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
					<form:input type="hidden" path="satuanID" />
					<form:input type="hidden" path="satuanCreatedDate" />
					<form:input type="hidden" path="satuanCreatedBy" />
					<form:input type="hidden" path="satuanRevised" />
					<form:input type="hidden" path="satuanAktif" />
					
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
<jsp:include page="../app/footer.jsp" />