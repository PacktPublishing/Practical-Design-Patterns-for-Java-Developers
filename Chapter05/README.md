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
