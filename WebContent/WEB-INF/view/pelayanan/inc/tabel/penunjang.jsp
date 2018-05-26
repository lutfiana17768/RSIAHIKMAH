<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>Nama Pemeriksaan</th>
                                    <th>Hasil</th>
                                    <th>Nilai Normal</th>
                                    <th>Satuan</th>
                                    <th>Jumlah</th>
                                    <th>Harga</th>
                                    <th>Harga Total</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody id="pelayanan-penunjangtrans-list" class="table-form">
                            	<c:forEach var="pt" items="${pelayananModel.penunjangtrans}" varStatus="loop">
									<tr id="penunjangtrans_${loop.index+1}">
										<td data-used="1" data-save="1" data-name="penunjangtrans_nama" data-kolom-id="penunjangtrans_nama">${pt.penunjang.penunjang_nama}</td>
										<td data-used="1" data-save="1" data-name="penunjangtrans_hasil" data-kolom-id="penunjangtrans_hasil">${pt.penunjang.penunjangmedis_nama}</td>
										<td data-used="1" data-save="1" data-name="penunjangtrans_standar" data-kolom-id="penunjangtrans_standar">${pt.penunjang.penunjangmedis_standar}</td>
										<td data-used="1" data-save="1" data-name="penunjangtrans_satuan" data-kolom-id="penunjangtrans_satuan">${pt.penunjang.penunjangmedis_satuan}</td>
										<td data-used="1" data-save="1" data-name="penunjangtrans_jumlah" data-kolom-id="penunjangtrans_jumlah">${pt.penunjang.penunjangmedis_jumlah}</td>
										<td data-used="1" data-save="1" data-name="penunjangtrans_harga" data-kolom-id="penunjangtrans_harga">harga</td>
										<td data-used="1" data-save="1" data-name="penunjangtrans_subtotal" data-kolom-id="penunjangtrans_subtotal">${pt.penunjang.penunjangmedis_jumlah}</td>
                                        <td>
                                            <button type="button" class="btn btn-danger btn-sm" onclick="deletePenunjangtrans(${loop.index+1})">Delete</button>
                                            <button type="button" class="btn btn-primary btn-sm" onclick="editPenunjangtrans(${loop.index+1})">Edit</button>
                                        </td>
                                        <td style="display:none" data-used="1" data-save="1" data-name="penunjangtrans_id" data-kolom-id="penunjangtrans_id">${pt.penunjangtrans_id}</td>
									</tr>
								</c:forEach>

                            </tbody>
                        </table>
                    </div>