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
                    <table>
                        <tr>
                            <td>NO</td>
                            <td>:</td>
                            <td>${pelayananModel.pendaftaran_no}</td>
                        </tr>
                        <tr>
                            <td>NO. RM</td>
                            <td>:</td>
                            <td>${pelayananModel.pasien.pasien_norm}</td>
                        </tr>
                        <tr>
                            <td>Nama</td>
                            <td>:</td>
                            <td>${pelayananModel.pasien.pasien_nama}</td>
                        </tr>
                        <tr>
                            <td>Alamat</td>
                            <td>:</td>
                            <td>${pelayananModel.pasien.pasien_alamat}</td>
                        </tr>
                        <tr>
                            <td>Tgl Lahir</td>
                            <td>:</td>
                            <td>${pelayananModel.pasien.pasien_tanggallahir}</td>
                        </tr>
                        <tr>
                            <td>L/P</td>
                            <td>:</td>
                            <td>${pelayananModel.pasien.pasien_kelamin}</td>
                        </tr>
                        <tr>
                            <td>Waktu MRS</td>
                            <td>:</td>
                            <td>${pelayananModel.pendaftaran_mrs}</td>
                        </tr>
                    </table>
                </div>
                <div class="col-lg-8">
                    <form:form id="pelayanan-form" modelAttribute="pelayananModel" method="POST" action="/pelayanan/update">
                        <form:hidden path="pendaftaran_id" />
                        <form:hidden path="pendaftaran_created_date" />
                        <form:hidden path="pendaftaran_created_by" />
                        <form:hidden path="pendaftaran_aktif" />
                        <div class="form-group row">    
                            <label class="col-sm-3 col-form-label">Dokter</label>
                            <div class="col-sm-9">
                                <div class="select2-wrapper">
                                    <form:select path="m_pasien_id"
                                        class="form-control form-control-sm select2-single">
                                        <c:forEach var="pegawai" items="${pegawais}">
                                            <form:option value="${pegawai.pegawai_id}"
                                                label="${pegawai.pegawaiNama}"/>
                                        </c:forEach>
                                    </form:select>
                                </div>
                            </div>
                        </div>
                        <div class="form-group row">    
                            <label class="col-sm-3 col-form-label">Kondisi Masuk</label>
                            <div class="col-sm-9">
                                <div class="select2-wrapper">
                                    <form:select path="m_pasien_id"
                                        class="form-control form-control-sm select2-single">
                                        <c:forEach var="kondisipasien" items="${kondisis}">
                                            <form:option value="${kondisipasien.kondisi_id}"
                                                label="${kondisipasien.kondisi_nama}"/>
                                        </c:forEach>
                                    </form:select>
                                </div>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label class="col-sm-3 col-form-label">Kamar</label>
                            <div class="col-sm-9">
                                <div class="select2-wrapper">
                                    <form:select path="m_pasien_id"
                                        class="form-control form-control-sm select2-single">
                                        <c:forEach var="kamar" items="${kamars}">
                                            <form:option value="${kamar.kamar_id}"
                                                label="${kamar.kamar_no}"/>
                                        </c:forEach>
                                    </form:select>
                                </div>
                            </div>
                        </div>
                    </form:form>
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
                    
                    <jsp:include page="inc/tabel/fisik.jsp" />

				</div>
                <div class="tab-pane fade" id="tab-pemeriksaan">
                    <button type="button" id="add_periksapasien" class="btn rounded-0 btn-success btn-sm btn-modal-form" data-toggle="modal" data-target="#modal-pelayanan-periksapasien">Tambah</button>

                    <jsp:include page="inc/tabel/pemeriksaan.jsp" />

                </div>
                <div class="tab-pane fade" id="tab-diagnosa">
                    <button type="button" id="add_diagnosapasien" class="btn rounded-0 btn-success btn-sm btn-modal-form" data-toggle="modal" data-target="#modal-pelayanan-diagnosapasien">Tambah</button>

                    <jsp:include page="inc/tabel/diagnosa.jsp" />

            	</div>
                <div class="tab-pane fade" id="tab-prosedur">
                    <button type="button" id="add_diagnosa9" class="btn rounded-0 btn-success btn-sm btn-modal-form" data-toggle="modal" data-target="#modal-pelayanan-diagnosa9">Tambah</button>

                    <jsp:include page="inc/tabel/prosedur.jsp" />

                </div>
            	<div class="tab-pane fade" id="tab-tindakan">
                    <button type="button" id="add_tindakan" class="btn rounded-0 btn-success btn-sm btn-modal-form" data-toggle="modal" data-target="#modal-pelayanan-tindakan">Tambah</button>

                    <jsp:include page="inc/tabel/tindakan.jsp" />

            	</div>
            	<div class="tab-pane fade" id="tab-bhp">
                    <button type="button" id="add_pakai" class="btn rounded-0 btn-success btn-sm btn-modal-form" data-toggle="modal" data-target="#modal-pelayanan-pakai">Tambah</button>
                    <div class="table-responsive">

                    <jsp:include page="inc/tabel/bhp.jsp" />

                    </div>
            	</div>
            	<div class="tab-pane fade" id="tab-resep">
                    <button type="button" id="add_resep" class="btn rounded-0 btn-success btn-sm btn-modal-form" data-toggle="modal" data-target="#modal-pelayanan-resep">Tambah</button>

                    <jsp:include page="inc/tabel/resep.jsp" />

            	</div>
            	<div class="tab-pane fade" id="tab-penunjang">
                    <button type="button" id="add_penunjangtrans" class="btn rounded-0 btn-success btn-sm btn-modal-form" data-toggle="modal" data-target="#modal-pelayanan-penunjangtrans">Tambah</button>

                    <jsp:include page="inc/tabel/penunjang.jsp" />

                </div>
                <div class="tab-pane fade" id="tab-soap">
                    <button type="button" id="add_soap" class="btn rounded-0 btn-success btn-sm btn-modal-form" data-toggle="modal" data-target="#modal-pelayanan-soap">Tambah</button>

                    <jsp:include page="inc/tabel/soap.jsp" />

            	</div>
        	</div>

            <jsp:include page="inc/modal/fisik.jsp" />
            <jsp:include page="inc/modal/pemeriksaan.jsp" />
            <jsp:include page="inc/modal/diagnosa.jsp" />
            <jsp:include page="inc/modal/prosedur.jsp" />
            <jsp:include page="inc/modal/tindakan.jsp" />
            <jsp:include page="inc/modal/bhp.jsp" />
            <jsp:include page="inc/modal/resep.jsp" />
            <jsp:include page="inc/modal/penunjang.jsp" />
            <jsp:include page="inc/modal/soap.jsp" />


	</section>
<jsp:include page="../app/footer.jsp" />