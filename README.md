client-lib -> contains the @Client

libA -> depends on client-lib

libB -> depends on client-lib

service -> a separate project that depends on libA and libB

This error occurs when using @Client in the service.

NonUniqueBeanException: Multiple possible bean candidates found


1. Build libraries and publish them to maven local
```
cd libs
./gradlew build publishToMavenLocal
```

2. You can see the error in the unit test
```
cd service
./gradlew test
```

3. Alternatively, you can build/run the jar and invoke the client to see the error.
```
cd service
./gradlew build
java -jar build/libs/service-all.jar
curl localhost:8080/invoke
```
