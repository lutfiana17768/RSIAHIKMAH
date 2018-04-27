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
                        <h3 class="title"> Data Gaji </h3>
                    </div>
                    <form:form modelAttribute="orderModel" method="POST" action="/order/store">
                        <div class="form-group">
                            <label>No</label>
                            <form:input path="orderNomer" placeholder="Masukan Nomer" class="form-control"/>
                         </div>
                         
                        <div class="form-group">
                            <label>Tanggal Order</label>
                            <form:input path="orderTanggal" type="date" placeholder="Masukan Tgl Order" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Jatuh Tempo </label>
                            <form:input path="orderJatuhTempo" type="date" placeholder="Jatuh tempo" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Perusahaan</label>
                            <form:input path="orderPerusahaan" placeholder="Perusahaan" class="form-control"/>
                         </div>
                         <div classs="form-group">
                            <label>Diskon</label>
                            <form:input path="orderDiskon" placeholder="Diskon" class="form-control"/>
                         </div><div class="form-group">
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
                            <button type="submit" class="btn btn-primary">Simpan</button>
                        </div>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </section>
<jsp:include page="../app/footer.jsp" />