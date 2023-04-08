package pages;

/*
		**tag with single attribute**
			
https://m.shein.com/us/
1.		//a[@id='header_logo_icon']
https://www.amazon.com/
2. 	//a[@id='nav-logo-sprites']
3. 	//a[@class='nav-logo-link nav-progressive-attribute']
4.		//a[@id='nav-logo-sprites']
5.		//input[@id='nav-search-submit-button']

	 
		**Tag with multiple attribute 'and' logic**
		
https://www.uscis.gov/
1.		//input[@id = 'gsc-i-id1' and @name = 'search']
https://www.amazon.com/
2.		//a[@id='nav-logo-sprites' and @class ='nav-logo-link nav-progressive-attribute']
3.		//span[@id='glow-ingress-line1' and @class='nav-line-1 nav-progressive-content']
4.		//input[@id='nav-search-submit-button' and @class='nav-input nav-progressive-attribute']
https://www.macys.com/
5. 	//a[@id='mb-j-header-image' and @class='m-j-cm-link header-logo__image']
	  
	
		**Tag with inner text [means complete text] t**
		
https://www.uscis.gov/
1.		//a[text()='Return to top']
https://www.costco.com/
2.		//a[text()='While Supplies Last']
3.		//a[text()='Treasure Hunt']
4.		//a[text()='Online-Only']
5.		//a[text()='Orders & Returns']
	
	
	**Tag with partial inner text [not complete inner text rather partial text as well as actual text] **
	
 https://www.facebook.com/
1.		//a[contains(text(), 'Create a Page')]
2.		//a[contains(text(), 'Forgot')]
https://www.sephora.com/
3.		//span[contains(text(), 'Tools &')]
4.		//span[contains(text(), 'Bath &')]
5.		//h2[contains(text(), 'New Ar')]
	 
	  
	 **Tag with attributes and use of contains **
	 
 https://www.amazon.com/
1.		//input[contains(@id,'twotabsear')]
https://www.facebook.com/
2.		//h2[contains(@class,'_8eso')]
3.		//img[contains(@class,'fb_logo _8ilh img')]
https://www.bossrevolution.com/en-us/
4.		//h1[contains(@class, 'mt-auto md:px-12 mb-10')]
5.		//span[contains(@class,'dynamic-content block font-bold text-bl')]

	
	*/
	
	

