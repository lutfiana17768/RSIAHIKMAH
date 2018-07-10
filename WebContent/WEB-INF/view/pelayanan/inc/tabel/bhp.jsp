<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>Tanggal</th>
                                    <th>Barang</th>
                                    <th>Dosis</th>
                                    <th>Jumlah</th>
                                    <th>Harga</th>
                                    <th>Sub Total</th>
                                    <th>Keterangan</th>
                                    <th>Petugas</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody id="pelayanan-terapi-list" class="table-form">
                            	<c:forEach var="trp" items="${pelayananModel.terapi}" varStatus="loop">
									<tr id="terapi_${loop.index+1}">
										<td data-used="1" data-save="1" data-name="terapiTanggal" data-kolom-id="terapiTanggal"><fmt:formatDate value="${trp.terapiTanggal}" pattern="yyyy-MM-dd HH:mm" /></td>
										<td>${trp.barang.barangNama}</td> 
										<td data-used="1" data-save="1" data-name="terapiDosis" data-kolom-id="terapiDosis">${trp.terapiDosis}</td>
										<td data-used="1" data-save="1" data-name="terapiJumlah" data-kolom-id="terapiJumlah">${trp.terapiJumlah}</td>
										<td data-used="1" data-save="1" data-name="terapiHarga" data-kolom-id="terapiHarga">${trp.terapiHarga}</td>
										<td data-used="1" data-save="1" data-name="terapSubtotal" data-kolom-id="terapiSubtotal">${trp.terapiJumlah*trp.terapiHarga}</td>
										<td data-used="1" data-save="1" data-name="terapiKeterangan" data-kolom-id="terapiKeterangan">${trp.terapiKeterangan}</td>
										<td data-used="1" data-save="1" data-name="terapiPetugas" data-kolom-id="terapiPetugas">${trp.terapiPetugas}</td>
										<td>
											<button type="button" class="btn btn-danger btn-sm" onclick="deleteTerapi(${loop.index+1})">Delete</button>
											<button type="button" class="btn btn-primary btn-sm" onclick="editTerapi(${loop.index+1})">Edit</button>
										</td>
										<td style="display:none" data-used="1" data-save="1" data-name="barang.barangId" data-kolom-id="terapiBarang">${trp.barang.barangId}</td>
                                        <td style="display:none" data-used="1" data-save="1" data-name="terapiID" data-kolom-id="terapiID">${trp.terapiID}</td>
									</tr>
								</c:forEach>
                            </tbody>
                        </table>