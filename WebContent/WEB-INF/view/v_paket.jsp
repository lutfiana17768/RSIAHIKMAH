<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="templatehead.jsp"></jsp:include>
<script type="text/javascript">
		$(document).ready(function(){
			$("#add_kamar").click(function(){
			    $("#add_kamar_form").slideToggle('slow');
			});
			$('#add_paket').click(function(){
				window.location = '/tambah';
			});
		});
		</script>
<body>
	<div class="main-wrapper">
		<div class="app" id="app">
			<header class="header">
			<div class="nav-title">
				<h3 class="title">Paket</h3>
			</div>
			<jsp:include page="templateheader.jsp"></jsp:include>
			</header>
			<jsp:include page="templatesidebar.jsp"></jsp:include>
			<div class="card card-success">
				<div class="card-header" style="min-height: 0">
					<div class="header-block" style="padding: 5px 20px">
						<p class="title">Data Paket</p>
					</div>
				</div>
				<div class="card-block" style="background-color: #f4f4f4">
					<div class="table-responsive">	
                        <a class="btn btn-primary" href="<c:url value="/Paket/tambah"></c:url>" align="right"> Tambah </a>											
						<table class="table table-striped table-bordered table-hover">
							<thead>
								<tr>
									<th>Nama</th>
									<th>Kelas</th>
									<th>Keterangan</th>
									<th>Harga</th>
									<th>Aksi</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="temp" items="${paket}">
									<c:choose>
										<c:when test="${temp.paket_aktif  == 'Y' }">
											<c:url var="updateLink" value="../form-update">
												<c:param name="Id" value="${temp.paket_id}" />
											</c:url>
											<c:url var="deleteLink" value="../delete">
												<c:param name="Id" value="${temp.paket_id}" />
											</c:url>
					
											<tr>
												<td>${temp.paket_nama}</td>
												<td>${temp.paket_kelas }</td>
												<td>${temp.paket_keterangan }</td>
												<td>${temp.paket_harga }</td>
												<td><a href="${updateLink }" class="btn btn-info">Update</a>
													<a href="${deleteLink }" class="btn btn-warning">Delete</a>
												</td>
											</tr>
										</c:when>
									</c:choose>
					
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>

			</section> </article>
			<footer class="footer"> </footer>
		</div>
	</div>
	<jsp:include page="templatefooter.jsp"></jsp:include>
	<script type="text/javascript">
		
	</script>
</body>
</html>