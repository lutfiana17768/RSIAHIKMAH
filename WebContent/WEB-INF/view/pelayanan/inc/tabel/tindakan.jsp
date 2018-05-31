<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>Nama Tindakan</th>
                                    <th>Harga</th>
                                    <th>Pelaksana</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody id="pelayanan-tindakan-list" class="table-form">

								<c:forEach var="tp" items="${pelayananModel.tindakanpasien}" varStatus="loop">
									<tr id="tindakan_${loop.index+1}">
										<td>${tp.tindakan.tindakanNama}</td>
										<td data-used="1" data-save="1" data-name="tindakanpasienHarga" data-kolom-id="tindakanpasienHarga">${tp.tindakanpasienHarga}</td>
										<td>${tp.pegawai.pegawaiNama}</td>
										<td>
											<button type="button" class="btn btn-danger btn-sm" onclick="deleteTIndakan(${loop.index+1})">Delete</button>
											<button type="button" class="btn btn-primary btn-sm" onclick="editTIndakan(${loop.index+1})">Edit</button>
										</td>
										<td style="display:none" data-used="1" data-save="1" data-name="pegawai.pegawaiID" data-kolom-id="pegawaiID">${tp.pegawai.pegawaiID}</td>
										<td style="display:none" data-used="1" data-save="1" data-name="tindakanID" data-kolom-id="tindakanID">${tp.tindakan.tindakanID}</td>
										<td style="display:none" data-used="1" data-save="1" data-name="tindakanpasienID" data-kolom-id="tindakanpasienID">${tp.tindakanpasienID}</td>
									</tr>
								</c:forEach>
                            </tbody>
                        </table>
                    </div>