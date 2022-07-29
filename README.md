# Lox

Lox is a simple programming language.

This is the interpreter for the Lox language.

The code is basically learnt and copied from the book "Crafting Interpreters" by Robert Nystrom.

Upon fully understanding interpreter, it will become a modified version of Lox language.

# Reading Note

## Parts of a Language

A interpreter has the following part:

1. Scanning: Turning characters sequence into tokens 
2. Parsing: Build an **abstract syntax tree** from the tokens, as well as throwing error
3. Static Analysis: Bind the variable names to the variable itself, scope and type error are relevant
4. Intermediate representations: Yap, self explanatory
5. Optimization: Maintain the same semantics but more efficient
6.1 Code generation: Spit out the machine code
6.2 Virtual machine: a program that emulates a hypothetical chip that can run the code that you designed
7. Runtime: Garbage collector, things need to run while your program is running

## Lox

First let's get familiar with the features of Lox.

1. Dynamic typing
2. Automatic memory management
3. Data Types: Boolean, Number, String, Nil
4. Expression
5. Statement
6. Variable
7. Control Flow
8. Function
9. Class
10. Inheritance

## Scanning

