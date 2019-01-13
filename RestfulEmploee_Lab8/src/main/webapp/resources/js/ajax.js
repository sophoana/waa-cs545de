 
function makeAjaxCall(event){
	

	event.preventDefault();
	
	var data = JSON.stringify(serializeObject($('#employeeForm')));
	var contextRoot = "/" + window.location.pathname.split('/')[1];
	alert(data);
	
	$.ajax({
		url: contextRoot + "/addEmployee",
		type: 'POST',
		contentType: 'application/json',
		dataType: "json",
		data: data,
		success: function(  response    ) {
//			$('#formInput').html("");
//			$("#formInput").append( '<H3 align="center"> New Employee Information <H3>');                
//			$('#formInput').append("<H4 align='center'>First Name:  " +   + "</h4>"  );
//			$('#formInput').append("<H4 align='center'>Last Name: " +   + "</h4>" );
//			$('#formInput').append("<H4 align='center'>Email: " +   + "</h4>");
//			$("#formInput").append('<h4 align="center"> <a href="#" onclick="toggle_visibility(\'formInput\');resetForm(\'employeeForm\');"><b>EXIT</b> </a> </h4>');
//			make_visible('formInput');
//			make_hidden('errors');
			alert(response);
		},

		error: function(   response     ){	
			

			alert('Error');	
			
			
			
			
			
			
			
			
		}
	
	});
}

function makeAjaxCallTest(){
	alert('helsslo');
}

toggle_visibility = function(id) {
    var element = document.getElementById(id);
    if(element.style.display == 'block')
    	element.style.display = 'none';
    else
    	element.style.display = 'block';
 }	

make_hidden = function(id) {
    var element = document.getElementById(id);
    element.style.display = 'none';
        }	   

make_visible = function(id) {
    var element = document.getElementById(id);
    element.style.display = 'block';
 }	   

resetForm = function(id) {
    var element = document.getElementById(id);
    $(element)[0].reset();

    }	  

// Translate form to array
// Then put in JSON format
 function serializeObject (form)
{
    var jsonObject = {};
    var array = form.serializeArray();
    $.each(array, function() {
         	jsonObject[this.name] = this.value;
    });
    return jsonObject;

};

