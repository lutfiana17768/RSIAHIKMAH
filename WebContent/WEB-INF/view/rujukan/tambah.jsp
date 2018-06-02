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
    					<h3 class="title"> Data Rujukan </h3>
    				</div>
    				<form:form modelAttribute="rujukanModel" method="POST" action="store">                                         
                        <div class="form-group">
                            <label>Jenis</label>
                            <form:input path="rujukanJenis" placeholder="Masukan Jenis" class="form-control"/>
                         </div>
                         
                        <div class="form-group">
                            <label>Nama</label>
                            <form:input path="rujukanNama" placeholder="Masukan Nama" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Nama Alamat</label>
                            <form:input path="rujukanAlamat" placeholder="Masukan Alamat" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Kecamatan</label>
                            <form:input path="rujukanKecamatan" placeholder="Masukan Kecamatan" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Kota</label>
                            <form:input path="rujukanKota" placeholder="Masukan Kota" class="form-control"/>
                         </div>
                        
                        <div class="form-group">
                            <label>Propinsi</label>
                            <form:input path="rujukanPropinsi" placeholder="Masukan Propinsi" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Telp</label>
                            <form:input path="rujukanTelp" placeholder="Masukan Telp" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Email</label>
                            <form:input path="rujukanEmail" placeholder="Masukan Email" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Fax</label>
                            <form:input path="rujukanFax" placeholder="Masukan Fax" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Nama CP</label>
                            <form:input path="rujukanCp" placeholder="Masukan CP " class="form-control"/>
                         </div>                                        
                         
                         <div class="form-group">
                            <label>CP Telp</label>
                            <form:input path="rujukanCpTelp" placeholder="Masukan CP Telp" class="form-control"/>
                         </div>
                        
                        <div class="form-group">
                            <label>Kode</label>
                            <form:input path="rujukanKode" placeholder="Masukan Keterangan" class="form-control"/>
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