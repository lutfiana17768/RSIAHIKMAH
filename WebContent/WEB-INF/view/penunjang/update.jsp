<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
	<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
		<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
			<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
				<jsp:include page="../app/header.jsp" />
				<section class="card">
					<div class="card-header bordered">
						<div class="header-block">
							<h3 class="title">Penunjang </h3>
						</div>
						<div class="header-block pull-right">
							<button type="button" id="simpan-penunjang" class="btn btn-primary float-right rounded-0 pull-right" style="margin: 0px;">Simpan</button>
						</div>
					</div>
					<div class="card card-success" style="box-shadow: none; border: none;">
						<div class="card-block row">
							<div class="col-lg-4">
								<form:form modelAttribute="penunjangModel" method="POST" id="penunjang-form" action="/penunjang/update">
								<form:hidden path="penunjangmedisID" />
								<form:hidden path="penunjangmedisCreatedBy" />
								<form:hidden path="penunjangmedisCreatedDate" />
									<div class="row">
										<div class="col-lg-12">
											<div class="form-group">
												<label>Kode</label>
												<form:input path="penunjangmedisKode" placeholder="Masukan Kode" class="form-control boxed" />
											</div>
											<div class="form-group">
												<label>Jenis</label>
												<form:select path="penunjangGroup.pmedisgroupID" class="form-control boxed input-lg">
													<option value="">--- Pilih Jenis ---</option>
													<c:forEach var="penunjangGroup" items="${penunjangGroups}">
														<form:option value="${penunjangGroup.pmedisgroupID }" label="${penunjangGroup.pmedisgroupDetail }" />
													</c:forEach>
												</form:select>
											</div>
											<div class="form-group">
												<label>Kategori</label>
												<form:select path="jenislayanan.jenislayananID" class="form-control boxed">
													<option value="">--- Pilih Kategori ---</option>
													<c:forEach var="jenislayanan" items="${jenisLayanans}">
														<form:option value="${jenislayanan.jenislayananID }" label="${jenislayanan.jenislayananNama }" />
													</c:forEach>
												</form:select>
											</div>
											<div class="form-group">
												<label>Pemeriksaan</label>
												<form:input path="penunjangmedisNama" placeholder="Masukan Nama Pemeriksaan" class="form-control boxed" />
											</div>
											<div class="form-group">
												<label>Keterangan</label>
												<form:input path="penunjangmedisKeterangan" placeholder="Masukan Nama Keterangan" class="form-control boxed" />
											</div>
										</div>
									</div>
									<div class="form-group">

									</div>
								</form:form>
							</div>
							<div class="col-lg-8">
								<div class="card-block">
									<ul class="nav nav-tabs nav-tabs-bordered">
										<li class="nav-item">
											<a href="#tab-tarif" class="nav-link active" data-target="#tab-tarif" data-toggle="tab" aria-controls="tab-tarif" role="tab">Tarif</a>
										</li>
										<li class="nav-item">
											<a href="#tab-pemeriksaan" class="nav-link" data-target="#tab-pemeriksaan" aria-controls="tab-pemeriksaan" data-toggle="tab"
											 role="tab">Pemeriksaan</a>
										</li>
									</ul>
									<!-- Tab panes -->
									<div class="tab-content tabs-bordered">
										<div class="tab-pane fade in active show" id="tab-tarif">
											<button type="button" id="add_tarif" class="btn rounded-0 btn-success btn-sm" data-toggle="modal" data-target="#form-penunjang-tarif">Tambah</button>
											<div class="table-responsive">
												<table class="table table-striped table-bordered table-hover">
													<thead>
														<tr>
															<th>Kelas</th>
															<th>Harga</th>
															<th>Aksi</th>
														</tr>
													</thead>
													<tbody id="penunjang-tarif-list" class="table-form">
														<c:forEach var="pkelas" items="${penunjangModel.penunjangkelas}" varStatus="loop">
															<tr id="tarif_${loop.index+1}">
																<td>${pkelas.kelases.kelasNama}</td>
																<td data-used="1" data-save="1" data-name="penunjangkelasHarga" data-kolom-id="penunjangTarifHarga">${pkelas.penunjangkelasHarga}</td>
																<td>
																	<button type="button" class="btn btn-danger btn-sm" onclick="deleteTarif(${loop.index+1})">Delete</button>&nbsp;
																	<button type="button" class="btn btn-primary btn-sm" onclick="editTarif(${loop.index+1})">Edit</button>
																</td>
																<td style="display:none" data-used="1" data-save="1" data-name="kelases.kelasID" data-kolom-id="penunjangTarifKelas">${pkelas.kelases.kelasID}</td>
																<td style="display:none" data-used="1" data-save="1" data-name="penunjangKelasID" data-kolom-id="penunjangKelasID">${pkelas.penunjangkelasID}</td>
															</tr>
														</c:forEach>
													</tbody>
												</table>
											</div>
										</div>
										<div class="tab-pane fade" id="tab-pemeriksaan">
											<button type="button" id="add_pemeriksaan" class="btn rounded-0 btn-success btn-sm" data-toggle="modal" data-target="#form-penunjang-pemeriksaan">Tambah</button>
											<div class="table-responsive">
												<table class="table table-striped table-bordered table-hover">
													<thead>
														<tr>
															<th>Detail Pemeriksaan</th>
															<th>Nilai Normal</th>
															<th>Satuan</th>
															<th>Action</th>
														</tr>
													</thead>
													<tbody id="penunjang-pemeriksaan-list" class="table-form">
														<c:forEach var="pp" items="${penunjangModel.paramperiksa}" varStatus="loop">
															<tr id="pemeriksaan_${loop.index+1}">
																<td data-used="1" data-save="1" data-name="paramperiksaNama" data-kolom-id="paramperiksaNama">${pp.paramperiksaNama}</td>
																<td data-used="1" data-save="1" data-name="paramperiksaStandar" data-kolom-id="paramperiksaStandar">${pp.paramperiksaStandar}</td>
																<td data-used="1" data-save="1" data-name="paramperiksaSatuan" data-kolom-id="paramperiksaSatuan">${pp.paramperiksaSatuan}</td>
																<td>
																	<button type="button" class="btn btn-danger btn-sm" onclick="deletePemeriksaan(${loop.index+1})">Delete</button>&nbsp;
																	<button type="button" class="btn btn-primary btn-sm" onclick="editPemeriksaan(${loop.index+1})">Edit</button>
																</td>
																<td style="display:none" data-used="1" data-save="1" data-name="paramperiksaID" data-kolom-id="paramperiksaID">${pp.paramperiksaID}</td>
															</tr>
														</c:forEach>
													</tbody>
												</table>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="modal fade" id="form-penunjang-tarif">
						<div class="modal-dialog modal-lg">
							<div class="modal-content">
								<div class="modal-header">
									<h4 class="modal-title">Tambah Kelas</h4>
									<button type="button" class="close" data-dismiss="modal" aria-label="Close">
										<span aria-hidden="true">X</span>
										<span class="sr-only">Close</span>
									</button>
								</div>
								<div class="modal-body">
									<form id="form-tarif" class="from-horizontal">
										<div class="form-group">
											<label>Kelas</label>
											<select name="penunjangTarifKelas" id="penunjangTarifKelas" class="form-control boxed">
												<option value="">--- Pilih Kelas ---</option>
												<c:forEach var="kelas" items="${kelases}">
													<option value="${kelas.kelasID }">
														${kelas.kelasNama }
													</option>
												</c:forEach>
											</select>
										</div>
										<div class="form-group">
											<label>Harga</label>
											<input type="text" name="penunjangTarifHarga" id="penunjangTarifHarga" class="form-control boxed">
										</div>
										<input type="hidden" name="tarif_mode" id="tarif_mode">
										<input type="hidden" name="tarif_edit" id="tarif_edit">
									</form>
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
									<button type="button" id="simpan-tarif" class="btn btn-primary rounded-0">Simpan</button>
								</div>
							</div>
							<!-- /.modal-content -->
						</div>
						<!-- /.modal-dialog -->
					</div>
					<div class="modal fade" id="form-penunjang-pemeriksaan">
						<div class="modal-dialog modal-lg">
							<div class="modal-content">
								<div class="modal-header">
									<h4 class="modal-title">Tambah Pemeriksaan</h4>
									<button type="button" class="close" data-dismiss="modal" aria-label="Close">
										<span aria-hidden="true">X</span>
										<span class="sr-only">Close</span>
									</button>
								</div>
								<div class="modal-body">
									<form id="form-pemeriksaan" class="from-horizontal">
										<div class="form-group">
											<label>Detail Pemeriksaan</label>
											<input type="text" name="paramperiksaNama" id="paramperiksaNama" class="form-control boxed">
											<% /** 
											<select name="pemeriksaanID" id="pemeriksaanDetail" class="form-control boxed">
												<option>SGO2</option>
												<option>KSa</option>
												<option>Laksas</option>
											</select>
											**/ %>
										</div>
										<div class="form-group">
											<label>Nilai Normal</label>
											<input type="text" name="paramperiksaStandar" id="paramperiksaStandar" class="form-control boxed">
										</div>
										<div class="form-group">
											<label>Satuan</label>
											<input type="text" name="paramperiksaSatuan" id="paramperiksaSatuan" class="form-control boxed">
										</div>
										<input type="hidden" name="pemeriksaan_mode" id="pemeriksaan_mode">
										<input type="hidden" name="pemeriksaan_edit" id="pemeriksaan_edit">
									</form>
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
									<button type="button" id="simpan-pemeriksaan" class="btn btn-primary rounded-0">Simpan</button>
								</div>
							</div>
							<!-- /.modal-content -->
						</div>
						<!-- /.modal-dialog -->
					</div>
				</section>
				<jsp:include page="../app/footer.jsp" />