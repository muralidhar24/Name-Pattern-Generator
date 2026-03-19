# 🔤 NamePattern — ASCII Letter Renderer in Java

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java" alt="Java"/>
  <img src="https://img.shields.io/badge/Type-Console%20App-blue?style=for-the-badge" alt="Console"/>
  <img src="https://img.shields.io/badge/Letters-A--Z-green?style=for-the-badge" alt="A-Z"/>
  <img src="https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge" alt="MIT"/>
</p>

<p align="center">
  A Java console application that renders any name as large ASCII art letters made of <code>*</code> characters — fully customizable in size.
</p>

---

## 📸 Preview

```
Enter name: HI
Enter size: 9

*       *   * * * * *
*       *       *    
*       *       *    
*       *       *    
* * * * *       *    
*       *       *    
*       *       *    
*       *       *    
*       *   * * * * *
```

---

## ✨ Features

- Renders **all 26 letters (A–Z)** as ASCII art patterns using `*` characters
- Accepts **any name or word** as input (automatically converted to uppercase)
- **Adjustable size** — control the grid dimensions for each letter
- Pure Java — **no external dependencies**
- Clean switch-case dispatch for each letter

---

## 🚀 Getting Started

### Prerequisites

- Java JDK 8 or higher
- A terminal / command prompt

### Installation

```bash
# Clone the repository
git clone https://github.com/your-username/NamePattern.git

# Navigate into the project directory
cd NamePattern
```

### Compile

```bash
javac NamePattern.java
```

### Run

```bash
java NamePattern
```

---

## 🖥️ Usage

Once the program is running, you will be prompted for two inputs:

```
enter name: JAVA
enter size: 9
```

| Input  | Description                                               | Example  |
|--------|-----------------------------------------------------------|----------|
| `name` | Any word or name (letters only, case-insensitive)         | `JAVA`   |
| `size` | Odd integer recommended for symmetry (e.g., 7, 9, 11)    | `9`      |

The program will then print each letter in the name, one by one, as an ASCII art block.

> **Tip:** Use an **odd number** for `size` (e.g., 7, 9, 11) to ensure letters with a midpoint (like B, E, H) render symmetrically.

---

## 📂 Project Structure

```
NamePattern/
│
├── NamePattern.java      # Main source file containing all letter methods
└── README.md             # Project documentation
```

### Code Architecture

| Component      | Description                                               |
|----------------|-----------------------------------------------------------|
| `A(int n)` – `Z(int n)` | Individual static methods, one per letter, each printing an `n×n` ASCII art grid |
| `main()`       | Reads user input, converts to uppercase, and dispatches each character via a `switch` statement |

Each letter method uses nested `for` loops over an `n × n` grid and prints `* ` or `  ` based on geometric conditions (row/column indices).

---

## 🔤 Supported Letters

All 26 letters of the English alphabet are supported:

| | | | | | |
|---|---|---|---|---|---|
| `A` | `B` | `C` | `D` | `E` | `F` |
| `G` | `H` | `I` | `J` | `K` | `L` |
| `M` | `N` | `O` | `P` | `Q` | `R` |
| `S` | `T` | `U` | `V` | `W` | `X` |
| `Y` | `Z` | | | | |

---

## 🧠 How It Works

Each letter is drawn on an `n × n` character grid. The method for each letter evaluates a **boolean condition** for every cell `(i, j)` to decide whether to print a `*` or a blank space.

**Example — Letter `H`:**
```java
// Prints * on the left column, right column, and middle row
if (i == (n/2)+1 || j == 1 || j == n)
    System.out.print("* ");
else
    System.out.print("  ");
```

This approach makes each letter a pure mathematical shape defined by simple row/column rules.

---

## 🤝 Contributing

Contributions are welcome! Here are some ideas to improve the project:

- [ ] Add support for **digits (0–9)**
- [ ] Add support for **spaces between letters**
- [ ] Export output to a **text file**
- [ ] Create a **GUI version** using Java Swing
- [ ] Improve letter accuracy for better visual fidelity

To contribute:

```bash
# Fork the repo, then:
git checkout -b feature/your-feature-name
git commit -m "Add your feature"
git push origin feature/your-feature-name
# Open a Pull Request
```

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

---

## 👤 Author

**Your Name**  
GitHub: [@your-username](https://github.com/your-username)

---

<p align="center">Made with ☕ Java — one <code>*</code> at a time.</p>
