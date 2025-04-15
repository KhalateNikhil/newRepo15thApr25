Feature: Test Facebook data
  
  #for data driven testing we need to use Scenario outline keyword here in features file

  Scenario Outline: validate register page functionality
    Given user is on register page
    When user enter valid "<firstname>","<lastname>","<phone>","<password>","<date>","<month>","<year>","<gender>"

    Examples: 
      | firstname | lastname | phone  | password | date | month | year | gender |
      | nikhil    | khalate  | 746377 | nsk@123  |    6 | Apr   | 1999 | Male   |
      | sonali    | khalate  |  76779 | ssk@123  |   14 | Mar   | 1996 | Female |
