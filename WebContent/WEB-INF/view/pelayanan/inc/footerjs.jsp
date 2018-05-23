<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<script type="text/javascript">
    var riwayatperiksa_length = $('#pelayanan-riwayatperiksa-list').find('tr').length;
    var periksapasien_length = $('#pelayanan-periksapasien-list').find('tr').length;
	var tindakan_length = $('#pelayanan-tindakan-list').find('tr').length;
	// 
	var diagnosapasien_length = $('#pelayanan-diagnosapasien-list').find('tr').length;
    var pakai_length = $('#pelayanan-pakai-list').find('tr').length;
    var resep_length = $('#pelayanan-resep-list').find('tr').length;
    var penunjangtrans_length = $('#pelayanan-penunjangtrans-list').find('tr').length;
    var soap_length = $('#pelayanan-soap-list').find('tr').length;



	
    $(function(){
		$('#simpan-pelayanan').click(function () {
            $('#pelayanan-riwayatperiksa-list tr').map(function(line){
                $(this).find('td').each(function (i) {
                    if ($(this).attr('data-save') == '1') {
                        var name = $(this).attr('data-name');
                        var value = $(this).text();
                        var new_input = $('<input type="hidden">');
                        new_input.attr('name','riwayatperiksa[' + line + '].' + name);
                        new_input.attr('value',value);
                        $('#pelayanan-form').append(new_input);
                    }
                });
            });

            $('#pelayanan-periksapasien-list tr').map(function(line){
                $(this).find('td').each(function (i) {
                    if ($(this).attr('data-save') == '1') {
                        var name = $(this).attr('data-name');
                        var value = $(this).text();
                        var new_input = $('<input type="hidden">');
                        new_input.attr('name','periksapasien[' + line + '].' + name);
                        new_input.attr('value',value);
                        $('#pelayanan-form').append(new_input);
                    }
                });
            });

            $('#pelayanan-diagnosapasien-list tr').map(function(line){
                $(this).find('td').each(function (i) {
                    if ($(this).attr('data-save') == '1') {
                        var name = $(this).attr('data-name');
                        var value = $(this).text();
                        var new_input = $('<input type="hidden">');
                        new_input.attr('name','diagnosapasien[' + line + '].' + name);
                        new_input.attr('value',value);
                        $('#pelayanan-form').append(new_input);
                    }
                });
            });

            //
            
            $('#pelayanan-tindakan-list tr').map(function(line){
                $(this).find('td').each(function (i) {
                    if ($(this).attr('data-save') == '1') {
                        var name = $(this).attr('data-name');
                        var value = $(this).text();
                        var new_input = $('<input type="hidden">');
                        new_input.attr('name','tindakanpasien[' + line + '].' + name);
                        new_input.attr('value',value);
                        $('#pelayanan-form').append(new_input);
                    }
                });
            });

            $('#pelayanan-pakai-list tr').map(function(line){
                $(this).find('td').each(function (i) {
                    if ($(this).attr('data-save') == '1') {
                        var name = $(this).attr('data-name');
                        var value = $(this).text();
                        var new_input = $('<input type="hidden">');
                        new_input.attr('name','pakai[' + line + '].' + name);
                        new_input.attr('value',value);
                        $('#pelayanan-form').append(new_input);
                    }
                });
            });
            $('#pelayanan-resep-list tr').map(function(line){
                $(this).find('td').each(function (i) {
                    if ($(this).attr('data-save') == '1') {
                        var name = $(this).attr('data-name');
                        var value = $(this).text();
                        var new_input = $('<input type="hidden">');
                        new_input.attr('name','resep[' + line + '].' + name);
                        new_input.attr('value',value);
                        $('#pelayanan-form').append(new_input);
                    }
                });
            });
            $('#pelayanan-penunjangtrans-list tr').map(function(line){
                $(this).find('td').each(function (i) {
                    if ($(this).attr('data-save') == '1') {
                        var name = $(this).attr('data-name');
                        var value = $(this).text();
                        var new_input = $('<input type="hidden">');
                        new_input.attr('name','penunjangtrans[' + line + '].' + name);
                        new_input.attr('value',value);
                        $('#pelayanan-form').append(new_input);
                    }
                });
            });
            $('#pelayanan-soap-list tr').map(function(line){
                $(this).find('td').each(function (i) {
                    if ($(this).attr('data-save') == '1') {
                        var name = $(this).attr('data-name');
                        var value = $(this).text();
                        var new_input = $('<input type="hidden">');
                        new_input.attr('name','soap[' + line + '].' + name);
                        new_input.attr('value',value);
                        $('#pelayanan-form').append(new_input);
                    }
                });
            });
			$('#pelayanan-form').submit();
		});

        $('#add_riwayatperiksa').click(function(){
            $('#form-pelayanan-riwayatperiksa').find('input,select').val('');
            $('#riwayatperiksa_mode').val('new');
            $('#modal-pelayanan-riwayatperiksa').modal('show');
        });
        $('#add_periksapasien').click(function(){
            $('#form-pelayanan-periksapasien').find('input,select').val('');
            $('#periksapasien_mode').val('new');
            $('#modal-pelayanan-periksapasien').modal('show');
        });
        $('#add_diagnosapasien').click(function(){
            $('#form-pelayanan-diagnosapasien').find('input,select').val('');
            $('#diagnosapasien_mode').val('new');
            $('#modal-pelayanan-diagnosapasien').modal('show');
        });

        //
       
        $('#add_tindakan').click(function(){
            $('#form-pelayanan-tindakan').find('input,select').val('');
            $('#tindakan_mode').val('new');
            $('#modal-pelayanan-tindakan').modal('show');
        });
        
        $('#add_pakai').click(function(){
            $('#form-pelayanan-pakai').find('input,select').val('');
            $('#pakai_mode').val('new');
            $('#modal-pelayanan-pakai').modal('show');
        });
        $('#add_resep').click(function(){
            $('#form-pelayanan-resep').find('input,select').val('');
            $('#resep_mode').val('new');
            $('#modal-pelayanan-resep').modal('show');
        });
        $('#add_penunjangtrans').click(function(){
            $('#form-pelayanan-penunjangtrans').find('input,select').val('');
            $('#penunjangtrans_mode').val('new');
            $('#modal-pelayanan-penunjangtrans').modal('show');
        });
        $('#add_soap').click(function(){
            $('#form-pelayanan-soap').find('input,select').val('');
            $('#soap_mode').val('new');
            $('#modal-pelayanan-soap').modal('show');
        });

        $('#simpan-riwayatperiksa').click(function(){
            var riwayatperiksa_tinggi,mode,counter,id_row;
            var mode = $('#riwayatperiksa_mode').val();

            if(mode == 'new')
            {
                var tr = $('<tr>');
                counter = riwayatperiksa_length+1;
                tr.attr('id','riwayatperiksa_'+counter);
            }
            else
            {
                id_row = $('#riwayatperiksa_edit').val();
                counter = id_row;
                var tr = $('#riwayatperiksa_'+id_row);
                tr.empty();
            }

            periksa_tb = $('#periksa_tb').val() ||0;
            periksa_bb = $('#periksa_bb').val() ||0;
            periksa_jantung = $('#periksa_jantung').val() ||0;
            periksa_tensi = $('#periksa_tensi').val() ||0;
            periksa_suhu = $('#periksa_suhu').val() ||0;
            periksa_nafas = $('#periksa_nafas').val() ||0;
            periksa_keluhan = $('#periksa_keluhan').val() ||'';
            periksa_pemeriksa = $('#periksa_pemeriksa').val() ||'';
            periksa_tanggal = $('#periksa_tanggal').val() ||0;
            
            tr.append('<td data-used="1" data-save="1" data-name="periksa_tb" data-kolom-id="periksa_tb">'+periksa_tb+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="periksa_bb" data-kolom-id="periksa_bb">'+periksa_bb+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="periksa_jantung" data-kolom-id="periksa_jantung">'+periksa_jantung+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="periksa_tensi" data-kolom-id="periksa_tensi">'+periksa_tensi+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="periksa_suhu" data-kolom-id="periksa_suhu">'+periksa_suhu+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="periksa_nafas" data-kolom-id="periksa_nafas">'+periksa_nafas+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="periksa_keluhan" data-kolom-id="periksa_keluhan">'+periksa_keluhan+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="periksa_pemeriksa" data-kolom-id="periksa_pemeriksa">'+periksa_pemeriksa+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="periksa_tanggal" data-kolom-id="periksa_tanggal">'+periksa_tanggal+'</td>');
            tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteRiwayatperiksa('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editRiwayatperiksa('+counter+')">Edit</button></td>');

            if(mode == 'new')
            {
                riwayatperiksa_length = counter;
                $('#pelayanan-riwayatperiksa-list').append(tr);                    
            }

            $('#modal-pelayanan-riwayatperiksa').modal('hide');
            $('#form-pelayanan-riwayatperiksa').find('input,select').val('');

        });
         $('#simpan-periksapasien').click(function(){
            var periksapasien_tinggi,mode,counter,id_row;
            var mode = $('#periksapasien_mode').val();

            if(mode == 'new')
            {
                var tr = $('<tr>');
                counter = periksapasien_length+1;
                tr.attr('id','periksapasien_'+counter);
            }
            else
            {
                id_row = $('#periksapasien_edit').val();
                counter = id_row;
                var tr = $('#periksapasien_'+id_row);
                tr.empty();
            }

            periksapasien_tinggi = $('#periksapasien_tinggi').val() ||0;
            
            tr.append('<td data-used="1" data-save="1" data-name="periksapasien_tinggi" data-kolom-id="periksapasien_tinggi">'+periksapasien_tinggi+'</td>');
            tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deletePeriksapasien('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editPeriksapasien('+counter+')">Edit</button></td>');

            if(mode == 'new')
            {
                periksapasien_length = counter;
                $('#pelayanan-periksapasien-list').append(tr);                    
            }

            $('#modal-pelayanan-periksapasien').modal('hide');
            $('#form-pelayanan-periksapasien').find('input,select').val('');

        }); 
        
        $('#simpan-diagnosapasien').click(function(){
            var diagnosapasien_tinggi,mode,counter,id_row;
            var mode = $('#diagnosapasien_mode').val();

            if(mode == 'new')
            {
                var tr = $('<tr>');
                counter = diagnosapasien_length+1;
                tr.attr('id','diagnosapasien_'+counter);
            }
            else
            {
                id_row = $('#diagnosapasien_edit').val();
                counter = id_row;
                var tr = $('#diagnosapasien_'+id_row);
                tr.empty();
            }

            diagnosapasien_tinggi = $('#diagnosapasien_tinggi').val() ||0;
            
            tr.append('<td data-used="1" data-save="1" data-name="diagnosapasien_tinggi" data-kolom-id="diagnosapasien_tinggi">'+diagnosapasien_tinggi+'</td>');
            tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteDiagnosapasien('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editDiagnosapasien('+counter+')">Edit</button></td>');

            if(mode == 'new')
            {
                diagnosapasien_length = counter;
                $('#pelayanan-diagnosapasien-list').append(tr);                    
            }

            $('#modal-pelayanan-diagnosapasien').modal('hide');
            $('#form-pelayanan-diagnosapasien').find('input,select').val('');

        }); 

        $('#simpan-tindakan').click(function(){
            var tindakanpasien_harga,mode,counter,id_row;
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

            tindakan_id = $('#tindakan_id').val();
            tindakan_text = $('#tindakan_id option:selected').text();
            pegawai_id = $('#pegawai_id').val();
            pegawai_text = $('#pegawai_id option:selected').text();
        	tindakanpasien_harga = $('#tindakanpasien_harga').val() ||0;

            tr.append('<td>'+tindakan_text+'</td>');
            tr.append('<td>'+pegawai_text+'</td>');
            tr.append('<td data-used="1" data-save="1" data-name="tindakanpasien_harga" data-kolom-id="tindakanpasien_harga">'+tindakanpasien_harga+'</td>');
            tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteTindakan('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editTindakan('+counter+')">Edit</button></td>');
            tr.append('<td style="display:none" data-used="1" data-save="1" data-name="tindakan.tindakan_id" data-kolom-id="tindakan_id">'+tindakan_id+'</td>');
            tr.append('<td style="display:none" data-used="1" data-save="1" data-name="pegawai.pegawai_id" data-kolom-id="pegawai_id">'+pegawai_id+'</td>');

            if(mode == 'new')
            {
                tindakan_length = counter;
                $('#pelayanan-tindakan-list').append(tr);                    
            }

            $('#modal-pelayanan-tindakan').modal('hide');
            $('#form-pelayanan-tindakan').find('input,select').val('');

        }); 

        $('#simpan-pakai').click(function(){
            var pakai_tinggi,mode,counter,id_row;
            var mode = $('#pakai_mode').val();

            if(mode == 'new')
            {
                var tr = $('<tr>');
                counter = pakai_length+1;
                tr.attr('id','pakai_'+counter);
            }
            else
            {
                id_row = $('#pakai_edit').val();
                counter = id_row;
                var tr = $('#pakai_'+id_row);
                tr.empty();
            }

            pakai_tinggi = $('#pakai_tinggi').val() ||0;
            
            tr.append('<td data-used="1" data-save="1" data-name="pakai_tinggi" data-kolom-id="pakai_tinggi">'+pakai_tinggi+'</td>');
            tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deletePakai('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editPakai('+counter+')">Edit</button></td>');

            if(mode == 'new')
            {
                pakai_length = counter;
                $('#pelayanan-pakai-list').append(tr);                    
            }

            $('#modal-pelayanan-pakai').modal('hide');
            $('#form-pelayanan-pakai').find('input,select').val('');

        }); 

         $('#simpan-resep').click(function(){
            var resep_tinggi,mode,counter,id_row;
            var mode = $('#resep_mode').val();

            if(mode == 'new')
            {
                var tr = $('<tr>');
                counter = resep_length+1;
                tr.attr('id','resep_'+counter);
            }
            else
            {
                id_row = $('#resep_edit').val();
                counter = id_row;
                var tr = $('#resep_'+id_row);
                tr.empty();
            }

            resep_tinggi = $('#resep_tinggi').val() ||0;
            
            tr.append('<td data-used="1" data-save="1" data-name="resep_tinggi" data-kolom-id="resep_tinggi">'+resep_tinggi+'</td>');
            tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteResep('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editResep('+counter+')">Edit</button></td>');

            if(mode == 'new')
            {
                resep_length = counter;
                $('#pelayanan-resep-list').append(tr);                    
            }

            $('#modal-pelayanan-resep').modal('hide');
            $('#form-pelayanan-resep').find('input,select').val('');

        }); 

         $('#simpan-penunjangtrans').click(function(){
            var penunjangtrans_tinggi,mode,counter,id_row;
            var mode = $('#penunjangtrans_mode').val();

            if(mode == 'new')
            {
                var tr = $('<tr>');
                counter = penunjangtrans_length+1;
                tr.attr('id','penunjangtrans_'+counter);
            }
            else
            {
                id_row = $('#penunjangtrans_edit').val();
                counter = id_row;
                var tr = $('#penunjangtrans_'+id_row);
                tr.empty();
            }

            penunjangtrans_tinggi = $('#penunjangtrans_tinggi').val() ||0;
            
            tr.append('<td data-used="1" data-save="1" data-name="penunjangtrans_tinggi" data-kolom-id="penunjangtrans_tinggi">'+penunjangtrans_tinggi+'</td>');
            tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deletePenunjangtrans('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editPenunjangtrans('+counter+')">Edit</button></td>');

            if(mode == 'new')
            {
                penunjangtrans_length = counter;
                $('#pelayanan-penunjangtrans-list').append(tr);                    
            }

            $('#modal-pelayanan-penunjangtrans').modal('hide');
            $('#form-pelayanan-penunjangtrans').find('input,select').val('');

        }); 

         $('#simpan-soap').click(function(){
            var soap_tinggi,mode,counter,id_row;
            var mode = $('#soap_mode').val();

            if(mode == 'new')
            {
                var tr = $('<tr>');
                counter = soap_length+1;
                tr.attr('id','soap_'+counter);
            }
            else
            {
                id_row = $('#soap_edit').val();
                counter = id_row;
                var tr = $('#soap_'+id_row);
                tr.empty();
            }

            soap_tinggi = $('#soap_tinggi').val() ||0;
            
            tr.append('<td data-used="1" data-save="1" data-name="soap_tinggi" data-kolom-id="soap_tinggi">'+soap_tinggi+'</td>');
            tr.append('<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteSoap('+counter+')">Delete</button>&nbsp<button type="button" class="btn btn-primary btn-sm" onclick="editSoap('+counter+')">Edit</button></td>');

            if(mode == 'new')
            {
                soap_length = counter;
                $('#pelayanan-soap-list').append(tr);                    
            }

            $('#modal-pelayanan-soap').modal('hide');
            $('#form-pelayanan-soap').find('input,select').val('');

        }); 

        // next simpan

    });


    function editRiwayatperiksa(id)
    {
        var tr;
        $('#riwayatperiksa_mode').val('edit');
        $('#riwayatperiksa_edit').val(id);
        tr = $('#riwayatperiksa_'+id);
        $.each(tr.find('td'),function(i,e){
            if($(e).attr("data-used") == '1')
            {
                var elem_id = $(e).attr('data-kolom-id');
                $('#'+elem_id).val($(e).text());
            }
        });
        $('#modal-pelayanan-riwayatperiksa').modal('show');
    }

    function deleteRiwayatperiksa(id)
    {
        var tr;
        tr = $('#riwayatperiksa_'+id);
        tr.remove();
    }

    function editPeriksapasien(id)
    {
        var tr;
        $('#periksapasien_mode').val('edit');
        $('#periksapasien_edit').val(id);
        tr = $('#periksapasien_'+id);
        $.each(tr.find('td'),function(i,e){
            if($(e).attr("data-used") == '1')
            {
                var elem_id = $(e).attr('data-kolom-id');
                $('#'+elem_id).val($(e).text());
            }
        });
        $('#modal-pelayanan-periksapasien').modal('show');
    }

    function deleteRiwayatperiksa(id)
    {
        var tr;
        tr = $('#periksapasien_'+id);
        tr.remove();
    }    
    function editPeriksapasien(id)
    {
        var tr;
        $('#periksapasien_mode').val('edit');
        $('#periksapasien_edit').val(id);
        tr = $('#periksapasien_'+id);
        $.each(tr.find('td'),function(i,e){
            if($(e).attr("data-used") == '1')
            {
                var elem_id = $(e).attr('data-kolom-id');
                $('#'+elem_id).val($(e).text());
            }
        });
        $('#modal-pelayanan-periksapasien').modal('show');
    }

    function deletePeriksapasien(id)
    {
        var tr;
        tr = $('#periksapasien_'+id);
        tr.remove();
    }  
    function editDiagnosapasien(id)
    {
        var tr;
        $('#diagnosapasien_mode').val('edit');
        $('#diagnosapasien_edit').val(id);
        tr = $('#diagnosapasien_'+id);
        $.each(tr.find('td'),function(i,e){
            if($(e).attr("data-used") == '1')
            {
                var elem_id = $(e).attr('data-kolom-id');
                $('#'+elem_id).val($(e).text());
            }
        });
        $('#modal-pelayanan-diagnosapasien').modal('show');
    }

    function deleteDiagnosapasien(id)
    {
        var tr;
        tr = $('#diagnosapasien_'+id);
        tr.remove();
    }

    // procedur

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
        $('#modal-pelayanan-tindakan').modal('show');
    }

    function deleteTindakan(id)
    {
        var tr;
        tr = $('#tindakan_'+id);
        tr.remove();
    }

    function editPakai(id)
    {
        var tr;
        $('#pakai_mode').val('edit');
        $('#pakai_edit').val(id);
        tr = $('#pakai_'+id);
        $.each(tr.find('td'),function(i,e){
            if($(e).attr("data-used") == '1')
            {
                var elem_id = $(e).attr('data-kolom-id');
                $('#'+elem_id).val($(e).text());
            }
        });
        $('#modal-pelayanan-pakai').modal('show');
    }

    function deletePakai(id)
    {
        var tr;
        tr = $('#pakai_'+id);
        tr.remove();
    }  

    function editResep(id)
    {
        var tr;
        $('#resep_mode').val('edit');
        $('#resep_edit').val(id);
        tr = $('#resep_'+id);
        $.each(tr.find('td'),function(i,e){
            if($(e).attr("data-used") == '1')
            {
                var elem_id = $(e).attr('data-kolom-id');
                $('#'+elem_id).val($(e).text());
            }
        });
        $('#modal-pelayanan-resep').modal('show');
    }

    function deleteResep(id)
    {
        var tr;
        tr = $('#resep_'+id);
        tr.remove();
    }  

    function editPenunjangtrans(id)
    {
        var tr;
        $('#penunjangtrans_mode').val('edit');
        $('#penunjangtrans_edit').val(id);
        tr = $('#penunjangtrans_'+id);
        $.each(tr.find('td'),function(i,e){
            if($(e).attr("data-used") == '1')
            {
                var elem_id = $(e).attr('data-kolom-id');
                $('#'+elem_id).val($(e).text());
            }
        });
        $('#modal-pelayanan-penunjangtrans').modal('show');
    }

    function deletePenunjangtrans(id)
    {
        var tr;
        tr = $('#penunjangtrans_'+id);
        tr.remove();
    }  

    function editSoap(id)
    {
        var tr;
        $('#soap_mode').val('edit');
        $('#soap_edit').val(id);
        tr = $('#soap_'+id);
        $.each(tr.find('td'),function(i,e){
            if($(e).attr("data-used") == '1')
            {
                var elem_id = $(e).attr('data-kolom-id');
                $('#'+elem_id).val($(e).text());
            }
        });
        $('#modal-pelayanan-soap').modal('show');
    }

    function deleteSoap(id)
    {
        var tr;
        tr = $('#soap_'+id);
        tr.remove();
    }  

</script>