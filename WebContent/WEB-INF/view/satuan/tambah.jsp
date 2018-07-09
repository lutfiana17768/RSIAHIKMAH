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
						<h3 class="title"> Data Satuan </h3>
					</div>
					<form:form modelAttribute="satuanModel" method="POST" action="/satuan/update">
					
						<div class="form-group">
							<label for="exampleInputEmail1">Kode Satuan</label>
								<form:input path="satuanKode" placeholder="Masukan Kode Satuan" class="form-control boxed"/>
							</div>
						<div class="form-group">
							<label for="exampleInputPassword1">Nama Satuan</label>
								<form:input path="satuanNama" placeholder="Masukan Nama Satuan" class="form-control boxed"/>
							 </div>
						<div class="form-group">
							<button type="submit" class="btn btn-primary rounded-0">Simpan</button>
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
                            <h3 class="title"> List Satuan </h3>
                        </div>
                        <section class="example">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover">
                                    <thead>
                                        <tr>
                                            <th>Kode Satuan</th>
                                            <th>Nama Satuan</th>
                                            <th>Keterangan</th>
                                            <th colspan="2">Action</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="tempSatuan" items="${satuan}">
                                        
                                            	<tr>
                                            		<td> ${tempSatuan.satuanKode } </td>
                                            		<td> ${tempSatuan.satuanNama } </td>
                                            		<td>  </td>
                                            		<td> <a href="/satuan/update/${tempSatuan.satuanID }" class="btn btn-info rounded-0">Update</a>
                                                     <a href="/satuan/delete/${tempSatuan.satuanID }" class="btn btn-warning rounded-0">Delete</a></td>
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
        <div class="fixed-table-pagination" style="display: block; margin-top:25px">
             <form action="" method="get">
                    <div class="pull-right pagination" style="margin-right: 20px;">
                         ${link }
                    </div>
              </form>
        </div>
                <div class="clearfix"></div>
    </section>
<jsp:include page="../app/footer.jsp" />