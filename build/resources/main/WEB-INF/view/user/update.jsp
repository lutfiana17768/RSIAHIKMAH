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
                                    <h3 class="title"> Data Users </h3>
                                </div>
                                <form:form modelAttribute="userModel" method="POST" action="/user/update">
                                    <form:hidden path="userID" />
                                    <form:hidden path="userAktif" />
                                    <form:hidden path="userCreatedDate" />
                                    <form:hidden path="userCreatedBy" />
                                    <div class="form-group">
                                        <label>Pegawai</label>
                                        <div class="select2-wrapper">
                                            <form:select path="pegawai.pegawaiID" class="form-control select2-single">
                                                <option value="">--- Pilih Pegawai ---</option>
                                                <c:forEach var="pegawai" items="${pegawais}">
                                                    <form:option value="${pegawai.pegawaiID}" label="${pegawai.pegawaiNama}" />
                                                </c:forEach>
                                            </form:select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label>Username</label>
                                        <form:input path="userName" placeholder="username" class="form-control" />
                                    </div>
                                    <div class="form-group">
                                        <label>Ubah Password</label>
                                        <form:input path="changePassword" type="password" placeholder="password" class="form-control" />
                                    </div>
                                    <div class="form-group">
                                        <label>Role</label>
                                        <div class="select2-wrapper">
                                            <select class="form-control select2-multiple" data-placeholder="Chose number" multiple="multiple" data-name="userRole">
                                                <c:set var="selected" value="false" />
                                                <c:forEach var="role" items="${roles}">
                                                    <c:set var="firstAttempt" value="false" />
                                                    <c:forEach var="urole" items="${userModel.userRole}">
                                                        <c:if test="${urole.role.rolePriv.equalsIgnoreCase(role.rolePriv)}">
                                                            <c:if test="${firstAttempt == false}">
                                                                <option value="${role.roleID}" selected>${role.rolePriv}</option>
                                                                <c:set var="firstAttempt" value="true" />
                                                            </c:if>
                                                            <c:set var="selected" value="true" />
                                                        </c:if>
                                                    </c:forEach>
                                                    <c:if test="${selected == false}">
                                                        <option value="${role.roleID}">${role.rolePriv}</option>
                                                    </c:if>
                                                    <c:set var="selected" value="false" />
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <button type="submit" class="btn btn-primary">Simpan</button>
                                    </div>
                                </form:form>
                            </div>
                        </div>
                    </div>
                </section>
                <jsp:include page="../app/footer.jsp" />