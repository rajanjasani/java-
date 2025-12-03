// java 

# what is java?
- popular and powerful programming language, created in 1995.
- 3 billion devices run Java.

# used for:
- Mobile applications (specially Android apps)
- Desktop applications
- Web applications
- Web servers and application servers
- Games
- Database connection 

Why Use Java?
- works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.)
- popular programming languages
- easy to learn and simple to use
- secure, fast and powerful
- object oriented language which gives a clear structure to programs 
- close to C++ and C#, it makes it easy for programmers


# example code:=

public class Main{
  public static void main(String args[]){
    String name = "John";
    System.out.println("hello " + name);
  }
}


# for run this code write in tarminal :-

- javac filename.java
- java classname

# show java version

java --version

# Java Quickstart
- every application begins with a class name and that class must match the filename.

#Example explained
- line of code that runs in Java must be inside a class
- class name always start with an uppercase first letter.
- Java is case-sensitive. MyClass and myclass that to are diffrent.
- name of the Java file must match the class name.
- ex:- So if your class is called Main, the file must be saved as Main.java.


# main Method

- main() method is required in every Java program. It is where the program starts running
- Any code placed inside the main() method will be executed.

# System.out.println();
-that is used for the printthe data.

# print the number and String

- System.out.println("Enter the Name:");
- System.out.println(20 * 20);

# Java Comments

- Single-line Comments => //
- Multi-line Comments => /* and */

# Variables

String => stores string Value "hello"
int =>  stores integers 123 or -123  => byte,short,long
float => stores floating point numbers 19.99 or -19.99 => double
char => stores single characters  'a' or 'B'.
boolan => stores values with two states: true or false

# Declaring Variables

 # Syntax
 - type variableName = value;

String name = "John";
int myNum = 15;

# Final Variables

- If you don't want a variable’s value to change, use the final keyword.
- A final variable can be assigned only once, and after that, it becomes read-only.

ex:-
 - final int age = 20;
 - age = 30; // ❌ Error: can't change a final variable

ex:-

- int myNum = 5;
- byte by = 127;
- short sh = 234;
- long l = 12234l; // in long after number write a L
- float myFloatNum = 5.99f;
- double d = 5.8;
- char myLetter = 'D';
- boolean myBool = true;
- String myText = "Hello";


# JVM Stands for Java Virtual Machine

- with out JVM not run this program
- a virtual machine that runs Java programs by interpreting bytecode and providing a runtime environment

# Java is platform-independent because its compiled code, bytecode, is not tied to a specific operating system or hardware.(run any platfom and any mashin);  

# jvm is a platform dependent

- jvm run the first file.
class hello
{
  public static void main(String a[])
  {
    System.out.println("hello name");
  }
}

- extenshan of byte code is .class

# JVM (Java Virtual Machine)

- Think of JVM like a machine that runs Java programs.
- Runs .class files (bytecode)
- Converts bytecode → machine code for your OS
- Handles memory, garbage collection, security

# JRE (Java Runtime Environment)
- JRE as a package that contains everything needed to run Java programs.
- Core libraries (Java classes)

# ----=> java is write once run anywhere

Widening Casting (automatic) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manual) - converting a larger type to a smaller type size
double -> float -> long -> int -> char -> short -> byte






 

