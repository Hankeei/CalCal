# Calorie Calculator

I built this Java command-line calorie calculator in 2023 for my Introduction to Programming course.

The program lets you enter your personal information, log food and quantities from five built-in food categories, and review or clear your entries. It calculates BMI, basal metabolic rate (BMR), and estimated total daily energy expenditure (TDEE), then shows how your logged calories compare with your estimated daily needs. Entries are kept in memory for the current session.

## Run locally

From the repository root, with a JDK installed:

```sh
javac -encoding UTF-8 -d out src/*.java src/fooddata/*.java
java -cp out Main
```
