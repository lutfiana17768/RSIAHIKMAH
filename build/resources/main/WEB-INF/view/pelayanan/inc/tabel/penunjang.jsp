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
                                <c:choose>
                                    <c:when test="${paket.paketDetail != null && empty pelayananModel.penunjangtrans}">

                                        <c:set var = "itemIndex" value = "${0}"/>
                                        <c:forEach var="pt" items="${paket.paketDetail}" varStatus="loop">
                                            <c:choose>
                                                <c:when test="${pt.paketDetailType=='penunjang'}">
                                                    <c:set var = "itemIndex" value = "${itemIndex+1}"/>
                                                    <tr id="penunjangtrans_${itemIndex}">
                                                        <td data-used="1" 
                                                            data-save="1" 
                                                            data-name="penunjangtransNama" 
                                                            data-kolom-id="penunjangtransNama">${pt.penunjangs.penunjangmedisNama}</td>
                                                        <td data-used="1" 
                                                            data-save="1" 
                                                            data-name="penunjangtransHasil" 
                                                            data-kolom-id="penunjangtransHasil"></td>
                                                        <td data-used="1" 
                                                            data-save="1" 
                                                            data-name="penunjangtransStandar" 
                                                            data-kolom-id="penunjangtransStandar">${pt.penunjangs.paramperiksa[0].paramperiksaStandar}</td>
                                                        <td data-used="1" 
                                                            data-save="1" 
                                                            data-name="penunjangtransSatuan" 
                                                            data-kolom-id="penunjangtransSatuan">${pt.penunjangs.paramperiksa[0].paramperiksaSatuan}</td>
                                                        <td data-used="1" 
                                                            data-save="1" 
                                                            data-name="penunjangtransJumlah" 
                                                            data-kolom-id="penunjangtransJumlah">${pt.paketDetailJumlah}</td>
                                                        <td data-used="1" 
                                                            data-save="1" 
                                                            data-name="penunjangtransHarga" 
                                                            data-kolom-id="penunjangtransHarga">${pt.paketDetailHarga}</td>
                                                        <td data-used="1" 
                                                            data-save="1" 
                                                            data-name="penunjangtransSubtotal" 
                                                            data-kolom-id="penunjangtransSubtotal">${pt.paketDetailJumlah*pt.paketDetailHarga}</td>
                                                        <td>
                                                            <button type="button" class="btn btn-danger btn-sm" onclick="deletePenunjangtrans(${itemIndex})">Delete</button>
                                                            <button type="button" class="btn btn-primary btn-sm" onclick="editPenunjangtrans(${itemIndex})">Edit</button>
                                                        </td>
                                                        <td style="display:none" data-used="1" data-save="1" data-name="penunjang.penunjangmedisID" data-kolom-id="penunjangMedis">${pt.penunjangs.penunjangmedisID}</td>
                                                    </tr>
                                                </c:when>
                                            </c:choose>
                                        </c:forEach>

                                    </c:when>
                                    <c:otherwise>
                                        <c:forEach var="pt" items="${pelayananModel.penunjangtrans}" varStatus="loop">
        									<tr id="penunjangtrans_${loop.index+1}">
        										<td>${pt.penunjang.penunjangmedisNama} - ${pt.paramperiksa.paramperiksaNama}</td>
        										<td data-used="1" 
                                                    data-save="1" 
                                                    data-name="penunjangtransHasil" 
                                                    data-kolom-id="penunjangtransHasil">${pt.penunjangtransHasil}</td>
        										<td data-used="1" 
                                                    data-save="1" 
                                                    data-name="penunjangtransStandar" 
                                                    data-kolom-id="penunjangtransStandar">${pt.paramperiksa.paramperiksaStandar}</td>
        										<td data-used="1" 
                                                    data-save="1" 
                                                    data-name="penunjangtransSatuan" 
                                                    data-kolom-id="penunjangtransSatuan">${pt.paramperiksa.paramperiksaSatuan}</td>
        										<td data-used="1" 
                                                    data-save="1" 
                                                    data-name="penunjangtransJumlah" 
                                                    data-kolom-id="penunjangtransJumlah">${pt.penunjangtransJumlah}</td>
        										<td data-used="1" 
                                                    data-save="1" 
                                                    data-name="penunjangtransHarga" 
                                                    data-kolom-id="penunjangtransHarga">${pt.penunjang.penunjangkelas[0].penunjangkelasHarga}</td>
        										<td data-used="1" 
                                                    data-save="1" 
                                                    data-name="penunjangtransSubtotal" 
                                                    data-kolom-id="penunjangtransSubtotal">${pt.penunjangtransJumlah*pt.penunjangtransHarga}</td>
                                                <td>
                                                    <button type="button" class="btn btn-danger btn-sm" onclick="deletePenunjangtrans(${loop.index+1})">Delete</button>
                                                    <button type="button" class="btn btn-primary btn-sm" onclick="editPenunjangtrans(${loop.index+1})">Edit</button>
                                                </td>
                                                <td style="display:none" data-used="1" data-save="1" data-name="penunjang.penunjangmedisID" data-kolom-id="penunjangMedis">${pt.penunjang.penunjangmedisID}</td>
                                                <td style="display:none" data-used="1" data-save="1" data-name="paramperiksa.paramperiksaID" data-kolom-id="paramperiksa">${pt.paramperiksa.paramperiksaID}</td>
                                                <td style="display:none" data-used="1" data-save="1" data-name="penunjangtransID" data-kolom-id="penunjangtransID">${pt.penunjangtransID}</td>
        									</tr>
                                        </c:forEach>
                                    </c:otherwise>
                                </c:choose>
                            </tbody>
                        </table>
                    </div>