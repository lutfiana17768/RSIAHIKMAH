<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
	<section class="section">
		<div class="container"   id="add_passien_form">
			 
				 			 
			<div class="container">
				<div class="card card-success">
					<div class="card-header" style="min-height:0">
						<div class="header-block" style="padding: 5px 20px">
							<p class="title"> Data Pasien </p>
						</div>
					</div>
					
					<div class="card-block" style="background-color: #f4f4f4">
					<a class="btn btn-primary" href="/pasien/tambah"/>Tambah Data</a>
                        <jsp:include page="inc/tabel.jsp" />
					</div>
				</div>
			</div>
	</section>
<jsp:include page="../app/footer.jsp" />