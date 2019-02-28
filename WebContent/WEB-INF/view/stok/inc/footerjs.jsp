<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script type="text/javascript">
	$('#stok-table').DataTable({
		        "paging":   true,
		        "ordering": true,
		        "info":     true
	    });

	$('#simpan-barang').click(function () {
        $('#barang-form').submit();
    });

    $('.kartu-stok').click(function(){
    		var barangid = $(this).attr('barang-id');
    		var month = $('#month').val();
    		var year = $('#year').val();

    		window.location.href = "http://localhost:8383/stok-obat/kartustok?id="+barangid+"&year="+year+"&month="+month;
    	});
</script>