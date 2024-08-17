# snakeyaml_cve_poc
SnakeYAML-CVE-2022-1471-POC


## build

Either build the jar on your host with `mvn clean compile assembly:single`

Or use `docker` to build an image with `docker build -t snakeyaml .`

## run

Run the container with `docker run --rm -p8080:8080 snakeyaml` 

or the jar if you built on your host with `java -jar target/snakeyaml-1.0-SNAPSHOT-jar-with-dependencies.jar`

or when using jars in lib folder `java -cp "target/snakeyaml-1.0-SNAPSHOT-jar-with-dependencies.jar:/libs/*" com.example.snakeyaml.App`

## use

Send a get request to serialize object of student class and send yaml as response
![](images/image1.png)

Send a post request with yaml to read YAML object as custom java object - deserialization
![](images/image2.png)


## curl command
```shell
curl POST --data-binary @/files/exploit.yaml  -H "Content-type: text/x-yaml" http://localhost:8080
```

## exploit

Execute `python3 -m http.server 8000` to run the http server

Send a post request with yaml containing exploit
![](images/image3.png)

You should observe a HTTP GET request on the listner
