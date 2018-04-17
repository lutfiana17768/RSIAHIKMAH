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
                        <h3 class="title"> Data Kamar </h3>
                    </div>
                    <form:form modelAttribute="kamarModel" method="POST" action="../store">
                       <div class="form-group">
                            <label>No Kamar</label>
                            <form:input path="kamar_no" placeholder="Masukan No Kamar" class="form-control"/>
                         </div>
                         
                        <div class="form-group">
                            <label>Ruang</label>
                            <form:input path="m_ruang_id" placeholder="Masukan Ruang" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Kelas</label>
                            <form:input path="m_kelas_id" placeholder="Masukan Kelas" class="form-control"/>
                         </div>
                        
                        <div class="form-group">
                            <label>Keterangan</label>
                            <form:input path="kamar_keterangan" placeholder="Masukan Keterangan" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Kategori</label>
                            <form:input path="kamar_kategori" placeholder="Masukan Kategori" class="form-control"/>
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