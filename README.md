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

Build the project from root directory (heroku-samples):


	mvn clean install
	heroku login
	<Enter heroku email id>
	<Enter heroku password>

Edit the newrelic.yml file to update the license key  (once newrelic heroku addon has been added then goto the heroku app settings and copy the config var NEW_RELIC_LICENSE_KEY) and specify application name

	cd heroku-samples/src/deploy/newrelic
	open newrelic.yml in your favourite text editor
	change the value of license_key to your newrelic license key
	change the value of app_name to whatever name you want in all applicable places
	

To deploy to heroku and enable java new relic use one of the below mentioned ways

1. Heroku Executable Jar Deployment 

		cd heroku-samples/src/deploy/heroku-executable-deploy
		sh herokupush
		
		PS Note: heroku deploy:jar -j <jarname> -i newrelic.jar:newrelic.yml --app  <herokuappname>
		For this sample app in herokupush i have used as below:
		heroku deploy:jar -j microservice-1.0.0.jar -i newrelic.jar:newrelic.yml --app  java-heroku-newrelic-sample

2. Deploy to heroku via heroku-maven-plugin with newrelic jar included to slug

		cd heroku-samples/src/deploy/maven-heroku-deploy
		mvn clean heroku:deploy
		
		PS Note: here is pom.xml currently the value of app name is <appName>java-heroku-newrelic-sample</appName> you need to change it to your heroku app name
		
On successful deployment to heroku using either heroku deploy:jar for executable jar or using heroku maven plugin:

You can access the heroku app for the dummy rest service using below url

		https://java-heroku-newrelic-sample.herokuapp.com/ms
		
		PS Note: https://<yourheroku-app-name>/ms

Here java-heroku-newrelic-sample should be replaced with your heroku app name.
