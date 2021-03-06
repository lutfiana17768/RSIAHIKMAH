<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>RSI AL-HIKMAH</title>
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/vendor.css'/>">
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/app.css'/>">
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/style.css'/>">
</head>
<body>
	<div class="main-wrapper">
		<div class="app" id="app">
			<header class="header">
				<div class="nav-title">
					<c:choose>
						<c:when test="${pagetitle == null}">
							<h3 class="title">Dashboard</h3>
						</c:when>
						<c:otherwise>
							<h3 class="title">${pagetitle}</h3>
						</c:otherwise>
					</c:choose>
				</div>
				<div class="header-block header-block-collapse d-lg-none d-xl-none">
					<button class="collapse-btn" id="sidebar-collapse-btn">
						<i class="fa fa-bars"></i>
					</button>
				</div>
				<div class="header-block header-block-nav"></div>
			</header>
			<aside class="sidebar">
				<div class="sidebar-container">
					<div class="sidebar-header">
						<div class="brand">
							<div class="logo">
								<span class="l l1"></span>
								<span class="l l2"></span>
								<span class="l l3"></span>
								<span class="l l4"></span>
								<span class="l l5"></span>
							</div>
							<span>RSI AL-HIKMAH</span>
						</div>
					</div>
					<nav class="menu">
						<ul class="sidebar-menu metismenu" id="sidebar-menu">
							<li><a href="/"><i class="fa fa-home"></i> Dashboard </a></li>
							<li>
								<a href="">
									<i class="fa fa-desktop"></i> Transaksi <i class="fa arrow"></i>
								</a>
								<ul class="sidebar-nav">
									<li><a href="/pendaftaran"><i class="fa fa-users"></i> Pendaftaran</a></li>
								</ul>
							</li>
							<li>
								<a href="">
									<i class="fa fa-hdd-o"></i> Master <i class="fa arrow"></i>
								</a>
								<ul class="sidebar-nav">
									<li><a href="/kelas"> Kelas </a></li>
									<li><a href="/tindakan"> Tindakan </a></li>
									<li><a href="/ruang"> Ruang </a></li>
									<li><a href="/paket"> Paket </a></li>
								</ul>
							</li>
						</ul>
					</nav>
					<footer class="sidebar-footer">
						<ul class="sidebar-menu metismenu" id="customize-menu"></ul>
					</footer>
				</div>
			</aside>
			<div class="sidebar-overlay" id="sidebar-overlay"></div>
			<div class="sidebar-mobile-menu-handle" id="sidebar-mobile-menu-handle"></div>
			<div class="mobile-menu-handle"></div>
			<article class="content forms-page">
			