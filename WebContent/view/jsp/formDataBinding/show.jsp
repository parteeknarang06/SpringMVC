<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Form-Data binding</title>
	</head>
	<body>
		<spring:form action="/SpringMVC/formDataBindcontroller/process" modelAttribute="empbean">
			Ename f:<spring:input path="ename" /> <br>
			Ename l:<spring:input path="ename" /> <br>
			Ecode:<spring:input path="ecode"/> <br>
			Controller: <spring:input path="controller"/><br>
			
			Select fav country: 
			<spring:select path="country">
				<spring:option value="" label="--Select--"/>
				<spring:option value="CZR" label="Czech Republic"/> <!-- 'value' will be put in employee bean.-->
				<spring:option value="IND" label="India" /> <!-- If model have value in country property then option will be selected only when option value matched with value from (model)bean -->
				<spring:option value="DEU" label="Germeny"/>
				<spring:option value="USA" label="United States"/>
			</spring:select>
			<br>
			Select touring country:
			<spring:select path="country">
				<spring:option value="" label="--Select--"/>
				<spring:options items="${empbean.countries}"/>
				<%-- 
					<spring:options items="countries"/>   Spring always treat modelbean property as a normal string irrespective of its datatype in bean
				--%>
			</spring:select>
			<br>
			Select countriesList:(from prop file)
			<spring:select path="country">
			<spring:option value="" label="--Select--"/>
				<spring:options items="${countriesList}"/>
				<spring:options items="${email}"/>
			</spring:select>
			<br>
			
			Prog lang:
			<spring:radiobutton path="progLang" value="java"></spring:radiobutton>Java
			<spring:radiobutton path="progLang" value="scala"></spring:radiobutton>Scala
			<spring:radiobutton path="progLang" value="C"></spring:radiobutton>C-lang
			<spring:radiobuttons path="progLang" items="${empbean.progLangList}" />
			
			<br>
			<spring:checkbox path="operatingSystem" value="linux"/>Linux
			<spring:checkbox path="operatingSystem" value="win"/>Windows
			<spring:checkbox path="operatingSystem" value="macos"/>Mac OS
			<spring:checkboxes items="${empbean.operatingSystemList}" path="operatingSystem"/>
			<br>
		<button type="submit">Submit</button>
		</spring:form>
		
	</body>
</html>