<%-- 
    Document   : detail
    Created on : Sep 7, 2023, 12:32:53 AM
    Author     : Jackie's PC
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec"
           uri="http://www.springframework.org/security/tags" %> 
<sec:authorize access="hasRole('ROLE_STORE')">
    <div>
        <a href="<c:url value="/store_admin/stores"/>" class = "btn btn-danger mt-3 p-2">Thêm cửa hàng</a>
    </div>
</sec:authorize>
<h1 class="text-center text-danger">CỬA HÀNG</h1>
<c:url value="/detail" var="action" />
<section class="container">
    <div class="row">
        <c:forEach items="${stores}" var="st" >
            <div class="col-md-4">
                <div class="card">
                    <img src="${st.imgfoodstore}" alt="${st.name}" class="card-img-top">
                    <div class="card-body">
                        <h5 class="card-title">${st.name}</h5>
                        <p class="card-text">${st.location}</p>
                        <c:forEach items="${foods}" var="f">
                            <c:if test="${st.storeId ==f.storeId.storeId}">
                                <li>${f.name} - ${f.price}</li>
                                </c:if>

                        </c:forEach>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</section>
<%--<c:forEach items="${foods}" var="f">
                                    <c:if test="${st.storeId ==f.storeId.storeId}">
                                        <li>${f.name} - ${f.price}</li>
                                    </c:if>
                                    
                                </c:forEach>--%>