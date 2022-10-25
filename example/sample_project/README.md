# Example Execution

## Requirements

* S3 bucket exists
* IAM credentials to be used have access to read and write to the S3 bucket
* aws-maven wagon is installed in your local maven repo (i.e. ~/.m2/repository)

## Key Elements in the sample project

* `.m2/settings.xml` -- example settings file that setups up the server to be used and specifieds the region in the server configuration
* `.mvn/extensions.xml` -- adds the aws-maven wagon as an extension

## Build and deploy the project

1. Set the following environmental variables
    ```bash
    export AWS_ACCESS_KEY_ID=xxx
    export AWS_SECRET_ACCESS_KEY=yyy
    ```
2. Build and deploy the project
    ```bash
    mvn clean deploy -s .m2/settings.xml
    ```
