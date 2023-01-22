[![HowToCompileAndExecuteCode](https://img.shields.io/badge/How_To_Compile_And_Execute_Code-0067B6?style=for-the-badge&logoColor=white)](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/HowToCompileAndExecute.md)

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
## Chapter 7 - anti-patterns exmples 
```bash
#  Garbage collection phenomenon
$ javac --release 17 --enable-preview -g -cp out/Chapter07/garbage -sourcepath java -d out/Chapter07/garbage ./Chapter07/garbage/*.java
$ java --enable-preview -cp out/Chapter07/garbage GarbageMain


#  Busy method phenomenon
$ javac --release 17 --enable-preview -g -cp out/Chapter07/busy_method -sourcepath java -d out/Chapter07/busy_method ./Chapter07/busy_method/*.java
$ java --enable-preview -cp out/Chapter07/busy_method BusyMethodMain
```
