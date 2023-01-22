[![HowToCompileAndExecuteCode](https://img.shields.io/badge/How_To_Compile_And_Execute_Code-0067B6?style=for-the-badge&logoColor=white)](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/HowToCompileAndExecute.md)

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
## Chapter 6 - concurrency pattern examples
```bash
# Active object 
$ javac --release 17 --enable-preview -g -cp out/Chapter06/active_object -sourcepath java -d out/Chapter06/active_object ./Chapter06/active_object/*.java
$ java --enable-preview -cp out/Chapter06/active_object ActiveObjectMain

# Async method invocation 
$ javac --release 17 --enable-preview -g -cp out/Chapter06/async_method -sourcepath java -d out/Chapter06/async_method ./Chapter06/async_method/*.java
$ java --enable-preview -cp out/Chapter06/async_method AsyncMethodMain

# Balking
$ javac --release 17 --enable-preview -g -cp out/Chapter06/balking -sourcepath java -d out/Chapter06/balking ./Chapter06/balking/*.java
$ java --enable-preview -cp out/Chapter06/balking BalkingMain

# Double-checked locking
$ javac --release 17 --enable-preview -g -cp out/Chapter06/double_checked -sourcepath java -d out/Chapter06/double_checked ./Chapter06/double_checked/*.java
$ java --enable-preview -cp out/Chapter06/double_checked DoubleCheckedLockingMain

# Read-write lock
$ javac --release 17 --enable-preview -g -cp out/Chapter06/read_write_lock -sourcepath java -d out/Chapter06/read_write_lock ./Chapter06/read_write_lock/*.java
$ java --enable-preview -cp out/Chapter06/read_write_lock ReadWriteLockMain

# Producer-consumer
$ javac --release 17 --enable-preview -g -cp out/Chapter06/prod_con -sourcepath java -d out/Chapter06/prod_con ./Chapter06/prod_con/*.java
$ java --enable-preview -cp out/Chapter06/prod_con ProducerConsumerMain

# Scheduler
$ javac --release 17 --enable-preview -g -cp out/Chapter06/scheduler -sourcepath java -d out/Chapter06/scheduler ./Chapter06/scheduler/*.java

$ java --enable-preview -cp out/Chapter06/scheduler CustomSchedulerMain
$ java --enable-preview -cp out/Chapter06/scheduler CustomScheduledThreadPoolMain

# Thread-pool
$ javac --release 17 --enable-preview -g -cp out/Chapter06/thread_pool -sourcepath java -d out/Chapter06/thread_pool ./Chapter06/thread_pool/*.java
$ java --enable-preview -cp out/Chapter06/thread_pool ThreadPoolMain
```
