[![HowToCompileAndExecuteCode](https://img.shields.io/badge/How_To_Compile_And_Execute_Code-0067B6?style=for-the-badge&logoColor=white)](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/HowToCompileAndExecute.md) 
## Chapter 1 -  getting into software design patterns examples
 1. **OOP** pilars **APIE** :
    - encapuslation (E) : 
        - [Example 1.1 - `Vehicle.java`](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/apie/Vehicle.java)
    - inheritance   (I)
        - [`Car.java` implementation extends `Vehicle` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/apie/Car.java)
        - [`SportCar.java` class extends `AbstractVehicle` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/apie/SportCar.java)
    - polymorphism  (P)
        - method overloading
            - [Figure 1.5 - `Vehicle` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/apie/Vehicle.java)
        - method overriding
            - [Example 1.2, Figure 1.6 - `Vehicle` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/apie/Vehicle.java)
            - [Example 1.2, Figure 1.6 - `Car` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/apie/Car.java)
    - abstraciton   (A)
        - abstract `class`
            - [Example 1.3, Figure 1.7 - `AbstractVehicle` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/apie/AbstractVehicle.java)
            - [Example 1.3, Figure 1.7 - `CommonCar` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/apie/CommonCar.java)
            - [Example 1.3, Figure 1.7 - `SportCar` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/apie/SportCar.java)
        - interface `class`
            - [Example 1.4, Figure 1.8 - `VehicleInterface` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/apie/VehicleInterface.java)
            - [Example 1.4, Figure 1.8 - `Truck` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/apie/Truck.java)
            - [Example 1.4, Figure 1.8 - `Bus` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/apie/Bus.java) 
        - abstract and interface `classes`
            - [Figure 1.9 - `VehicleInterface` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/apie/VehicleInterface.java)
            - [Figure 1.9 - `AbstractVehicle` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/apie/AbstractVehicle.java)
            - [Figure 1.9 - `Truck` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/apie/CommonCar.java)
            - [Figure 1.9 - `Bus` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/apie/SportCar.java) 


 2. SOLID Principles
    - single-responsiblity principle (SRP)
        - [Figure 1.12 - `Vehicle` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/solid/srp/Vehicle.java)
        - [Figure 1.12 - `Engine` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/solid/srp/Engine.java)
        - [Figure 1.12 - `VehicleComputer` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/solid/srp/VehicleComputer.java)
    - open-closed principle (OCP)
        - [Example 1.5 - `Vehicle` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/solid/general/Vehicle.java)
        - [Example 1.5 - `Truck` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/solid/general/Truck.java)
        - [Example 1.6 - `Example1_6Main` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/solid/general/Example1_6Main.java)
    - liskov substitution principle (LSP)
        - [Example 1.7 - `Vehicle` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/solid/general/Vehicle.java)
        - [Example 1.7 - `CarWash` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/solid/general/CarWash.java)
        - [Example 1.7 - `Car` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/solid/general/Car.java)
        - [Example 1.7 - `SportCar` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/solid/general/SportCar.java)
        - [Example 1.7 - `Example1_7Main.java` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/solid/general/Example1_7Main.java)
    - interface segregation principle (ISP)
        - malicious
            - [Example 1.8 - `Vehicle` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/solid/spi_malicious/Vehicle.java)
            - [Example 1.8 - `Bike` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/solid/spi_malicious/Bike.java)
            - [Example 1.8 - `Car` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/solid/spi_malicious/Car.java)
            - [Example 1.8 - `Example1_8Main` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/solid/spi_malicious/Example1_8Main.java)
        - optimal
            - [Example 1.9 - `Vehicle` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/solid/spi_optimal/Vehicle.java)
            - [Example 1.9 - `Bike` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/solid/spi_optimal/Bike.java)
            - [Example 1.9 - `Car` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/solid/spi_optimal/Car.java)
            - [Example 1.9 - `HasEngine` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/solid/spi_optimal/HasEngine.java)
            - [Example 1.9 - `HasPedals` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/solid/spi_optimal/HasPedals.java)
            - [Example 1.9 - `Example1_8Main` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/solid/spi_optimal/Example1_9Main.java)
    - dependency inversion principle (DIP)
        - [Example 1.10 - `Gerage` class](https://github.com/PacktPublishing/Practical-Design-Patterns-for-Java-Developers/blob/main/Chapter01/solid/dip/Garage.java)

### Runnable Examples:
```bash
# Example 1.2:
$ javac --release 17 --enable-preview -g -cp out/Chapter01/apie/ -sourcepath java -d out/Chapter01/apie ./Chapter01/apie/*.java
$ java --enable-preview -cp out/Chapter01/apie Example1_2Main

# Example 1.6 and Example 1.7
$ javac --release 17 --enable-preview -g -cp out/Chapter01/solid/general/ -sourcepath java -d out/Chapter01/solid/general ./Chapter01/solid/general/*.java
$ java --enable-preview -cp out/Chapter01/solid/general Example1_6Main
$ java --enable-preview -cp out/Chapter01/solid/general Example1_7Main

# Example 1.8: SPI - malicious
$ javac --release 17 --enable-preview -g -cp out/Chapter01/solid/spi_malicious/ -sourcepath java -d out/Chapter01/solid/spi_malicious ./Chapter01/solid/spi_malicious/*.java
$ java --enable-preview -cp out/Chapter01/solid/spi_malicious Example1_8Main

# Example 1.9: SPI - optimal
$ javac --release 17 --enable-preview -g -cp out/Chapter01/solid/spi_optimal/ -sourcepath java -d out/Chapter01/solid/spi_optimal ./Chapter01/solid/spi_optimal/*.java
$ java --enable-preview -cp out/Chapter01/solid/spi_optimal Example1_9Main
