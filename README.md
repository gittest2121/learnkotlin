# LearnKotlin
This is a repository made whilst learning Kotlin (along with Java).

## Difference between a java class file and a jar file
```
JAR = Java ARchive
class = Java bytecode (that can be executed in JVM)
```
* A .jar file is an zip archive (maybe this is why SDKMAN asked for "unzip" & "zip" software for setup) containing one or more java class files (can contain zero classes if it contains only resources).
* This makes the usage of libraries (consisting of multiple classes) more handy.
* Directories and Jar files are added to the classpath and available to the *ClassLoader* at runtime to find particular classes inside of it.

*Credits:* https://stackoverflow.com/a/5743779 (CC-BY-SA 3.0)

## Packages vs JARs
* A package is a way to *logically organize your classes.*
```
* Say, you declare [ package com.foo; ] at the top of each source file that 
are related enough to reside in the [ com.foo ] package together.

* The Java compiler and runtime will also expect you to place such files in
the path [ com/foo/ ], where the root of this path is a directory or JAR in
your classpath.
```

* A JAR file lets your *physically organize your classes.*
```
* You can take any Java files (and their parent directories, respecting the
directory structure discussed above) and store them in a JAR file.

* A JAR file may contain files belonging to multiple multiple packages, and
multiple JAR files may contain files that belong to the same package. So,
JAR is largely a way to store multiple class files in a single physical file.
```

* There are some other special characterstics of JAR files.
```
Say, you specify a *Main-Class (Application's Entry Point)* value in the JAR
manifest to "designate which class is the entry point for an application", and you can *seal* packages in a JAR file, "which means that all classes defined in that package must be archived in the same JAR file."
```
* You would put class files into a jar, not Java files.

*Credits:* https://stackoverflow.com/a/5138452 (CC-BY-SA 2.5)

## Why Kotlin allow write main function with no arguments?
* The signature of main is based on what the JVM expects:

*More Explanation:* https://stackoverflow.com/a/55794003 (CC-BY-SA 4.0)

## Why does Kotlin allow to write a function outside a class?
* Rethink for a second; A class is supposed to be a blueprint for objects, describe their behavior and state.
* But you can call a static method without creating any instances!
* Actually static methods are a hack in Java, they pollute and misuse the OOP notion of a class. But you got used to them over the years so that you don't feel that anymore.
```
* Conceptually, a static method is a top-level function and Java uses the
name of its declaring class as its namespace.
* In contrast to that, Kotlin allows you to declare top-level functions without misusing the class for namespacing
```
***This leads to the question of "Why Java does not allow function defintions to be present outside of class?"
Explanation: https://softwareengineering.stackexchange.com/a/185159 (CC-BY-SA 4.0)***
* Generally, this means "it is better to use a top-level function when the logic of a function does not clearly belong to any class.

*Credits:* https://stackoverflow.com/a/49015268 (CC-BY-SA 3.0)
