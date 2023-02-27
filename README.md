# Practical Design Patterns for Java Developers
[![LinkedIn URL](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE) 


<a href="https://www.packtpub.com/product/practical-design-patterns-for-java-developers/9781804614679"><img src="https://static.packt-cdn.com/products/9781804614679/cover/smaller" alt="Design Patterns and Best Practices in Java " height="256px" align="right"></a>

This is the code repository for [ Practical Design Patterns for Java Developers ](https://www.packtpub.com/product/practical-design-patterns-for-java-developers/9781804614679), published by Packt.

**Hone your software design skills by implementing popular design patterns in Java**

## What is this book about?
As the experience level increases for software developers, it becomes crucial to develop the required skillset for developing quality code. This book will enable you to identify and apply common design patterns for building quality applications by refining your code.

This book covers the following exciting features:
* Understand the most common problems that can be solved using Java design patterns
* Uncover Java building elements, their usages, and concurrency possibilities
* Optimize a vehicle memory footprint with the Flyweight Pattern
* Explore one-to-many relations between instances with the observer pattern
* Discover how to route vehicle messages by using the visitor pattern
* Utilize and control vehicle resources with the thread-pool pattern
* Understand the penalties caused by anti-patterns in software design

The book describes <b>42</b> popular design patterns formed into an imaginary abstraction of vehicle manufacturing to boost the learning curve. 

| Creational | Structural | Behavioral | Concurrent |
| :--- | :--- | :--- | :--- |
| _Chapter 3_ | _Chapter 4_ | _Chapter 5_ | _Chapter 6_ |
| Factory Method | Adapter | Caching | Active Object |
| Abstract Factory | Bridge | Chain of Responsibility | Asynchronous Method |
| Builder | Composite | Command | Balking |
| Prototype | Decorator | Interpreter | Double Checked Locking |
| Singleton | Facade | Iterator | Read Write Lock |
| Object Pool | Filter | Mediator | Producer Consumer |
| Lazy Initialization | Flyweight | Null Object | Scheduler |
| Dependency Injection | Front Controller | Observer | Thread Pool |
| | Marker | Pipeline | |
| | Module | State | |
| | Proxy | Strategy | |
| | Twin | Template | |
| | | Visitor | |

_Table 1._ : **42** Practical Design Patterns explored in the book

If you feel this book is for you, get your [copy](https://www.amazon.com/dp/180461467X) today!<br>
What led the author to write this book: [Miroslav Wengner: The Interview](https://authors.packtpub.com/interview-with-miroslav-wengner/)

<a href="https://www.packtpub.com/?utm_source=github&utm_medium=banner&utm_campaign=GitHubBanner"><img src="https://raw.githubusercontent.com/PacktPublishing/GitHub/master/GitHub.png" 
alt="https://www.packtpub.com/" border="5" /></a>



The book 

## Instructions and Navigations
All of the code is organized into folders. For example, Chapter02.

The code will look like the following:
```
public class Vehicle {
 private boolean moving;
   public void move(){
       this.moving = true;
       System.out.println("moving...");
 }
```

**Following is what you need for this book:**
If you are an intermediate-level Java developer or software architect looking to learn the practical implementation of software design patterns in Java, then this book is for you. No prior knowledge of design patterns is required, but an understanding of Java programming is necessary.

With the following software and hardware list you can run all code files present in the book (Chapter 1-7).
### Software and Hardware List
| Chapter | Software required | OS required |
| -------- | ------------------------------------ | ----------------------------------- |
| 1 | Java Development Kit 17+ | Windows, Mac OS X, and Linux (Any) |
| 1 | Recommended IDE VSCode 1.73.1+ | Windows, Mac OS X, and Linux (Any) |
| 1 | A text editor or IDE | Windows, Mac OS X, and Linux (Any) |


We also provide a PDF file that has color images of the screenshots/diagrams used in this book. [Click here to download it]( https://packt.link/nSLEf).

### Related products
* Domain-Driven Design with Java - A Practitioner’s Guide  [[Packt]](https://www.packtpub.com/product/domain-driven-design-with-java-a-practitioners-guide/9781800560734?utm_source=github&utm_medium=repository&utm_campaign=) [[Amazon]](https://www.amazon.com/dp/1800560737)

* Java Memory Management  [[Packt]](https://www.packtpub.com/product/java-memory-management/9781801812856?utm_source=github&utm_medium=repository&utm_campaign=) [[Amazon]](https://www.amazon.com/dp/1801812853)

## How to install Java
Java Development Kit 17+ is required to run the book's examples. To check if it is available on your system, execute the following commands:
```bash
$ java -version

# Expected output:
openjdk version "17" 2021-09-14
OpenJDK Runtime Environment (build 17+35-2724)
OpenJDK 64-Bit Server VM (build 17+35-2724, mixed mode,
sharing)
```

In case the JDK is not installed, feel free to visit the following links for help:
1. [Foojay.io : Java Quick Start](https://foojay.io/java-quick-start/install-java/)
2. [dev.java : Getting Started with Java](https://dev.java/learn/)
3. [Homebrew Formulae: OpenJDK](https://formulae.brew.sh/formula/openjdk)


### How to create and open Java Flight Recorder recordings
The project contains several ***.jfr** recordings. The file-name refers to the image that was created from this recording. **Java Mission Control version 8.2** was used for image creation purposes. *.jfr files can be opened in the **Java Mission Control application**, which can be downloaded from the links below.

download links:
- https://github.com/openjdk/jmc
- https://adoptium.net/jmc/

```bash 
# Starting the JavaFlightRecorder for the patterns
# Recordings are done on Java 17
$ java -XX:StartFlightRecording=filename=<PATTERN_NAME_MAIN>.jfr,dumponexit=true,settings=profile <MAIN_CLASS>
```
[![HowToCompileAndExecuteCode](https://img.shields.io/badge/How_To_Compile_And_Execute_Code-0067B6?style=for-the-badge&logoColor=white)](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/HowToCompileAndExecute.md)

## Get to Know the Author
**Miroslav Wengner**
is an engineer with a passion for resilient distributed systems and product quality. He is a co-author and contributor to the Robo4J project (a reactive soft real-time framework for robotics/IoT). Miro contributes to OpenJDK and participates in other open source technologies. He uses his passion for helping build resilient and scalable solutions.
Miro was selected for the Java Champions Program, recognized as a JavaOne Rockstar, and elected to the Java Community Process (JCP) as an executive committee member.He shares his knowledge at conferences (JavaOne, Devoxx, and so on) and in blogs. Miro believes in the Java ecosystem and helps move it forward!

[![Twitter URL](https://img.shields.io/twitter/url/https/twitter.com/miragemiko.svg?style=social&label=Follow%20%40miragemiko)](https://twitter.com/miragemiko) <br>
[![LinkedIn URL](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/mwengner/) 







### Download a free PDF

 <i>If you have already purchased a print or Kindle version of this book, you can get a DRM-free PDF version at no cost.<br>Simply click on the link to claim your free PDF.</i>
<p align="center"> <a href="https://packt.link/free-ebook/9781804614679">https://packt.link/free-ebook/9781804614679 </a> </p>