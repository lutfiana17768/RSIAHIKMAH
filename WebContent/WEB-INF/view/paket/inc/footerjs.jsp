<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript">
        var ruang_length = 0;
        var tindakan_length = 0;
        var barang_length = 0;
		$(function(){
			$('#tab_first').click();
            $('#simpan-paket').click(function(){
                var tabletindakan = $('#paket-tindakan-list tr').map(function(i){
                    $(this).find('td').each(function (i) {
                        if($(this).attr('data-save') == '1')
                        {
                            var name = $(this).attr('data-kolom-id');
                            var value = $(this).text();
                            var new_input = $('<input type="hidden">');
                            new_input.attr('name',name+'[]');
                            new_input.attr('value',value);
                            $('#paket-form').append(new_input);
                        }
                    });
                });

                $('#paket-form').submit();

            });
			$('#add_ruang').click(function(){
                $('#form-paket-ruang').find('input,select').val('');
                $('#ruang_mode').val('new');
                $('#form-paket-ruang').modal('show');
			});
            $('#add_tindakan').click(function(){
                $('#form-paket-tindakan').find('input,select').val('');
                $('#tindakan_mode').val('new');
                $('#form-paket-tindakan').modal('show');
            });
            $('#add_barang').click(function(){
                $('#form-paket-barang').find('input,select').val('');
                $('#barang_mode').val('new');
                $('#form-paket-barang').modal('show');
            });
			$('#simpan-tindakan').click(function(){
                var m_tindakan_id,paket_tindakan_jumlah,paket_tindakan_harga,paket_tindakan_subharga,tindakan_text,mode,counter,id_row;
                var mode = $('#tindakan_mode').val();

                if(mode == 'new')
                {
                    var tr = $('<tr>');
                    counter = tindakan_length+1;
                    tr.attr('id','tindakan_'+counter);
                }
                else
                {
                    id_row = $('#tindakan_edit').val();
                    counter = id_row;
                    var tr = $('#tindakan_'+id_row);
                    tr.empty();
                }

                m_tindakan_id = $('#m_tindakan_id').val();
                tindakan_text = $('#m_tindakan_id option:selected').text();
                paket_tindakan_jumlah = $('#paket_tindakan_jumlah').val() ||'';
                paket_tindakan_harga = $('#paket_tindakan_harga').val() ||0;
                paket_tindakan_subharga = $('#paket_tindakan_subharga').val() || 0;
                
                tr.append('<td>'+tindakan_text+'</td>');
                tr.append('<td data-used="1" data-save="1" data-kolom-id="paket_tindakan_jumlah">'+paket_tindakan_jumlah+'</td>');
                tr.append('<td data-used="1" data-save="1" data-kolom-id="paket_tindakan_harga">'+paket_tindakan_harga+'</td>');
                tr.append('<td data-used="1" data-kolom-id="paket_tindakan_subharga">'+paket_tindakan_subharga+'</td>');
                tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteTindakan('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editTindakan('+counter+')">Edit</button></td>');
                tr.append('<td style="display:none" data-used="1" data-save="1" data-kolom-id="m_tindakan_id">'+m_tindakan_id+'</td>');


                tr.append('<input type="hidden" name="paket.tindakans[' + tindakan_length + '].tindakan_id" value="' + m_tindakan_id + '"  >');
                tr.append('<input type="hidden" name="paket.tindakans[' + tindakan_length + '].tindakan_harga" value="' + paket_tindakan_harga + '"  >');

                if(mode == 'new')
                {
                    tindakan_length = counter;
                    $('#paket-tindakan-list').append(tr);                    
                }

                $('#form-paket-tindakan').modal('hide');
                $('#form-paket-tindakan').find('input,select').val('');

            });
            
            $('#simpan-barang').click(function(){
				var m_barang_id,paket_barang_jumlah,paket_barang_harga,paket_satuan_id,paket_barang_subharga,barang_text,mode,counter,id_row;
                var mode = $('#barang_mode').val();

                if(mode == 'new')
                {
                    var tr = $('<tr>');
                    counter = barang_length+1;
                    tr.attr('id','barang_'+counter);
                }
                else
                {
                    id_row = $('#barang_edit').val();
                    counter = id_row;
                    var tr = $('#barang_'+id_row);
                    tr.empty();
                }

                m_barang_id = $('#m_barang_id').val();
                barang_text = $('#m_barang_id option:selected').text();
                paket_satuan_id = $('#paket_satuan_id').val() || 0;
                paket_satuan_text = $('#paket_satuan_id option:selected').text();
                paket_barang_jumlah = $('#paket_barang_jumlah').val() ||'';
                paket_barang_harga = $('#paket_barang_harga').val() ||0;
                paket_barang_subharga = $('#paket_barang_subharga').val() || 0;
                
                tr.append('<td>'+barang_text+'</td>');
                tr.append('<td>'+paket_satuan_text+'</td>');
                tr.append('<td data-used="1" data-save="1" data-kolom-id="paket_barang_jumlah">'+paket_barang_jumlah+'</td>');
                tr.append('<td data-used="1" data-save="1" data-kolom-id="paket_barang_harga">'+paket_barang_harga+'</td>');
                tr.append('<td data-used="1" data-kolom-id="paket_barang_subharga">'+paket_barang_subharga+'</td>');
                tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteBarang('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editBarang('+counter+')">Edit</button></td>');
                tr.append('<td style="display:none" data-used="1" data-save="1" data-kolom-id="m_barang_id">'+m_barang_id+'</td>');
                tr.append('<td style="display:none" data-used="1" data-save="1" data-kolom-id="paket_satuan_id">'+paket_satuan_id+'</td>');
                if(mode == 'new')
                {
                    barang_length = counter;
                    $('#paket-barang-list').append(tr);                    
                }

                $('#form-paket-barang').modal('hide');
                $('#form-paket-barang').find('input,select').val('');

			});

		});

        function editTindakan(id)
        {
            var tr;
            $('#tindakan_mode').val('edit');
            $('#tindakan_edit').val(id);
            tr = $('#tindakan_'+id);
            $.each(tr.find('td'),function(i,e){
                if($(e).attr("data-used") == '1')
                {
                    var elem_id = $(e).attr('data-kolom-id');
                    $('#'+elem_id).val($(e).text());
                }
            });
            $('#form-paket-tindakan').modal('show');
        }        

        function deleteTindakan(id)
        {
            var tr;
            tr = $('#tindakan_'+id);
            tr.remove();
        }        
        function editBarang(id)
        {
            var tr;
            $('#barang_mode').val('edit');
            $('#barang_edit').val(id);
            tr = $('#barang_'+id);
            $.each(tr.find('td'),function(i,e){
                if($(e).attr("data-used") == '1')
                {
                    var elem_id = $(e).attr('data-kolom-id');
                    $('#'+elem_id).val($(e).text());
                }
            });
            $('#form-paket-barang').modal('show');
        }        

        function deleteBarang(id)
        {
            var tr;
            tr = $('#barang_'+id);
            tr.remove();
        }
	</script>