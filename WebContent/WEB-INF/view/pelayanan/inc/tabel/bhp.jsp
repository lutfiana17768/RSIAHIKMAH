<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>Barang</th>
                                    <th>Satuan</th>
                                    <th>Jumlah</th>
                                    <th>Harga</th>
                                    <th>Sub Total</th>
                                    <th>Keterangan</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody id="pelayanan-pakai-list" class="table-form">
                            	<c:forEach var="p" items="${pelayananModel.pakai}" varStatus="loop">
									<tr id="pakai_${loop.index+1}">
										<td data-used="1" data-save="1" data-name="pakai_barang" data-kolom-id="pakai_barang">${p.barang.NamaBarang}</td>
										<td data-used="1" data-save="1" data-name="pakai_satuan" data-kolom-id="pakai_satuan">${p.pakai_satuan}</td>
										<td data-used="1" data-save="1" data-name="pakai_jumlah" data-kolom-id="pakai_jumlah">${p.pakai_jumlah}</td>
										<td data-used="1" data-save="1" data-name="pakai_harga" data-kolom-id="pakai_harga">${p.pakai_harga}</td>
										<td data-used="1" data-save="1" data-name="pakai_subtotal" data-kolom-id="pakai_subtotal">${p.pakai_jumlah*p.pakai_harga}</td>
										<td data-used="1" data-save="1" data-name="pakai_keterangan" data-kolom-id="pakai_keterangan">${p.pakai_keterangan}</td>
										<td>
											<button type="button" class="btn btn-danger btn-sm" onclick="deletePakai(${loop.index+1})">Delete</button>
											<button type="button" class="btn btn-primary btn-sm" onclick="editPakai(${loop.index+1})">Edit</button>
										</td>
                                        <td style="display:none" data-used="1" data-save="1" data-name="pakai_id" data-kolom-id="pakai_id">${p.pakai_id}</td>
									</tr>
								</c:forEach>
                            </tbody>
                        </table>