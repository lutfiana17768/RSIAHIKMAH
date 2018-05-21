<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
	<section class="section">
		<div class="row sameheight-container">
			<div class="col-12" id="add_paket_form">
				<div class="card">
					<div class="card-header bordered">
						<div class="header-block">
							<h3 class="title">Tambah Paket </h3>
						</div>
						<div class="header-block pull-right">
							<button type="button" id="simpan-paket" class="btn btn-primary float-right rounded-0 pull-right" style="margin: 0px;">Simpan</button>
						</div>
					</div>
				<div class="card card-success" style="box-shadow: none; border: none;">
					<div class="card-block row">
						<div class="col-4">
							<form:form modelAttribute="paketModel" method="POST" action="/paket/store" id="paket-form">
								<div class="form-group">
									<label>Nama Paket</label>
									<form:input path="paket_nama" placeholder="Masukan Nama Paket" class="form-control boxed" />
								</div>

								<div class="form-group">
									<label>Kelas</label>
									<div class="select2-wrapper">
										<form:select path="kelas.kelas_id" class="form-control boxed input-lg select2-single">
											<option value="">--- Pilih Kelas ---</option>
											<c:forEach var="kelas" items="${kelases}">
												<form:option value="${kelas.kelas_id }" label="${kelas.kelas_nama }" />
											</c:forEach>
										</form:select>
									</div>
								</div>
								<div class="form-group">
									<label>Keterangan</label>
									<form:input path="paket_keterangan" placeholder="Masukan Keterangan" class="form-control boxed" />
								</div>

								<div class="form-group">
									<label>Harga</label>
									<form:input path="paket_harga" placeholder="Masukan Harga" class="form-control boxed" />
								</div>


								<div class="form-group">
									<label>Jenis</label>
									<div class="select2-wrapper">
										<form:select path="paket_jenis" items="${jenispaket}" class="form-control boxed" />
									</div>
								</div>
							</form:form>
						</div>
						<div class="col-8">
							<div class="col col-12" style="padding:0">
								<div class="sameheight-item" data-exclude="xs" id="dashboard-history">
									<div class="card-block">
										<ul class="nav nav-tabs nav-tabs-bordered" role="tablist">
											<li class="nav-item">
												<a class="nav-link" id="tab_first" href="#ruangan" role="tab" data-toggle="tab">Ruangan</a>
											</li>
											<li class="nav-item">
												<a class="nav-link" href="#tindakan" role="tab" data-toggle="tab">Tindakan</a>
											</li>
											<li class="nav-item">
												<a class="nav-link" href="#penunjang" role="tab" data-toggle="tab">Penunjang</a>
											</li>
											<li class="nav-item">
												<a class="nav-link" href="#obatalkes" role="tab" data-toggle="tab">Obat/Alkes</a>
											</li>
										</ul>
										<div class="tab-content tabs-bordered" style="padding: 10px 0px;">
											<div role="tabpanel" class="tab-pane fade active" id="ruangan">
												<div class="container-fluid" style="padding:0">
													<div class="card-header card-header-sm">
														<div class="header-block">
															<button type="button" id="add_ruang" class="btn rounded-0 btn-success btn-sm" data-toggle="modal" data-target="#form-paket-ruang">Tambah</button>
														</div>
													</div>
													<div class="card-block">
														<div class="table-responsive" style="overflow-y: auto;">
															<table class="table table-striped table-bordered table-hover">
																<thead>
																	<tr>
																		<th>Nama Ruangan</th>
																		<th>Harga</th>
																		<th>Aksi</th>
																	</tr>
																</thead>
																<tbody id="paket-ruang-list" class="table-form">
																</tbody>
															</table>
														</div>
													</div>
												</div>
											</div>
											<div role="tabpanel" class="tab-pane fade" id="tindakan">
												<div class="container-fluid" style="padding:0">
													<div class="card-header card-header-sm">
														<div class="header-block">
															<button type="button" id="add_tindakan" class="btn btn-success btn-sm rounded-0" data-toggle="modal" data-target="#form-paket-tindakan">Tambah</button>
														</div>
													</div>
													<div class="card-block">
														<div class="table-responsive" style="overflow-y: auto;">
															<table class="table table-striped table-bordered table-hover">
																<thead>
																	<tr>
																		<th>Nama Tindakan</th>
																		<th>Jumlah</th>
																		<th>Harga</th>
																		<th>Sub harga</th>
																		<th>Aksi</th>
																	</tr>
																</thead>
																<tbody id="paket-tindakan-list" class="table-form">
																</tbody>
															</table>
														</div>
													</div>
												</div>
											</div>
											<div role="tabpanel" class="tab-pane fade" id="penunjang">
												<div class="container-fluid" style="padding:0">
													<div class="card-header card-header-sm">
														<div class="header-block">
															<button type="button" class="btn rounded-0 btn-success btn-sm" id="add_penunjang">Tambah</button>
														</div>
													</div>
													<div class="card-block">
														<div class="table-responsive" style="overflow-y: auto;">
															<table class="table table-striped table-bordered table-hover">
																<thead>
																	<tr>
																		<th>Nama Pemeriksaan</th>
																		<th>Jumlah</th>
																		<th>Harga</th>
																		<th>Sub harga</th>
																		<th>Aksi</th>
																	</tr>
																</thead>
																<tbody id="paket-penunjang-list" class="table-form">
																</tbody>
															</table>
														</div>
													</div>
												</div>
											</div>
											<div role="tabpanel" class="tab-pane fade" id="obatalkes">
												<div class="container-fluid" style="padding:0">
													<div class="card-header card-header-sm">
														<div class="header-block">
															<button type="button" class="btn rounded-0 btn-success btn-sm" id="add_barang" data-toggle="modal" data-target="#form-paket-barang">Tambah</button>
														</div>
													</div>
													<div class="card-block">
														<div class="table-responsive" style="overflow-y: auto;">
															<table class="table table-striped table-bordered table-hover">
																<thead>
																	<tr>
																		<th>Nama Obat</th>
																		<th>Satuan</th>
																		<th>Jumlah</th>
																		<th>Harga</th>
																		<th>Sub harga</th>
																		<th>Aksi</th>

																	</tr>
																</thead>
																<tbody id="paket-barang-list" class="table-form">
																</tbody>
															</table>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		</div>
		<div class="modal fade" id="form-paket-ruang">
			<div class="modal-dialog modal-lg">
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title">Tambah Ruang</h4>
						<button type="button" class="close" data-dismiss="modal" aria-label="Close">
							<span aria-hidden="true">X</span>
							<span class="sr-only">Close</span>
						</button>
					</div>
					<div class="modal-body">
						<form id="form-ruang" class="from-horizontal">
							<div class="form-group">
								<label>Nama Ruang</label>
								<select name="m_ruang_id" id="m_ruang_id" class="form-control boxed">
									<option value="">--- Pilih Ruang ---</option>
									<c:forEach var="ruang" items="${ruangs}">
										<option value="${ruang.ruang_id }">
											${ruang.ruang_nama }
										</option>
									</c:forEach>
								</select>
							</div>
							<div class="form-group">
								<label>Harga</label>
								<input type="text" name="paket_ruang_harga" id="paket_ruang_harga" class="form-control boxed">
							</div>
							<input type="hidden" name="ruang_mode" id="ruang_mode">
							<input type="hidden" name="ruang_edit" id="ruang_edit">
						</form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
						<button type="button" id="simpan-ruang" class="btn btn-primary rounded-0">Simpan</button>
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>
		<div class="modal fade" id="form-paket-tindakan">
			<div class="modal-dialog modal-lg">
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title">Tambah Tindakan</h4>
						<button type="button" class="close" data-dismiss="modal" aria-label="Close">
							<span aria-hidden="true">X</span>
							<span class="sr-only">Close</span>
						</button>
					</div>
					<div class="modal-body">
						<form id="form-tindakan" class="from-horizontal">
							<div class="form-group">
								<label>Nama Tindakan</label>
								<select name="m_tindakan_id" id="m_tindakan_id" class="form-control boxed">
									<option value="">--- Pilih Tindakan ---</option>
									<c:forEach var="tindakans" items="${tindakans}">
										<option value="${tindakans.tindakan_id }">
											${tindakans.tindakan_nama }
										</option>
									</c:forEach>
								</select>
							</div>
							<div class="form-group">
								<label>Jumlah</label>
								<input type="text" name="paket_tindakan_jumlah" id="paket_tindakan_jumlah" class="form-control boxed">
							</div>
							<div class="form-group">
								<label>Harga</label>
								<input type="text" name="paket_tindakan_harga" id="paket_tindakan_harga" class="form-control boxed">
							</div>
							<div class="form-group">
								<label>Sub Harga</label>
								<input type="text" name="paket_tindakan_subharga" id="paket_tindakan_subharga" class="form-control boxed">
							</div>
							<input type="hidden" name="tindakan_mode" id="tindakan_mode">
							<input type="hidden" name="tindakan_edit" id="tindakan_edit">
						</form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
						<button type="button" id="simpan-tindakan" class="btn btn-primary rounded-0">Simpan</button>
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>
		<div class="modal fade" id="form-paket-penunjang">
			<div class="modal-dialog modal-lg">
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title">Tambah Penunjang</h4>
						<button type="button" class="close" data-dismiss="modal" aria-label="Close">
							<span aria-hidden="true">X</span>
							<span class="sr-only">Close</span>
						</button>
					</div>
					<div class="modal-body">
						<form id="form-penunjang" class="from-horizontal">
							<div class="form-group">
								<label>Nama Penunjang</label>
								<select name="penunjangmedis_id" id="penunjangmedis_id" class="form-control boxed">
									<option value="">--- Pilih Penunjang ---</option>
									<c:forEach var="penunjang" items="${penunjangs}">
										<option value="${penunjang.penunjangmedis_id }">
											${penunjang.penunjangmedis_nama }
										</option>
									</c:forEach>
								</select>
							</div>
							<div class="form-group">
								<label>Jumlah</label>
								<input type="text" name="paket_penunjang_jumlah" id="paket_penunjang_jumlah" class="form-control boxed">
							</div>
							<div class="form-group">
								<label>Harga</label>
								<input type="text" name="paket_penunjang_harga" id="paket_penunjang_harga" class="form-control boxed">
							</div>
							<div class="form-group">
								<label>Sub Harga</label>
								<input type="text" name="paket_penunjang_subharga" id="paket_penunjang_subharga" class="form-control boxed">
							</div>
							<input type="hidden" name="penunjang_mode" id="penunjang_mode">
							<input type="hidden" name="penunjang_edit" id="penunjang_edit">
						</form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
						<button type="button" id="simpan-penunjang" class="btn btn-primary rounded-0">Simpan</button>
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>
		<div class="modal fade" id="form-paket-barang">
			<div class="modal-dialog modal-lg">
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title">Tambah Obat/Alkes</h4>
						<button type="button" class="close" data-dismiss="modal" aria-label="Close">
							<span aria-hidden="true">X</span>
							<span class="sr-only">Close</span>
						</button>
					</div>
					<div class="modal-body">
						<form id="form-barang" class="from-horizontal">
							<div class="form-group">
								<label>Nama Obat/Alkes</label>
								<select name="m_barang_id" id="m_barang_id" class="form-control boxed">
									<option value="">--- Pilih Obat ---</option>
									<c:forEach var="obat" items="${obats}">
										<option value="${obat.obat_id }">
											${obat.obat_nama }
										</option>
									</c:forEach>
								</select>
							</div>
							<div class="form-group">
								<label>Satuan</label>
								<select name="paket_satuan_id" id="paket_satuan_id" class="form-control boxed">
									<c:forEach var="satuan" items="${satuan}" varStatus="loop">
										<option value="${satuan.key}">${satuan.value}</option>
									</c:forEach>
								</select>
							</div>
							<div class="form-group">
								<label>Jumlah</label>
								<input type="text" name="paket_barang_jumlah" id="paket_barang_jumlah" class="form-control boxed">
							</div>
							<div class="form-group">
								<label>Harga</label>
								<input type="text" name="paket_barang_harga" id="paket_barang_harga" class="form-control boxed">
							</div>
							<div class="form-group">
								<label>Sub Harga</label>
								<input type="text" name="paket_barang_subharga" id="paket_barang_subharga" class="form-control boxed">
							</div>
							<input type="hidden" name="barang_mode" id="barang_mode">
							<input type="hidden" name="barang_edit" id="barang_edit">
						</form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
						<button type="button" id="simpan-barang" class="btn btn-primary rounded-0">Simpan</button>
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>

		<div class="modal fade" id="confirm-modal">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title">
							<i class="fa fa-warning"></i> Alert
						</h4>
						<button type="button" class="close" data-dismiss="modal" aria-label="Close">
							<span aria-hidden="true">X</span>
						</button>
					</div>
					<div class="modal-body">
						<p>Are you sure want to do this?</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-primary rounded-0" data-dismiss="modal">Yes</button>
						<button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">No</button>
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>
		<!-- /.modal -->
	</section>
<jsp:include page="../app/footer.jsp" />