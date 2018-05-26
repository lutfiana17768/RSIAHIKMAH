<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>Barang</th>
                                    <th>Satuan</th>
                                    <th>Jumlah</th>
                                    <th>Aturan Pakai</th>
                                    <th>Keterangan</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody id="pelayanan-resep-list" class="table-form">
                            	<c:forEach var="rsp" items="${pelayananModel.resep}" varStatus="loop">
									<tr id="resep_${loop.index+1}">
										<td data-used="1" data-save="1" data-name="resep_barang" data-kolom-id="resep_barang">${rsp.resep.resepNo}</td>
										<td data-used="1" data-save="1" data-name="resep_satuan" data-kolom-id="resep_satuan">${rsp.resepDimension}</td>
										<td data-used="1" data-save="1" data-name="resep_jumlah" data-kolom-id="resep_jumlah">${rsp.resep_jumlah}</td>
										<td data-used="1" data-save="1" data-name="resep_aturan" data-kolom-id="resep_aturan">${rsp.resep_aturan}</td>
										<td data-used="1" data-save="1" data-name="resep_keterangan" data-kolom-id="resep_keterangan">${rsp.resep_keterangan}</td>
										<td>
											<button type="button" class="btn btn-danger btn-sm" onclick="deleteResep(${loop.index+1})">Delete</button>
											<button type="button" class="btn btn-primary btn-sm" onclick="editResep(${loop.index+1})">Edit</button>
										</td>
                                        <td style="display:none" data-used="1" data-save="1" data-name="resep_id" data-kolom-id="resep_id">${rsp.pakai_id}</td>

									</tr>
								</c:forEach>
                            </tbody>
                        </table>
                    </div>