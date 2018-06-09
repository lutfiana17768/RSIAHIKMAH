<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />

				<section class="section">
					<div class="container">
						<small>Keterangan : <span style="color:red">*</span> Wajib Diisi</small>
						<form:form modelAttribute="barangModel" method="POST" action="store">
						<div class="row card-block">
							<div class="col-6">
								<div class="form-group">
									<label class="control-label">Jenis Barang</label>
									<div>
										<label>
												<form:radiobutton path="IdJenisBarang" value="0"/>
												<span>Obat</span>
											</label>
										<label>
												<form:radiobutton path="IdJenisBarang" value="1"/>
												<span>Alat</span>
											</label>
										<label>
												<form:radiobutton path="IdJenisBarang" value="2"/>
												<span>Jasa</span>
											</label>
									</div>
								</div>
								
								<div class="form-group">
									<label for="exampleInputEmail1">Kode</label>
									<input type="text" class="form-control boxed form-control-sm">
								</div>
								
								<div class="form-group">
									<label for="exampleInputEmail1">Nama Barang<span style="color:red">*</span></label>
									<input type="text" class="form-control boxed form-control-sm">
								</div>
								
								<div class="form-group">
									<label class="control-label">Satuan Terkecil<span style="color:red">*</span></label>
									<select class="form-control boxed form-control-sm">
											<option>Option one</option>
											<option>Option two</option>
											<option>Option three</option>
											<option>Option four</option>
										</select>
								</div>
								
							<div class="col-6">
								<div class="form-group">
									<label for="exampleInputEmail1">Keterangan</label>
									<input type="text" class="form-control boxed form-control-sm">
								</div>
								<div class="form-group">
									<label for="exampleInputEmail1">Profit(%)<span style="color:red">*</span></label>
									<input type="number" class="form-control boxed form-control-sm">
								</div>
								<div class="form-group">
									<label for="exampleInputEmail1">Stok Minimal</label>
									<input type="number" class="form-control boxed form-control-sm">
								</div>

								<label for="exampleInputEmail1">Harga HET</label>
								<div class="input-group input-group-sm">
									<span class="input-group-addon">Rp</span>
									<input type="number" class="form-control">
									<span class="input-group-addon">,00</span>
								</div>
								
								<label for="exampleInputEmail1">Harga Jual<span style="color:red">*</span></label>
								<div class="input-group input-group-sm">
									<span class="input-group-addon">Rp</span>
									<input type="number" class="form-control">
									<span class="input-group-addon">,00</span>
								</div>
							</div>
						</div>
						
						<div class="col col-12" style="padding:0">
							<div class="card sameheight-item" data-exclude="xs" id="dashboard-history">
								<div class="card-header card-header-sm bordered">
									<ul class="nav nav-tabs" role="tablist">
										<li class="nav-item">
											<a class="nav-link active" href="#satuan" role="tab" data-toggle="tab">Satuan Konversi</a>
										</li>
										<li class="nav-item">
											<a class="nav-link" href="#detail" role="tab" data-toggle="tab">Detail Paket</a>
										</li>
										<li class="nav-item">
											<a class="nav-link" href="#jenis-pasien" role="tab" data-toggle="tab">Untuk Jenis Pasien</a>
										</li>
										<li class="nav-item">
											<a class="nav-link" href="#jasa" role="tab" data-toggle="tab">Jasa</a>
										</li>
									</ul>
								</div>
								<div class="card-block">
									
									<div class="card-block" style="background-color: #f4f4f4">
										<div class="table-responsive">
											<table class="table table-sm table-striped table-bordered table-hover">
												<thead>
													<tr>
														<th>Satuan</th>
														<th>Nilai</th>
														<th>Satuan Default?</th>
													</tr>
												</thead>
												<tbody id="barang-list">
											</table>
										</div>
									</div>
									<div role="tabpanel" class="tab-pane fade" id="detail">
										<div class="container-fluid" style="padding:0">
											<small>Kosong</small>
										</div>
									</div>
									<div role="tabpanel" class="tab-pane fade" id="jenis-pasien">
										<div class="container-fluid" style="padding:0">
											<small>Kosong</small>
										</div>
									</div>
									<div role="tabpanel" class="tab-pane fade" id="jasa">
										<div class="container-fluid" style="padding:0">
											<small>Kosong</small>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				<div class="container form-group" style="float: right;background-color: #f5f5f5;margin-bottom:20px">
					<a href="v_barang_index.html"><button type="button" class="btn btn-danger d_pasien-button">Batal</button></a>
					<button type="button" class="btn btn-primary d_pasien-button">Simpan</button>
				</div>

				<div class="container">
					<div class="form-group" style="float: right;">
						<button type="button" class="btn btn-sm btn-danger">Hapus</button>
					</div>
				</div>
				</form:form>
			</div>
		</section>
				
				
<jsp:include page="ScriptBarang.jsp" />
<jsp:include page="../app/footer.jsp" />