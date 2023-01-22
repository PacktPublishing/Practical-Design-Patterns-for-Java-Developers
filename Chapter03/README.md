[![HowToCompileAndExecuteCode](https://img.shields.io/badge/How_To_Compile_And_Execute_Code-0067B6?style=for-the-badge&logoColor=white)](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/HowToCompileAndExecute.md)
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
