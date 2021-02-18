# Sample (REST API) Spring Application


### Building & Running
$ ./gradlew bootRun


### Clean up build directory
$ ./gradlew clean


### Manually test endpoints
*Make sure the application is running!*


To populate the "database" with mock data, run...
$ ./src/main/resources/populate.sh


To retrieve some data from the "database", run...
$ ./src/main/resources/get-one.sh [name]


To delete all mock data from the "database", run...
$ ./src/main/resources/delete-all.sh

