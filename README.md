# Calorie Calculator

I built this Java command-line project in 2023 for my Introduction to Programming course. It was an early exercise in using loops, switch statements, console input, and separate classes for the interface and program logic.

The program displays an ASCII-art title and an interactive menu. I started a form for entering height, weight, gender, and activity level. Food logging, reviewing entries, and calculating calories were planned features. The personal-data form has input and validation bugs in this snapshot.

## Run locally

From the repository root, with a JDK installed:

```sh
javac -d out src/calcal_project/Main.java src/calcal_project/TextGui.java
java -cp out calcal_project.Main
```
