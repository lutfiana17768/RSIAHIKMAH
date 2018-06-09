<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
<table class="table table-striped table-bordered table-hover">
<section class="section">
        <div class="row sameheight-container">
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <div class="card card-block sameheight-item">
                    <div class="title-block">
                        <h3 class="title"> update Data Resep </h3>
                    </div>
                    <form:form modelAttribute="resepModel" method="POST" action="/resep/update">
                        <form:hidden path="resepID" />
                        <form:hidden path="resepCreatedBy" />
                        <form:hidden path="resepCreatedDate" />
                        <form:hidden path="resepAktif" />
                        <div class="form-group">
                            <label>Resep Norm</label>
                            <form:input path="resepPasienNorm" placeholder="resep norm" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Tanggal Resep</label>
                            <form:input path="resepTanggal" type="date" placeholder="tanggal resep" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Resep Status</label>
                            <form:input path="resepStatus" placeholder="resep status" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Nama Pasien</label>
                            <form:input path="resepPasienNama" placeholder="nama pasien" class="form-control"/>
                         </div>
                         <div classs="form-group">
                            <label>Alamat pasien</label>
                            <form:input path="resepPasienAlamat" placeholder="alamat pasien" class="form-control"/>
                         </div><div class="form-group">
                            <label>Resep Dokter</label>
                            <form:input path="resepDokterNama" placeholder="resep dokter" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Nomer Resep</label>
                            <form:input path="resepNo" placeholder="nomer resep" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Resep Data</label>
                            <form:input path="resepData" placeholder="resep data" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Resep unit Nama</label>
                            <form:input path="resepUnitNama" placeholder="resep unit nama" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Resep Dimension</label>
                            <form:input path="resepDimension" placeholder="resdep dimension" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Ruang Resep</label>
                            <form:input path="resepRuangNama" placeholder="ruang resep" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Keterangan</label>
                            <form:input path="resepKeterangan" placeholder="keterangan" class="form-control"/>
                         </div>
                        
                         <div class="form-group">
                            <button type="submit" class="btn btn-primary">Simpan</button>
                        </div>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </section>
<jsp:include page="../app/footer.jsp" />