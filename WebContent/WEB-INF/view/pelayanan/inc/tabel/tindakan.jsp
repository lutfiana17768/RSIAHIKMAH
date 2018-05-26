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
										<td>${tp.tindakan.tindakan_nama}</td>
										<td data-used="1" data-save="1" data-name="tindakanpasien_harga" data-kolom-id="tindakanpasien_harga">${tp.tindakanpasien_harga}</td>
										<td>${tp.pegawai.pegawaiNama}</td>
										<td>
											<button type="button" class="btn btn-danger btn-sm" onclick="deleteTIndakan(${loop.index+1})">Delete</button>
											<button type="button" class="btn btn-primary btn-sm" onclick="editTIndakan(${loop.index+1})">Edit</button>
										</td>
										<td style="display:none" data-used="1" data-save="1" data-name="pegawai.pegawai_id" data-kolom-id="pegawai_id">${tp.pegawai.pegawai_id}</td>
										<td style="display:none" data-used="1" data-save="1" data-name="tindakan_id" data-kolom-id="tindakan_id">${tp.tindakan.tindakan_id}</td>
										<td style="display:none" data-used="1" data-save="1" data-name="tindakanpasien_id" data-kolom-id="tindakanpasien_id">${tp.tindakanpasien_id}</td>
									</tr>
								</c:forEach>
                            </tbody>
                        </table>
                    </div>