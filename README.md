# Calculator Program

A simple Java-based calculator application designed to perform various mathematical operations. The program consists of three main components:

## Components

### `Main.java`
The entry point for the program that displays the menu and navigates user inputs to the appropriate operations.

### `UserInput.java`
Handles user input, including taking numbers or arrays for various operations.

### `Calculator.java`
Contains the logic for all mathematical operations such as addition, subtraction, multiplication, division, Fibonacci sequence generation, and array-related calculations.

---

## Features

This calculator can perform the following operations:

- **Addition**: Adds two numbers and displays the result.
- **Subtraction**: Subtracts one number from another.
- **Multiplication**: Multiplies two numbers.
- **Division**: Divides one number by another (handles division by zero gracefully).
- **Fibonacci**: Generates the Fibonacci sequence up to the specified number of terms.
- **Sum of Array**: Calculates the sum of elements in a user-provided array.
- **Mean of Array**: Computes the mean (average) of elements in a user-provided array.

---

## Code Structure

### Class and Method Details

#### `Main.java`
- Displays the menu and handles the control flow using the user's choice.

#### `UserInput.java`
- Contains helper methods like:
  - `getNumberInput(String prompt)`: Takes a single number input.
  - `getArrayInput(String prompt, int size)`: Takes input for an array of numbers.

#### `Calculator.java`
- Core logic for all calculations, including:
  - `addition()`
  - `subtraction()`
  - `multiplication()`
  - `division()`
  - `fibonacci()`
  - `sumOfArray()`
  - `meanOfArray()`

---

## Naming Conventions

- **Class Names**: Use CamelCase (e.g., `Main`, `UserInput`, `Calculator`).
- **Method Names**: Use camelCase (e.g., `addition()`, `meanOfArray()`).

---
