<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script type="text/javascript">
$('#simpan-returbeli').click(function(){
    // tambahkan class table-form di tbody
    $('.table-form tr').map(function(line){
        $(this).find('td').each(function (i) {
            if($(this).attr('data-save') == '1')
            {
                var name = $(this).attr('data-name');
                var value = $(this).text();
                var new_input = $('<input type="hidden">');
                // input name nya sesuaikan dengan property one to many entity 
                new_input.attr('name','detail[' + line + '].' + name);
                new_input.attr('value',value);

                $('#returbeli-form').append(new_input);
            }
        });
    });

    $('#returbeli-form').submit();

});
var returbeli_length = $('#returbeli-list').find('tr').length;

$('#add_detail').click(function(){
    $('#form-detail').find('input,select').val('');
    $('#detail_mode').val('new');
    $('#form-detail').modal('toggle');
    $('#form-detail').modal('show');
});

$('#simpan-detail').click(function(){
    var nama_barang, satuan, jumlah, harga, kadaluarsa, sub_total, mode, counter, id_row;
    var mode = $('#detail_mode').val();

    if(mode == 'new')
    {
        var tr = $('<tr>');
        counter = returbeli_length+1;
        tr.attr('id','returbeli_'+counter);
    }
    else
    {
        id_row = $('#returbeli_edit').val();
        counter = id_row;
        var tr = $('#returbeli_'+id_row);
        tr.empty();
    }
    
    nama_barang = $('#returBeliDetailBarangId').val();
    kadaluarsa = $('#returBeliDetailKadaluarsa').val()
    satuan = $('#returBeliDetailSatuanId').val();
    jumlah = $('#returBeliDetailJumlah').val() || 0;
    harga = $('#returBeliDetailHarga').val() ||0;
    sub_total = $('#returBeliDetailSubTotal').val() || 0;

     var barangText, satuanText;

    barangText = $('#returBeliDetailBarangId option:selected').text();
    satuanText = $('#returBeliDetailSatuanId option:selected').text();
    
    // data-kolom-id sesuaikan dengan id input di modal
    //tr.append('<td>'+nama_barang+'</td>');
    // tr.append('<td data-used="1" data-save="1" data-name="orderDetailSatuanId" data-kolom-id="satuan">'+satuan+'</td>');
    //conto
    tr.append('<td data-used="1" data-save="1" data-name="returBeliDetailBarangId" data-kolom-id="returBeliDetailBarangId">'+barangText+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="returBeliDetailSatuanId" data-kolom-id="returBeliDetailSatuanId">'+satuanText+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="returBeliDetailKadaluarsa" data-kolom-id="returBeliDetailKadaluarsa">'+kadaluarsa+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="returBeliDetailJumlah" data-kolom-id="returBeliDetailJumlah">'+jumlah+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="returBeliDetailHarga" data-kolom-id="ReturBerliDetailHarga">'+harga+'</td>');
    tr.append('<td data-used="1" data-save="1" data-name="returBeliDetailSubTotal" data-kolom-id="returBeliDetailSubTotal">'+sub_total+'</td>');
    tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteDetail('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editDetail('+counter+')">Edit</button></td>');
    if(mode == 'new')
    {
        returbeli_length = counter;
        // append to tbody
        $('#returbeli-list').append(tr);                    
    }

    $('#form-detail').modal('hide');
    $('#form-detail').find('input,select').val('');
}); 

function editDetail(id)
{
    var tr;
    $('#detail_mode').val('edit');
    $('#detail_edit').val(id);
    tr = $('#returbeli_'+id);
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
    tr = $('#returbeli_'+id);
    tr.remove();
}
</script>