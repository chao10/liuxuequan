<!DOCTYPE html>
<html ng-app>
<head>
<title>Hello AngularJS</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
<script type="text/javascript">
/* 	function Hello($scope, $http) {
	    $http.get('http://localhost:8080/login').
	        success(function(data) {
	            $scope.user = data;
	        });
	} */
</script>
</head>
<body ng-init="user = ${user}">
	<div>
		<p>The ID is {{user.id}}</p>
		<p>The username is {{user.username}}</p>
		<p>The password is {{user.password}}</p>
		<p>If user is locked: {{user.locked}}</p>
	</div>
</body>
</html>