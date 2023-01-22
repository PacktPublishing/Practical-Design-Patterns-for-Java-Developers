[![HowToCompileAndExecuteCode](https://img.shields.io/badge/How_To_Compile_And_Execute_Code-0067B6?style=for-the-badge&logoColor=white)](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/HowToCompileAndExecute.md)
## Chapter 2 - discovering the java platform for design patterns examples
#### Runnable Examples
```bash
# Example 2.1:
$ java ./Chapter02/Program.java

# Example 2.12 and Example 2.13
$ java ./Chapter02/StreamMain.java

# Example 2.18: JPMS
$ javac -d ./out/Chapter02/module-example ./Chapter02/module-example/module-info.java ./Chapter02/module-example/example/ExampleMain.java
$ jar --create --file ./out/Chapter02/module-example.jar  -C ./out/Chapter02/module-example .
$ java --module-path ./out/Chapter02/module-example.jar --module module.example/example.ExampleMain

# Example 2.20: JEP-323
$ java ./Chapter02/Jep323.java

# Example 2.21: JEP-361
$ java ./Chapter02/Jep361.java

# Example 2.22: JEP-394
$ java ./Chapter02/Jep394.java

# Example 2.23: JEP-395
$ java ./Chapter02/Jep395.java

# Example 2.24: JEP-409
$ javac --release 17 --enable-preview -g -cp ./out/Chapter02/jep409 -sourcepath java -d ./out/Chapter02/jep409 ./Chapter02/jep409/*.java
$ java --enable-preview -cp out/Chapter02/jep409 Jep409Main

# Example 2.27: JEP-420
$ javac --release 17 --enable-preview -g -d ./out/Chapter02 ./Chapter02/Jep420.java
$ java --enable-preview -cp ./out/Chapter02 Jep420

# Example 2.28:
$ java ./Chapter02/MultiThreadedProgram.java
```
