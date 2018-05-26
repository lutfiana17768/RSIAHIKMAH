<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>Tanggal</th>
                                    <th>Subject (Keluhan)</th>
                                    <th>Object (Pemeriksaaan)</th>
                                    <th>Assesment (Kesimpulan)</th>
                                    <th>Plan (Perencanaan)</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody id="pelayanan-soap-list" class="table-form">
                            	<c:forEach var="soap" items="${pelayananModel.soap}" varStatus="loop">
									<tr id="soap_${loop.index+1}">
										<td data-used="1" data-save="1" data-name="soap_tanggal" data-kolom-id="soap_tanggal">${soap.soap_tanggal}</td>
										<td data-used="1" data-save="1" data-name="soap_subject" data-kolom-id="soap_subject">${soap.soap_subject}</td>
										<td data-used="1" data-save="1" data-name="soap_object" data-kolom-id="soap_object">${soap.soap_object}</td>
										<td data-used="1" data-save="1" data-name="soap_assesment" data-kolom-id="soap_assesment">${soap.soap_assesment}</td>
										<td data-used="1" data-save="1" data-name="soap_plan" data-kolom-id="soap_plan">${soap.soap_plan}</td>
										<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteSoap(${loop.index+1})">Delete</button>&nbsp;<button type="button" class="btn btn-primary btn-sm" onclick="editSoap(${loop.index+1})">Edit</button></td>
                                        <td style="display:none" data-used="1" data-save="1" data-name="soap_id" data-kolom-id="soap_id">${soap.soap_id}</td>
									</tr>
								</c:forEach>
                            </tbody>
                        </table>
                    </div>