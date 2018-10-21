<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script type="text/javascript">
var TotalTransaksi = 0;
$('#simpan-order').click(function(){
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

                $('#order-form').append(new_input);
            }
        });
    });

    $('#order-form').submit();

});
var order_length = $('#order-list').find('tr').length;
$('#add_order').click(function(){
    $('#form-detail').find('input,select').val('');
    $('#order_mode').val('new');
    $('#form-detail').modal('toggle');
    $('#form-detail').modal('show');
});

$('#simpan-detail').click(function(){
    setTotalTransaksi();
    var nama_barang, satuan, jumlah, harga, sub_total, mode, counter, id_row;
    var mode = $('#order_mode').val();

    if(mode == 'new')
    {
        var tr = $('<tr>');
        counter = order_length+1;
        tr.attr('id','order_'+counter);
    }
    else
    {
        id_row = $('#order_edit').val();
        counter = id_row;
        var tr = $('#order_'+id_row);
        tr.empty();
    }
    
    nama_barang = $('#orderDetailBarangId').val();
    satuan = $('#orderDetailSatuanId').val();
    jumlah = $('#orderDetailJumlah').val() || 0;
    harga = $('#orderDetailHarga').val() ||0;
    sub_total = $('#orderDetailSubTotal').val() || 0;

     var barangText, satuanText;

    barangText = $('#orderDetailBarangId option:selected').text();
    satuanText = $('#orderDetailSatuanId option:selected').text();
    
    // data-kolom-id sesuaikan dengan id input di modal
    //tr.append('<td>'+nama_barang+'</td>');
    // tr.append('<td data-used="1" data-save="1" data-name="orderDetailSatuanId" data-kolom-id="satuan">'+satuan+'</td>');
    //conto
    tr.append('<td data-used="1" data-save="1" data-id="'+ nama_barang +'" data-name="orderDetailBarangId" data-kolom-id="orderDetailBarangId">'+barangText+'</td>');
    tr.append('<td data-used="1" data-save="1" data-id="'+ satuan +'" data-name="orderDetailSatuanId" data-kolom-id="orderDetailSatuanId">'+satuanText+'</td>');
    tr.append('<td data-used="1" data-save="1" data-id="0" data-name="orderDetailJumlah" data-kolom-id="orderDetailJumlah">'+jumlah+'</td>');
    tr.append('<td data-used="1" data-save="1" data-id="0" data-name="orderDetailHarga" data-kolom-id="orderDetailHarga">'+harga+'</td>');
    tr.append('<td data-used="1" data-save="1" data-id="0" data-name="orderDetailSubTotal" data-kolom-id="orderDetailSubTotal">'+sub_total+'</td>');
    tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteDetail('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editOrder('+counter+')">Edit</button></td>');
    if(mode == 'new')
    {
        order_length = counter;
        // append to tbody
        $('#order-list').append(tr);                    
    }

    $('#form-detail').modal('hide');
    $('#form-detail').find('input,select').val('');
}); 

function editOrder(id)
{
    var tr;
    $('#order_mode').val('edit');
    $('#order_edit').val(id);
    tr = $('#order_'+id);
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
    tr = $('#order_'+id);
    tr.remove();
}

function setTotal(){
    var harga = $('#orderDetailHarga').val();
    var jumlah = $('#orderDetailJumlah').val();

    $('#orderDetailSubTotal').val(harga * jumlah);
}

function setTotalTransaksi(){
    var total = $('#orderDetailSubTotal').val();
    TotalTransaksi = parseInt(TotalTransaksi) +  parseInt(total);

    $('#orderTotal').val('');
    $('#orderTotal').val(TotalTransaksi);
}
</script>