$(document).ready(function() {
	
	
	$.ajaxSetup({
        cache : false
      });

	$.getJSON("getStudentId.action", function(data) {
		
		//alert(data.getIdArray);
		//$("#ids").empty();
    	           $.each(data.getIdArray, function(i,item) {
        	 $("#studentid").append("<option>" + item.id + "</option>");
            });
      
      });
      $.ajaxSetup({
          cache : true
        });
      
      

      
});