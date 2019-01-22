<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript">
var TotalTransaksi = 0;
$('#simpan-terima').click(function(){
    // tambahkan class table-form di tbody <<<<<<<
    $('.table-form tr').map(function(line){
        $(this).find('td').each(function (i) {
            if($(this).attr('data-save') == '1')
            {
                var name = $(this).attr('data-name');
                var id = $(this).attr('data-id')
                if(id != '0'){
                    var value = parseInt(id);
                } else{
                    var value = $(this).text();    
                }
                var new_input = $('<input type="hidden">');
                new_input.attr('name','detail[' + line + '].' + name);
                new_input.attr('value',value);

                $('#terima-form').append(new_input);
            }
        });
    });

    $('#terima-form').submit();

});

var terima_length = $('#terima-list').find('tr').length;
$('#add_terima').click(function(){
    $('#form-detail').find('input,select').val('');
    $('#terima_mode').val('new');
    $('#form-detail').modal('toggle');
    $('#form-detail').modal('show');
});

$('#simpan-detail').click(function(){
    setTotalTransaksi();
    setPPN();
    setBiayaKirim();
    setJumlahTagihan();

    var nama_barang, kadaluarsa, satuan, jumlah, harga, sub_total, mode, counter, id_row;
    var mode = $('#terima_mode').val();

    if(mode == 'new')
    {
        var tr = $('<tr>');
        counter = terima_length+1;
        tr.attr('id','terima_'+counter);
    }
    else
    {
        id_row = $('#terima_edit').val();
        counter = id_row;
        var tr = $('#terima_'+id_row);
        tr.empty();
    }
	
    nama_barang = $('#terimaDetailBarangId').val();
    satuan = $('#terimaDetailSatuan').val();
    jumlah = $('#terimaDetailJumlah').val() || 0;
    kadaluarsa = $('#terimaDetailKadaluarsa').val() || 0;
    harga = $('#terimaDetailHarga').val() ||0;
    sub_total = $('#terimaDetailSubTotal').val() || 0;

    var barangText, satuanText;

    barangText = $('#terimaDetailBarangId option:selected').text();
    satuanText = $('#terimaDetailSatuan option:selected').text();
    // data-kolom-id sesuaikan dengan id input di modal
    
    tr.append('<td data-used="1" data-save="1" data-id="'+ nama_barang +'" data-name="terimaDetailBarangId" data-kolom-id="terimaDetailBarangId" value="'+ nama_barang +'">'+barangText+'</td>');
    tr.append('<td data-used="1" data-save="1" data-id="'+ satuan +'" data-name="terimaDetailSatuan" data-kolom-id="terimaDetailSatuan" value="'+ satuan +'">'+satuanText+'</td>');
    tr.append('<td data-used="1" data-save="1" data-id="0" data-name="terimaDetailKadaluarsa" data-kolom-id="terimaDetailKadaluarsa" value="'+ kadaluarsa +'">'+kadaluarsa+'</td>');
    tr.append('<td data-used="1" data-save="1" data-id="0" data-name="terimaDetailJumlah" data-kolom-id="terimaDetailJumlah" value="'+ jumlah +'">'+jumlah+'</td>');
    tr.append('<td data-used="1" data-save="1" data-id="0" data-name="terimaDetailHarga" data-kolom-id="terimaDetailHarga" value="'+ harga +'">'+harga+'</td>');
    tr.append('<td data-used="1" data-save="1" data-id="0" data-name="terimaDetailSubTotal" data-kolom-id="terimaDetailSubTotal" value="'+ sub_total +'">'+sub_total+'</td>');
    tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteDetail('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editDetail('+counter+')">Edit</button></td>');
    if(mode == 'new')
    {
        tindakan_length = counter;
        $('#terima-list').append(tr);                    
    }

    $('#form-detail').modal('hide');
    $('#form-detail').find('input,select').val('');
});	

function editDetail(id)
{
    var tr;
    $('#terima_mode').val('edit');
    $('#terima_edit').val(id);
    tr = $('#terima_'+id);
    $.each(tr.find('td'),function(i,e){
        if($(e).attr("data-used") == '1')
        {
            var elem_id = $(e).attr('data-kolom-id');
            $('#'+elem_id).val($(e).text());
        }
    });
    $('#form-detail').modal('show');
}

function deleteDetail(id)
{
    var tr;
    tr = $('#terima_'+id);
    tr.remove();
}

function setTotal(){
    var harga = $('#terimaDetailHarga').val();
    var jumlah = $('#terimaDetailJumlah').val();

    $('#terimaDetailSubTotal').val(harga * jumlah);
}

function setTotalTransaksi(){
    var total = $('#terimaDetailSubTotal').val();
    TotalTransaksi = parseInt(TotalTransaksi) +  parseInt(total);

    $('#terimaTotal').val('');
    $('#terimaTotal').val(TotalTransaksi);
    console.log(TotalTransaksi);
}

function setPPN(){
    var total = $('#terimaTotal').val();
    var potongan = ($('#terimaCashback').val() == '') ? 0 : $('#terimaCashback').val();

    var ppn = (parseInt(TotalTransaksi) - parseInt(potongan)) * 0.1;

    $('#terimaTotalPPH').val(ppn);
    console.log(ppn);
}

function setBiayaKirim(){
    // var ppn = $('#terimaTotalPPH').val();

    // var biayakirim = parseFloat(ppn) * 0.1;

    // $('#terimaBiayaLain').val(biayakirim);
    // console.log(biayakirim);
}

function setJumlahTagihan(){
    // var total = $('#terimaTotal').val();
    var ppn = $('#terimaTotalPPH').val();
    var biayakirim = ($('#terimaBiayaLain').val() == '' ) ? 0 : $('#terimaBiayaLain').val();
    var potongan = ($('#terimaCashback').val() == '') ? 0 : $('#terimaCashback').val();

    var tagihan = parseInt(parseInt(TotalTransaksi) - parseInt(potongan)) + parseInt(ppn) + parseInt(biayakirim);

    $('#terimaTotal').val('');
    $('#terimaTotal').val(tagihan);   
    console.log(tagihan);
}

function onchangenumber(){
    setPPN();
    setBiayaKirim();
    setJumlahTagihan();
}
</script>