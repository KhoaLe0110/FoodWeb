<%-- 
    Document   : header
    Created on : Aug 19, 2023, 1:03:36 AM
    Author     : Jackie's PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/" var="action" />
<header>
    <nav>


        <div class="dropdown">
            <ul >
                <li><a href="<c:url value="/"/>">Trang Chủ</a></li>
                <li><a href="<c:url value="/liststores"/>">Cửa Hàng</a></li>
                <li><a href="<c:url value="/store_admin/stores"/>">Quản lý cửa hàng</a></li>
                <li><a href="<c:url value ="/store_admin/foods"/>">Quản lý thực phẩm</a></li>
                <li><a href="<c:url value="/listfood"/>">Món ăn</a></li>
                <div class="login">
                    <c:choose>
                        <c:when test="${pageContext.request.userPrincipal.name != null}">
                            <li class="nav-item">
                                <a class="nav-link" href="<c:url value="/" />">${pageContext.request.userPrincipal.name}</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="<c:url value="/logout" />">Logout</a>
                            </li>
                        </c:when>
                        <c:otherwise>
                            <li class="nav-item">
                                <a class="nav-link" href="<c:url value="/login" />">Đăng nhập</a>
                            </li>
                        </c:otherwise>
                    </c:choose>

                </div>


            </ul>
        </div>

        <div class="search-bar">
            <input type="text" placeholder="Tìm cửa hàng hoặc món ăn">
            <button type="submit">Search</button>
        </div>

        <div class="header__img">
            <img src="" alt="">
        </div>
        <div class="clear"></div>

    </nav>

</header>