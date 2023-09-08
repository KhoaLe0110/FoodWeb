<%-- 
    Document   : detail
    Created on : Sep 7, 2023, 12:32:53 AM
    Author     : Jackie's PC
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                        <div class="food-list">
                            <h3>Món ăn phổ biến</h3>
                            <ul>
                                <c:forEach items="${foods}" var="f">
                                    <c:if test="${st.storeId ==f.storeId.storeId}">
                                        <li>${f.name} - ${f.price}</li>
                                    </c:if>
                                    
                                </c:forEach>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</section>