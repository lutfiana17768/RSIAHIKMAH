<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<jsp:include page="../Head.jsp"></jsp:include>

<body>
	<div class="main-wrapper">
		<div class="app" id="app">

			<jsp:include page="../HeaderSidebar.jsp"></jsp:include>


			<!-- MAIN HERE -->
			<article class="content forms-page">
				<!-- Form -->
				<section class="section">
					<div class="row sameheight-container">
						<div class="col-md-3"></div>
						<div class="col-md-12">
							<!-- MAIN HERE -->
							<div class="card card-block sameheight-item">
									
								<form:form modelAttribute="agamaModel" method="POST"
									action="update">
									
									<div class="row">
										<div class="col-md-4">
											<div class="form-group">
												<label>No. Daftar</label>										
											</div>
											
											<div class="form-group">
												<label>No. RM</label>										
											</div>
											
											<div class="form-group">
												<label>Nama</label>										
											</div>
											
											<div class="form-group">
												<label>Alamat</label>										
											</div>
											
											<div class="form-group">
												<label>Usia</label>										
											</div>
											
											<div class="form-group">
												<label>L/P</label>										
											</div>
											
											<div class="form-group">
												<label>Pembayaran</label>										
											</div>
											
											<div class="form-group">
												<label>Waktu MRS</label>										
											</div>
										</div>
										<div class="col-md-4">
											<div class="form-group">
												<div class="row">
													<div class="col-md-3">
														<label>Dokter</label>
													</div>
													<div class="col-md-8">
														<select class="form-control">
															<option>Dokter 1</option>
															<option>Dokter 2</option>
														</select>				
													</div>
												</div>										
											</div>
											
											<div class="form-group">
												<div class="row">
													<div class="col-md-3">
														<label>Kondisi Masuk</label>	
													</div>
													<div class="col-md-8">
														<select class="form-control">
															<option>Normal</option>
															<option>Tidak Normal</option>
														</select>				
													</div>
												</div>										
											</div>
											
											<div class="form-group">
												<div class="row">
													<div class="col-md-3">
														<label>Kegiatan</label>	
													</div>
													<div class="col-md-8">
														<select class="form-control">
															<option>Umum</option>
															<option>Tidak Umum</option>
														</select>				
													</div>
												</div>								
											</div>
											
											<div class="form-group">												
												<div class="row">
													<div class="col-md-3">
														<label>Kamar</label>	
													</div>
													<div class="col-md-8">
														<select class="form-control">
															<option>Kamar 1</option>
															<option>Kamar 2</option>
														</select>				
													</div>
												</div>										
											</div>
											
											<div class="form-group">
												<div class="row">
													<div class="col-md-3">
														<label>Bed</label>	
													</div>
													<div class="col-md-8">
														<select class="form-control">
															<option>Bed 1</option>
															<option>Bed 2</option>
														</select>				
													</div>
												</div>										
											</div>
										</div>
										<div class="col-md-4">
											<div class="form-group">
												<div class="row">
													<div class="col-md-3">
														<label>Selesai</label>
													</div>
													<div class="col-md-8">
														<select class="form-control">
															<option>Ya</option>
															<option>Tidak</option>
														</select>				
													</div>
												</div>				
											</div>
										</div>
									</div>

								</form:form>
							</div>							
							<!-- END MAIN HERE -->
							
							<!-- TABS -->
							<div class="card card-block sameheight-item">
								<ul class="nav nav-tabs" id="myTab" role="tablist">
								
									<li class="nav-item"><a class="nav-link active"
										id="home-tab" data-toggle="tab" href="#fisik" role="tab"
										aria-controls="home" aria-selected="true">Fisik</a></li>
										
									<li class="nav-item"><a class="nav-link" id="profile-tab"
										data-toggle="tab" href="#pemeriksaan" role="tab"
										aria-controls="profile" aria-selected="false">Pemeriksaan</a></li>
										
									<li class="nav-item"><a class="nav-link" id="contact-tab"
										data-toggle="tab" href="#diagnosa" role="tab"
										aria-controls="contact" aria-selected="false">Diagnosis</a></li>
										
									<li class="nav-item"><a class="nav-link" id="contact-tab"
										data-toggle="tab" href="#prosedur" role="tab"
										aria-controls="contact" aria-selected="false">Prosedur</a></li>
										
									<li class="nav-item"><a class="nav-link" id="contact-tab"
										data-toggle="tab" href="#tindakan" role="tab"
										aria-controls="contact" aria-selected="false">Tindakan</a></li>
									
									<li class="nav-item"><a class="nav-link" id="contact-tab"
										data-toggle="tab" href="#bph" role="tab"
										aria-controls="contact" aria-selected="false">BPH</a></li>
										
									<li class="nav-item"><a class="nav-link" id="contact-tab"
										data-toggle="tab" href="#resep" role="tab"
										aria-controls="contact" aria-selected="false">Resep</a></li>
										
									<li class="nav-item"><a class="nav-link" id="contact-tab"
										data-toggle="tab" href="#file" role="tab"
										aria-controls="contact" aria-selected="false">File</a></li>
										
									<li class="nav-item"><a class="nav-link" id="contact-tab"
										data-toggle="tab" href="#soap" role="tab"
										aria-controls="contact" aria-selected="false">SOAP</a></li>
								</ul>
								
								<div class="tab-content" id="myTabContent">
									<!-- Fisik -->
									<div class="tab-pane fade show active" id="fisik" role="tabpanel">										
										<div class="card-title-block" style="margin-top:10px">
											<button class="btn btn-primary">Tambah</button>
										</div>
										
										<section class="example">
											<div class="table-responsive">
												<table class="table table-striped table-bordered table-hover">
													<thead>
														<tr>
															<th>Tinggi</th>
															<th>Berat</th>
															<th>Detak Jantung</th>
															<th>Tekanan Darah</th>
															<th>Suhu</th>
															<th>Nafas</th>
															<th>Keluhan</th>
															<th>Pemeriksa</th>
															<th>Tanggal</th>
															<th>Waktu</th>
															<th colspan="2">Action</th>
														</tr>
													</thead>
													
													<!-- 
													<tbody>
														<c:forEach var="temp" items="${agama}">
															<c:url var="updateLink" value="../form-update">
																<c:param name="Id" value="${temp.agama_id}" />
															</c:url>
															<c:url var="deleteLink" value="../delete">
																<c:param name="Id" value="${temp.agama_id}" />
															</c:url>
															<tr>
																<td>${temp.agamaNama }</td>
																<td>${temp.agamaKeterangan }</td>
																<td><a href="${updateLink }" class="btn btn-info">Update</a>
																	<a href="${deleteLink }" class="btn btn-warning">Delete</a></td>
															</tr>
	
														</c:forEach>
													</tbody>
													 -->
												</table>
											</div>
										</section>								
									</div>
									<!-- Fisik -->
									
									<!-- Pemeriksaan -->
									<div class="tab-pane fade" id="pemeriksaan" role="tabpanel">										
										<div class="card-title-block" style="margin-top:10px">
											<button class="btn btn-primary">Tambah</button>
										</div>
										
										<section class="example">
											<div class="table-responsive">
												<table class="table table-striped table-bordered table-hover">
													<thead>
														<tr>
															<th>Kode</th>
															<th>Pemeriksa</th>
															<th>Standar</th>
															<th>Nilai</th>
															<th>Dokter</th>
															<th>Keterangan</th>
															<th>Tanggal</th>
															<th>Waktu</th>
															<th colspan="2">Action</th>
														</tr>
													</thead>
													
													<!-- 
													<tbody>
														<c:forEach var="temp" items="${agama}">
															<c:url var="updateLink" value="../form-update">
																<c:param name="Id" value="${temp.agama_id}" />
															</c:url>
															<c:url var="deleteLink" value="../delete">
																<c:param name="Id" value="${temp.agama_id}" />
															</c:url>
															<tr>
																<td>${temp.agamaNama }</td>
																<td>${temp.agamaKeterangan }</td>
																<td><a href="${updateLink }" class="btn btn-info">Update</a>
																	<a href="${deleteLink }" class="btn btn-warning">Delete</a></td>
															</tr>
	
														</c:forEach>
													</tbody>
													 -->
												</table>
											</div>
										</section>								
									</div>
									<!-- Pemeriksaan --> 
									
									<!-- Diagnosa -->
									<div class="tab-pane fade" id="diagnosa" role="tabpanel">										
										<div class="card-title-block" style="margin-top:10px">
											<button class="btn btn-primary">Tambah</button>
										</div>
										
										<section class="example">
											<div class="table-responsive">
												<table class="table table-striped table-bordered table-hover">
													<thead>
														<tr>
															<th>Kode ICD X</th>
															<th>Nama Diagnosa</th>
															<th>Jenis Diagnosa</th>
															<th>Kasus</th>
															<th>Keterangan</th>
															<th>Tanggal</th>
															<th>Waktu</th>
															<th colspan="2">Action</th>
														</tr>
													</thead>
													
													<!-- 
													<tbody>
														<c:forEach var="temp" items="${agama}">
															<c:url var="updateLink" value="../form-update">
																<c:param name="Id" value="${temp.agama_id}" />
															</c:url>
															<c:url var="deleteLink" value="../delete">
																<c:param name="Id" value="${temp.agama_id}" />
															</c:url>
															<tr>
																<td>${temp.agamaNama }</td>
																<td>${temp.agamaKeterangan }</td>
																<td><a href="${updateLink }" class="btn btn-info">Update</a>
																	<a href="${deleteLink }" class="btn btn-warning">Delete</a></td>
															</tr>
	
														</c:forEach>
													</tbody>
													 -->
												</table>
											</div>
										</section>								
									</div>
									<!-- Diagnosa -->
									
									<!-- prosedur -->
									<div class="tab-pane fade" id="prosedur" role="tabpanel">										
										<div class="card-title-block" style="margin-top:10px">
											<button class="btn btn-primary">Tambah</button>
										</div>
										
										<section class="example">
											<div class="table-responsive">
												<table class="table table-striped table-bordered table-hover">
													<thead>
														<tr>
															<th>Kode ICD X</th>
															<th>Nama Diagnosa</th>
															<th>Keterangan</th>
															<th>Tanggal</th>
															<th>Waktu</th>
															<th colspan="2">Action</th>
														</tr>
													</thead>
													
													<!-- 
													<tbody>
														<c:forEach var="temp" items="${agama}">
															<c:url var="updateLink" value="../form-update">
																<c:param name="Id" value="${temp.agama_id}" />
															</c:url>
															<c:url var="deleteLink" value="../delete">
																<c:param name="Id" value="${temp.agama_id}" />
															</c:url>
															<tr>
																<td>${temp.agamaNama }</td>
																<td>${temp.agamaKeterangan }</td>
																<td><a href="${updateLink }" class="btn btn-info">Update</a>
																	<a href="${deleteLink }" class="btn btn-warning">Delete</a></td>
															</tr>
	
														</c:forEach>
													</tbody>
													 -->
												</table>
											</div>
										</section>								
									</div>
									<!-- prosedur --> 
									
									<!-- tindakan -->
									<div class="tab-pane fade" id="tindakan" role="tabpanel">										
										<div class="card-title-block" style="margin-top:10px">
											<button class="btn btn-primary">Tambah</button>
										</div>
										
										<section class="example">
											<div class="table-responsive">
												<table class="table table-striped table-bordered table-hover">
													<thead>
														<tr>
															<th>Tindakan</th>
															<th>Pelaksana</th>
															<th>Jumlah</th>
															<th>Keterangan</th>
															<th>Tanggal</th>
															<th>Waktu</th>
															<th colspan="2">Action</th>
														</tr>
													</thead>
													
													<!-- 
													<tbody>
														<c:forEach var="temp" items="${agama}">
															<c:url var="updateLink" value="../form-update">
																<c:param name="Id" value="${temp.agama_id}" />
															</c:url>
															<c:url var="deleteLink" value="../delete">
																<c:param name="Id" value="${temp.agama_id}" />
															</c:url>
															<tr>
																<td>${temp.agamaNama }</td>
																<td>${temp.agamaKeterangan }</td>
																<td><a href="${updateLink }" class="btn btn-info">Update</a>
																	<a href="${deleteLink }" class="btn btn-warning">Delete</a></td>
															</tr>
	
														</c:forEach>
													</tbody>
													 -->
												</table>
											</div>
										</section>								
									</div>
									<!-- tindakan --> 
									
									<!-- bph -->
									<div class="tab-pane fade" id="bph" role="tabpanel">										
										<div class="card-title-block" style="margin-top:10px">
											<button class="btn btn-primary">Tambah</button>
										</div>
										
										<section class="example">
											<div class="table-responsive">
												<table class="table table-striped table-bordered table-hover">
													<thead>
														<tr>
															<th>Barang</th>
															<th>Satuan</th>
															<th>Jumlah</th>
															<th>Harga</th>
															<th>Sub Total</th>
															<th>Keterangan</th>
															<th colspan="2">Action</th>
														</tr>
													</thead>
													
													<!-- 
													<tbody>
														<c:forEach var="temp" items="${agama}">
															<c:url var="updateLink" value="../form-update">
																<c:param name="Id" value="${temp.agama_id}" />
															</c:url>
															<c:url var="deleteLink" value="../delete">
																<c:param name="Id" value="${temp.agama_id}" />
															</c:url>
															<tr>
																<td>${temp.agamaNama }</td>
																<td>${temp.agamaKeterangan }</td>
																<td><a href="${updateLink }" class="btn btn-info">Update</a>
																	<a href="${deleteLink }" class="btn btn-warning">Delete</a></td>
															</tr>
	
														</c:forEach>
													</tbody>
													 -->
												</table>
											</div>
										</section>								
									</div>
									<!-- bph --> 
									
									<!-- resep -->
									<div class="tab-pane fade" id="resep" role="tabpanel">										
										<div class="card-title-block" style="margin-top:10px">
											<button class="btn btn-primary">Tambah</button>
										</div>
										
										<section class="example">
											<div class="table-responsive">
												<table class="table table-striped table-bordered table-hover">
													<thead>
														<tr>
															<th>Barang</th>
															<th>Satuan</th>
															<th>Jumlah</th>
															<th>Aturan Pakai</th>
															<th>Keterangan</th>
															<th colspan="2">Action</th>
														</tr>
													</thead>
													
													<!-- 
													<tbody>
														<c:forEach var="temp" items="${agama}">
															<c:url var="updateLink" value="../form-update">
																<c:param name="Id" value="${temp.agama_id}" />
															</c:url>
															<c:url var="deleteLink" value="../delete">
																<c:param name="Id" value="${temp.agama_id}" />
															</c:url>
															<tr>
																<td>${temp.agamaNama }</td>
																<td>${temp.agamaKeterangan }</td>
																<td><a href="${updateLink }" class="btn btn-info">Update</a>
																	<a href="${deleteLink }" class="btn btn-warning">Delete</a></td>
															</tr>
	
														</c:forEach>
													</tbody>
													 -->
												</table>
											</div>
										</section>								
									</div>
									<!-- resep --> 
									
									<!-- file -->
									<div class="tab-pane fade" id="file" role="tabpanel">										
										<div class="card-title-block" style="margin-top:10px">
											<button class="btn btn-primary">Tambah</button>
										</div>
										
										<section class="example">
											<div class="table-responsive">
												<table class="table table-striped table-bordered table-hover">
													<thead>
														<tr>
															
															<th colspan="2">Action</th>
														</tr>
													</thead>
													
													<!-- 
													<tbody>
														<c:forEach var="temp" items="${agama}">
															<c:url var="updateLink" value="../form-update">
																<c:param name="Id" value="${temp.agama_id}" />
															</c:url>
															<c:url var="deleteLink" value="../delete">
																<c:param name="Id" value="${temp.agama_id}" />
															</c:url>
															<tr>
																<td>${temp.agamaNama }</td>
																<td>${temp.agamaKeterangan }</td>
																<td><a href="${updateLink }" class="btn btn-info">Update</a>
																	<a href="${deleteLink }" class="btn btn-warning">Delete</a></td>
															</tr>
	
														</c:forEach>
													</tbody>
													 -->
												</table>
											</div>
										</section>								
									</div>
									<!-- file -->
									
									<!-- soap -->
									<div class="tab-pane fade" id="soap" role="tabpanel">										
										<div class="card-title-block" style="margin-top:10px">
											<button class="btn btn-primary">Tambah</button>
										</div>
										
										<section class="example">
											<div class="table-responsive">
												<table class="table table-striped table-bordered table-hover">
													<thead>
														<tr>
															<th>Tanggal</th>
															<th>Subjek (Keluhan)</th>
															<th>Objek (Pemeriksaan)</th>
															<th>Assesment (Kesimpulan)</th>
															<th>Plan (Rencana)</th>
															<th colspan="2">Action</th>
														</tr>
													</thead>
													
													<!-- 
													<tbody>
														<c:forEach var="temp" items="${agama}">
															<c:url var="updateLink" value="../form-update">
																<c:param name="Id" value="${temp.agama_id}" />
															</c:url>
															<c:url var="deleteLink" value="../delete">
																<c:param name="Id" value="${temp.agama_id}" />
															</c:url>
															<tr>
																<td>${temp.agamaNama }</td>
																<td>${temp.agamaKeterangan }</td>
																<td><a href="${updateLink }" class="btn btn-info">Update</a>
																	<a href="${deleteLink }" class="btn btn-warning">Delete</a></td>
															</tr>
	
														</c:forEach>
													</tbody>
													 -->
												</table>
											</div>
										</section>								
									</div>
									<!-- soap -->  
								</div>
							
								
								
							
							</div>		
							<!-- END TABS -->
						</div>
					</div>
				</section>
				<!-- End Form -->

			</article>
			<!-- END MAIN HERE -->
		</div>
	</div>
</body>
</html>