<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/app.css "/>" rel="stylesheet"
	type="text/css" />
<link href="<c:url value="/resources/css/vendor.css "/>"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/bootstrap.min.css "/>"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/gh-pages.css "/>"
	rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="main-wrapper">
		<div class="app" id="app">
			<header class="header">
			<div class="header-block header-block-collapse d-lg-none d-xl-none">
				<button class="collapse-btn" id="sidebar-collapse-btn">
					<i class="fa fa-bars"></i>
				</button>
			</div>
			<div class="header-block header-block-nav">
				<ul class="nav-profile">
					<li class="notifications new"><a href=""
						data-toggle="dropdown"> <i class="fa fa-bell-o"></i> <sup>
								<span class="counter">8</span>
						</sup>
					</a>
						<div class="dropdown-menu notifications-dropdown-menu">
							<ul class="notifications-container">
								<li><a href="" class="notification-item">
										<div class="img-col">
											<div class="img"
												style="background-image: url('assets/faces/3.jpg')"></div>
										</div>
										<div class="body-col">
											<p>
												<span class="accent">Zack Alien</span> pushed new commit: <span
													class="accent">Fix page load performance issue</span>.
											</p>
										</div>
								</a></li>
								<li><a href="" class="notification-item">
										<div class="img-col">
											<div class="img"
												style="background-image: url('assets/faces/5.jpg')"></div>
										</div>
										<div class="body-col">
											<p>
												<span class="accent">Amaya Hatsumi</span> started new task:
												<span class="accent">Dashboard UI design.</span>.
											</p>
										</div>
								</a></li>
								<li><a href="" class="notification-item">
										<div class="img-col">
											<div class="img"
												style="background-image: url('assets/faces/8.jpg')"></div>
										</div>
										<div class="body-col">
											<p>
												<span class="accent">Andy Nouman</span> deployed new version
												of <span class="accent">NodeJS REST Api V3</span>
											</p>
										</div>
								</a></li>
							</ul>
							<footer>
							<ul>
								<li><a href=""> View All </a></li>
							</ul>
							</footer>
						</div></li>
					<li class="profile dropdown"><a
						class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
						role="button" aria-haspopup="true" aria-expanded="false">
							<div class="img"
								style="background-image: url('https://avatars3.githubusercontent.com/u/3959008?v=3&amp;s=40')">
							</div> <span class="name"> John Doe </span>
					</a>
						<div class="dropdown-menu profile-dropdown-menu"
							aria-labelledby="dropdownMenu1">
							<a class="dropdown-item" href="#"> <i class="fa fa-user icon"></i>
								Profile
							</a> <a class="dropdown-item" href="#"> <i
								class="fa fa-bell icon"></i> Notifications
							</a> <a class="dropdown-item" href="#"> <i
								class="fa fa-gear icon"></i> Settings
							</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="login.html"> <i
								class="fa fa-power-off icon"></i> Logout
							</a>
						</div></li>
				</ul>
			</div>
			</header>
			<aside class="sidebar">
			<div class="sidebar-container">
				<div class="sidebar-header">
					<div class="brand">
						<div class="logo">
							<span class="l l1"></span> <span class="l l2"></span> <span
								class="l l3"></span> <span class="l l4"></span> <span
								class="l l5"></span>
						</div>
						RSIA Hikmah
					</div>
				</div>
				<nav class="menu">
				<ul class="sidebar-menu metismenu" id="sidebar-menu">
					<li><a href="index.html"> <i class="fa fa-home"></i>
							Dashboard
					</a></li>
					<li class="active"><a
						href="../../provinsi/tambah/?page=1&limit=10"> <i
							class="fa fa-user"></i> Provinsi
					</a></li>
					<li><a href="../../kota/tambah/?page=1&limit=10"> <i
							class="fa fa-home"></i> Kota
					</a></li>
					<li><a href="../../kecamatan/tambah/?page=1&limit=10"> <i
							class="fa fa-user"></i> Kecamatan
					</a></li>
					<li><a href="../../kelurahan/tambah/?page=1&limit=10"> <i
							class="fa fa-user"></i> Kelurahan
					</a></li>
					<li><a href="../../jenis-pegawai/tambah"> <i
							class="fa fa-user"></i> Jenis Pegawai
					</a></li>
				</ul>
				</nav>
			</div>
			<footer class="sidebar-footer">
			<ul class="sidebar-menu metismenu" id="customize-menu">
				<li>
					<ul>
						<li class="customize">
							<div class="customize-item">
								<div class="row customize-header">
									<div class="col-4"></div>
									<div class="col-4">
										<label class="title">fixed</label>
									</div>
									<div class="col-4">
										<label class="title">static</label>
									</div>
								</div>
								<div class="row">
									<div class="col-4">
										<label class="title">Sidebar:</label>
									</div>
									<div class="col-4">
										<label> <input class="radio" name="sidebarPosition"
											value="sidebar-fixed" type="radio"> <span></span>
										</label>
									</div>
									<div class="col-4">
										<label> <input class="radio" name="sidebarPosition"
											value="" type="radio"> <span></span>
										</label>
									</div>
								</div>
								<div class="row">
									<div class="col-4">
										<label class="title">Header:</label>
									</div>
									<div class="col-4">
										<label> <input class="radio" name="headerPosition"
											value="header-fixed" type="radio"> <span></span>
										</label>
									</div>
									<div class="col-4">
										<label> <input class="radio" name="headerPosition"
											value="" type="radio"> <span></span>
										</label>
									</div>
								</div>
								<div class="row">
									<div class="col-4">
										<label class="title">Footer:</label>
									</div>
									<div class="col-4">
										<label> <input class="radio" name="footerPosition"
											value="footer-fixed" type="radio"> <span></span>
										</label>
									</div>
									<div class="col-4">
										<label> <input class="radio" name="footerPosition"
											value="" type="radio"> <span></span>
										</label>
									</div>
								</div>
							</div>
							<div class="customize-item">
								<ul class="customize-colors">
									<li><span class="color-item color-red" data-theme="red"></span>
									</li>
									<li><span class="color-item color-orange"
										data-theme="orange"></span></li>
									<li><span class="color-item color-green active"
										data-theme=""></span></li>
									<li><span class="color-item color-seagreen"
										data-theme="seagreen"></span></li>
									<li><span class="color-item color-blue" data-theme="blue"></span>
									</li>
									<li><span class="color-item color-purple"
										data-theme="purple"></span></li>
								</ul>
							</div>
						</li>
					</ul> <a href=""> <i class="fa fa-cog"></i> Customize
				</a>
				</li>
			</ul>
			</footer> </aside>
			<div class="sidebar-overlay" id="sidebar-overlay"></div>
			<div class="sidebar-mobile-menu-handle"
				id="sidebar-mobile-menu-handle"></div>
			<div class="mobile-menu-handle"></div>
			<article class="content forms-page"> <section
				class="section">
			<div class="row sameheight-container">
				<div class="col-md-3"></div>
				<div class="col-md-6">
					<div class="card card-block sameheight-item">
						<div class="title-block">
							<h3 class="title">Data Paket</h3>
						</div>

						<form:form modelAttribute="paketobatModel" method="POST"
							action="update">
							<form:hidden path="paket_barang_id" />
							<div class="form-group">
								<label>Nama Paket</label>
								<form:input path="paket_nama"
									placeholder="Masukan Nama Paket Obat" class="form-control" />
							</div>

							<div class="form-group">
								<label>Paket</label>
								<div class="select2-wrapper">
									<form:select path="m_paket_id"
										class="form-control input-lg select2-single">
										<c:forEach var="paket" items="${paket}">
											<form:option value="${paket.paket_id }"
												label="${paket.paket_nama}" />
										</c:forEach>
									</form:select>
								</div>
							</div>

							<div class="form-group">
								<label>Obat</label>
								<div class="select2-wrapper">
									<form:select path="m_obat_id"
										class="form-control input-lg select2-single">
										<c:forEach var="obat" items="${obat}">
											<form:option value="${obat.obat_id }"
												label="${obat.obat_nama}" />
										</c:forEach>
									</form:select>
								</div>
							</div>

							<div class="form-group">
								<label>Kelas</label>
								<div class="select2-wrapper">
									<form:select path="m_kelas_id"
										class="form-control input-lg select2-single">
										<c:forEach var="kelas" items="${kelas}">
											<form:option value="${kelas.kelas_id }"
												label="${kelas.kelas_nama }" />
										</c:forEach>
									</form:select>
								</div>
							</div>
							<div class="form-group">
								<label>Jumlah Barang</label>
								<form:input path="paket_barang_jumlah"
									placeholder="Masukan Jumlah Barang" class="form-control" />
							</div>

							<div class="form-group">
								<label>Harga</label>
								<form:input path="paket_barang_harga"
									placeholder="Masukan Harga" class="form-control" />
							</div>

							<div class="form-group">
								<label>Satuan</label>
								<div class="select2-wrapper">
									<form:select path="paket_satuan_id" items="${satuan}"
										class="form-control" />
								</div>
							</div>

							<div class="form-group">
								<button type="submit" class="btn btn-primary">Simpan</button>
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
	</div>
	<script src="<c:url value="/resources/js/app.js "/>" /></script>
	<script src="<c:url value="/resources/js/vendor.js "/>" /></script>
</body>
</html>