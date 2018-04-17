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
                            <form:input path="rujukan_jenis" placeholder="Masukan Jenis" class="form-control"/>
                         </div>
                         
                        <div class="form-group">
                            <label>Nama</label>
                            <form:input path="rujukan_nama" placeholder="Masukan Nama" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Nama Alamat</label>
                            <form:input path="rujukan_alamat" placeholder="Masukan Alamat" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Kecamatan</label>
                            <form:input path="rujukan_kecamatan" placeholder="Masukan Kecamatan" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Kota</label>
                            <form:input path="rujukan_kota" placeholder="Masukan Kota" class="form-control"/>
                         </div>
                        
                        <div class="form-group">
                            <label>Propinsi</label>
                            <form:input path="rujukan_propinsi" placeholder="Masukan Propinsi" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Telp</label>
                            <form:input path="rujukan_telp" placeholder="Masukan Telp" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Email</label>
                            <form:input path="rujukan_email" placeholder="Masukan Email" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Fax</label>
                            <form:input path="rujukan_fax" placeholder="Masukan Fax" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Nama CP</label>
                            <form:input path="rujukan_cp" placeholder="Masukan CP " class="form-control"/>
                         </div>                                        
                         
                         <div class="form-group">
                            <label>CP Telp</label>
                            <form:input path="rujukan_cp_telp" placeholder="Masukan CP Telp" class="form-control"/>
                         </div>
                        
                        <div class="form-group">
                            <label>Kode</label>
                            <form:input path="rujukan_kode" placeholder="Masukan Keterangan" class="form-control"/>
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