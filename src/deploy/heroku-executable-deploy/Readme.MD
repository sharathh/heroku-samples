Just execute the below commands one after another:

    rm -r microservice-1.0.0.jar
    cp -v ../../../target/microservice-1.0.0.jar .
    heroku deploy:jar -j microservice-1.0.0.jar -i newrelic.jar:newrelic.yml --app  java-heroku-newrelic-sample
