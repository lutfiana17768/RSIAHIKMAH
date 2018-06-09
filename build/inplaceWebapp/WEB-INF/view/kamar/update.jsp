<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
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
							<h3 class="title">Data Ruang</h3>
						</div>
						<form:form modelAttribute="kamarModel" method="POST" action="update">
							<form:hidden path="kamarID" />
							<form:hidden path="kamarCreatedDate" />
							<form:hidden path="kamarCreatedBy" />
							<form:hidden path="kamarAktif" />
							<form:hidden path="kamarID" />
							
                            <div class="form-group">
                                 <label>No Kamar</label>
                                 <form:input path="kamarNo" placeholder="Masukan No Kamar" class="form-control"/>
                              </div>
                              
                             <div class="form-group">
                                 <label>Ruang</label>
                                 <form:input path="mRuangID" placeholder="Masukan Ruang" class="form-control"/>
                              </div>
                              
                              <div class="form-group">
                                 <label>Kelas</label>
                                 <form:input path="mKelasID" placeholder="Masukan Kelas" class="form-control"/>
                              </div>
                             
                             <div class="form-group">
                                 <label>Keterangan</label>
                                 <form:input path="kamarKeterangan" placeholder="Masukan Keterangan" class="form-control"/>
                              </div>
                              
                              <div class="form-group">
                                 <label>Kategori</label>
                                 <form:input path="kamarKategori" placeholder="Masukan Kategori" class="form-control"/>
                              </div>
                          
							<div class="form-group">
								<button type="submit" class="btn btn-primary">Update</button>
							</div>
						</form:form>

					</div>
				</div>
			</div>
			</section> </article>
			<footer class="footer"> </footer>

			<div class="modal fade" id="modal-media">
				<div class="modal-dialog modal-lg">
					<div class="modal-content">
						<div class="modal-header">
							<h4 class="modal-title">Media Library</h4>
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">×</span> <span class="sr-only">Close</span>
							</button>
						</div>
						<div class="modal-body modal-tab-container">
							<ul class="nav nav-tabs modal-tabs" role="tablist">
								<li class="nav-item"><a class="nav-link" href="#gallery"
									data-toggle="tab" role="tab">Gallery</a></li>
								<li class="nav-item"><a class="nav-link active"
									href="#upload" data-toggle="tab" role="tab">Upload</a></li>
							</ul>
							<div class="tab-content modal-tab-content">
								<div class="tab-pane fade" id="gallery" role="tabpanel">
									<div class="images-container">
										<div class="row"></div>
									</div>
								</div>
								<div class="tab-pane fade active in" id="upload" role="tabpanel">
									<div class="upload-container">
										<div id="dropzone">
											<form action="/" method="POST" enctype="multipart/form-data"
												class="dropzone needsclick dz-clickable" id="demo-upload">
												<div class="dz-message-block">
													<div class="dz-message needsclick">Drop files here or
														click to upload.</div>
												</div>
											</form>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary"
								data-dismiss="modal">Close</button>
							<button type="button" class="btn btn-primary">Insert
								Selected</button>
						</div>
					</div>
					<!-- /.modal-content -->
				</div>
				<!-- /.modal-dialog -->
			</div>
			<!-- /.modal -->
			<div class="modal fade" id="confirm-modal">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h4 class="modal-title">
								<i class="fa fa-warning"></i> Alert
							</h4>
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">×</span>
							</button>
						</div>
						<div class="modal-body">
							<p>Are you sure want to do this?</p>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-primary"
								data-dismiss="modal">Yes</button>
							<button type="button" class="btn btn-secondary"
								data-dismiss="modal">No</button>
						</div>
					</div>
					<!-- /.modal-content -->
				</div>
				<!-- /.modal-dialog -->
			</div>
			<!-- /.modal -->
		</div>
<jsp:include page="../app/footer.jsp" />