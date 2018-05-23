<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
			
	<section class="card">
		<div class="card-header bordered">
			<div class="header-block">
				<h3 class="title">Pelayanan </h3>
			</div>
			<div class="header-block pull-right">
				<button type="button" id="simpan-pelayanan" class="btn btn-primary float-right rounded-0 pull-right" style="margin: 0px;">Simpan</button>
			</div>
		</div>
		<div class="card card-success" style="box-shadow: none; border: none;">
			<div class="card-block row">
				<div class="col-lg-4">
					read data pasien
				</div>
				<div class="col-lg-8">
					insert pelayanan
					<form id="pelayanan-form" method="POST" action="/pelayanan/store">
						
					</form>
				</div>
			</div>
		</div>

		<div class="card-block">
            <ul class="nav nav-tabs nav-tabs-bordered">
                <li class="nav-item">
                    <a href="#tab-fisik" class="nav-link active" data-target="#tab-fisik" data-toggle="tab" aria-controls="tab-fisik" role="tab">Fisik</a>
                </li>
                <li class="nav-item">
                    <a href="#tab-pemeriksaan" class="nav-link" data-target="#tab-pemeriksaan" aria-controls="tab-pemeriksaan" data-toggle="tab" role="tab">Pemeriksaan</a>
                </li>
                <li class="nav-item">
                    <a href="#tab-diagnosa" class="nav-link" data-target="#tab-diagnosa" aria-controls="tab-diagnosa" data-toggle="tab" role="tab">diagnosa</a>
                </li>
                <li class="nav-item">
                    <a href="#tab-prosedur" class="nav-link" data-target="#tab-prosedur" aria-controls="tab-prosedur" data-toggle="tab" role="tab">prosedur</a>
                </li>
                <li class="nav-item">
                    <a href="#tab-tindakan" class="nav-link" data-target="#tab-tindakan" aria-controls="tab-tindakan" data-toggle="tab" role="tab">tindakan</a>
                </li>
                <li class="nav-item">
                    <a href="#tab-bhp" class="nav-link" data-target="#tab-bhp" aria-controls="tab-bhp" data-toggle="tab" role="tab">bhp</a>
                </li>
                <li class="nav-item">
                    <a href="#tab-resep" class="nav-link" data-target="#tab-resep" aria-controls="tab-resep" data-toggle="tab" role="tab">resep</a>
                </li>
                <li class="nav-item">
                    <a href="#tab-penunjang" class="nav-link" data-target="#tab-penunjang" aria-controls="tab-penunjang" data-toggle="tab" role="tab">penunjang</a>
                </li>
                <li class="nav-item">
                    <a href="#tab-soap" class="nav-link" data-target="#tab-soap" aria-controls="tab-soap" data-toggle="tab" role="tab">soap</a>
                </li>
            </ul>
            <!-- Tab panes -->
            <div class="tab-content tabs-bordered">
                <div class="tab-pane fade in active show" id="tab-fisik">
					<button type="button" id="add_riwayatperiksa" class="btn rounded-0 btn-success btn-sm btn-modal-form" data-toggle="modal" data-target="#modal-pelayanan-riwayatperiksa">Tambah</button>
					<div class="table-responsive">
						<table class="table table-striped table-bordered table-hover">
							<thead>
								<tr>
									<th>Tinggi</th>
									<th>Berat</th>
									<th>Detak Jantung</th>
									<th>Tekanan Darah</th>
									<th>Suhu</th>
									<th>Nafas</th>
									<th>Keluhan</th>
									<th>Pemeriksa</th>
									<th>Tanggal</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody id="pelayanan-riwayatperiksa-list" class="table-form">
							</tbody>
						</table>
					</div>
				</div>
                <div class="tab-pane fade" id="tab-pemeriksaan">
                    <button type="button" id="add_periksapasien" class="btn rounded-0 btn-success btn-sm btn-modal-form" data-toggle="modal" data-target="#modal-pelayanan-periksapasien">Tambah</button>
                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>Tinggi</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody id="pelayanan-periksapasien-list" class="table-form">
                            </tbody>
                        </table>
                    </div>
                </div>
                <div class="tab-pane fade" id="tab-diagnosa">
                    <button type="button" id="add_diagnosapasien" class="btn rounded-0 btn-success btn-sm btn-modal-form" data-toggle="modal" data-target="#modal-pelayanan-diagnosapasien">Tambah</button>
                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>Tinggi</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody id="pelayanan-diagnosapasien-list" class="table-form">
                            </tbody>
                        </table>
                    </div>
            	</div>
            	<div class="tab-pane fade" id="tab-prosedur">
                    <button type="button" id="add_pelayananprosedur_paling" class="btn rounded-0 btn-success btn-sm btn-modal-form" data-toggle="modal" data-target="#modal-pelayanan-pelayananprosedur_paling">Tambah</button>
                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>Tinggi</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody id="pelayanan-pelayananprosedur_paling-list" class="table-form">
                            </tbody>
                        </table>
                    </div>
            	</div>
            	<div class="tab-pane fade" id="tab-tindakan">
                    <button type="button" id="add_tindakan" class="btn rounded-0 btn-success btn-sm btn-modal-form" data-toggle="modal" data-target="#modal-pelayanan-tindakan">Tambah</button>
                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>Nama Tindakan</th>
                                    <th>Harga</th>
                                    <th>Pelaksana</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody id="pelayanan-tindakan-list" class="table-form">
                            </tbody>
                        </table>
                    </div>
            	</div>
            	<div class="tab-pane fade" id="tab-bhp">
                    <button type="button" id="add_pakai" class="btn rounded-0 btn-success btn-sm btn-modal-form" data-toggle="modal" data-target="#modal-pelayanan-pakai">Tambah</button>
                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>Barang</th>
                                    <th>Satuan</th>
                                    <th>Jumlah</th>
                                    <th>Harga</th>
                                    <th>Sub Total</th>
                                    <th>Keterangan</th>
                                </tr>
                            </thead>
                            <tbody id="pelayanan-pakai-list" class="table-form">
                            </tbody>
                        </table>
                    </div>
            	</div>
            	<div class="tab-pane fade" id="tab-resep">
                    <button type="button" id="add_resep" class="btn rounded-0 btn-success btn-sm btn-modal-form" data-toggle="modal" data-target="#modal-pelayanan-resep">Tambah</button>
                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>Tinggi</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody id="pelayanan-resep-list" class="table-form">
                            </tbody>
                        </table>
                    </div>
            	</div>
            	<div class="tab-pane fade" id="tab-penunjang">
                    <button type="button" id="add_penunjangtrans" class="btn rounded-0 btn-success btn-sm btn-modal-form" data-toggle="modal" data-target="#modal-pelayanan-penunjangtrans">Tambah</button>
                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>Tinggi</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody id="pelayanan-penunjangtrans-list" class="table-form">
                            </tbody>
                        </table>
                    </div>
            	</div>
            	<div class="tab-pane fade" id="tab-soap">
                    <button type="button" id="add_soap" class="btn rounded-0 btn-success btn-sm btn-modal-form" data-toggle="modal" data-target="#modal-pelayanan-soap">Tambah</button>
                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>Tinggi</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody id="pelayanan-soap-list" class="table-form">
                            </tbody>
                        </table>
                    </div>
            	</div>
        	</div>

		<div class="modal fade" id="modal-pelayanan-riwayatperiksa">
			<div class="modal-dialog modal-lg">
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title">Tambah Fisik</h4>
						<button type="button" class="close" data-dismiss="modal" aria-label="Close">
							<span aria-hidden="true">X</span>
							<span class="sr-only">Close</span>
						</button>
					</div>
					<div class="modal-body">
						<form id="form-pelayanan-riwayatperiksa" class="from-horizontal">
							<div class="form-group">
								<label>TInggi</label>
								<input type="text" name="periksa_tb" id="periksa_tb" class="form-control boxed">
							</div>
                            <div class="form-group">
                                <label>Berat</label>
                                <input type="text" name="periksa_bb" id="periksa_bb" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Detak Jantung</label>
                                <input type="text" name="periksa_jantung" id="periksa_jantung" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Tekanan Darah </label>
                                <input type="text" name="periksa_darah" id="periksa_darah" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Suhu</label>
                                <input type="text" name="periksa_suhu" id="periksa_suhu" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Nafas</label>
                                <input type="text" name="periksa_nafas" id="periksa_nafas" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Keluhan</label>
                                <input type="text" name="periksa_keluhan" id="periksa_keluhan" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Pemeriksa</label>
                                <input type="text" name="periksa_pemeriksa" id="periksa_pemeriksa" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Tanggal</label>
                                <input type="text" name="periksa_tanggal" id="periksa_tanggal" class="form-control boxed">
                            </div>
							<input type="hidden" name="riwayatperiksa_mode" id="riwayatperiksa_mode">
							<input type="hidden" name="riwayatperiksa_edit" id="riwayatperiksa_edit">
						</form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
						<button type="button" id="simpan-riwayatperiksa" class="btn btn-primary rounded-0">Simpan</button>
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>
        <div class="modal fade" id="modal-pelayanan-periksapasien">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Tambah Fisik</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">X</span>
                            <span class="sr-only">Close</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form id="form-pelayanan-periksapasien" class="from-horizontal">
                            <div class="form-group">
                                <label>Tinggi</label>
                                <input type="text" name="periksapasien_tinggi" id="periksapasien_tinggi" class="form-control boxed">
                            </div>
                            <input type="hidden" name="periksapasien_mode" id="periksapasien_mode">
                            <input type="hidden" name="periksapasien_edit" id="periksapasien_edit">
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
                        <button type="button" id="simpan-periksapasien" class="btn btn-primary rounded-0">Simpan</button>
                    </div>
                </div>
                <!-- /.modal-content -->
            </div>
            <!-- /.modal-dialog -->
        </div>
        <div class="modal fade" id="modal-pelayanan-diagnosapasien">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Tambah Fisik</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">X</span>
                            <span class="sr-only">Close</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form id="form-pelayanan-diagnosapasien" class="from-horizontal">
                            <div class="form-group">
                                <label>TInggi</label>
                                <input type="text" name="diagnosapasien_tinggi" id="diagnosapasien_tinggi" class="form-control boxed">
                            </div>
                            <input type="hidden" name="diagnosapasien_mode" id="diagnosapasien_mode">
                            <input type="hidden" name="diagnosapasien_edit" id="diagnosapasien_edit">
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
                        <button type="button" id="simpan-diagnosapasien" class="btn btn-primary rounded-0">Simpan</button>
                    </div>
                </div>
                <!-- /.modal-content -->
            </div>
            <!-- /.modal-dialog -->
        </div>
        <!-- prosedur -->
        <!-- tindakan -->
        <div class="modal fade" id="modal-pelayanan-tindakan">
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
                        <form id="form-pelayanan-tindakan" class="from-horizontal">
                            <div class="form-group">
                                <label>Tindakan</label>
                                <select name="tindakan_id" id="tindakan_id" class="form-control boxed">
                                	<option>1</option>
                                	<option>2</option>
                                	<option>3</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Pelaksana</label>
                                <select name="pegawai_id" id="pegawai_id" class="form-control boxed">
                                	<option>1</option>
                                	<option>2</option>
                                	<option>3</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Harga</label>
                                <input type="text" name="tindakanpasien_harga" id="tindakanpasien_harga" class="form-control boxed">
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
        <div class="modal fade" id="modal-pelayanan-pakai">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Tambah Fisik</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">X</span>
                            <span class="sr-only">Close</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form id="form-pelayanan-pakai" class="from-horizontal">
                            <div class="form-group">
                                <label>TInggi</label>
                                <input type="text" name="pakai_tinggi" id="pakai_tinggi" class="form-control boxed">
                            </div>
                            <input type="hidden" name="pakai_mode" id="pakai_mode">
                            <input type="hidden" name="pakai_edit" id="pakai_edit">
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
                        <button type="button" id="simpan-pakai" class="btn btn-primary rounded-0">Simpan</button>
                    </div>
                </div>
                <!-- /.modal-content -->
            </div>
            <!-- /.modal-dialog -->
        </div>
        <div class="modal fade" id="modal-pelayanan-resep">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Tambah Fisik</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">X</span>
                            <span class="sr-only">Close</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form id="form-pelayanan-resep" class="from-horizontal">
                            <div class="form-group">
                                <label>TInggi</label>
                                <input type="text" name="resep_tinggi" id="resep_tinggi" class="form-control boxed">
                            </div>
                            <input type="hidden" name="resep_mode" id="resep_mode">
                            <input type="hidden" name="resep_edit" id="resep_edit">
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
                        <button type="button" id="simpan-resep" class="btn btn-primary rounded-0">Simpan</button>
                    </div>
                </div>
                <!-- /.modal-content -->
            </div>
            <!-- /.modal-dialog -->
        </div>
        <div class="modal fade" id="modal-pelayanan-penunjangtrans">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Tambah Fisik</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">X</span>
                            <span class="sr-only">Close</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form id="form-pelayanan-penunjangtrans" class="from-horizontal">
                            <div class="form-group">
                                <label>TInggi</label>
                                <input type="text" name="penunjangtrans_tinggi" id="penunjangtrans_tinggi" class="form-control boxed">
                            </div>
                            <input type="hidden" name="penunjangtrans_mode" id="penunjangtrans_mode">
                            <input type="hidden" name="penunjangtrans_edit" id="penunjangtrans_edit">
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
                        <button type="button" id="simpan-penunjangtrans" class="btn btn-primary rounded-0">Simpan</button>
                    </div>
                </div>
                <!-- /.modal-content -->
            </div>
            <!-- /.modal-dialog -->
        </div>
        <div class="modal fade" id="modal-pelayanan-soap">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Tambah Fisik</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">X</span>
                            <span class="sr-only">Close</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form id="form-pelayanan-soap" class="from-horizontal">
                            <div class="form-group">
                                <label>TInggi</label>
                                <input type="text" name="soap_tinggi" id="soap_tinggi" class="form-control boxed">
                            </div>
                            <input type="hidden" name="soap_mode" id="soap_mode">
                            <input type="hidden" name="soap_edit" id="soap_edit">
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
                        <button type="button" id="simpan-soap" class="btn btn-primary rounded-0">Simpan</button>
                    </div>
                </div>
                <!-- /.modal-content -->
            </div>
            <!-- /.modal-dialog -->
        </div>

	</section>
<jsp:include page="../app/footer.jsp" />