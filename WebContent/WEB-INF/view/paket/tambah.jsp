<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
	<section class="section">
		<div class="row sameheight-container">
			<div class="col-12" id="add_paket_form">
				<div class="card card-success">
					<div class="card-header" style="min-height:0">
						<div class="header-block row" style="padding: 5px 20px">
							<p class="title"> Tambah Paket </p>
						</div>
					</div>
					<div class="card-block row" style="background-color: #f4f4f4">
						<div class="col-4">
							<form:form modelAttribute="paketModel" method="POST" action="store" id="paket-form">
								<div class="form-group">
									<label>Nama Paket</label>
									<form:input path="paket_nama" placeholder="Masukan Nama Paket" class="form-control" />
								</div>

								<div class="form-group">
									<label>Kelas</label>
									<div class="select2-wrapper">
										<form:select path="kelas.kelas_id" class="form-control input-lg select2-single">
											<c:forEach var="kelas" items="${kelases}">
												<form:option value="${kelas.kelas_id }" label="${kelas.kelas_nama }" />
											</c:forEach>
										</form:select>
									</div>
								</div>
								<div class="form-group">
									<label>Keterangan</label>
									<form:input path="paket_keterangan" placeholder="Masukan Keterangan" class="form-control" />
								</div>

								<div class="form-group">
									<label>Harga</label>
									<form:input path="paket_harga" placeholder="Masukan Harga" class="form-control" />
								</div>


								<div class="form-group">
									<label>Jenis</label>
									<div class="select2-wrapper">
										<form:select path="paket_jenis" items="${jenispaket}" class="form-control" />
									</div>
								</div>
							</form:form>
						</div>
						<div class="col-8">
							<div class="col col-12" style="padding:0">
								<div class="card sameheight-item" data-exclude="xs" id="dashboard-history">
									<div class="card-header card-header-sm bordered">
										<ul class="nav nav-tabs" role="tablist">
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
									</div>
									<div class="card-block">
										<div class="tab-content">
											<div role="tabpanel" class="tab-pane fade active" id="ruangan">
												<div class="container-fluid" style="padding:0">
													<div class="card-header card-header-sm bordered" style="background-color: #f0f0f0">
														<div class="header-block">
															<button type="button" id="add_ruang" class="btn btn-success btn-sm" data-toggle="modal" data-target="#form-paket-ruang">Tambah</button>
														</div>
													</div>
													<div class="card-block" style="background-color: #f4f4f4">
														<div class="table-responsive" style="overflow-y: auto;">
															<table class="table table-striped table-bordered table-hover">
																<thead>
																	<tr>
																		<th>Nama Ruangan</th>
																		<th>Harga</th>
																		<th>Aksi</th>

																	</tr>
																</thead>
																<tbody id="paket-ruang-list">
																</tbody>
															</table>
														</div>
													</div>
												</div>
											</div>
											<div role="tabpanel" class="tab-pane fade" id="tindakan">
												<div class="container-fluid" style="padding:0">
													<div class="card-header card-header-sm bordered" style="background-color: #f0f0f0">
														<div class="header-block">
															<button type="button" id="add_tindakan" class="btn btn-success btn-sm" data-toggle="modal" data-target="#form-paket-tindakan">Tambah</button>
														</div>
													</div>
													<div class="card-block" style="background-color: #f4f4f4">
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
																<tbody id="paket-tindakan-list">
																</tbody>
															</table>
														</div>
													</div>
												</div>
											</div>
											<div role="tabpanel" class="tab-pane fade" id="penunjang">
												<div class="container-fluid" style="padding:0">
													<div class="card-header card-header-sm bordered" style="background-color: #f0f0f0">
														<div class="header-block">
															<button type="button" class="btn btn-success btn-sm" id="add_penunjang">Tambah</button>
														</div>
													</div>
													<div class="card-block" style="background-color: #f4f4f4">
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
																<tbody>
																	<tr>
																		<td>Table cell</td>
																		<td>Table cell</td>
																		<td>Table cell</td>
																		<td>Table cell</td>
																		<td>
																			<button type="button" class="btn btn-danger btn-sm">Delete</button>&nbsp
																			<button type="button" class="btn btn-primary btn-sm">Edit</button>
																		</td>
																	</tr>

																</tbody>
															</table>
														</div>
													</div>
												</div>
											</div>
											<div role="tabpanel" class="tab-pane fade" id="obatalkes">
												<div class="container-fluid" style="padding:0">
													<div class="card-header card-header-sm bordered" style="background-color: #f0f0f0">
														<div class="header-block">
															<button type="button" class="btn btn-success btn-sm" id="add_barang" data-toggle="modal" data-target="#form-paket-barang">Tambah</button>
														</div>
													</div>
													<div class="card-block" style="background-color: #f4f4f4">
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
																<tbody id="paket-barang-list">
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
					<div class="text-right">
						<div class="form-group">
							<button type="button" id="simpan-paket" class="btn btn-primary">Simpan</button>
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
							<span aria-hidden="true">�</span>
							<span class="sr-only">Close</span>
						</button>
					</div>
					<div class="modal-body modal-tab-container">
						<form id="form-ruang" class="from-horizontal">
							<div class="form-group">
								<label>Nama Ruang</label>
								<select name="m_ruang_id" id="m_ruang_id">
									<c:forEach var="ruang" items="${ruangs}">
										<option value="${ruang.ruang_id }">
											${ruang.ruang_nama }
										</option>
									</c:forEach>
								</select>
							</div>
							<div class="form-group">
								<label>Harga</label>
								<input type="text" name="paket_ruang_harga" id="paket_ruang_harga">
							</div>
						</form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						<button type="button" id="simpan-ruang" class="btn btn-primary">Simpan</button>
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
							<span aria-hidden="true">�</span>
							<span class="sr-only">Close</span>
						</button>
					</div>
					<div class="modal-body modal-tab-container">
						<form id="form-tindakan" class="from-horizontal">
							<div class="form-group">
								<label>Nama Tindakan</label>
								<select name="m_tindakan_id" id="m_tindakan_id">
									<c:forEach var="tindakans" items="${tindakans}">
										<option value="${tindakans.tindakan_id }">
											${tindakans.tindakan_nama }
										</option>
									</c:forEach>
								</select>
							</div>
							<div class="form-group">
								<label>Jumlah</label>
								<input type="text" name="paket_tindakan_jumlah" id="paket_tindakan_jumlah">
							</div>
							<div class="form-group">
								<label>Harga</label>
								<input type="text" name="paket_tindakan_harga" id="paket_tindakan_harga">
							</div>
							<div class="form-group">
								<label>Sub Harga</label>
								<input type="text" name="paket_tindakan_subharga" id="paket_tindakan_subharga">
							</div>
							<input type="hidden" name="tindakan_mode" id="tindakan_mode">
							<input type="hidden" name="tindakan_edit" id="tindakan_edit">
						</form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						<button type="button" id="simpan-tindakan" class="btn btn-primary">Simpan</button>
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
							<span aria-hidden="true">�</span>
							<span class="sr-only">Close</span>
						</button>
					</div>
					<div class="modal-body modal-tab-container">
						<form id="form-barang" class="from-horizontal">
							<div class="form-group">
								<label>Nama Obat/Alkes</label>
								<select name="m_barang_id" id="m_barang_id">
									<c:forEach var="obat" items="${obat}">
										<option value="${obat.obat_id }">
											${obat.obat_nama }
										</option>
									</c:forEach>
								</select>
							</div>
							<div class="form-group">
								<label>Satuan</label>
								<select name="paket_satuan_id" id="paket_satuan_id">
									<c:forEach var="satuan" items="${satuan}" varStatus="loop">
										<option value="${satuan.key}">${satuan.value}</option>
									</c:forEach>
								</select>
							</div>
							<div class="form-group">
								<label>Jumlah</label>
								<input type="text" name="paket_barang_jumlah" id="paket_barang_jumlah">
							</div>
							<div class="form-group">
								<label>Harga</label>
								<input type="text" name="paket_barang_harga" id="paket_barang_harga">
							</div>
							<div class="form-group">
								<label>Sub Harga</label>
								<input type="text" name="paket_barang_subharga" id="paket_barang_subharga">
							</div>
							<input type="hidden" name="barang_mode" id="barang_mode">
							<input type="hidden" name="barang_edit" id="barang_edit">
						</form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						<button type="button" id="simpan-barang" class="btn btn-primary">Simpan</button>
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
							<span aria-hidden="true">�</span>
						</button>
					</div>
					<div class="modal-body">
						<p>Are you sure want to do this?</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-primary" data-dismiss="modal">Yes</button>
						<button type="button" class="btn btn-secondary" data-dismiss="modal">No</button>
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>
		<!-- /.modal -->
	</section>
<jsp:include page="../app/footer.jsp" />