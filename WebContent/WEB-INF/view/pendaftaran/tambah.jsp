<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
				<section class="section">
					<div class="container">
						<div class="col-12" id="add_Pendaftaran_form" style="display: none;">
							<div class="card card-success">
								<div class="card-header" style="min-height:0">
									<div class="header-block row" style="padding: 5px 20px">
										<p class="title"> Tambah Pendaftaran </p>
									</div>
								</div>
								
								<div class="card-block row" style="background-color: #f4f4f4">
								<div class="col-6">
									
									<form:form modelAttribute="PendaftaranModel" method="POST" action="/pendaftaran/store">
										<div class="form-group">
											<label>Nomor Rekam Medis</label>
											<div class="select2-wrapper">
												<form:select path="m_pasien_id"
													class="form-control input-lg select2-single">
													<c:forEach var="pasien" items="${Pasien}">
														<form:option value="${pasien.pasien_id}"
															label="${pasien.pasien_norm} - ${pasien.pasien_nama}"/>
													</c:forEach>
												</form:select>
											</div>
										</div>
										
										<div class="form-group">
											<label class="control-label">Kondisi Pasien</label>
											<div class="select2-wrapper">
												<form:select path="m_pasien_id"
													class="form-control input-lg select2-single">
													<c:forEach var="kondisipasien" items="${Kondisipasien}">
														<form:option value="${kondisipasien.kondisi_id}"
															label="${kondisipasien.kondisi_nama}"/>
													</c:forEach>
												</form:select>
											</div>
										</div>
										
										
										<div class="form-group">
											<label class="control-label">Kondisi Kedatangan Pasien</label>
											<select class="form-control boxed form-control-sm" id="kondisi_pasien">
												<option value="D">Datang Sendiri</option>
												<option value="R">Rujukan</option>
											</select>
										</div>
										
										<div class="form-group" id="rujukan_id">
											<label>Rujukan</label>
											<div class="select2-wrapper">
												<form:select path="m_rujukan_id"
													class="form-control input-lg select2-single">
													<c:forEach var="rujukan" items="${Rujukan}">
														<form:option value="${rujukan.rujukan_id}"
															label="${rujukan.rujukan_nama}"/>
													</c:forEach>
												</form:select>
											</div> 
											
											<label>Tindakan</label>
											<div class="select2-wrapper">
												<form:select path="m_rujukan_id"
													class="form-control input-lg select2-single">
													<c:forEach var="tindakan" items="${Tindakan}">
														<form:option value="${tindakan.tindakan_id}"
															label="${tindakan.tindakan_nama}"/>
													</c:forEach>
												</form:select>
											</div>
										</div>
										
										<div class="form-group">
											<label class="control-label">Poli</label>
											<select class="form-control boxed form-control-sm">
												<option value=O">Obyn</option>
												<option value="A">Anak</option>
											</select>
										</div>
										
										<div class="form-group">
											<label class="control-label">Dokter</label>
											<select class="form-control boxed form-control-sm">
													<option>Rahayu</option>
													<option>Sri</option>
												</select>
										</div>
										
										<div class="form-group">
											<label class="control-label">Jenis Pendaftaran</label>
											<select class="form-control boxed form-control-sm">
													<option>Rawat Inap</option>
													<option>Rawat Jalan</option>
												</select>
										</div>
										
										<div class="form-group">
											<label class="control-label">Paket</label>
											<div class="select2-wrapper">
												<form:select path="m_pasien_id"
													class="form-control input-lg select2-single">
													<c:forEach var="paket" items="${Paket}">
														<form:option value="${paket.paket_id}"
															label="${paket.paket_nama}"/>
													</c:forEach>
												</form:select>
											</div>
										</div>
										
										<div class="form-group">
											<button type="submit" class="btn btn-primary d_pasien-button">Simpan</button>
											<button type="button" class="btn btn-danger d_pasien-button">
												<a href="/pasien/list" />Batal</a>
											</button>
										</div>
									</form:form>
									
									
								   <div class="form-group">
										<label for="exampleInputEmail1">Nomor Rekam medis</label>
										<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="Cari Nomer Rekan Medis">
									</div>
									<div class="form-group">
										<label for="exampleInputEmail1">Nama Pasien</label>
										<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
									</div>
									<div class="form-group">
										<label for="exampleInputEmail1">Tanggal Lahir</label>
										<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
									</div>
									 <div class="form-group">
										<label for="exampleInputEmail1">Alamat</label>
										<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
									</div>
									 <div class="form-group">
										<label for="exampleInputEmail1">L/P</label>
										<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
									</div>
									 <div class="form-group">
										<label for="exampleInputEmail1">No. Telp</label>
										<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
									</div>
									<div class="form-group">
										<label class="control-label">Cara Masuk Pasien</label>
										<select class="form-control boxed form-control-sm">
												<option>Dari Kondisi Pasien</option>
												<option>Datang Sendiri</option>
												<option>Tidak Sadar</option>
												<option>Rujukan</option>
												<option>Dibawa Polisi</option>
											</select>
									</div>
									<div class="form-group">
										<label for="exampleInputEmail1">Keterangan</label>
										<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
									</div>
								</div>
								<div class="col-6">
									<div class="form-group">
										<label for="exampleInputEmail1">Tgl MRS</label>
										<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
									</div>
									<div class="form-group">
										<label for="exampleInputEmail1">Jam MRS</label>
										<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
									</div>
									<div class="form-group">
										<label class="control-label">Jenis Pendaftaran</label>
										<select class="form-control boxed form-control-sm">
												<option>RJ</option>
												<option>RI</option>
											</select>
									</div>
									<div class="form-group">
										<label class="control-label">Kelas Pendaftaran</label>
										<select class="form-control boxed form-control-sm">
												<option>I</option>
												<option>II</option>
												<option>III</option>
												<option>VIP</option>
												<option>VVIP</option>
											</select>
									</div>
									<div class="form-group">
										<label class="control-label">Dokter</label>
										<select class="form-control boxed form-control-sm">
												<option>A</option>
												<option>B</option>
												<option>C</option>
												<option>D</option>
												<option>E</option>
											</select>
									</div>
									<div class="form-group">
										<label for="exampleInputEmail1">Paket Pelayanan</label>
										<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
									</div>
									<div class="form-group">
										<label for="exampleInputEmail1">Harga Pendaftaran</label>
										<input type="text" class="form-control boxed form-control-sm" id="exampleInputEmail1" placeholder="">
									</div>
								</div>
									<div class="container form-group" style="float: right;">
										<button type="submit" class="btn btn-primary d_pasien-button">Simpan</button>
									</div>
								</div>
							</div>
							
						</div>
						<div class="container">
							<div class="form-group">
								<button type="button" class="btn btn-sm btn-primary" id="add_Pendaftaran">Tambah</button>
							</div>
						</div>
						<div class="container">
							<div class="card card-success">
								<div class="card-header" style="min-height:0">
									<div class="header-block" style="padding: 5px 20px">
										<p class="title"> Data Pendaftaran </p>
									</div>
								</div>
								<div class="card-block" style="background-color: #f4f4f4">
									<div class="table-responsive">
										<table class="table table-striped table-bordered table-hover">
											<thead>
												<tr>
													<th>#</th>
													<th>Table heading</th>
													<th>Table heading</th>
													<th>Table heading</th>
													<th>Table heading</th>
													<th>Table heading</th>
													<th>Table heading</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>Table cell</td>
													<td>Table cell</td>
													<td>Table cell</td>
													<td>Table cell</td>
													<td>Table cell</td>
													<td>Table cell</td>
													<td>Table cell</td>
												</tr>
												<tr>
													<td>Table cell</td>
													<td>Table cell</td>
													<td>Table cell</td>
													<td>Table cell</td>
													<td>Table cell</td>
													<td>Table cell</td>
													<td>Table cell</td>
												</tr>
											   
											</tbody>
										</table>
									</div>
								</div>
							</div>
						</div>
						
					</div>
				</section>
<jsp:include page="../app/footer.jsp" />
