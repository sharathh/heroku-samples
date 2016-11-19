# heroku-samples

This is an example to show how to enable java newrelic agent on heroku.
Here we create dummy rest service using spring boot.

Assumptions : The person has understanding of java , maven , heroku , new relic

Pre-Requisites:

	1. Heroku Account
	2. Install Heroku CLI (command line interface)
	3. Login to heroku using cli
	4. JDK 1.8
	5. Maven 3.3.3
	6. Create heroku app with new relic add on


Heroku Executable Jar Deployment 

	heroku deploy:jar -j <jarname> -i newrelic.jar:newrelic.yml --app  <herokuappname>

For this sample app i have used as below:

	heroku deploy:jar -j microservice-1.0.0.jar -i newrelic.jar:newrelic.yml --app  java-heroku-newrelic-sample

On successful deployment to heroku using either heroku deploy:jar for executable jar or using heroku maven plugin:

You can access the heroku app for the dummy rest service using below url

		https://java-heroku-newrelic-sample.herokuapp.com/ms

Here java-heroku-newrelic-sample should be replaced with your heroku app name.
