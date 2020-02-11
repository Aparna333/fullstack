<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h2>Hello World!</h2>

<spring:form action="process.do" method="POST" modelAttribute="product">
	Product Id:    <spring:input path="prodId"/><br/>
	<spring:errors path="prodId"></spring:errors>
	Product Name:  <spring:input path="prodName"/><br/>
	<spring:errors path="prodName"></spring:errors>
	Quantity: 	   <spring:input path="quantity"/><br/>
	<spring:errors path="quantity"></spring:errors>
	Product Price: <spring:input path="price"/><br/> 
	<spring:errors path="price"></spring:errors>
	<input type="submit" value="Store"/>
</spring:form>

</body>
</html>
