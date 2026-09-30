# ☕ Java DSA

A curated collection of foundational Java programs and introductory Data Structures & Algorithms (DSA) exercises. This repository covers essential programming constructs, digit manipulation, number theory, and console input handling to build a strong algorithmic foundation.

[![Java](https://img.shields.io/badge/Java-11%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)](LICENSE)

---

## ✨ Features

- **Core Syntax & Control Flow**: Demonstrations of conditionals, multi-way branching, and `for`, `while`, and `do-while` loops.
- **Number Theory & Mathematics**: Primality testing with $O(\sqrt{n})$ factor search and iterative Fibonacci sequence generation.
- **Digit Manipulation Algorithms**: Counting digits, extracting individual digits, reversing digits, and calculating positional digit inverses.
- **I/O & Scanner Patterns**: Standard console input handling with common pitfalls (such as newline consumption after `nextInt()`).
- **Pattern Printing**: Geometric pattern rendering using string manipulation.

---

## 📁 Repository Structure

```text
Java-DSA/
├── Comparision.java       # Conditional branching and grading logic
├── DigitsOfNumber.java    # Digit extraction from left to right
├── FirstNFibonachi.java   # Fibonacci sequence generation up to N terms
├── FirstProgram.java      # Basic console input and output
├── inverseofnum.java      # Positional inverse of a number
├── loops.java             # Demonstration of for, while, and do-while loops
├── NofDigits.java         # Count total digits in an integer
├── Primecheck.java        # Primality testing using square root factor check
├── Printz.java            # ASCII 'Z' pattern generation
├── reverseofNum.java      # Reverses integer digits via modulo arithmetic
├── ScanningIssues.java    # Scanner buffer behavior and newline handling
├── LICENSE                # MIT License
└── README.md              # Project documentation
```

---

## 🚀 Getting Started

### Prerequisites

- **Java Development Kit (JDK)**: Version 11 or higher installed ([Download JDK](https://www.oracle.com/java/technologies/downloads/))
- **Git**: Installed on your system

Check your Java version:
```bash
java -version
javac -version
```

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/Joeljozzz/Java-DSA.git
   ```
2. Navigate to the repository directory:
   ```bash
   cd Java-DSA
   ```

---

## 💻 Usage

Each file contains a standalone `main` method and can be compiled and executed individually.

### Option 1: Direct Execution (Java 11+)
Single-file source code programs can be executed directly without manually generating `.class` files:
```bash
java Primecheck.java
```

### Option 2: Compile and Run
Alternatively, compile using `javac` and run the bytecode:
```bash
javac Primecheck.java
java Primecheck
```

---

## 📝 Problem Summary

| File | Description | Concepts Covered |
| :--- | :--- | :--- |
| [`FirstProgram.java`](FirstProgram.java) | Interactive greeting program | Standard I/O, `Scanner.nextLine()` |
| [`Comparision.java`](Comparision.java) | Grade classification | If-else conditional ladders |
| [`loops.java`](loops.java) | Loop comparisons | `for`, `while`, and `do-while` constructs |
| [`Primecheck.java`](Primecheck.java) | Checks if input numbers are prime | Primality testing, loop optimization |
| [`FirstNFibonachi.java`](FirstNFibonachi.java) | Prints first $N$ Fibonacci numbers | Iterative sequence generation |
| [`DigitsOfNumber.java`](DigitsOfNumber.java) | Prints digits from left to right | Integer arithmetic, powers of 10 |
| [`NofDigits.java`](NofDigits.java) | Counts number of digits | Iterative division by 10 |
| [`reverseofNum.java`](reverseofNum.java) | Reverses digits of an integer | Modulo arithmetic (`% 10`, `/ 10`) |
| [`inverseofnum.java`](inverseofnum.java) | Computes positional digit inverse | Index & value mapping with Math power |
| [`Printz.java`](Printz.java) | Prints a 'Z' pattern to console | String repetition (`String.repeat`) |
| [`ScanningIssues.java`](ScanningIssues.java) | Illustrates Scanner buffer quirks | Buffer flushing, token vs line reading |

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
