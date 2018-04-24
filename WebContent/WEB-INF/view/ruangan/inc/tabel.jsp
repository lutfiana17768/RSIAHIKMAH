<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="row">
	<div class="col-md-12">
		<div class="card">
			<div class="card-block">
				<div class="card-title-block">
					<h3 class="title"> List Ruangan </h3>
				</div>
				<section class="list-kelas">
					<div class="table-responsive">
						<table class="table table-striped table-bordered table-hover">
							<thead>
								<tr>
									<th>Kode Ruangan</th>
									<th>Nama Ruangan</th>
									<th>Kelas Ruangan</th>
									<th>Penanggung Jawab</th>
									<th>Harga</th>
									<th>Aksi</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="temp" items="${ruangs}">
									<c:choose>
										<c:when test="${temp.ruang_aktif  == 'Y' }">
											<tr>
												<td>${temp.ruang_kode }</td>
												<td>${temp.ruang_nama }</td>
												<td>${temp.kelas.kelas_nama }</td>
												<td>${temp.ruang_kepala }</td>
												<td>${temp.tarif_sarana }</td>
												<td>
													<a href="ruangan/update/${temp.ruang_id }" class="btn btn-info">Update</a>
													<a href="ruangan/delete/${temp.ruang_id }" class="btn btn-warning">Delete</a>
												</td>
											</tr>
										</c:when>
									</c:choose>

								</c:forEach>
							</tbody>

						</table>
					</div>
				</section>
			</div>
		</div>
	</div>
</div>