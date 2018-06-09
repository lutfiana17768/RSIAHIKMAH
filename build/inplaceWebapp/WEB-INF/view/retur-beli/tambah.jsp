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
                    <button type="button" id="add_detail" class="btn btn-success btn-sm" data-toggle="modal"
                    data-target="#form-detail">Tambah</button>
                    <form:form modelAttribute="returBeliModel" method="POST" action="store" id="order-form">
                    <div class="form-group">
                            <button type="button" id="simpan-order" class="btn btn-primary">Simpan</button>
                        </div>
                        <div class="form-group">
                            <label>No</label>
                            <form:input path="returBeliNo" placeholder="Masukan Nomer" class="form-control"/>
                         </div>
                         
                        <div class="form-group">
                            <label>Tanggal Retur</label>
                            <form:input path="returBeliTanggal" type="text" placeholder="Masukan Tgl Order" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Terima</label>
                            <form:input path="returBeliTerimaId" placeholder="Masukan Nomer" class="form-control"/>
                         </div>
                         
                        <div class="form-group">
                            <label>Perusahaan</label>
                            <form:input path="returBeliPerusahaanId" type="text" placeholder="Masukan Tgl Order" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Alamat Perusahaan</label>
                            <form:input path="returBeliPerusahaanAlamat" type="text" placeholder="Masukan Tgl Order" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Telepon</label>
                            <form:input path="returBeliPerusahaanNoTelp" type="text" placeholder="Masukan Tgl Order" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Total</label>
                            <form:input path="returBeliTotal" placeholder="Masukan Nomer" class="form-control"/>
                         </div>
                         
                        <div class="form-group">
                            <label>Group</label>
                            <form:input path="returBeliGroup" type="text" placeholder="Masukan Tgl Order" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>PPN</label>
                            <form:input path="returBeliPPN" type="text" placeholder="Masukan Tgl Order" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Total PPN</label>
                            <form:input path="returBeliTotalPPN" type="text" placeholder="Masukan Tgl Order" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                         <div class="card-block" style="background-color: #f4f4f4">
                               <div class="table-responsive" style="overflow-y: auto;">
                                   <table class="table table-striped table-bordered table-hover table-form">
                                       <thead>
                                           <tr>
                                               <th>Nama Barang</th>
                                               <th>Satuan</th>
                                               <th>Kadaluarsa</th>
                                               <th>Jumlah</th>
                                               <th>Harga</th>
                                               <th>Sub Total</th>
                                               <th>Aksi</th>
                                               
                                           </tr>
                                       </thead>
                                       <tbody id="returbeli-list">
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
                     <h4 class="modal-title">Tambah Barang Retur Beli</h4>
                     <button type="button" class="close" data-dismiss="modal"
                         aria-label="Close">
                         <span aria-hidden="true">�</span> <span class="sr-only">Close</span>
                     </button>
                 </div>
                 <div class="modal-body modal-tab-container">
                     <form>
                         <div class="form-group">
                             <label>Nama Barang</label>
                             <input type="text" name="ReturbeliBarangNama" id="orderDetailBarangId">
                             
                         </div>
                         <div class="form-group">
                             <label>Satuan</label>
                             <select name="ReturBeliSatuanId" id="ReturBeliSatuanId">
                                 <c:forEach var="tempSatuan" items="${satuan}">
                                         <option value="${tempSatuan.satuan_id }">
                                         ${tempSatuan.satuanNama }
                                         </option>
                                     </c:forEach>
                             </select>
                         </div>
                         <div class="form-group">
                             <label>Kadaluarsa</label>
                             <input type="text" name="ReturBeliKadaluarsa" id="ReturBeliKadaluarsa">
                         </div>
                         
                         <div class="form-group">
                             <label>Jumlah</label>
                             <input type="text" name="ReturBeliJumlah" id="ReturBeliJumlah">
                         </div>
                         <div class="form-group">
                             <label>Harga</label>
                             <input type="text" name="ReturBeliHarga" id="ReturBeliHarga">
                         </div>
                         <div class="form-group">
                             <label>Sub Total</label>
                             <input type="text" name="ReturBeliSubTotal" id="ReturBeliSubTotal">
                         </div>
                         <input type="hidden" name="detail_mode" id="detail_mode">                                                                               
                         <input type="hidden" name="detail_edit" id="detail_edit">
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
<!-- <jsp:include page="ScriptOrder.jsp" /> -->
<jsp:include page="../app/footer.jsp" />