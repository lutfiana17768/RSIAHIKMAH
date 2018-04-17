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
						<h3 class="title"> Data Kondisi </h3>
					</div>
					<form:form modelAttribute="kondisiModel" method="POST" action="/kondisi/update">
						<form:hidden path="kondisi_id" />
						
						<div class="form-group">
							<label for="exampleInputEmail1">Kode</label>
							<form:input path="kondisi_kode" class="form-control"/>
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">Nama</label>
							<form:input path="kondisi_nama" class="form-control"/>
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">Keterangan</label>
							<form:input path="kondisi_keterangan" class="form-control"/>
						</div>
						
						<div class="form-group">
							<button type="submit" class="btn btn-primary">Update</button>
						</div>
					</form:form>
					
				</div>
			</div>
		</div>
	</section>
<jsp:include page="../app/footer.jsp" />