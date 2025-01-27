
    function validateName() {
            var name = document.getElementById('name').value;
            if (name == '') {
                document.getElementById('nameError').innerHTML = 'Name is required';
		return false;
            }
		return true;
        }

        function validateEmail() {
            var email = document.getElementById('email').value;
            at = email.indexOf('@');
            dot = email.indexOf('.');
            len = email.length;
            if(email == '')
            {
                    document.getElementById('emailError').innerHTML = "Email address is required";
			return false;
			
            }
            if (at > 0 && dot > at+1 && len > dot +1) {
                document.getElementById('emailError').innerHTML = "";
		return true;
            } else {
                document.getElementById('emailError').innerHTML = "Invalid email address.";
		return false;
            }
        }

	function validate()
	{	
		con1 = validateName();
		con2 = validateEmail();
		if(con1 && con2)
			return true;
		
		return false;
		
	}

	