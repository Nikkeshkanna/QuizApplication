# 🧠 Java Swing Quiz Application

A desktop-based **Quiz Application** developed using **Java Swing**. The application provides an interactive graphical interface for answering multiple-choice questions, automatically validates answers, tracks the score, and displays the final result.

---

## 📌 Overview

The **Java Swing Quiz Application** is a lightweight desktop application built to demonstrate **Java GUI development, event-driven programming, and core Object-Oriented Programming concepts**.

The application presents questions one at a time and allows users to select an answer using radio buttons. After clicking **Next**, the selected answer is validated and the score is updated automatically.

### ✨ Key Highlights

* 🎯 Multiple-choice quiz questions
* 🖥️ Interactive Java Swing GUI
* 🔘 Single-answer selection using radio buttons
* ✅ Automatic answer validation
* 📊 Real-time score tracking
* ➡️ Question-by-question navigation
* 🏆 Final score calculation
* 🧩 Easy-to-maintain question structure
* 🚀 Simple architecture that can be extended easily

---

## 🛠️ Technologies Used

| Technology       | Purpose                      |
| ---------------- | ---------------------------- |
| **Java**         | Core application development |
| **Java Swing**   | Graphical User Interface     |
| **AWT**          | Event handling               |
| **JFrame**       | Main application window      |
| **JLabel**       | Question display             |
| **JRadioButton** | Answer selection             |
| **ButtonGroup**  | Single-option selection      |
| **JButton**      | Question navigation          |
| **JOptionPane**  | Final result display         |

---

## 📂 Project Structure

```text
Java-Swing-Quiz-Application/
│
├── QuizApplication.java
└── README.md
```

---

## 🎮 How the Application Works

The application stores questions, options, and correct answers inside a two-dimensional `String` array.

Each question follows this structure:

```text
Index 0 → Question
Index 1 → Option 1
Index 2 → Option 2
Index 3 → Option 3
Index 4 → Option 4
Index 5 → Correct Answer
```

### Example

```java
{
    "Which language is platform independent?",
    "C",
    "C++",
    "Java",
    "Python",
    "Java"
}
```

When the application starts:

1. The first question is displayed.
2. The user selects one option.
3. The user clicks **Next**.
4. The application checks the selected answer.
5. The score is increased if the answer is correct.
6. The next question is displayed.
7. After the final question, the total score is shown.

---

## 🔄 Application Flow

```text
                  ┌────────────────────┐
                  │  Start Application  │
                  └──────────┬─────────┘
                             │
                             ▼
                  ┌────────────────────┐
                  │  Display Question  │
                  └──────────┬─────────┘
                             │
                             ▼
                  ┌────────────────────┐
                  │   Select Answer    │
                  └──────────┬─────────┘
                             │
                             ▼
                  ┌────────────────────┐
                  │   Click "Next"     │
                  └──────────┬─────────┘
                             │
                             ▼
                  ┌────────────────────┐
                  │  Validate Answer   │
                  └──────────┬─────────┘
                             │
                             ▼
                  ┌────────────────────┐
                  │    Update Score    │
                  └──────────┬─────────┘
                             │
                             ▼
                       More Questions?
                       /             \
                     Yes              No
                      │                │
                      ▼                ▼
              Next Question       Final Score
```

---

## 🧩 Core Implementation

### 1. Displaying Questions

The `setData()` method loads the current question and its four options into the GUI.

```java
void setData() {
    label.setText("Q" + (current + 1) + ": " + questions[current][0]);

    rb1.setText(questions[current][1]);
    rb2.setText(questions[current][2]);
    rb3.setText(questions[current][3]);
    rb4.setText(questions[current][4]);

    bg.clearSelection();
}
```

---

### 2. Answer Validation

The `checkAnswer()` method identifies the selected radio button and compares it with the correct answer.

```java
boolean checkAnswer() {
    String ans = "";

    if (rb1.isSelected()) ans = rb1.getText();
    if (rb2.isSelected()) ans = rb2.getText();
    if (rb3.isSelected()) ans = rb3.getText();
    if (rb4.isSelected()) ans = rb4.getText();

    return ans.equals(questions[current][5]);
}
```

---

### 3. Score Calculation

The score is increased whenever the selected answer is correct.

