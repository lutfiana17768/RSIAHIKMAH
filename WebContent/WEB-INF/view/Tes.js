		var allOrder = [];
		
		function storeOrderDetail() {
			var Order = new Object();
	
			Order.barangId = document.getElementById("orderDetailBarangId").value;
			Order.satuanId = document.getElementById("orderDetailSatuanId").value;
			Order.jumlah = document.getElementById("orderDetailJumlah").value;
			Order.harga = document.getElementById("orderDetailHarga").value;
			Order.subTotal = document.getElementById("orderDetailSubTotal").value;
		 	
			allOrder.push(Order);
		}
		
		function showOrderDetail(){
			var str = "<div class='table-responsive'> " +
				"<table class='table table-striped table-bordered table-hover'> " +
				"<thead>" +
				"<tr>" +
				"<th>Nama Barang</th>" +
				"<th>Satuan</th>" +
				"<th>Jumlah</th>" +
				"<th>Harga</th>" +
				"<th>Total</th>" +
				"</tr>" +
				"</thead>";
		
			if (allOrder.length != 0) {
				for (var i = 0; i < allOrder.length; i++){
					str = str +
					"<tbody> " +
					"<tr>" +
					"<td>"+ allOrder[i].barangId +"</td>" +
					"<td>"+ allOrder[i].satuanId +"</td>" +
					"<td>"+ allOrder[i].jumlah+"</td>" +
					"<td>"+ allOrder[i].harga+"</td>" +
					"<td>"+ allOrder[i].subTotal+"</td>" +
					"</tr>" +
					"</tbody>" +
					"</table>";
				}
			}

			else {
				str = str +
					"<tbody> " +
					"</tbody>" +
					"</table>";
			}

			return str;
		}