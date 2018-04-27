<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
					<div class="row">
						<div class="col-md-12">
							<div class="card">
								<div class="card-block">
									<div class="card-title-block">
										<h3 class="title"> List Paket </h3>
									</div>
									<section class="list-paket">
										<div class="table-responsive">
											<table class="table table-striped table-bordered table-hover">
												<thead>
													<tr>
														<th>Nama Paket</th>
														<th>Kelas</th>
														<th>Keterangan</th>
														<th>Harga</th>
														<th>Jenis</th>
														<th>Aksi</th>
													</tr>
												</thead>
												<tbody>
													<c:forEach var="paket" items="${paketan}">
														<tr>
															<td>${paket.paket_nama}</td>
															<td>${paket.paket_keterangan}</td>
															<td>${paket.kelas.kelas_nama}</td>
															<td>${paket.paket_harga}</td>
															<td>${paket.paket_jenis}</td>
															<td>
																<a href="/paket/update/${paket.paket_id}" class="btn btn-info">Update</a>
																<a href="/paket/delete/${paket.paket_id}" class="btn btn-warning">Delete</a>
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