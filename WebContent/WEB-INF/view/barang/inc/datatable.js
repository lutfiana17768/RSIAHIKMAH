<script type="text/javascript">
    $(document).ready(function() {
    	console.log('jalan');
        $('#BarangTbl').DataTable({
	        "paging":   true,
	        "ordering": false,
	        "info":     true
    	});

        $('#simpan-barang').click(function () {
        	$('#barang-form').submit();
    	});
    } );
</script>