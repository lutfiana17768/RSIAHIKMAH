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
			$('#form-rujukan').hide();
		} else {
			$('#form-rujukan').show();
		}
	})

</script>