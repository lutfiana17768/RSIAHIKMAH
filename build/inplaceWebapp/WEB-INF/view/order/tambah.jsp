<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />

	<section class="section">
        <div class="row sameheight-container">
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <div class="card card-block sameheight-item">
                    <div class="title-block">
                        <h3 class="title"> Data Order </h3>
                    </div>
                    <button type="button" id="add_order" class="btn btn-success btn-sm" data-toggle="modal"
                    data-target="#form-detail">Tambah</button>
                    <form:form modelAttribute="orderModel" method="POST" action="store" id="order-form">
                    <div class="form-group">
                            <button type="button" id="simpan-order" class="btn btn-primary">Simpan</button>
                        </div>
                        <div class="form-group">
                            <label>No</label>
                            <form:input path="orderNomer" placeholder="Masukan Nomer" class="form-control"/>
                         </div>
                         
                        <div class="form-group">
                            <label>Tanggal Order</label>
                            <form:input path="orderTanggal" type="text" placeholder="Masukan Tgl Order" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Jatuh Tempo </label>
                            <form:input path="orderJatuhTempo" type="text" placeholder="Jatuh tempo" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Perusahaan</label>
                            <form:input path="orderPerusahaanId" placeholder="Perusahaan" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Diskon</label>
                            <form:input path="orderDiskon" placeholder="Diskon" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>CashBack</label>
                            <form:input path="orderCashback" placeholder="Cashback" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Total Bayar</label>
                            <form:input path="orderTotal" placeholder="Total bayar" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Jumlah Bayar</label>
                            <form:input path="orderJumlahBayar" placeholder="Jumlah bayar" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>TTD Nama</label>
                            <form:input path="orderTtdNama" placeholder="TTd Nama" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Status</label>
                            <form:input path="orderStatus" placeholder="Status" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Jabatan</label>
                            <form:input path="orderTtdJabatanNama" placeholder="Jabatan" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Jenis Barang</label>
                            <form:input path="orderBarangJenis" placeholder="Jenis Barang" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Group</label>
                            <form:input path="orderGroup" placeholder="Group" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Keterangan</label>
                            <form:input path="orderKeterangan" placeholder="Keterangan" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>NIP</label>
                            <form:input path="orderTtdNip" placeholder="NIP" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Order Revised</label>
                            <form:input path="orderRevised" placeholder="Order Revised" class="form-control"/>
                         </div>
                         <div class="form-group">
                         <div class="card-block" style="background-color: #f4f4f4">
                               <div class="table-responsive" style="overflow-y: auto;">
                                   <table class="table table-striped table-bordered table-hover table-form">
                                       <thead>
                                           <tr>
                                               <th>Nama Barang</th>
                                               <th>Satuan</th>
                                               <th>Jumlah</th>
                                               <th>Harga</th>
                                               <th>Sub Total</th>
                                               <th>Aksi</th>
                                               
                                           </tr>
                                       </thead>
                                       <tbody id="order-list">
                                       </tbody>
                                   </table>
                               </div>
                           </div>
                           </div>
                    </form:form>
                </div>
            </div>
        </div>
	</section>
    <div class="modal fade" id="form-detail" role="dialog">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
            	<div class="modal-header">
                     <h4 class="modal-title">Tambah Order Barang</h4>
                     <button type="button" class="close" data-dismiss="modal"
                         aria-label="Close">
                         <span aria-hidden="true">�</span> <span class="sr-only">Close</span>
                     </button>
                 </div>
                 <div class="modal-body modal-tab-container">
                     <form>
                         <div class="form-group">
                             <label>Nama Barang</label>
                             <input type="text" name="orderDetailBarangId" id="orderDetailBarangId">
                             
                         </div>
                         <div class="form-group">
                             <label>Satuan</label>
                             <select name="orderDetailSatuanId" id="orderDetailSatuanId">
                                 <c:forEach var="tempSatuan" items="${satuan}">
                                         <option value="${tempSatuan.satuan_id }">
                                         ${tempSatuan.satuanNama }
                                         </option>
                                     </c:forEach>
                             </select>
                         </div>
                         <div class="form-group">
                             <label>Jumlah</label>
                             <input type="text" name="orderDetailJumlah" id="orderDetailJumlah">
                         </div>
                         <div class="form-group">
                             <label>Harga</label>
                             <input type="text" name="orderDetailHarga" id="orderDetailHarga">
                         </div>
                         <div class="form-group">
                             <label>Sub Total</label>
                             <input type="text" name="orderDetailSubTotal" id="orderDetailSubTotal">
                         </div>
                         <input type="hidden" name="order_mode" id="order_mode">                                                                               
                         <input type="hidden" name="order_edit" id="order_edit">
                     </form>
                 </div>
                 <div class="modal-footer">
                      <button type="button" class="btn btn-secondary"
                          data-dismiss="modal">Close</button>
                      <button type="button" id="simpan-detail" class="btn btn-primary">Simpan</button>
                  </div>
         	</div>
		<!-- /.modal-content -->
		</div>
	</div>
<jsp:include page="ScriptOrder.jsp" />
<jsp:include page="../app/footer.jsp" />