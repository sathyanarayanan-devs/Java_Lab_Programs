# OBJECT ORIENTED JAVA PROGRAMMING LAB

This repository contains Java programs implemented as part of the
**Object Oriented Java Programming Laboratory** for **II B.Sc.
CyberSecurity**.

The programs cover Java fundamentals, arrays and strings, classes and
objects, inheritance and polymorphism, packages and interfaces,
exception handling, multithreading, and graphical user interface
development using Java Swing.

------------------------------------------------------------------------

## PROGRAM OVERVIEW

  ------------------------------------------------------------------------------------------
  Program No.             Program Title                              Aim of Program
  ----------------------- ------------------------------------------ -----------------------
  1                       [JAVA PROGRAM                              To demonstrate
                          FUNDAMENTALS](Program1/Program1.java)      variables, data types,
                                                                     user input/output,
                                                                     arithmetic and
                                                                     relational operators,
                                                                     conditional statements,
                                                                     grade calculation, and
                                                                     a `for` loop.

  2                       [ARRAYS AND                                To demonstrate
                          STRINGS](Program2/Program2.java)           one-dimensional and
                                                                     two-dimensional arrays,
                                                                     array traversal and
                                                                     summation, `String`
                                                                     operations, and mutable
                                                                     string operations using
                                                                     `StringBuffer`.

  3                       [CLASSES AND                               To demonstrate classes,
                          OBJECTS](Program3/Program3.java)           objects, a
                                                                     parameterized
                                                                     constructor, instance
                                                                     methods, arrays as
                                                                     object data, and
                                                                     student mark and grade
                                                                     calculation.

  4                       [INHERITANCE AND                           To demonstrate single,
                          POLYMORPHISM](Program4/Program4.java)      multilevel, and
                                                                     hierarchical
                                                                     inheritance,
                                                                     constructor chaining
                                                                     using `super`, method
                                                                     overloading, and method
                                                                     overriding.

  5                       [PACKAGES AND                              To demonstrate a
                          INTERFACES](Program5/Program5.java)        user-defined package
                                                                     and a `Calculator`
                                                                     interface implemented
                                                                     by a class that
                                                                     performs arithmetic
                                                                     operations.

  6                       [EXCEPTION                                 To demonstrate a
                          HANDLING](Program6/Program6.java)          user-defined exception,
                                                                     `throw`, `throws`,
                                                                     `try-catch-finally`,
                                                                     and handling of an
                                                                     arithmetic exception.

  7                       [MULTITHREADING](Program7/Program7.java)   To demonstrate thread
                                                                     creation by extending
                                                                     the `Thread` class and
                                                                     implementing the
                                                                     `Runnable` interface,
                                                                     along with `start()`,
                                                                     `sleep()`, and
                                                                     `join()`.

  8                       [JAVA SWING -- BASIC                       To create a basic
                          GUI](Program8/Program8.java)               graphical user
                                                                     interface using Swing
                                                                     components such as
                                                                     `JFrame`, `JPanel`,
                                                                     `JLabel`, `JTextField`,
                                                                     `JButton`, and
                                                                     `JTextArea`, with
                                                                     button event handling.

  9                       [JAVA SWING -- GUI                         To demonstrate Swing
                          CONTROLS](Program9/Program9.java)          controls including
                                                                     `JCheckBox`,
                                                                     `JRadioButton`,
                                                                     `ButtonGroup`,
                                                                     `JComboBox`, `JList`,
                                                                     `JTable`, and a message
                                                                     dialog.
  ------------------------------------------------------------------------------------------

------------------------------------------------------------------------

## FOLDER STRUCTURE

``` text
Java_Lab_Programs/
│
├── Program1/
│   └── Program1.java
│
├── Program2/
│   └── Program2.java
│
├── Program3/
│   └── Program3.java
│
├── Program4/
│   └── Program4.java
│
├── Program5/
│   ├── Program5.java
│   └── MyPackage/
│       └── Calculator.java
│
├── Program6/
│   └── Program6.java
│
├── Program7/
│   └── Program7.java
│
├── Program8/
│   └── Program8.java
│
├── Program9/
│   └── Program9.java
│
├── README.md
├── .gitignore
└── LabPracticalNotes-2.pdf
```

