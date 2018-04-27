<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
    <section class="section">
        <div class="row sameheight-container">
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <div class="card card-block sameheight-item">
                    <div class="title-block">
                        <h3 class="title"> Data Opname </h3>
                    </div>
                    <form:form modelAttribute="opnameModel" method="POST" action="/opname/store">
                    
                        <div class="form-group">
                            <label>No</label>
                                <form:input path="opnameNo" placeholder="Masukan Nomer" class="form-control"/>
                            </div>
                        <div class="form-group">
                            <label>Nama</label>
                                <form:input path="opnameDepoNama" placeholder="Masukan Nama Opname" class="form-control"/>
                             </div>
                        <div class="form-group">
                            <label>Tanggal</label>
                                <form:input path="opnameTanggal" type="date" placeholder="Tanggal Opname" class="form-control"/>
                             </div>
                        <div class="form-group">
                            <label>Status</label>
                                <form:input path="opnameStatus" placeholder="Status opname" class="form-control"/>
                             </div>
                        <div class="form-group">
                            <label>Keterangan</label>
                                <form:input path="opnameKeterangan" placeholder="Keterangan" class="form-control"/>
                             </div>
                        <div class="form-group">
                            <button type="submit" class="btn btn-primary">Simpan</button>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </section>
    <section class="section">
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="card-block">
                        <div class="card-title-block">
                            <h3 class="title"> List Opname</h3>
                        </div>
                        <section class="example">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover">
                                    <thead>
                                        <tr>
                                            <th>No Opname</th>
                                            <th>Opname</th>
                                            <th>Tanggal Opname</th>
                                            <th>Status</th>
                                            <th>Keterangan</th>
                                            <th></th>
                                            <th colspan="2">Action</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="tempOpname" items="${Opname}">
                                                <tr>
                                                    <td> ${tempOpname.opnameNo } </td>
                                                    <td> ${tempOpname.opnameDepoNama } </td>
                                                     <td> ${tempOpname.opnameTanggal } </td>
                                                    <td> ${tempOpname.opnameStatus } </td>
                                                    <td> ${tempOpname.opnameKeterangan }</td>
                                                    <td> <a href="/Opname/update/${tempOpname.opname_id }" class="btn btn-info">Update</a>
                                                     <a href="/Opname/delete/${tempOpname.opname_id }" class="btn btn-warning">Delete</a></td>
                                                </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </section>
                    </div>
                </div>
            </div>
        </div>
    </section>
<jsp:include page="../app/footer.jsp" />