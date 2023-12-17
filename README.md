## Installation Steps


### 1. Creating New Repository
You Need to go on the below link or click on `Use this template` Button in order to create a new repository.
```
  https://github.com/Cogoport/micronaut-kotlin-starter-project/generate
```
* Give a relevant name to your repository.
* Give proper description(optional).

**For more info checkout the below link**
```
https://docs.github.com/en/repositories/creating-and-managing-repositories/creating-a-repository-from-a-template
```
### 2. Run following command for initial necessary setup.
After Cloning run following Command in your terminal.
```shell
sh initiate.sh example
```
It will ask you to provide Repository Name, provide it the repository name and Enter.


you must give the same repository name that you have given at the time of Repository creation.
This is very important. As we have used string 'example' at many places where your repository name should be according to our code convention.
This script will do the job still it is strictly advisable to recheck and pay attention once more to check whether or not 'example' string is present in the codebase.

### 3. Run Docker compose
```
  docker-compose -f ./api/docker-compose.dev.yml up
```

## Working with IntellJ IDE

We have to install jdk explicitly to use Intellj build and run functionality.

### Setup SDKMan
```shell
curl -s "https://get.sdkman.io" | bash`
```

After installing SDKMan, open a new terminal window/tab and install Java and Micronaut CLI by following the below steps:

1. List java versions

```shell
sdk list java
```

2. Install Latest GraalVM version where `x.y.z-grl` is the version you want to install:
```shell
sdk install java x.y.z-grl
```

3. Verify Java installation:
```shell
java --version
```
4. Install Micronaut CLI
```shell
sdk install micronaut
```


5. Then Run the application
### Voila!!
The application must have been started on port http://localhost:8080 and kafka UI on http://localhost:9000 .

