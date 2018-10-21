<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script type="text/javascript">
var TotalTransaksi = 0;
$('#simpan-jual').click(function(){
    // tambahkan class table-form di tbody
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
                // input name nya sesuaikan dengan property one to many entity 
                new_input.attr('name','detail[' + line + '].' + name);
                new_input.attr('value',value);

                $('#jual-form').append(new_input);
            }
        });
    });

    $('#jual-form').submit();

});
var jual_length = $('#jual-list').find('tr').length;

$('#add_detail').click(function(){
    $('#form-detail').find('input,select').val('');
    $('#detail_mode').val('new');
    $('#form-detail').modal('toggle');
    $('#form-detail').modal('show');
});

$('#simpan-detail').click(function(){
    setTotalTransaksi();
    var nama_barang, satuan, jumlah, harga, sub_total, mode, counter, id_row, kadaluarsa;
    var mode = $('#detail_mode').val();

    if(mode == 'new')
    {
        var tr = $('<tr>');
        counter = jual_length+1;
        tr.attr('id','jual_'+counter);
    }
    else
    {
        id_row = $('#jual_edit').val();
        counter = id_row;
        var tr = $('#jual_'+id_row);
        tr.empty();
    }
    
    nama_barang = $('#jualDetailBarangId').val();
    satuan = $('#jualDetailSatuanId').val();
    jumlah = $('#jualDetailJumlah').val() || 0;
    kadaluarsa = $('#jualDetailKadaluarsa').val();
    harga = $('#jualDetailHarga').val() ||0;
    sub_total = $('#jualDetailSubTotal').val() || 0;

    var barangText, satuanText;

    barangText = $('#jualDetailBarangId option:selected').text();
    satuanText = $('#jualDetailSatuanId option:selected').text();
    
    // data-kolom-id sesuaikan dengan id input di modal
    //tr.append('<td>'+nama_barang+'</td>');
    // tr.append('<td data-used="1" data-save="1" data-name="orderDetailSatuanId" data-kolom-id="satuan">'+satuan+'</td>');
    //conto
    tr.append('<td data-used="1" data-save="1" data-id="'+ nama_barang +'" data-name="jualDetailBarangId" data-kolom-id="jualDetailBarangId">'+barangText+'</td>');
    tr.append('<td data-used="1" data-save="1" data-id="0" data-name="jualDetailKadaluarsa" data-kolom-id="jualDetailKadaluarsa">'+kadaluarsa+'</td>');
    tr.append('<td data-used="1" data-save="1" data-id="'+satuan+'" data-name="jualDetailSatuanId" data-kolom-id="jualDetailSatuanId">'+satuanText+'</td>');
    tr.append('<td data-used="1" data-save="1" data-id="0" data-name="jualDetailJumlah" data-kolom-id="jualDetailJumlah">'+jumlah+'</td>');
    tr.append('<td data-used="1" data-save="1" data-id="0" data-name="jualDetailHarga" data-kolom-id="jualDetailHarga">'+harga+'</td>');
    tr.append('<td data-used="1" data-save="1" data-id="0" data-name="jualDetailSubTotal" data-kolom-id="jualDetailSubTotal">'+sub_total+'</td>');
    tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteDetail('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editDetail('+counter+')">Edit</button></td>');
    if(mode == 'new')
    {
        jual_length = counter;
        // append to tbody
        $('#jual-list').append(tr);                    
    }
    $('#form-detail').modal('hide');
    $('#form-detail').find('input,select').val('');
    
}); 

function editDetail(id)
{
    var tr;
    $('#detail_mode').val('edit');
    $('#detail_edit').val(id);
    tr = $('#jual_'+id);
    $.each(tr.find('td'),function(i,e){
        if($(e).attr("data-used") == '1')
        {
            var elem_id = $(e).attr('data-kolom-id');
            $('#'+elem_id).val($(e).text());
        }
        var harga = $('#jualDetailSubTotal').text();
        TotalTransaksi = TotalTransaksi - parseInt(harga);
    });
    $('#form-detail').modal('show');
}

function deleteDetail(id)
{
    var tr;
    tr = $('#jual_'+id);
    tr.remove();
}

function setHarga(){
    var harga = $('#jualDetailBarangId option:selected').attr('data-harga');

    $('#jualDetailHarga').val(harga);
}

function setTotal(){
    var harga = $('#jualDetailHarga').val();
    var jumlah = $('#jualDetailJumlah').val();

    $('#jualDetailSubTotal').val(harga * jumlah);
}

function setTotalTransaksi(){
    var total = $('#jualDetailSubTotal').val();
    TotalTransaksi = parseInt(TotalTransaksi) +  parseInt(total);

    $('#jualTotal').val('');
    $('#jualTotal').val(TotalTransaksi);
}
</script>