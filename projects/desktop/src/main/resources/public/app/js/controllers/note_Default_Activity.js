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

app.controller("note_Default_Activity", [ '$scope', '$rootScope', '$location', '$window', '$q', '$http', '$timeout', 'RestURL',
				    function( $scope, $rootScope, $location, $window, $q, $http, $timeout, RestURL) {

		$scope.Note = {
		id: '',
		lotusseller_1 : '',
		nextsteps : '',
		lastupdate : '',
		forecastunid : '',
		unid : '',
		dspnotepriority : '',
		projdur : '',
		createdate : '',
		pidstatus : '',
		lotusseller : '',
		dspheader : '',
		client : '',
		status : '',
		territory : '',
		notepriority : '',
		nextstepslast : '',
		engagementmanager : '',
		actionduedate : '',
		project : '',
		br5just : '',
		author : '',
		region : '',
		epdesign : '',
		contactstate : '',
		pricetype : '',
		dspcitystatezip : '',
		epplan : '',
		privateyn : '',
		bdm : '',
		epquestionnaire : '',
		actionwho : '',
		racompleteyn : '',
		prjstartdate : '',
		contactphone : '',
		elafundedyn : '',
		dspprivateyn : '',
		recentlogevent : '',
		auth : '',
		dspcitystatezip_1 : '',
		speccustreqs : '',
		contactcity : '',
		logevents : '',
		eppricecase : '',
		dsptype : '',
		projname : '',
		epproposal : '',
		componentscomplete : '',
		eppresentation : '',
		sourcespid : '',
		custname : '',
		conexpdate : '',
		type : '',
		rescount : '',
		br5yn : '',
		ssr : '',
		scope : '',
		contactstreetaddress : '',
		intlheader : '',
		subject : '',
		contractreqbydate : '',
		summary : '',
		contactemail : '',
		notedocid : '',
		racompletedby : '',
		complist : '',
		contactname : '',
		br1yn : ''
		};





		$scope.$on('$viewContentLoaded', function(event) {
			var biggestHeight = 0;
			var height = 0;
			$(".screen").find('*').each(function(){
				height = $(this).position().top + $(this).height() + 100;
				if (height > biggestHeight ) {
					biggestHeight = height;
				}
			});
			$(".screen").height(biggestHeight);
		});

		$scope.refresh_screen_height = function() {
			var biggestHeight = 0;
			var height = 0;
			$(".screen").find('*').each(function(){
				height = $(this).position().top + $(this).height() + 100;
				if (height > biggestHeight ) {
					biggestHeight = height;
				}
			});
			$(".screen").height(biggestHeight);
		};

}]);


