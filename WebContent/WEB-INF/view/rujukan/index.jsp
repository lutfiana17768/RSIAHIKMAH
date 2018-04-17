<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
	<section class="section">
		<div class="container">
			<div class="container" id="add_Rujukan_form" style="display: none">
				<div class="card card-success">
					<div class="card-header" style="min-height:0">
						<div class="header-block" style="padding: 5px 20px">
							<a href="/rujukan/tambah"> Tambah Rujukan </a>
						</div>
					</div>
					<div class="row card-block" style="background-color: #f4f4f4;margin:0;">
						<div class="col-6">
							<div class="form-group">
								<label class="control-label">Jenis Rujukan<span style="color:red">*</span></label>
								<select class="form-control boxed form-control-sm">
									<option>Option one</option>
									<option>Option two</option>
									<option>Option three</option>
									<option>Option four</option>
								</select>
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Kode Rujukan</label>
								<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Nama Rujukan<span style="color:red">*</span></label>
								<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Alamat</label>
								<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Kelurahan</label>
								<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
							</div>
							<small>Keterangan : <span style="color:red">*</span> Wajib Diisi</small>
						</div>
						<div class="col-6">
							<div class="form-group">
								<label for="exampleInputEmail1">Kecamatan</label>
								<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Provinsi</label>
								<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Telp</label>
								<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Email</label>
								<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Fax</label>
								<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
							</div>
							
						</div>
					</div>
					<div class="container form-group"  style="float: right;background-color: #f5f5f5;margin-bottom: 0">
						<button type="button" class="btn btn-danger d_pasien-button">Batal</button>
						<button type="button" class="btn btn-primary d_pasien-button">Simpan</button>
					</div>
				</div>
			</div>
			<div class="container">
				<div class="form-group">
					<button type="button" class="btn btn-sm btn-primary" id="add_Rujukan">Tambah</button>
				</div>
			</div>
			<div class="container">
				<div class="card card-success">
					<div class="card-header" style="min-height:0">
						<div class="header-block" style="padding: 5px 20px">
							<p class="title"> Data Rujukan </p>
						</div>
					</div>
					<div class="card-block" style="background-color: #f4f4f4">
						<div class="table-responsive">
						 <jsp:include page="inc/tabel.jsp" />
						</div>
					</div>
				</div>
			</div>
			
		</div>
	</section>
<jsp:include page="../app/footer.jsp" />