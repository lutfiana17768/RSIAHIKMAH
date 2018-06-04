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
			<form:form modelAttribute="penunjangModel" method="POST" id="penunjang-form" action="/penunjang/store">
				<div class="card-block row">
					<div class="col-lg-4">
						<div class="row">
							<div class="col-lg-12">
								<div class="form-group">
									<label>Kode</label>
						            <form:input path="penunjangmedisKode" placeholder="Masukan Kode" class="form-control boxed" />
								</div>
								<div class="form-group">
									<label>Jenis</label>
									<form:select path="penunjangGroup.pmedisgroupID" id="jenis_penunjang" class="form-control boxed input-lg">
										<option value="">--- Pilih Jenis ---</option>
										<c:forEach var="penunjangGroup" items="${penunjangGroups}">
											<form:option value="${penunjangGroup.pmedisgroupID }" data-report="${penunjangGroup.pmedisgroupMaster }">${penunjangGroup.pmedisgroupDetail }</form:option>
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
					</div>
					<div class="col-lg-4">
						<div class="row">
							<div class="col-lg-12">
								<div class="form-group">
									<label>Parameter Periksa</label>
						            <form:input path="paramperiksa[0].paramperiksaNama" id="paramperiksaNama" placeholder="Masukan Kode" class="form-control boxed" />
								</div>
								<div class="form-group">
									<label>Nilai Normal</label>
						            <form:input path="paramperiksa[0].paramperiksaStandar" id="paramperiksaStandar" placeholder="Masukan Standar" class="form-control boxed" />
								</div>
								<div class="form-group">
									<label>Satuan</label>
						            <form:input path="paramperiksa[0].paramperiksaSatuan" id="paramperiksaSatuan" placeholder="Masukan Satuan" class="form-control boxed" />
								</div>
								<div class="form-group">
									<label>harga</label>
						            <form:input path="paramperiksa[0].paramperiksaHarga" id="paramperiksaHarga" placeholder="Masukan Harga" class="form-control boxed" />
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-4">
						<div class="card-block">
		                    <ul class="nav nav-tabs nav-tabs-bordered">
		                        <li class="nav-item">
		                            <a href="/penunjang/tambah#tab-tarif" class="nav-link active" data-target="#tab-tarif" data-toggle="tab" aria-controls="tab-tarif" role="tab" aria-expanded="true">Tarif</a>
		                        </li>
		                        <!-- <li class="nav-item">
		                            <a href="/penunjang/tambah#tab-pemeriksaan" class="nav-link" data-target="#tab-pemeriksaan" aria-controls="tab-pemeriksaan" data-toggle="tab" role="tab" aria-expanded="false">Pemeriksaan</a>
		                        </li> -->
		                    </ul>
		                    <!-- Tab panes -->
		                    <div class="tab-content tabs-bordered">
		                        <div class="tab-pane fade in active show" id="tab-tarif" aria-expanded="true">
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
											</tbody>
										</table>
									</div>
								</div>
		                        <!-- <div class="tab-pane fade" id="tab-pemeriksaan" aria-expanded="false">
									<button type="button" id="add_pemeriksaan" class="btn rounded-0 btn-success btn-sm" data-toggle="modal" data-target="#form-penunjang-pemeriksaan">Tambah</button>
									<div class="table-responsive">
										<table class="table table-striped table-bordered table-hover">
											<thead id="penunjang-pemeriksaan-column">
												<tr>
													<th>Nama Pemeriksaan</th>
													<th>Nilai Normal</th>
													<th>Satuan</th>
													<th>Harga</th>
													<th>Action</th>
												</tr>
											</thead>
											<tbody id="penunjang-pemeriksaan-list" class="table-form">
											</tbody>
										</table>
									</div>
		                        </div> -->
		                    </div>
		                </div>
					</div>
				</div>
			</form:form>
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
