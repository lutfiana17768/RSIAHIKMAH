<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript">
	$(document).ready(function(){
		$("#add_Pendaftaran").click(function(){
			$("#add_Pendaftaran_form").slideToggle('slow');
		});
	});
	$('#kondisi_pasien').on('change', function() {
		var kondisi_datang = this.value ;

		if (kondisi_datang == 'D') {
			$('#form-rujukan').hide(500);
		} else {
			$('#form-rujukan').show(500);
		}
	})
	$('#jenis_daftar').on('change', function() {
		if (this.value == 'RI') {
			$('#form-rawat-inap').show(500);
			$('#form-rawat-jalan').hide(500);
		} else if (this.value == 'RJ') {
			$('#form-rawat-inap').hide(500);
			$('#form-rawat-jalan').show(500);
		} else {
			$('#form-rawat-inap').hide(500);
			$('#form-rawat-jalan').hide(500);
		}
	})

</script>