```java
if (checkAnswer())
    count++;
```

After completing all questions, the application displays the final score:

```java
JOptionPane.showMessageDialog(
    this,
    "Quiz Completed!\nScore: " + count + "/" + questions.length
);
```

---

## 📋 Sample Questions

The current version contains questions related to **Java and Object-Oriented Programming**.

|  # | Question                                          | Correct Answer |
| -: | ------------------------------------------------- | -------------- |
|  1 | Which language is platform independent?           | Java           |
|  2 | Which keyword is used to inherit a class in Java? | extends        |
|  3 | Which of the following is not an OOP concept?     | Recursion      |

---

## 🧠 Java Concepts Demonstrated

This project provides practical implementation of several Java concepts.

### `JFrame`

Used to create the main application window.

```java
public class QuizApplication extends JFrame
```

### `JRadioButton`

Used for displaying multiple-choice answers.

```java
JRadioButton rb1, rb2, rb3, rb4;
```

### `ButtonGroup`

Ensures that only one answer can be selected at a time.

```java
ButtonGroup bg = new ButtonGroup();

bg.add(rb1);
bg.add(rb2);
bg.add(rb3);
bg.add(rb4);
```

### `ActionListener`

Handles the **Next** button event.

```java
btnNext.addActionListener(this);
```

### `JOptionPane`

Displays the final quiz result.

```java
JOptionPane.showMessageDialog(
    this,
    "Quiz Completed!\nScore: " + count + "/" + questions.length
);
```

---

## 🚀 Getting Started

### Prerequisites

Make sure **Java JDK** is installed on your system.

Check your Java installation:

```bash
java -version
```

You should also have a Java compiler available:

```bash
javac -version
```

---

### Clone the Repository

```bash
git clone https://github.com/your-username/Java-Swing-Quiz-Application.git
```

### Navigate to the Project

```bash
cd Java-Swing-Quiz-Application
```

### Compile the Application

```bash
javac QuizApplication.java
```

### Run the Application

```bash
java QuizApplication
```

---

## 🖥️ Application Preview

> Add screenshots or a GIF of your application here to make the GitHub repository more attractive.

```text
📸 Screenshot 1 — Quiz Interface
📸 Screenshot 2 — Answer Selection
📸 Screenshot 3 — Final Score
```

For example:

```markdown
![Quiz Application](screenshots/quiz-interface.png)
```

---

## 🔮 Future Enhancements

The current application can be extended into a more complete quiz platform.

### Planned Features

* [ ] ⏱️ Timer for each question
* [ ] 🔀 Randomized questions
* [ ] 📝 Larger question bank
* [ ] 📚 Multiple quiz categories
* [ ] 🎯 Difficulty levels
* [ ] 🔄 Restart quiz functionality
* [ ] 📊 Detailed score analysis
* [ ] 🏆 Leaderboard
* [ ] 👤 User registration and login
* [ ] 💾 Database integration using JDBC
* [ ] 📈 Score history
* [ ] 🎨 Modernized user interface
* [ ] 🔐 Persistent user data

---

## 📚 Learning Outcomes

Through this project, the following concepts were practiced:

* Java Swing GUI development
* Event-driven programming
* Action listeners
* Object-Oriented Programming
* Java arrays
* Methods and class design
* Conditional statements
* GUI component management
* State management
* Basic desktop application development

---

## 📈 Possible Improvements

The application currently uses a simple two-dimensional array for storing questions.

For a larger application, the architecture could be improved by introducing:

```text
Question Model
      ↓
Question Service
      ↓
Quiz Controller
      ↓
Swing UI
      ↓
Database
```

This would make the application easier to maintain and scale.

---

## 👨‍💻 Author

### Nikkeshkanna C V

**Computer Science & Engineering Student**

Java Developer | Full Stack Development Enthusiast | Problem Solver

Interested in:

* Java
* Data Structures & Algorithms
* Full Stack Development
* Software Engineering
* Application Development

---

## ⭐ Support

If you found this project useful or interesting, consider giving the repository a ⭐ on GitHub.

Your feedback and suggestions are always welcome!

---

## 📄 License

This project is developed for **educational and learning purposes**.

---

<p align="center">
  Built with ☕ Java & ❤️ by <strong>Nikkeshkanna C V</strong>
</p>
