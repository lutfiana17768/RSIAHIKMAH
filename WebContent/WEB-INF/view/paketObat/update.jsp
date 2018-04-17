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
	               <h3 class="title">Data Paket</h3>
	            </div>
	            <form:form modelAttribute="paketobatModel" method="POST"
	               action="update">
	               <form:hidden path="paket_barang_id" />
	               <div class="form-group">
	                  <label>Nama Paket</label>
	                  <form:input path="paket_nama"
	                     placeholder="Masukan Nama Paket Obat" class="form-control" />
	               </div>
	               <div class="form-group">
	                  <label>Paket</label>
	                  <div class="select2-wrapper">
	                     <form:select path="m_paket_id"
	                        class="form-control input-lg select2-single">
	                        <c:forEach var="paket" items="${paket}">
	                           <form:option value="${paket.paket_id }"
	                              label="${paket.paket_nama}" />
	                        </c:forEach>
	                     </form:select>
	                  </div>
	               </div>
	               <div class="form-group">
	                  <label>Obat</label>
	                  <div class="select2-wrapper">
	                     <form:select path="m_obat_id"
	                        class="form-control input-lg select2-single">
	                        <c:forEach var="obat" items="${obat}">
	                           <form:option value="${obat.obat_id }"
	                              label="${obat.obat_nama}" />
	                        </c:forEach>
	                     </form:select>
	                  </div>
	               </div>
	               <div class="form-group">
	                  <label>Kelas</label>
	                  <div class="select2-wrapper">
	                     <form:select path="m_kelas_id"
	                        class="form-control input-lg select2-single">
	                        <c:forEach var="kelas" items="${kelas}">
	                           <form:option value="${kelas.kelas_id }"
	                              label="${kelas.kelas_nama }" />
	                        </c:forEach>
	                     </form:select>
	                  </div>
	               </div>
	               <div class="form-group">
	                  <label>Jumlah Barang</label>
	                  <form:input path="paket_barang_jumlah"
	                     placeholder="Masukan Jumlah Barang" class="form-control" />
	               </div>
	               <div class="form-group">
	                  <label>Harga</label>
	                  <form:input path="paket_barang_harga"
	                     placeholder="Masukan Harga" class="form-control" />
	               </div>
	               <div class="form-group">
	                  <label>Satuan</label>
	                  <div class="select2-wrapper">
	                     <form:select path="paket_satuan_id" items="${satuan}"
	                        class="form-control" />
	                  </div>
	               </div>
	               <div class="form-group">
	                  <button type="submit" class="btn btn-primary">Simpan</button>
	               </div>
	            </form:form>
	         </div>
	      </div>
	   </div>
	</section>
<jsp:include page="../app/footer.jsp" />