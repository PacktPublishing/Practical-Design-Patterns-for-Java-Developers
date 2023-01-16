### how to compile a code
```bash
$ javac --release 17 --enable-preview -g -cp out -sourcepath java -d out ./<CHAPTER_NUMBER>/<CHAPTER_IDENTIFIER>/*.java

# example 
$ javac --release 17 --enable-preview -g -cp out -sourcepath java -d out ./Chapter01/apie/*.java

# create module jar
$ jar --create --file module-example.jar  -C out .
```

### how to execute example
```bash
$ java --enable-preview -cp out/<CHAPTER_IDENTIFIER> <EXAMPLE_NUMBER_MAIN>

# example
$ java --enable-preview -cp out/apie Example1_2Main

# run module path 
$ java --module-path ./Chapter02/module-example.jar --module module.example/example.ExampleMain
```

### create and open Java Flight Recorder recording
The project contains several ***.jfr** recordings. The file name contains the identifier of the image that was created from this recording. **Java Mission Control version 8.2** was used for image creation purposes. *.jfr files can be opened in the **Java Mission Control application**, which can be downloaded from the links below.

download links:
- https://github.com/openjdk/jmc
- https://adoptium.net/jmc/

```bash 
# Starting the JavaFlightRecorder for the patterns
# Recordings are done on Java 17
$ java -XX:StartFlightRecording=filename=<PATTERN_NAME_MAIN>.jfr,dumponexit=true,settings=profile <MAIN_CLASS>
```
## Chapter 7 - anti-paterns exmples 
```bash
#  Garbage collection phenomenon
$ javac --release 17 --enable-preview -g -cp out/Chapter07/garbage -sourcepath java -d out/Chapter07/garbage ./Chapter07/garbage/*.java
$ java --enable-preview -cp out/Chapter07/garbage GarbageMain


#  Busy method phenomenon
$ javac --release 17 --enable-preview -g -cp out/Chapter07/busy_method -sourcepath java -d out/Chapter07/busy_method ./Chapter07/busy_method/*.java
$ java --enable-preview -cp out/Chapter07/busy_method BusyMethodMain
```
