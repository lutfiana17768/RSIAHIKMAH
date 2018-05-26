<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


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
								<c:forEach var="rp" items="${pelayananModel.riwayatperiksa}" varStatus="loop">
									<tr id="riwayatperiksa_${loop.index+1}">
											<td data-used="1" data-save="1" data-name="periksa_tb" data-kolom-id="periksa_tb">${rp.periksa_tb}</td>
											<td data-used="1" data-save="1" data-name="periksa_bb" data-kolom-id="periksa_bb">${rp.periksa_bb}</td>
											<td data-used="1" data-save="1" data-name="periksa_jantung" data-kolom-id="periksa_jantung">${rp.periksa_jantung}</td>
											<td data-used="1" data-save="1" data-name="periksa_tensi" data-kolom-id="periksa_tensi">${rp.periksa_tensi}</td>
											<td data-used="1" data-save="1" data-name="periksa_suhu" data-kolom-id="periksa_suhu">${rp.periksa_suhu}</td>
											<td data-used="1" data-save="1" data-name="periksa_nafas" data-kolom-id="periksa_nafas">${rp.periksa_nafas}</td>
											<td data-used="1" data-save="1" data-name="periksa_keluhan" data-kolom-id="periksa_keluhan">${rp.periksa_keluhan}</td>
											<td data-used="1" data-save="1" data-name="periksa_pemeriksa" data-kolom-id="periksa_pemeriksa">${rp.periksa_pemeriksa}</td>
											<td data-used="1" data-save="1" data-name="periksa_tanggal" data-kolom-id="periksa_tanggal">${rp.periksa_tanggal}</td>
										<td>
											<button type="button" class="btn btn-danger btn-sm" onclick="deleteRiwayatperiksa(${loop.index+1})">Delete</button>
											<button type="button" class="btn btn-primary btn-sm" onclick="editRiwayatperiksa(${loop.index+1})">Edit</button>
										</td>
										<td style="display:none" data-used="1" data-save="1" data-name="periksa_id" data-kolom-id="periksa_id">${rp.periksa_id}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>