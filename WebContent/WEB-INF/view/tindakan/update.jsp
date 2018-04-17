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
									<div class="card-title-block">
										<h3 class="title"> Update Tindakan </h3>
									</div>
									<section class="form-kelas-baru">
										<form:form modelAttribute="tindakanModel" method="POST" action="/tindakan/update">
											<form:hidden path="tindakan_id" />
											<form:hidden path="tindakan_aktif" />
											<form:hidden path="tindakan_created_by" />
											<form:hidden path="tindakan_created_date" />
											<div class="form-group">
												<label>Kode</label>
												<form:input path="tindakan_kode" placeholder="Masukan Kode" class="form-control"/>
											</div>

											<div class="form-group">
												<label>Nama</label>
												<form:input path="tindakan_nama" placeholder="Masukan Nama" class="form-control"/>
											</div>

											<div class="form-group">
												<label>Keterangan</label>
												<form:input path="tindakan_keterangan" placeholder="Masukan Keterangan" class="form-control"/>
											</div>

											<div class="form-group">
												<label>Kelas</label>
												<form:select path="kelas.kelas_id" class="form-control">
													<form:options items="${kelases}" itemValue="kelas_id" itemLabel="kelas_nama"  />
												</form:select>
											</div>

											<div class="form-group">
												<button type="submit" class="btn btn-primary">Simpan</button>
											</div>
										</form:form>
									</section>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<a href="/tindakan" class="pull-right btn btn-danger">Batal</a>
						</div>
					</div>
					<jsp:include page="inc/tabel.jsp" />
				</section>
<jsp:include page="../app/footer.jsp" />