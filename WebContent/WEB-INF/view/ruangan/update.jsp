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
					<div class="title-block" style="border-bottom: 1px solid #ddd; padding-bottom: 10px;">
						<label class="title" style="margin-top: 10px;">Data Ruang</label>
					</div>
					<form:form modelAttribute="ruangModel" method="POST" action="/ruangan/update">
						<form:hidden path="ruang_id" />
						<form:hidden path="ruang_created_date" />
						<form:hidden path="ruang_created_by" />
						<form:hidden path="ruang_aktif" />

						<div class="form-group">
                           <label>Kode</label>
                           <form:input path="ruang_kode" placeholder="Masukan Kode" class="form-control boxed"/>
                        </div>

                       <div class="form-group">
                           <label>Nama</label>
                           <form:input path="ruang_nama" placeholder="Masukan Nama" class="form-control boxed"/>
                        </div>
                       
                       <div class="form-group">
                           <label>Keterangan</label>
                           <form:input path="ruang_keterangan" placeholder="Masukan Keterangan" class="form-control boxed"/>
                        </div>

                        <div class="form-group">
                           <label>Kepala</label>
                           <form:input path="ruang_kepala" placeholder="Masukan Kepala" class="form-control boxed"/>
                        </div>

						<div class="form-group">
							<form:select path="kelas.kelas_id" class="form-control boxed">
								<form:options items="${kelases}" itemValue="kelas_id" itemLabel="kelas_nama" />
							</form:select>
						</div>
						<div class="form-group">
							<button type="submit" class="btn btn-primary rounded-0" id="simpan-paket" onclick="$('form').submit()">Update</button>
						</div>
					</form:form>

				</div>
			</div>
		</div>
	</section> 
<jsp:include page="../app/footer.jsp" />