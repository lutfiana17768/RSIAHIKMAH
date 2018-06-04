<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script type="text/javascript">
	var totalHarga = 0;
	$('.kasir-sub-total').each(harga){
		total += parseInt(harga.text());
	}
	$('#total_tagihan').val(totalHarga);
</script>