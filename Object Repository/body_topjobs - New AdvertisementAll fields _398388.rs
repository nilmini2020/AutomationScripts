<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_topjobs - New AdvertisementAll fields _398388</name>
   <tag></tag>
   <elementGuidId>367ac944-984d-4baa-a0fa-dc01fd57cd53</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//body</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
	 
     
    
	
    
     
    
     
    
		 
	

		
        
        
		
		
		
		topjobs - New Advertisement
		
		All fields marked with (*) are mandatory
		Your Name *
		
		Enter Your Email *
		
		Your Phone Number *
		
		Enter Your Message *
		
		
		Your message was submitted 
		
        
        
		
        




	
		
			
				
					
						Home
						Post Your Vacancy
						Top Employers
						T &amp; C
						Privacy Policy
						Security Policy
						FAQ
						Media Room
						Partners
						LMI
						Contact Us
						Sitemap
						
					
					
			
		
		
			
				
					Copyright © 2006-document.write(new Date().getFullYear())2020 Genesiis Software (Pvt) Ltd, All Rights Reserved.
				
			
		
	

        
        
        
        
        var usersNameTxtField = $('#txtYourName');
    	// Get the container element of the feedback page-body
    	var containerElem = $('div#feedback-view');				
    	// Extract params set to containerElem as data-attributes
    	var toEmail = containerElem.attr('data-to-email');
    	var topic = containerElem.attr('data-topic');
    	
    	// Set the heading of the page
    	setHeading(topic);			
    	
    // On click of the submit button in the feedback form
      function collectFeedbackData(){
        	        	
        	var usersNameTxtField = $('#txtYourName');
        	var userEmailTxtfield = $('#txtYourEmail');
    		var userPhoneNo = $('#txtYourPhnNo');
    		var userMsgTxtField = $('#txtYourMessage');
    		
    		var user = usersNameTxtField.val();
    		var userEmail = userEmailTxtfield.val();
    		var userPhone = userPhoneNo.val();
    		var userMessage = userMsgTxtField.val();
    		
    		var feedbackData = {
    				'user': user,
    				'userEmail': userEmail, 
    				'userPhone': userPhone, 
    				'userMessage': userMessage, 
    				'toEmail': toEmail, 
    				'topic': topic
    		} 
    		return feedbackData;
    	}
    
      /**
       * param:feedbackData - user input data
         validate the user input data
       */
      function validateFeedbackFields(feedbackData) {
    		$('#feedbackReply').text(&quot;&quot;);
    		var areFieldsValid = true;     
    		if (feedbackData != undefined &amp;&amp; feedbackData != null) {
    			
    			// Validate Your Name field
    			if (feedbackData.user != undefined){
	    			if(/^[a-zA-Z_ ]+$/.test(feedbackData.user)){ // Only characters and spaces allowed and should be at least one time
    					$('#txtYourName').popover('hide');
    					$('#txtYourName').removeClass('invalid');
    				}else{
    					showErrorMessage('Name is empty or invalid.','#txtYourName');
						areFieldsValid = false;
    				}
	    		}
    			
    			// Validate value provided for Enter Your Email	
    			if (feedbackData.userEmail != undefined) {
    				if( /^[\w\-\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-z0-9]{2,}$/.test(feedbackData.userEmail)){ // local part can contain characters,numbers,-,.,+ and second level domain can contain numbers,characters,.,- and top level domain can contain numbers,characters at least two times (RFC specification - https://en.wikipedia.org/wiki/Email_address)
    					$('#txtYourEmail').popover('hide');
    					$('#txtYourEmail').removeClass('invalid');
    				} else {
    					showErrorMessage('Invalid email address','#txtYourEmail');
						areFieldsValid = false;
	    			}							
    			}
    			
    			// validate the user entered phone number
	    		if (feedbackData.userPhone != undefined) {
					if(!(/^[0-9 ()+-]{7,}$/.test(feedbackData.userPhone))){   // phone number should have minimum 7 numbers length and allowed only numbers,+,-
						showErrorMessage('Please enter at least 7 digits for your phone number.','#txtYourPhnNo');
						areFieldsValid = false;
					}else{			
						$('#txtYourPhnNo').popover('hide');
						$('#txtYourPhnNo').removeClass('invalid');
					}
				}
			
   			// check if feedback message is empty or not 
   			if (feedbackData.userMessage != undefined) {	
   				if(feedbackData.userMessage.length > 0){
   					$('#txtYourMessage').popover('hide');
   					$('#txtYourMessage').removeClass('invalid');
   				}							
   				if(feedbackData.userMessage.length &lt; 1){	
   					showErrorMessage('Message is empty.','#txtYourMessage');
   					areFieldsValid = false;
   				}							
   			 }
    	}
    	return areFieldsValid;
    };
    	
    /**
     * param:errorMessage - relevant message should display in the pop-over
             txtField   - to identify the invalid data field
             Show error message in a pop-over 
     */
    	function showErrorMessage(errorMessage,txtField){
    		$(txtField).attr('data-content',errorMessage);
    		$(txtField).addClass('invalid');
    		$(txtField).popover('show');
    	}
    	
    // On click of the submit button in the feedback form
        $('#feedbackSubmitBtn').on('click',function(e){
        	trimInputFields();
        	var feedbackData = collectFeedbackData();					
    	    areFieldsValid = validateFeedbackFields(feedbackData);
    		var command = $('#submit-feedback-code').val();
    		if(areFieldsValid){
    			
    			$.ajax({
    				
    				type: &quot;POST&quot;,
    				dataType: &quot;json&quot;,
    				data: feedbackData,
    				url: &quot;/do.landing?CO=&quot;+command+&quot;&quot;,
    					success: function(response){
    						if(response.status == true ){
    							$('#feedbackReply').text(&quot;Your message was submitted&quot;).css({'color':'#006400'});
     							$('#txtYourName').val(&quot;&quot;);
     				    		$('#txtYourEmail').val(&quot;&quot;);
     				    		$('#txtYourPhnNo').val(&quot;&quot;);
    				    		$('#txtYourMessage').val(&quot;&quot;);
    				    		
    						}
    						else{
    							$('#feedbackReply').text(&quot;Your message was not submitted.  Please try again&quot;).css({'color':'#ff0000'});		
    						}																							
    				},
    				global: false, //prevent firing within global events
    				error: function(err){
    					$('#feedbackReply').text(&quot;Your message was not submitted.  Please try again&quot;);
    				},
    					beforeSend: function(){
    						$('#feedbackReply').text(&quot;Hold on...&quot;).css({'color':'#000000'});	 		
    					}
    				
    			});
    			
    		}
    		
    		
    	 });
    
             
    /**
    * This function removes unnecessary spaces inside input fields 
    */
          function trimInputFields(){
          $(':input').each(function(){
          $(this).val($.trim($(this).val()))
          });
         }
      	/**
    		 * This function sets the main title of the feedback page.
    		 * 
    		 * @param: heading: The text that should be set as the heading.
    		 */
    		function setHeading(heading) {
    			// Set heading as the content of element whose id=title
    			document.getElementById('title').textContent = heading;
    		}	
     
    		 actionBtnId = &quot;feedbackSubmitBtn&quot;;
    	  areFieldsValid = false;
    	  pageDetails = &quot;feedback form&quot;;
    	  insertRecaptcha(actionBtnId, areFieldsValid, pageDetails);
    	  function collectHelpData(){
    		  isClickForHelp = true;
    		  userHelpData = {'isClickForHelp': isClickForHelp}; 
    		  ajaxUrl = '';
    	 }
    	  /*
    	  validate the  form fields at the realtime with each key press on the input field and pass the boolean value of the field validations to an invocation of the enableCaptcha() function 
    	   */	
    		$('#txtYourName, #txtYourEmail, #txtYourPhnNo, #txtYourMessage').focusout(function() {
            trimInputFields();
    		var feedbackData = collectFeedbackData();					
    	    areFieldsValid = validateFeedbackFields(feedbackData);
    	    enableCaptcha(areFieldsValid, actionBtnId);
        	}); 
    		 /*
    	  validate the  form fields at the realtime with each key focus out from the input field and pass the boolean value of the field validations to an invocation of the enableCaptcha() function 
    	   */
    		$('#txtYourName, #txtYourEmail, #txtYourPhnNo, #txtYourMessage').on('keyup',function(){
    			var feedbackData = collectFeedbackData();					
    	    areFieldsValid = validateFeedbackFields(feedbackData);
    	    enableCaptcha(areFieldsValid, actionBtnId);
    	});
    		 
    		
    		
      
	  
	  
 (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
 (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
 m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
 })(window,document,'script','//www.google-analytics.com/analytics.js','ga');
 ga('create', 'UA-37021458-1', 'auto');
 ga('require', 'displayfeatures'); 
 ga('send', 'pageview');
 
	 
	

/html[1]/body[1]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[1]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
   </webElementXpaths>
</WebElementEntity>
