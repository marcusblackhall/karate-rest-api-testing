Feature: Using karate to test users api
  Background:
    * def urlBase = 'http://localhost:8080/rest/api/users'
Scenario: Return a list of users
  Given url urlBase
  And header Authorization = call read('basic-auth.js'){username : 'marcus',password : 'marcus' }
  When method GET
  Then status 200
  And match $..name contains 'Jan Smit'