<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
       <article class="content forms-page">
            <section class="section">
                <div class="container">
                    <div class="row">
                        <div class="col-6">
                            <small>Keterangan : <span style="color:red">*</span> Wajib Diisi</small>
                        </div>
                        <div class="col-6">
                            <button type="button" class="btn btn-sm btn-success d_pasien-button" id="simpan-jual" style="float: right;">Simpan</button>
                        </div>
                    </div>
                    <form:form modelAttribute="jualModel" method="POST" action="/jual/store" id="jual-form">
                    <div class="row card-block">
                        <div class="col-6">
                            <div class="form-group">
                                <label>No</label>
                                <form:input path="jualNo" placeholder="Masukan Nomer" class="form-control"/>
                             </div>
                             
                            <div class="form-group">
                                <label>Tanggal jual</label>
                                <form:input path="jual_tanggal" type="text" placeholder="Masukan Tgl Penjualan" class="form-control"/>
                             </div>
                             
                             <div class="form-group">
                                <label>Pendafataran Nomer</label>
                                <select name="jualPendaftaranId" id="jualPendaftaranId" class="form-control">
                                     <c:forEach var="tempPendaftaran" items="${pendaftaran}">
                                             <option value="${tempPendaftaran.pendaftaranID }">
                                             ${tempPendaftaran.pendaftaranNo }
                                             </option>
                                         </c:forEach>
                                 </select>
                             </div>
                             
                            <div class="form-group">
                                <label>Pasien</label>
                                <select name="jualPasienId" id="jualPasienId" class="form-control">
                                     <c:forEach var="tempPasien" items="${pasien}">
                                             <option value="${tempPasien.pasienID }">
                                             ${tempPasien.pasienNama }
                                             </option>
                                         </c:forEach>
                                 </select>
                             </div>
<%--                            
                             <div class="form-group">
                                <label>Alamat Pasien</label>
                                <form:input path="jualPasienAlamat" type="text" placeholder="Masukan Pasien Id" class="form-control"/>
                             </div>
--%>                             
                             <div class="form-group">
                                <label>Pegawai</label>
                                <select name="jualPegawaiId" id="jualPegawaId" class="form-control">
                                     <c:forEach var="tempPegawai" items="${pegawai}">
                                             <option value="${tempPegawai.pegawaiID }">
                                             ${tempPegawai.pegawaiNama }
                                             </option>
                                         </c:forEach>
                                 </select>
                             </div>
<%--                             
                             <div class="form-group">
                                <label>Dokter</label>
                                <form:input path="jualDokterId" placeholder="Masukan Nomer Pendaftaran" class="form-control"/>
                             </div>
                        </div>
--%>                    </div>
                        <div class="col-6">
                         
                            <div class="form-group">
                                <label>Diskon</label>
                                <form:input path="jualDiskon" type="text" placeholder="Masukan Pasien Id" class="form-control"/>
                             </div>
                             
                             <div class="form-group">
                                <label>Total</label>
                                <form:input path="jualTotal" type="text" placeholder="Masukan Tgl Penjualan" class="form-control"/>
                             </div>
                             
                             <div class="form-group">
                                <label>Bayar</label>
                                <form:input path="jualBayarId" placeholder="Masukan Nomer Pendaftaran" class="form-control"/>
                             </div>
                             
                            <div class="form-group">
                                <label>Jumlah Bayar</label>
                                <form:input path="jualBayarJumlah" type="text" placeholder="Masukan Pasien Id" class="form-control"/>
                             </div>
                         </div>
                     </div>
                         <%--
                         <div class="form-group">
                            <label>Status</label>
                            <form:input path="jualStatus" type="text" placeholder="Masukan Pasien Id" class="form-control"/>
                         </div>
                         --%>
                         <div class="col col-12" style="padding:0">
                            <div class="container">
                                <div class="card card-success">
                                    <div class="card-header" style="min-height:0">
                                        <div class="header-block" style="padding: 5px 20px">
                                            <p class="title"> Detail Barang </p>
                                        </div>
                                    </div>
                                    <div class="card-block" style="background-color: #f4f4f4">
                                        <button type="button" class="btn btn-sm btn-success" style="float: right;"
                                        id="add_detail" data-toggle="modal" data-target="#form-detail">
                                            <span class="fa fa-plus"></span>&nbsp;Tambah
                                        </button>
                                       <div class="table-responsive" style="overflow-y: auto;">
                                           <table class="table table-striped table-bordered table-hover table-form">
                                               <thead>
                                                   <tr>
                                                       <th>Nama Barang</th>
                                                       <th>Kadalursa</th>
                                                       <th>Satuan</th>
                                                       <th>Jumlah</th>
                                                       <th>Harga</th>
                                                       <th>Sub Total</th>
                                                       <th>Aksi</th>
                                                       
                                                   </tr>
                                               </thead>
                                               <tbody id="jual-list">
                                               </tbody>
                                           </table>
                                       </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        </form:form>                        
                    </div>
                </section>
            </article>
    <div class="modal fade" id="form-detail" role="dialog">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
            	<div class="modal-header">
                     <h4 class="modal-title">Tambah jual Barang</h4>
                     <button type="button" class="close" data-dismiss="modal"
                         aria-label="Close">
                         <span aria-hidden="true">�</span> <span class="sr-only">Close</span>
                     </button>
                 </div>
                 <div class="modal-body modal-tab-container">
                     <form>
                         <div class="form-group">
                             <label>Nama Barang</label>
                             <select name="jualDetailBarangId" id="jualDetailBarangId" onchange="setHarga()">
                                 <c:forEach var="tempBarang" items="${barang}">
                                         <option value="${tempBarang.barang.barangId }" data-harga="${tempBarang.barangHJHJ }">
                                         ${tempBarang.barang.barangNama }
                                         </option>
                                     </c:forEach>
                             </select>
                             
                         </div>
                         <div class="form-group">
                             <label>Satuan</label>
                             <select name="jualDetailSatuanId" id="jualDetailSatuanId">
                                 <c:forEach var="tempSatuan" items="${satuan}">
                                         <option value="${tempSatuan.satuanID }">
                                         ${tempSatuan.satuanNama }
                                         </option>
                                     </c:forEach>
                             </select>
                         </div>
                         
                         <div class="form-group">
                             <label>Kadaluarsa</label>
                             <input type="text" name="jualDetailKadaluarsa" id="jualDetailKadaluarsa">
                         </div>

                         <div class="form-group">
                             <label>Jumlah</label>
                             <input type="text" name="jualDetailJumlah" id="jualDetailJumlah" onkeypress="setTotal()">
                         </div>
                         <div class="form-group">
                             <label>Harga</label>
                             <input type="text" name="jualDetailHarga" id="jualDetailHarga" readonly="">
                         </div>
                         <div class="form-group">
                             <label>Sub Total</label>
                             <input type="text" name="jualDetailSubTotal" id="jualDetailSubTotal" readonly="">
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
<jsp:include page="../app/footer.jsp" />