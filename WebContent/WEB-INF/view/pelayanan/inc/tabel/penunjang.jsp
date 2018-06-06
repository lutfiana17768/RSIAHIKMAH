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
                                    <th>Sub Total</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody id="pelayanan-penunjangtrans-list" class="table-form">
                            	<c:forEach var="pt" items="${pelayananModel.penunjangtrans}" varStatus="loop">
									<tr id="penunjangtrans_${loop.index+1}">
										<td data-used="1" 
                                            data-save="1" 
                                            data-name="penunjangtransNama" 
                                            data-kolom-id="penunjangtransNama">${pt.penunjang.penunjangmedisNama}</td>
										<td data-used="1" 
                                            data-save="1" 
                                            data-name="penunjangtransHasil" 
                                            data-kolom-id="penunjangtransHasil">${pt.penunjangtransHasil}</td>
										<td data-used="1" 
                                            data-save="1" 
                                            data-name="penunjangtransStandar" 
                                            data-kolom-id="penunjangtransStandar">${pt.penunjang.paramperiksa[0].paramperiksaStandar}</td>
										<td data-used="1" 
                                            data-save="1" 
                                            data-name="penunjangtransSatuan" 
                                            data-kolom-id="penunjangtransSatuan">${pt.penunjang.paramperiksa[0].paramperiksaSatuan}</td>
										<td data-used="1" 
                                            data-save="1" 
                                            data-name="penunjangtransJumlah" 
                                            data-kolom-id="penunjangtransJumlah">${pt.penunjangtransJumlah}</td>
										<td data-used="1" 
                                            data-save="1" 
                                            data-name="penunjangtransHarga" 
                                            data-kolom-id="penunjangtransHarga">${pt.penunjang.paramperiksa[0].paramperiksaHarga}</td>
										<td data-used="1" 
                                            data-save="1" 
                                            data-name="penunjangtransSubtotal" 
                                            data-kolom-id="penunjangtransSubtotal">${pt.penunjangtransHarga}</td>
                                        <td>
                                            <button type="button" class="btn btn-danger btn-sm" onclick="deletePenunjangtrans(${loop.index+1})">Delete</button>
                                            <button type="button" class="btn btn-primary btn-sm" onclick="editPenunjangtrans(${loop.index+1})">Edit</button>
                                        </td>
                                        <td style="display:none" data-used="1" data-save="1" data-name="penunjangtransID" data-kolom-id="penunjangtransID">${pt.penunjangtransID}</td>
									</tr>
								</c:forEach>

                            </tbody>
                        </table>
                    </div>