------------------------------------------------------------------------

## REPOSITORY CONTENTS

  -----------------------------------------------------------------------
  Folder / File                       Description
  ----------------------------------- -----------------------------------
  `Program1/`                         Java fundamentals, arithmetic
                                      operations, relational comparison,
                                      conditional grade calculation, and
                                      looping.

  `Program2/`                         One-dimensional and two-dimensional
                                      arrays, `String` methods, and
                                      `StringBuffer` operations.

  `Program3/`                         A `Student` class with a
                                      constructor and methods to read
                                      marks, calculate totals and
                                      averages, assign grades, and
                                      display details.

  `Program4/`                         Inheritance and polymorphism using
                                      `Person`, `Student`,
                                      `SportsStudent`, and `Teacher`
                                      classes.

  `Program5/`                         A `Calculator` interface in the
                                      `MyPackage` package and a
                                      `MyCalculator` implementation for
                                      arithmetic operations.

  `Program6/`                         User-defined age exception handling
                                      and built-in arithmetic exception
                                      handling.

  `Program7/`                         Two threads created using the
                                      `Thread` class and the `Runnable`
                                      interface.

  `Program8/`                         A Swing window that accepts a name
                                      and displays a greeting when the
                                      Submit button is clicked.

  `Program9/`                         A Swing form containing selection
                                      controls and a table of sample
                                      student data.

  `LabPracticalNotes-2.pdf`           Lab practical notes containing the
                                      documented exercises, algorithms,
                                      source code, and compilation steps
                                      for Programs 1--5.

  `README.md`                         Main repository documentation,
                                      program overview, and folder
                                      structure.

  `.gitignore`                        Specifies files and paths Git
                                      should ignore.
  -----------------------------------------------------------------------

------------------------------------------------------------------------

## HOW TO COMPILE AND RUN

Install a compatible Java Development Kit (JDK), then open a terminal in
the repository's root directory.

### Programs 1--4

Compile and run each program from the repository root. For example, for
Program 1:

``` bash
javac Program1/Program1.java
java Program1.Program1
```

Use the matching folder and fully qualified class name for Programs
2--4.

### Programs 6--7

These programs do not declare a package. Open a terminal in the
corresponding program folder and run:

``` bash
javac Program6.java
java Program6
```

Replace `Program6` with `Program7` when running Program 7.

### Program 5 -- Packages and Interfaces

The `Calculator` interface is located in the `MyPackage` package. From
the `Program5` directory, compile and run:

``` bash
javac MyPackage/Calculator.java Program5.java
java Program5
```

### Programs 8--9 -- Java Swing

Open a terminal in each program's folder, then compile and run. For
Program 8:

``` bash
javac Program8.java
java Program8
```

Replace `Program8` with `Program9` when running Program 9. A desktop
environment is required to display the Swing windows.

------------------------------------------------------------------------

## TECHNOLOGIES AND CONCEPTS

The programs in this repository use:

-   Java Programming
-   Variables and Data Types
-   Operators and Control Structures
-   Arrays and Strings
-   Classes, Objects, and Constructors
-   Inheritance and Polymorphism
-   Packages and Interfaces
-   Exception Handling
-   Multithreading
-   Java Swing GUI Components
-   Event Handling
-   User Input and Output

------------------------------------------------------------------------

## LAB PRACTICAL NOTES

The `LabPracticalNotes-2.pdf` file documents Programs 1--5, including
their aims, algorithms, source code, and compilation instructions.
Programs 6--9 are represented by their Java source files in this
repository; their descriptions in this README are based on those source
files.

------------------------------------------------------------------------

## RESULT

The Java lab programs are organized into individual program folders,
with source files and supporting practical notes. The repository
demonstrates core Java programming concepts, object-oriented
programming, exception handling, multithreading, and Swing-based GUI
development.
