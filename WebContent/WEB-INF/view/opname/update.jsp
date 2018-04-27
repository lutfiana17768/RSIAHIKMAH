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
                        <h3 class="title">Update Data Opname </h3>
                    </div>
                    <form:form modelAttribute="opnameModel" method="POST" action="/opname/update">
                    
                        <div class="form-group">
                            <label>No</label>
                                <form:input path="opnameNo" class="form-control"/>
                            </div>
                        <div class="form-group">
                            <label>Nama</label>
                                <form:input path="opnameDepoNama" class="form-control"/>
                             </div>
                        <div class="form-group">
                            <label>Tanggal</label>
                                <form:input path="opnameTanggal" type="date" class="form-control"/>
                             </div>
                        <div class="form-group">
                            <label>Status</label>
                                <form:input path="opnameStatus" class="form-control"/>
                             </div>
                        <div class="form-group">
                            <label>Keterangan</label>
                                <form:input path="opnameKeterangan" class="form-control"/>
                             </div>
                        <div class="form-group">
                            <button type="submit" class="btn btn-primary">Simpan</button>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </section>
<jsp:include page="../app/footer.jsp" />