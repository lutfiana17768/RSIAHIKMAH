<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title> Form Pegawai RSIA </title>
		<link href="<c:url value="/resources/css/bootstrap.min.css "/>" rel="stylesheet" type="text/css"/>
	</head>
	
	<body>
		<H2>Form Kepegawaian</H2>
		
		<form class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label" for="form_control_1">No Pegawai
                    <span class="required" aria-required="true">*</span>
                </label>
                <div class="col-sm-10">
                	<input type="text" name="no" class="form-control" placeholder="Masukan No Pegawai" />
                </div>
			</div>
			
			<div class="form-group">
				<label class="col-sm-2 control-label" for="form_control_1">Nama Pegawai
                    <span class="required" aria-required="true">*</span>
                </label>
                <div class="col-sm-10">
                	<input type="text" name="nama" class="form-control" placeholder="Masukan Nama Pegawai" />
                </div>
			</div>
			
			<div class="form-group">
				<label class="col-sm-2 control-label" for="form_control_1">Jenis Kelamin
                    <span class="required" aria-required="true">*</span>
                </label>
                <div class="col-sm-10">
                	<select class="form-control" name="jenis_kelamin">
                        <option value=""> ---Pilih Satu--- </option>
                        <option value="L"> Laki-Laki </option>
                        <option value="P"> Perempuan </option>
                    </select>
                </div>
			</div>
			
			<div class="form-group">
				<label class="col-sm-2 control-label" for="form_control_1">Jenis Pegawai
                    <span class="required" aria-required="true">*</span>
                </label>
                <div class="col-sm-10">
                	<select class="form-control" name="jenis_pegawai">
                        <option value=""> ---Pilih Satu--- </option>
                        <option value="1"> Dokter </option>
                        <option value="2"> Bidan </option>
                        <option value="0"> Lainnya </option>
                    </select>
                </div>
			</div>
			
			<div class="form-group">
				<label class="col-sm-2 control-label" for="form_control_1">Tanggal Lahir
                    <span class="required" aria-required="true">*</span>
                </label>
                <div class="col-sm-10">
                	<input type="date" name="tanggal_lahir" class="form-control" placeholder="Masukan Tanggal Lahir" />
                </div>
			</div>
			
			<div class="form-group">
				<label class="col-sm-2 control-label" for="form_control_1">Kota Lahir
                    <span class="required" aria-required="true">*</span>
                </label>
                <div class="col-sm-10">
                	<select class="form-control" name="kota_lahir">
                        <option value=""> ---Pilih Satu--- </option>
                        <option value="1"> Surabaya </option>
                        <option value="2"> Mojokerto </option>
                        <option value="0"> Lainnya </option>
                    </select>
                </div>
			</div>
			
			<div class="form-group">
				<label class="col-sm-2 control-label" for="form_control_1">Alamat
                    <span class="required" aria-required="true">*</span>
                </label>
                <div class="col-sm-10">
                	<input type="text" name="alamat" class="form-control" placeholder="Masukan Alamat Pegawai" />
                </div>
			</div>
			
			<div class="form-group">
				<label class="col-sm-2 control-label" for="form_control_1">Kota
                    <span class="required" aria-required="true">*</span>
                </label>
                <div class="col-sm-10">
                	<select class="form-control" name="kota">
                        <option value=""> ---Pilih Satu--- </option>
                        <option value="1"> Surabaya </option>
                        <option value="2"> Mojokerto </option>
                        <option value="0"> Lainnya </option>
                    </select>
                </div>
			</div>
			
			<div class="form-group">
				<label class="col-sm-2 control-label" for="form_control_1">Nama Jabatan
                    <span class="required" aria-required="true">*</span>
                </label>
                <div class="col-sm-10">
                	<select class="form-control" name="nama_jabatan">
                        <option value=""> ---Pilih Satu--- </option>
                        <option value="dokter"> Dokter </option>
                        <option value="bidan"> Bidan </option>
                        <option value="0"> Lainnya </option>
                    </select>
                </div>
			</div>
			
			<div class="form-group">
				<label class="col-sm-2 control-label" for="form_control_1">Pendidikan
                    <span class="required" aria-required="true">*</span>
                </label>
                <div class="col-sm-10">
                	<select class="form-control" name="pendidikan">
                        <option value=""> ---Pilih Satu--- </option>
                        <option value="1"> SMA </option>
                        <option value="2"> S1 </option>
                        <option value="3"> S2 </option>
                    </select>
                </div>
			</div>
			
			<div class="form-group">
				<label class="col-sm-2 control-label" for="form_control_1">Medis
                    <span class="required" aria-required="true">*</span>
                </label>
                <div class="col-sm-10">
                	<select class="form-control" name="medis">
                        <option value=""> ---Pilih Satu--- </option>
                        <option value="perawat"> Perawat </option>
                        <option value="apoteker"> Apoteker </option>
                        <option value="lainnya"> Lainnya </option>
                    </select>
                </div>
			</div>
			
			<div class="form-group">
				<label class="col-sm-2 control-label" for="form_control_1">Tanggal Masuk
                    <span class="required" aria-required="true">*</span>
                </label>
                <div class="col-sm-10">
                	<input type="date" name="tanggal_masuk" class="form-control" placeholder="Masukan Tanggal Masuk" />
                </div>
			</div>
			
			<div class="form-group">
				<label class="col-sm-2 control-label" for="form_control_1">Tanggal Keluar
                </label>
                <div class="col-sm-10">
                	<input type="date" name="tanggal_keluar" class="form-control" placeholder="Masukan Tanggal Keluar" />
                </div>
			</div>
			
			<div class="form-group">
				<label class="col-sm-2 control-label" for="form_control_1">Nomer HP
                    <span class="required" aria-required="true">*</span>
                </label>
                <div class="col-sm-10">
                	<input type="text" name="no_hp" class="form-control" placeholder="Masukan Nomer Handphone" />
                </div>
			</div>
			
			<div class="form-group">
				<label class="col-sm-2 control-label" for="form_control_1">Email
                    <span class="required" aria-required="true">*</span>
                </label>
                <div class="col-sm-10">
                	<input type="text" name="email" class="form-control" placeholder="email" />
                </div>
			</div>
			
			<div class="form-group">
				<label class="col-sm-2 control-label" for="form_control_1">Nomer HP
                    <span class="required" aria-required="true">*</span>
                </label>
                <div class="col-sm-10">
                	<input type="text" name="no_hp" class="form-control" placeholder="Masukan Nomer Handphone" />
                </div>
			</div>
			
			<div class="form-group">
				<label class="col-sm-2 control-label" for="form_control_1">Bank
                    <span class="required" aria-required="true">*</span>
                </label>
                <div class="col-sm-10">
                	<select class="form-control" name="nama_bank">
                        <option value=""> ---Pilih Satu--- </option>
                        <option value="BNI"> BNI </option>
                        <option value="BCA"> BCA </option>
                        <option value="lainnya"> Lainnya </option>
                    </select>
                </div>
			</div>
			
			<div class="form-group">
				<label class="col-sm-2 control-label" for="form_control_1">Akun Bank
                    <span class="required" aria-required="true">*</span>
                </label>
                <div class="col-sm-10">
                	<input type="text" name="akun_bank" class="form-control" placeholder="Masukan Nama Akun" />
                </div>
			</div>
			
			<div class="form-group">
				<label class="col-sm-2 control-label" for="form_control_1">Nomer Rekening
                    <span class="required" aria-required="true">*</span>
                </label>
                <div class="col-sm-10">
                	<input type="text" name="no_rekening" class="form-control" placeholder="Masukan Nomer Rekening" />
                </div>
			</div>
			
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default"> Submit </button>
				</div>
			</div>
			
		</form>
		<script src="<c:url value="/resources/js/vendor.js" />"></script>
		<script src="<c:url value="/resources/js/app.js" />"></script>
	</body>
</html>