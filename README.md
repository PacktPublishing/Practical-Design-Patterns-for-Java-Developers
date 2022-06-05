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

## Chapter 1 - examples
Runnable examples:
- Example1_2Main
- Example1_6Main
- Example1_7Main
- Example1_8Main
- Example1_9Main

## Chapter 2 - examples