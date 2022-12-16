# Practical-Design-Patterns-for-Java-Developers
Practical Design Patterns for Java Developers, published by Packt

#### how to compile a code
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

## Chapter 1 -  initial examples
The examples are 
Runnable examples:
- Example1_2Main
- Example1_6Main
- Example1_7Main
- Example1_8Main
- Example1_9Main

## Chapter 2 - java platform examples

## Chapter 3 - creational patterns examples 
```bash
# Factory Method: creating instances 
$ javac --release 17 --enable-preview -g -cp out/Chapter03/fm -sourcepath java -d out/Chapter03/fm ./Chapter03/factory_method/*.java
$ java --enable-preview -cp out/Chapter03/fm FactoryMethodMain
$ java --enable-preview -cp out/Chapter03/fm -XX:StartFlightRecording=filename=FactoryMethod.jfr,dumponexit-true,settings=profile FactoryMethodMain

# Abstract Factory: instancise proper factory to create desired instances
$ javac --release 17 --enable-preview -g -cp out/Chapter03/af -sourcepath java -d out/Chapter03/af ./Chapter03/abstract_factory/*.java
$ java --enable-preview -cp out/Chapter03/af AbstractFactoryMain

# Builder
$ javac --release 17 --enable-preview -g -cp out/Chapter03/builder -sourcepath java -d out/Chapter03/builder ./Chapter03/builder/*.java
$ java --enable-preview -cp out/Chapter03/builder BuilderMain

# Prototype
$ javac --release 17 --enable-preview -g -cp out/Chapter03/prototype -sourcepath java -d out/Chapter03/prototype ./Chapter03/prototype/*.java
$ java --enable-preview -cp out/Chapter03/prototype PrototypeMain

# Singleton 
$ javac --release 17 --enable-preview -g -cp out/Chapter03/singleton -sourcepath java -d out/Chapter03/singleton ./Chapter03/singleton/*.java
$ java --enable-preview -cp out/Chapter03/singleton SingletonMain


# Object Pool
$ javac --release 17 --enable-preview -g -cp out/Chapter03/object_pool -sourcepath java -d out/Chapter03/object_pool ./Chapter03/object_pool/*.java
$ java --enable-preview -cp out/Chapter03/object_pool ObjectPoolMain

# Lazy Initialization
$ javac --release 17 --enable-preview -g -cp out/Chapter03/lazy_initialization -sourcepath java -d out/Chapter03/lazy_initialization ./Chapter03/lazy_initialization/*.java
$ java --enable-preview -cp out/Chapter03/lazy_initialization LazyInitializationMain

# Dependency Injection
$ javac --release 17 --enable-preview -g -cp out/Chapter03/dependency_injection -sourcepath java -d out/Chapter03/dependency_injection ./Chapter03/dependency_injection/*.java
$ java --enable-preview -cp out/Chapter03/dependency_injection DependencyInjectionMain

### it is required to have present the service providers configuration in the classpath
$ cp -R Chapter03/dependency_injection/META-INF  out/Chapter03/dependency_injection
$ java --enable-preview -cp out/Chapter03/dependency_injection DependencyInjectionServiceLoaderMain
```

## Chapter 4 - structural pattern examples
```bash
# Adapter 
$ javac --release 17 --enable-preview -g -cp out/Chapter04/adapter -sourcepath java -d out/Chapter04/adapter ./Chapter04/adapter/*.java
$ java --enable-preview -cp out/Chapter04/adapter AdapterMain

# Bridge
$ javac --release 17 --enable-preview -g -cp out/Chapter04/bridge -sourcepath java -d out/Chapter04/bridge ./Chapter04/bridge/*.java
$ java --enable-preview -cp out/Chapter04/bridge BridgeMain

# Composite
$ javac --release 17 --enable-preview -g -cp out/Chapter04/composite -sourcepath java -d out/Chapter04/composite ./Chapter04/composite/*.java
$ java --enable-preview -cp out/Chapter04/composite CompositeMain

# Decorator
$ javac --release 17 --enable-preview -g -cp out/Chapter04/decorator -sourcepath java -d out/Chapter04/decorator ./Chapter04/decorator/*.java
$ java --enable-preview -cp out/Chapter04/decorator DecoratorMain

# Facade
$ javac --release 17 --enable-preview -g -cp out/Chapter04/facade -sourcepath java -d out/Chapter04/facade ./Chapter04/facade/*.java
$ java --enable-preview -cp out/Chapter04/facade FacadeMain

# Filter
$ javac --release 17 --enable-preview -g -cp out/Chapter04/filter -sourcepath java -d out/Chapter04/filter ./Chapter04/filter/*.java
$ java --enable-preview -cp out/Chapter04/filter FilterMain

# Flyweight
$ javac --release 17 --enable-preview -g -cp out/Chapter04/flyweight -sourcepath java -d out/Chapter04/flyweight ./Chapter04/flyweight/*.java
$ java --enable-preview -cp out/Chapter04/flyweight FlyweightMain

# Front controller
$ javac --release 17 --enable-preview -g -cp out/Chapter04/front_controller -sourcepath java -d out/Chapter04/front_controller ./Chapter04/front_controller/*.java
$ java --enable-preview -cp out/Chapter04/front_controller FrontControllerMain

# Marker
$ javac --release 17 --enable-preview -g -cp out/Chapter04/marker -sourcepath java -d out/Chapter04/marker ./Chapter04/marker/*.java
$ java --enable-preview -cp out/Chapter04/marker MarkerMain

# Module
$ javac --release 17 --enable-preview -g -cp out/Chapter04/module -sourcepath java -d out/Chapter04/module ./Chapter04/module/*.java
$ java --enable-preview -cp out/Chapter04/module ModuleMain

# Proxy
$ javac --release 17 --enable-preview -g -cp out/Chapter04/proxy -sourcepath java -d out/Chapter04/proxy ./Chapter04/proxy/*.java
$ java --enable-preview -cp out/Chapter04/proxy ProxyMain

# Twin
$ javac --release 17 --enable-preview -g -cp out/Chapter04/twin -sourcepath java -d out/Chapter04/twin ./Chapter04/twin/*.java
$ java --enable-preview -cp out/Chapter04/twin TwinMain
```

