<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
					<div class="row">
						<div class="col-md-12">
							<div class="card">
								<div class="card-header">
									<div class="header-block">
										<h3 class="title"> List Tindakan </h3>
										<a href="/tindakan/tambah" class="btn btn-primary btn-sm">Tambah</a>
									</div>
								</div>
								<div class="card-block">
									<section class="list-kelas">
										<div class="table-responsive">
											<table class="table table-striped table-bordered table-hover">
												<thead>
													<tr>
														<th>Kode</th>
														<th>Nama</th>
														<th>Keterangan</th>
														<th>Kelas</th>
														<th>Aksi</th>
													</tr>
												</thead>
												<tbody>
													<c:forEach var="tindakan" items="${tindakans}">
														<tr>
															<td>${tindakan.tindakan_kode}</td>
															<td>${tindakan.tindakan_nama}</td>
															<td>${tindakan.tindakan_keterangan}</td>
															<td>${tindakan.kelas.kelas_nama}</td>
															<td>
																<a href="/tindakan/update/${tindakan.tindakan_id}" class="btn btn-info rounded-0">Update</a>
																<a href="/tindakan/delete/${tindakan.tindakan_id}" class="btn btn-warning rounded-0">Delete</a>
															</td>
														</tr>
													</c:forEach>
												</tbody>
											</table>
										</div>
									</section>
								</div>
							</div>
						</div>
					</div>