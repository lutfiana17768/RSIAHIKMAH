<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="../app/header.jsp" />

	<section class="section">
		<div class="card">
			<div class="card-header">
				<div class="header-block w-100">
					<h3 class="title pt-2"> Kasir </h3>
					<div class="btn-group btn-group pull-right" role="group">
						<button class="btn btn-success rounded-0" id="kasir-submit-kuitansi">Simpan dan Cetak Kuitansi</button>
						<button class="btn btn-success rounded-0" id="kasir-submit-tagihan">Simpan dan Cetak Bukti</button>
						<button class="btn btn-success rounded-0" id="kasir-submit">Simpan</button>
						<button class="btn btn-danger rounded-0">Batas</button>
					</div>
				</div>
			</div>
			<form:form modelAttribute="transaksiModel" id="kasir-form" method="POST" action="/kasir/store">
				<c:if test="${transaksiDaftarID.transaksiID != null}">
					<input type="hidden" name="transaksiID" value="${transaksiDaftarID.transaksiID}">
				</c:if>
				<input type="hidden" name="pendaftaran.pendaftaranID" value="${daftarID}" />
				<div class="row">
					<div class="col-sm-7">
						<div class="card-block">
							<div class="form-group row">
								<label for="staticEmail" class="col-sm-4 col-form-label">Tgl. MRS : </label>
								<div class="col-sm-8">
									<fmt:formatDate value="${daftar.pendaftaranMrs}" pattern="EEEE, dd MMMM yyyy" />
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
									<fmt:formatDate value="${daftar.pasien.pasienTanggallahir}" pattern="dd MMMM yyyy" />
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
						</div>
						<div class="card-block">
							<section class="list-paket">
								<div class="table-responsive">
									<table class="table table-sm table-striped table-bordered table-hover">
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
											<c:set var = "totalKamar" value = "${0}"/>
											<c:if test="${daftar.kamar != null}">
												<c:set var = "totalKamar" value = "${daftar.kamar.tarif * rentangHari}"/>
												<tr>
													<td>${daftar.kamar.kamarNo}</td>
													<td>${rentangHari}</td>
													<td><fmt:formatNumber value = "${daftar.kamar.tarif}" maxFractionDigits = "3"/></td>
													<td>0</td>
													<td><fmt:formatNumber value = "${totalKamar}" maxFractionDigits = "3"/></td>
												</tr>
											</c:if>
											<c:set var = "totalTindakan" value = "${0}"/>
											<c:set var = "itemIndex" value = "${0}"/>
											<c:forEach var="tp" items="${daftar.tindakanpasien}" varStatus="loop">
												<c:set var = "subTindakan" value = "${tp.tindakanpasienHarga}"/>
												<c:set var = "totalTindakan" value = "${totalTindakan + subTindakan}"/>
												<tr>
													<td>${tp.tindakan.tindakanNama}</td>
													<td>1</td>
											        <td><fmt:formatNumber value = "${tp.tindakanpasienHarga}" maxFractionDigits = "3"/></td>
													<td>0</td>
													<td class="kasir-sub-total"><fmt:formatNumber value = "${subTindakan}" maxFractionDigits = "3"/></td>
												</tr>
												<input type="hidden" name="item[${loop.index}].transaksiItemNama" value="${tp.tindakan.tindakanNama}">
												<input type="hidden" name="item[${loop.index}].transaksiItemJumlah" value="1">
												<input type="hidden" name="item[${loop.index}].transaksiItemharga" value="${tp.tindakanpasienHarga}">
												<c:set var = "itemIndex" value = "${itemIndex}+1"/>
											</c:forEach>

											<c:set var = "totalPenunjang" value = "${0}"/>
											<c:forEach var="pnj" items="${daftar.penunjangtrans}" varStatus="loop">
												<c:set var = "subPenunjang" value = "${pnj.penunjangtransHarga * pnj.penunjangtransJumlah}"/>
												<c:set var = "totalPenunjang" value = "${totalPenunjang + subPenunjang}"/>
												<tr>
													<td>${pnj.penunjang.penunjangmedisNama}</td>
													<td>${pnj.penunjangtransJumlah}</td>
											        <td><fmt:formatNumber value = "${pnj.penunjangtransHarga}" maxFractionDigits = "3"/></td>
													<td>0</td>
													<td class="kasir-sub-total"><fmt:formatNumber value = "${subPenunjang}" maxFractionDigits = "3"/></td>
												</tr>
												<input type="hidden" name="item[${loop.index}].transaksiItemNama">
												<input type="hidden" name="item[${loop.index}].transaksiItemJumlah">
												<input type="hidden" name="item[${loop.index}].transaksiItemharga">
												<c:set var = "itemIndex" value = "${itemIndex}+1"/>
											</c:forEach>

											<c:set var = "totalTerapi" value = "${0}"/>
											<c:forEach var="trp" items="${daftar.terapi}" varStatus="loop">
												<c:set var = "subTerapi" value = "${trp.terapiJumlah * trp.terapiHarga}"/>
												<c:set var = "totalTerapi" value = "${totalTerapi + subTerapi}"/>
												<tr>
													<td><% /**${trp.barang.NamaBarang} **/ %></td>
													<td>${trp.terapiJumlah}</td>
											        <td><fmt:formatNumber value = "${trp.terapiHarga}" maxFractionDigits = "3"/></td>
													<td>0</td>
													<td class="kasir-sub-total"><fmt:formatNumber value = "${subTerapi}" maxFractionDigits = "3"/></td>
												</tr>
												<input type="hidden" name="item[${loop.index}].transaksiItemNama">
												<input type="hidden" name="item[${loop.index}].transaksiItemJumlah">
												<input type="hidden" name="item[${loop.index}].transaksiItemharga">
												<c:set var = "itemIndex" value = "${itemIndex}+1"/>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</section>
						</div>
					</div>
					<div class="col-sm-5">
						<div class="card-block">
							<div class="form-group">
								<c:set var = "totalTagihan" value = "${totalTindakan+totalPenunjang+totalTerapi+totalKamar}"/>
			                    <label>Total Tagihan</label>
			                    <input type="text" name="transaksiTagihan" class="form-control form-control-sm boxed" 
			                    value='<fmt:formatNumber value = "${totalTagihan}" maxFractionDigits = "3"/>' disabled />
			                </div>
							<div class="form-group">
			                    <label>Total Terbayar</label>
			                    <input type="text" class="form-control form-control-sm boxed"
			                    value='<fmt:formatNumber value = "${sudahBayar}" maxFractionDigits = "3"/>' disabled />
			                </div>
							<div class="form-group">
			                    <label>Harus Dibayar</label>
			                    <input type="text" class="form-control form-control-sm boxed" id="harus-bayar"
			                    value='<fmt:formatNumber value = "${totalTagihan-sudahBayar}" maxFractionDigits = "3"/>' disabled />
			                </div>
							<div class="form-group">
								<label>Uang Bayar</label>
								<input type="text" name="bayar[0].transaksiBayarNominal" id="uang-bayar" class="form-control form-control-sm">
							</div>
							<div class="form-group">
								<label>Kembalian</label>
								<input type="text" id="kembalian" class="form-control form-control-sm" disabled>
							</div>
							<input type="hidden" name="harusBayar" value="${totalTagihan-sudahBayar}">
						</div>
					</div>
				</div>
			</form:form>
		</div>
	</section>
<jsp:include page="../app/footer.jsp" />
