/**
 *
 * @author Geppetto Generated Code</br>
 * Date Created: </br>
 * @since  </br>
   build:   </p>
 *
 * code was generated by the Geppetto System </br>
 * Geppetto system Copyright - NewPortBay LLC </br>
 * The generated code is free to use by anyone</p>
 *
 *
 *
*/

var app = angular.module('IBMSalesForecast', ['ngRoute','rzModule']);

   // configure our routes
   app.config(['$routeProvider','$httpProvider',function($routeProvider,$httpProvider) {
   $httpProvider.defaults.withCredentials = true;
       $routeProvider
            .when('/landing_page-en', {
                         templateUrl : 'app/views/en/landing_page-en.html'
                         ,allow:''
                     })

            .when('/app_level', {
                         controller: 'AplicationLevelCtrl', cache: false
                         ,template: ' ',
          			   allow:''
                     })

            .when('/CreateOpportunity-en', {
                         templateUrl : 'app/views/en/CreateOpportunity-en.html',
          controller: 'Forecast_Default_Activity'
                         ,allow:'ROLE_USER'
                     })

            .when('/CreateOpportunity-es', {
                         templateUrl : 'app/views/es/CreateOpportunity-es.html',
          controller: 'Forecast_Default_Activity'
                         ,allow:''
                     })

            .when('/ClientMaster-en', {
                         templateUrl : 'app/views/en/ClientMaster-en.html',
          controller: 'Client_Default_Activity'
                         ,allow:'ROLE_USER'
                     })

            .when('/ClientMaster-es', {
                         templateUrl : 'app/views/es/ClientMaster-es.html',
          controller: 'Client_Default_Activity'
                         ,allow:''
                     })


          .otherwise('app_level');

   }]).run(["$log","$rootScope", "$location", function($log,$rootScope, $location) {
	$rootScope.userData = {};
$rootScope.i = 0;
$rootScope.isLogIn = false;
				$rootScope.logout = function(){
					//console.log("*****-----logout---->>>data>>>"+angular.toJson($rootScope.userData));
					$rootScope.userData = {};
					console.log("*****-----logout------>>->>>data>>>"+angular.toJson($rootScope.userData));
					$location.url('/login')
				}
		$rootScope.serverRoleValidation = function(toStaterolesAllowList){
			var checkO = angular.equals({}, $rootScope.userData);
				console.log('checkO data =>',angular.toJson(checkO));
					if(!checkO){
				var frontRole = toStaterolesAllowList;
						if(!angular.equals({}, $rootScope.userData)){
						$rootScope.roleListOfCurrentUser = $rootScope.userData.authorities[$rootScope.i].authority;
								for(var uiRole= 0; uiRole< frontRole.length; uiRole++){
// verfying the ROLE_ADMIN is present in this var $rootScope.roleListOfCurrentUser
// 	$rootScope.roleListOfCurrentUser  if this has ROLE_ADMIN we give the permission to access the all pages
									if( $rootScope.roleListOfCurrentUser === "ROLE_ADMIN"){
										console.log('User ROLE_ADMIN can Access all the pages in the project');
										return true;
												}else{
													var testVar = frontRole.indexOf($rootScope.roleListOfCurrentUser) !== -1;
													console.log('testVar data =>',angular.toJson(testVar));
										if(testVar){
															console.log('test var true stituation');
																return true;
										}
								}
				}
			}
						console.log('return false data coming time executed');
						return false;
			}
					else{
					console.log('else stituation checkO data')
					return true;
			}
		};
						$rootScope.$on("$routeChangeStart", function (event,next, current) {
							var currentUrl = $location.path();
								if(currentUrl != "/accessDenied " && next.allow){
								console.log('data of current Url =>',next.allow);
								if (!$rootScope.serverRoleValidation(next.allow)) {
						console.log('serverRoleValidation data coming time');
						event.preventDefault();
						$location.url('/accessDenied');
				}
			}
			});
		}]);

   app.directive('ckEditor', function () {	return {
   		require: '?ngModel',
   		compile: function () {
   			return function ($scope, elem, attr, ngModel) {
   				var ck = CKEDITOR.replace(elem[0], {
   					toolbar: 'Basic',
   					uiColor: '#fafafa'
   				});
   				if (!ngModel) return;
   				ck.on('instanceReady', function () {
   					ck.setData(ngModel.$viewValue);
   				});
   				function updateModel() {
   					
   $scope.$apply(function () {
   						ngModel.$setViewValue(ck.getData());
   					});
   				}
   				ck.on('change', updateModel);
   				ck.on('key', updateModel);
   				ck.on('dataReady', updateModel);
   				ngModel.$render = function (value) {
   					ck.setData(ngModel.$viewValue);
   				};
   			};
   		}
   	};
   });
