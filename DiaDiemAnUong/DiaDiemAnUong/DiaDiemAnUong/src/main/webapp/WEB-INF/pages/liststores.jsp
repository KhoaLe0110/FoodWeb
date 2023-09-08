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

                        <div class="ggmaps">
                            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3919.6244964665116!2d106.66679857872309!3d10.763395662013432!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31752f5a94082ddf%3A0x4c7a1fb5117f6c71!2zMjMzIE5nw7QgR2lhIFThu7EsIFBoxrDhu51uZyA0LCBRdeG6rW4gMTAsIFRow6BuaCBwaOG7kSBI4buTIENow60gTWluaCwgVmnhu4d0IE5hbQ!5e0!3m2!1svi!2s!4v1694196695476!5m2!1svi!2s"
                                    width="300" height="300" style="border:0;" allowfullscreen="" 
                                    loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
                        </div>
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