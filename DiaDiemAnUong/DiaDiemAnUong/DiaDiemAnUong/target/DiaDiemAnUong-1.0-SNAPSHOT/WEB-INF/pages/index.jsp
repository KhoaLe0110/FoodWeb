<%-- 
    Document   : index
    Created on : Aug 24, 2023, 8:38:54 PM
    Author     : Jackie's PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1 class="text-center text-danger">TRANG CHỦ</h1>
 <c:if test="${counter > 1}">
        <ul class="pagination mt-1">
            <li class="page-item"><a class="page-link" href="${action}">Tất cả</a></li>
                <c:forEach begin="1" end="${counter}" var="i">
                    <c:url value="/" var="pageAction">
                        <c:param name="page" value="${i}" />
                    </c:url>
                <li class="page-item"><a class="page-link" href="${pageAction}">${i}</a></li>
                </c:forEach>

        </ul>
    </c:if>
<section class="container">
    <table class="table table-hover">
        <thead>
            <tr>
                <th></th>
                <th>STT</th>
                <th>Tên cửa hàng</th>
                <th>Địa chỉ</th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${stores}" var="st">
                <tr>
                    <td>
                        <img src="${st.imgfoodstore}" alt="${st.name}" width="120" />
                    </td>
                    <td>${st.storeId}</td>
                    <td>${st.name}</td>
                    <td>${st.location}</td>
                    <td>
                        <a href="<c:url value='/detail' />" onclick="Xem('${st.storeId}')">
                            <button>Xem</button>
                        </a>
                    </td>
                   
                </tr>
            </c:forEach>
        </tbody>
    </table>
</section>

