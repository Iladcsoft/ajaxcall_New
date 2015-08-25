<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri="/struts-tags" %>
     <%@ page import="java.sql.*,java.io.*,java.util.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/main.css"/>
<script src="plugins/jquery-1.7.1.js" 	type="text/javascript"></script>
<script src="js/main.js" 	type="text/javascript">

</script>



<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div id="ids">

<select id="studentid" class="studentidFilter" style="width: 100px;">
                                <option value=''>-select-</option>
                            </select>
                            
           </div>                 
                          
       <div id="display">
              <table background="red" border="1"><tr><td>name</td>
  <td>phone</td>
  <td>mail</td>
  
  </tr>
    <s:iterator value="myStudentDetailArray" var="a">
  <tr><td><s:property value="#a.name" />
                            </td>
                            <td><s:property value="#a.phone" />
                            </td>
                            <td><s:property value="#a.mail" />
                            </td></tr>
                            </s:iterator>
  
  </table>              
         
</div>	                    
                          
</body>
</html>