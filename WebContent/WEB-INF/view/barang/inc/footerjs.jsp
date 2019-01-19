<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script type="text/javascript">
		$('#BarangTbl').DataTable({
		        "paging":   true,
		        "ordering": true,
		        "info":     true
	    });

		$('#BarangTbl').css('width', '100%');	    

		$('#fullFeatures').click(function(){
			$('#brgTblBody').css('display', 'block');
			
		});

        $('#simpan-barang').click(function () {
        	$('#barang-form').submit();
    	});

</script>