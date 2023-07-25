@regression
Feature: HomePage Test
  As user I want to search jobs on CV library website


  @smoke
  Scenario Outline:User should job search
    Given I am on homepage
    When I enters JobTitle "<jobTitle>"
    And I enter Location "<location>"
    And I select distance "<distance>"
    And I click on moreSearchOptionsLink
    And I enter salaryMin  "<salaryMin>"
    And  I enter salaryMax  "<salaryMax>"
    And I Select salaryType  "<salaryType>"
    And I select jobType "<jobType>"
    And I click on Find JObs button
    Then verify the result  "<result>"
    Examples:
      | jobTitle                   | location    | distance | salaryMin | salaryMax | salaryType | jobType   | result                                                   |
      | Tester                     | Harrow      | 5 miles  | 30000     | 500000    | Per annum  | Permanent | Permanent Tester jobs in Harrow            |
      | Automation Tester          | Leeds       | 5 miles  | 40000     | 600000    | Per annum  | Permanent | Permanent Automation Tester jobs in Leeds                |
      | Manual Tester              | Birmingham  | 7 miles  | 45000     | 650000    | Per annum  | Permanent | Permanent Manual Tester jobs in Birmingham               |
      | Supply Chain Administrator | Cleckheaton | 5 miles  | 35000     | 200000    | Per annum  | Part Time | Part Time Supply Chain Administrator jobs in Cleckheaton |
      | Automated Test Engineer    | Manchester  | 10 miles | 45000     | 650000    | Per annum  | Permanent | Permanent Automated Test Engineer jobs in Manchester     |
      | Customer Service advisor   | Leeds       | 5 miles  | 40000     | 600000    | Per annum  | Permanent | Permanent Customer Service Advisor jobs in Leeds         |

