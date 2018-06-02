<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />

	<section class="section">
		<div class="card">
			<div class="card-header">
				<div class="header-block w-100">
					<h3 class="title pt-2"> Kasir </h3>
					<div class="btn-group btn-group pull-right" role="group">
						<button class="btn btn-success rounded-0">Simpan dan Cetak Kuitansi</button>
						<button class="btn btn-success rounded-0">Simpan dan Cetak Bukti</button>
						<button class="btn btn-success rounded-0">Simpan</button>
						<button class="btn btn-danger rounded-0">Batas</button>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-6">
					<div class="card-block">
						<div class="form-group">
		                    <label>Total Tagihan</label>
		                    <input type="text" placeholder="Masukan Total Tagihan" class="form-control boxed">
		                </div>
						<div class="form-group">
		                    <label>Total Dibayar</label>
		                    <input type="text" placeholder="Masukan Total Bayar" class="form-control boxed">
		                </div>
						<div class="form group">
		                    <label>Deposit</label>
		                    <input type="text" placeholder="Deposit" class="form-control boxed">
		                </div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="card-block">
						<ul class="nav nav-tabs nav-tabs-bordered" id="myTab" role="tablist">
							<li class="nav-item">
								<a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">Cara Bayar 1</a>
							</li>
							<li class="nav-item">
								<a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile" aria-selected="false">Cara Bayar 2</a>
							</li>
							<li class="nav-item">
								<a class="nav-link" id="contact-tab" data-toggle="tab" href="#contact" role="tab" aria-controls="contact" aria-selected="false">Cara Bayar 3</a>
							</li>
						</ul>
						<div class="tab-content tabs-bordered" id="myTabContent">
							<div class="tab-pane fade pb-3 show active" id="home" role="tabpanel" aria-labelledby="home-tab">
								<div class="form group row mb-3">
		        		            <label class="col-sm-2 col-form-label" for="select-harga">Cara bayar</label>
		        		            <div class="col-sm-10">
			                		    <select name="" class="boxed form-control" id="select-harga">
			                		    	<option value="">TUNAI</option>
			                		    	<option value="">KREDIT</option>
			                		    </select>
		        		            </div>
		                		</div>
		                		<div class="form group row mb-3">
		        		            <label class="col-sm-2 col-form-label" for="select-harga">Kembalian</label>
		        		            <div class="col-sm-10">
			                		    <input type="text" class="form-control boxed" placeholder="Kembalian">
		        		            </div>
		                		</div>
							</div>
							<div class="tab-pane fade pb-3" id="profile" role="tabpanel" aria-labelledby="profile-tab">
								<div class="form group row mb-3">
		        		            <label class="col-sm-2 col-form-label" for="select-harga">Cara bayar</label>
		        		            <div class="col-sm-10">
			                		    <select name="" class="boxed form-control" id="select-harga">
			                		    	<option value="">TUNAI</option>
			                		    	<option value="">KREDIT</option>
			                		    </select>
		        		            </div>
		                		</div>
		                		<div class="form group row mb-3">
		        		            <label class="col-sm-2 col-form-label" for="select-harga">Kembalian</label>
		        		            <div class="col-sm-10">
			                		    <input type="text" class="form-control boxed" placeholder="Kembalian">
		        		            </div>
		                		</div>
							</div>
							<div class="tab-pane fade pb-3" id="contact" role="tabpanel" aria-labelledby="contact-tab">
								<div class="form group row mb-3">
		        		            <label class="col-sm-2 col-form-label" for="select-harga">Cara bayar</label>
		        		            <div class="col-sm-10">
			                		    <select name="" class="boxed form-control" id="select-harga">
			                		    	<option value="">TUNAI</option>
			                		    	<option value="">KREDIT</option>
			                		    </select>
		        		            </div>
		                		</div>
		                		<div class="form group row mb-3">
		        		            <label class="col-sm-2 col-form-label" for="select-harga">Kembalian</label>
		        		            <div class="col-sm-10">
			                		    <input type="text" class="form-control boxed" placeholder="Kembalian">
		        		            </div>
		                		</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-8">
					<div class="card-block">
						<section class="list-paket">
							<div class="table-responsive">
								<table class="table table-striped table-bordered table-hover">
									<thead>
										<tr>
											<th>Keterangan</th>
											<th>Jumlah</th>
											<th>Biaya</th>
											<th>Cover</th>
											<th>Subtotal</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
										</tr>
									</tbody>
								</table>
							</div>
						</section>
					</div>
					<div class="card-block">
						<section class="list-paket">
							<div class="table-responsive">
								<table class="table table-striped table-bordered table-hover">
									<thead>
										<tr>
											<th>Keterangan</th>
											<th>Jumlah</th>
											<th>Biaya</th>
											<th>Cover</th>
											<th>Subtotal</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
										</tr>
									</tbody>
								</table>
							</div>
						</section>
					</div>
				</div>
				<div class="col-sm-4">
					<form>
						<div class="form-group row">
							<label for="staticEmail" class="col-sm-4 col-form-label">Tgl. MRS : </label>
							<div class="col-sm-8">
								${daftar.pendaftaranMrs}
							</div>
						</div>
						<div class="form-group row">
							<label for="staticEmail" class="col-sm-4 col-form-label">No Daftar : </label>
							<div class="col-sm-8">
								${daftar.pendaftaranNo}
							</div>
						</div>
						<div class="form-group row">
							<label for="staticEmail" class="col-sm-4 col-form-label">Dokter : </label>
							<div class="col-sm-8">
								${daftar.pegawai.pegawaiNama}
							</div>
						</div>
						<div class="form-group row">
							<label for="staticEmail" class="col-sm-4 col-form-label">No. RM : </label>
							<div class="col-sm-8">
								${daftar.pasien.pasienNorm}
							</div>
						</div>
						<div class="form-group row">
							<label for="staticEmail" class="col-sm-4 col-form-label">Nama : </label>
							<div class="col-sm-8">
								${daftar.pasien.pasienNama}
							</div>
						</div>
						<div class="form-group row">
							<label for="staticEmail" class="col-sm-4 col-form-label">Tgl Lahir : </label>
							<div class="col-sm-8">
								${daftar.pasien.pasienTanggallahir}
							</div>
						</div>
						<div class="form-group row">
							<label for="staticEmail" class="col-sm-4 col-form-label">Alamat : </label>
							<div class="col-sm-8">
								${daftar.pasien.pasienAlamat}
							</div>
						</div>
						<div class="form-group row">
							<label for="staticEmail" class="col-sm-4 col-form-label">L/P : </label>
							<div class="col-sm-8">
								${daftar.pasien.pasienKelamin}
							</div>
						</div>
						<div class="form-group row">
							<label for="staticEmail" class="col-sm-4 col-form-label">No. Telp : </label>
							<div class="col-sm-8">
								${daftar.pasien.pasienNotelp}
							</div>
						</div>
						<div class="form-group row">
							<label for="staticEmail" class="col-sm-4 col-form-label">Pembayaran : </label>
							<div class="col-sm-8">
								_++_+_+_+_+_+
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
<jsp:include page="../app/footer.jsp" />
