## Program example 

```bash
# Compile and Execute Program example 
$ javac Program.java
$ java Program

# Create Java Flight Recording with dump on exit 
$ java -XX:StartFlightRecording=filename=program.jfr,dumponexit-true,settings=profile Program
```

## Modules Example 

```bash
# example module structure
module-example
├── example
│   └── ExampleMain.java
└── module-info.java
```

```bash
# Compile module 
$ javac -d ./out ./module-example/module-info.java ./module-example/example/ExampleMain.java

# out directory structure
out
├── example
│   └── ExampleMain.class
└── module-info.class

# Create a jar file 
$ jar --create -file module-example.jar -C ./out .

# Execute exported class 
$ java --module-path ./module-example.jar --module module.example/example.ExampleMain       
Welcome to JMPS!

# Describe module
$ java --module-path ./module-example.jar --describe-module module.example  

```

## JEP-409: Sealed classe example
```bash
# Compile 
$ javac -g -classpath ./out/jep409 -sourcepath ./jep409  -d ./out/jep409 ./jep409/*.java

# Run 
$ java -cp out/jep409 Jep409Main

```
