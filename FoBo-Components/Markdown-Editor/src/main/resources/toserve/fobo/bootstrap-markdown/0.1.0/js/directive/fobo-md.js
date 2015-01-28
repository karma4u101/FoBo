(function() {'use strict';
	angular.module('fobo.markdown-edit-preview', [])
	.directive('markdown',['$window','$sce','$log',function($window, $sce,$log) {
		
		return {
			template : "<div ng-bind-html='trustedLiftCMHtml' />",
			restrict : 'E',
			replace : true,
			scope : {
			  markdown : '=bindFrom',
			  class : '='
			},
			link : function(scope, element, attrs) {				
			  scope.$watch('markdown',function(value) {
				  if (value != undefined && value != '') {
			           var json = angular.toJson(value);
			           //round trip to server, lift parses the cm data sent as json  
			           //and returns a promise containing the resulting html5 code.
			           var promise = myRTFunctions.doCMEditorParseRT(json);
			   	       return promise.then(function(data) { 
			   	    	  scope.$apply(function() {
			 		    	 scope.trustedLiftCMHtml=$sce.trustAsHtml(data.cmdata);	
			   	    	  })
			   	       });	    
				  }
			  });
			}
		};
		
	} ])
							
	.directive('markdownedit',[ function() {
		
		return {
			restrict : 'A',
			replace : false,
			link : function(scope, element, attrs) {
				var hiddenButtons = attrs.markdownHiddenButtons ? attrs.markdownHiddenButtons.split(",") : new Array();
				hiddenButtons.push('cmdPreview');
				element.markdown({hiddenButtons : hiddenButtons});
				},
			};
	} ]);
	
}).call(this);