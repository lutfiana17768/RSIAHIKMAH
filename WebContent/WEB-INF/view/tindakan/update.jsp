<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
				<section class="section">
					<div class="form-kelas row">
						<div class="col-md-12">
							<div class="card">
								<div class="card-block">
									<div class="title-block">
										<h3 class="title">Update tindakan
											<div class="float-right">
												<button type="submit" class="btn btn-primary rounded-0" onclick="$('form').submit()" style="margin-right: 3px">Simpan</button>
												<a href="/tindakan" class="pull-right btn btn-danger rounded-0">Batal</a>
											</div>
										</h3>
									</div>
									<section class="form-kelas-baru">
										<form:form modelAttribute="tindakanModel" method="POST" action="/tindakan/update">
											<form:hidden path="tindakan_id" />
											<form:hidden path="tindakan_aktif" />
											<form:hidden path="tindakan_created_by" />
											<form:hidden path="tindakan_created_date" />
											<div class="form-group">
												<label>Kode</label>
												<form:input path="tindakan_kode" placeholder="Masukan Kode" class="form-control boxed"/>
											</div>

											<div class="form-group">
												<label>Nama</label>
												<form:input path="tindakan_nama" placeholder="Masukan Nama" class="form-control boxed"/>
											</div>

											<div class="form-group">
												<label>Keterangan</label>
												<form:input path="tindakan_keterangan" placeholder="Masukan Keterangan" class="form-control boxed"/>
											</div>

											<div class="form-group">
												<label>Kelas</label>
												<form:select path="kelas.kelas_id" class="form-control boxed">
													<option value="">--- Pilih Kelas ---</option>
													<form:options items="${kelases}" itemValue="kelas_id" itemLabel="kelas_nama"  />
												</form:select>
											</div>
										</form:form>
									</section>
								</div>
							</div>
						</div>
					</div>
					<jsp:include page="inc/tabel.jsp" />
				</section>
<jsp:include page="../app/footer.jsp" />