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
										<h3 class="title"> Tambah Kelas Baru </h3>
									</div>
									<section class="form-kelas-baru">
										<form:form modelAttribute="kelasModel" method="POST" action="/kelas/store">
											<div class="form-group">
												<label>Kode</label>
												<form:input path="kelas_kode" placeholder="Masukan Kode" class="form-control"/>
											</div>

											<div class="form-group">
												<label>Nama</label>
												<form:input path="kelas_nama" placeholder="Masukan Nama" class="form-control"/>
											</div>

											<div class="form-group">
												<label>Keterangan</label>
												<form:input path="kelas_keterangan" placeholder="Masukan Keterangan" class="form-control"/>
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
							<a href="/kelas" class="pull-right btn btn-danger">Batal</a>
						</div>
					</div>
					<jsp:include page="inc/tabel.jsp" />
				</section>
<jsp:include page="../app/footer.jsp" />