/**
 *
 * @author Schubert Generated Code</br>
 * Date Created: </br>
 * @since  </br>
   build:   </p>
 *
 * code was generated by the Schubert System </br>
 * Schubert system Copyright - NewPortBay LLC copy_right_range</br>
 * The generated code is free to use by anyone</p>
 *
 *
 *
*/

app.controller("Probability_Default_Activity", [ '$scope', '$rootScope', '$location', '$window', '$q', '$http', '$timeout', 'RestURL', 'ClientId',
				    function( $scope, $rootScope, $location, $window, $q, $http, $timeout, RestURL, ClientId) {

		$scope.Probability = {
		id: '',
		probability : '',
		description : ''
		};




}]);

app.factory('ClientId', function () {
	var id = '';
	return {
		setId: function (id){
			this.id = id;
		},
		getId: function (){
			return this.id;
		}
	}
})

