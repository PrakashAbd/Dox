<html>
	<head>
        <title>Login Page </title>
        <meta charset="UTF-8">
		  <meta name="viewport" content="width=device-width, initial-scale=1.0">
		  <meta http-equiv="X-UA-Compatible" content="ie=edge">
		  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css">
		  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css">
		  <link rel="stylesheet" href="style.css">
		  <!-- Google -->
		  <meta name="google-signin-scope" content="profile email">
          <meta name="google-signin-client_id" content="1071295299046-b69spi1fejdfl75m1teg0j6ngjpi2dl6.apps.googleusercontent.com">
          <script src="https://apis.google.com/js/platform.js" async defer></script>
          <!--  FB -->
          <script>
        window.fbAsyncInit = function() {
          FB.init({
            appId      : '2073855796238922',
            cookie     : true,
            xfbml      : true,
            version    : 'v3.2'
          });
            
          FB.AppEvents.logPageView();   
          
            FB.getLoginStatus(function(response) {
                statusChangeCallback(response);
            });
            
        };
      
        (function(d, s, id){
           var js, fjs = d.getElementsByTagName(s)[0];
           if (d.getElementById(id)) {return;}
           js = d.createElement(s); js.id = id;
           js.src = "https://connect.facebook.net/en_US/sdk.js";
           fjs.parentNode.insertBefore(js, fjs);
         }(document, 'script', 'facebook-jssdk'));
      </script>
        <style>
        	table
        	{
        		width: 350px;
        		height:200px;
        		margin-top : 300px;
        		margin-left:38em;
        		color: white;
        	}
        	td{
        		margin-left: 10px;
        	}
               	
        </style>
        
    </head>
    <body style="background-color:midnightblue">	
    	<form action="userpage" method="post">
        <table>
        <tr><td><b>UserId:</b></td><td><input type = "text" name="username"></input></td></tr>
        <tr><td><b>Password:</b></td><td><input type = "password" name="password"></input></td></tr>
        <tr><td><input type="submit" value="SUBMIT" id="1"></input></td><td>
        <input type="reset" value="CLEAR" onclick="location.reload()"></input></td></tr>
        
        </table>
    	</form>
    	
    	
    	<div class="g-signin2" data-onsuccess="onSignIn"></div>
		
          <script>
            function onSignIn(googleUser) {
              // Useful data for your client-side scripts:
              var profile = googleUser.getBasicProfile();
              console.log("ID: " + profile.getId()); // Don't send this directly to your server!
              console.log('Full Name: ' + profile.getName());
              console.log('Given Name: ' + profile.getGivenName());
              console.log('Family Name: ' + profile.getFamilyName());
              console.log("Image URL: " + profile.getImageUrl());
              console.log("Email: " + profile.getEmail());
      
              // The ID token you need to pass to your backend:
              var id_token = googleUser.getAuthResponse().id_token;
              console.log("ID Token: " + id_token);
            }
          </script>
          <a href="#" onclick="signOut();">Sign out</a>
          <script>
            function signOut() {
              var auth2 = gapi.auth2.getAuthInstance();
              auth2.signOut().then(function () {
                console.log('User signed out.');
              });
            }
          </script>
          <div id="fb-root"></div>
        <script>(function(d, s, id) {
          var js, fjs = d.getElementsByTagName(s)[0];
          if (d.getElementById(id)) return;
          js = d.createElement(s); js.id = id;
          js.src = 'https://connect.facebook.net/en_GB/sdk.js#xfbml=1&version=v3.2&appId=350956308795103&autoLogAppEvents=1';
          fjs.parentNode.insertBefore(js, fjs);
        }(document, 'script', 'facebook-jssdk'));</script>

<div class="fb-login-button" data-max-rows="1" data-size="large" data-button-type="continue_with" data-show-faces="false" data-auto-logout-link="false" data-use-continue-as="false"></div>


		<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.slim.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.13.0/umd/popper.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.min.js"></script>

	</body>
</html>
