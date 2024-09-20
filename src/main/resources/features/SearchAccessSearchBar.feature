Feature: Search and access in the search bar

	Scenario: Validate Search and Access in the Search Bar
		Given Test case: 'Search and access in the search bar'
		Given That I am using the browser CHROME
		Given That I access the Amazon website
		When I enter the 'NOTEBOOK' product in the search bar
		Then I validate the consistency of the results