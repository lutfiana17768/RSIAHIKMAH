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
						<h3 class="title"> Data Jabatan Pegawai </h3>
					</div>
					<form:form modelAttribute="jabatanModel" method="POST" action="/jabatan/store">
						<div class="form-group">
							<label for="exampleInputPassword1">Nama Nama Jabatan</label>
								<form:input path="jabatanNama" placeholder="Masukan Nama Jabatan" class="form-control"  />
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">Nama Jenis Jabatan</label>
								<form:select path="jabatanJenis" placeholder="Masukan Jenis Jabatan" class="form-control form-control-sm" >
									<form:option value="NULL" label="--- Pilih Satu ---" />
									<form:option value="Fungsional" label="Fungsional" />
									<form:option value="Struktural" label="Struktural" />
								</form:select>
						</div>
	                     <div class="form-group">
							<label for="exampleInputPassword1">Keterangan</label>
								<form:textarea path="jabatanKeterangan" placeholder="Masukan Keterangan" class="form-control" /> 
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
                            <h3 class="title"> List Jabatan </h3>
                        </div>
                        <section class="example">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover">
                                    <thead>
                                        <tr>
                                            <th>Nama Jabatan</th>
                                            <th>Jenis Jabatan</th>
                                            <th>Keterangan</th>
                                       
                                            <th colspan="2">Action</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="tempJabatan" items="${jabatan}">
                                        
                                            	<tr>
                                            		<td> ${tempJabatan.jabatanNama } </td>
                                            		<td> ${tempJabatan.jabatanJenis } </td>
                                            		<td> ${tempJabatan.jabatanKeterangan} </td>
                                            		<td>  </td>
                                            		<td> <a href="/jabatan/update/${tempJabatan.jabatanId }" class="btn btn-info rounded-0">Update</a>
                                                     <a href="/jabatan/delete/${tempJabatan.jabatanId }" class="btn btn-warning rounded-0">Delete</a></td>
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