## Chapter 5 - behavioral pattern examples
```bash
# Caching 
$ javac --release 17 --enable-preview -g -cp out/Chapter05/caching -sourcepath java -d out/Chapter05/caching ./Chapter05/caching/*.java
$ java --enable-preview -cp out/Chapter05/caching CachingMain

# Chain of responsibility 
$ javac --release 17 --enable-preview -g -cp out/Chapter05/chain_responsibility -sourcepath java -d out/Chapter05/chain_responsibility ./Chapter05/chain_responsibility/*.java
$ java --enable-preview -cp out/Chapter05/chain_responsibility ChainOfResponsibilityMain

# Command 
$ javac --release 17 --enable-preview -g -cp out/Chapter05/command -sourcepath java -d out/Chapter05/command ./Chapter05/command/*.java
$ java --enable-preview -cp out/Chapter05/command CommandMain

# Interpreter 
$ javac --release 17 --enable-preview -g -cp out/Chapter05/interpreter -sourcepath java -d out/Chapter05/interpreter ./Chapter05/interpreter/*.java
$ java --enable-preview -cp out/Chapter05/interpreter InterpreterMain

# Iterator 
$ javac --release 17 --enable-preview -g -cp out/Chapter05/iterator -sourcepath java -d out/Chapter05/iterator ./Chapter05/iterator/*.java
$ java --enable-preview -cp out/Chapter05/iterator IteratorMain

# Mediator 
$ javac --release 17 --enable-preview -g -cp out/Chapter05/mediator -sourcepath java -d out/Chapter05/mediator ./Chapter05/mediator/*.java
$ java --enable-preview -cp out/Chapter05/mediator MediatorMain

# Null object 
$ javac --release 17 --enable-preview -g -cp out/Chapter05/null_object -sourcepath java -d out/Chapter05/null_object ./Chapter05/null_object/*.java
$ java --enable-preview -cp out/Chapter05/null_object NullObjectMain

# Observer 
$ javac --release 17 --enable-preview -g -cp out/Chapter05/observer -sourcepath java -d out/Chapter05/observer ./Chapter05/observer/*.java
$ java --enable-preview -cp out/Chapter05/observer ObserverMain

# Pipeline 
$ javac --release 17 --enable-preview -g -cp out/Chapter05/pipeline -sourcepath java -d out/Chapter05/pipeline ./Chapter05/pipeline/*.java
$ java --enable-preview -cp out/Chapter05/pipeline PipelineMain

# State 
$ javac --release 17 --enable-preview -g -cp out/Chapter05/state -sourcepath java -d out/Chapter05/state ./Chapter05/state/*.java
$ java --enable-preview -cp out/Chapter05/state StateMain

# Strategy 
$ javac --release 17 --enable-preview -g -cp out/Chapter05/strategy -sourcepath java -d out/Chapter05/strategy ./Chapter05/strategy/*.java
$ java --enable-preview -cp out/Chapter05/strategy StrategyMain

# Template method 
$ javac --release 17 --enable-preview -g -cp out/Chapter05/template_method -sourcepath java -d out/Chapter05/template_method ./Chapter05/template_method/*.java
$ java --enable-preview -cp out/Chapter05/template_method TemplateMethodMain

# Visitor
$ javac --release 17 --enable-preview -g -cp out/Chapter05/visitor -sourcepath java -d out/Chapter05/visitor ./Chapter05/visitor/*.java
$ java --enable-preview -cp out/Chapter05/visitor VisitorMain
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

## Chapter 7 - anti-paterns exmples 
```bash
#  Garbage collection phenomenon
$ javac --release 17 --enable-preview -g -cp out/Chapter07/garbage -sourcepath java -d out/Chapter07/garbage ./Chapter07/garbage/*.java
$ java --enable-preview -cp out/Chapter07/garbage GarbageMain


#  Busy method phenomenon
$ javac --release 17 --enable-preview -g -cp out/Chapter07/busy_method -sourcepath java -d out/Chapter07/busy_method ./Chapter07/busy_method/*.java
$ java --enable-preview -cp out/Chapter07/busy_method BusyMethodMain
```