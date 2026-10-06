# Java Swing Quiz Application

A desktop-based **Quiz Application** developed using **Java Swing**. The application provides a simple interactive interface for answering multiple-choice questions and automatically calculates the user's final score.

## Overview

The **Java Swing Quiz Application** is a lightweight desktop application designed to demonstrate core Java GUI development and event-driven programming.

Users can:

* View multiple-choice questions
* Select one answer from four options
* Navigate through questions using the **Next** button
* Receive immediate answer validation
* View their final score after completing the quiz

## Features

* Multiple-choice question interface
* Single-answer selection using radio buttons
* Automatic answer validation
* Real-time score tracking
* Question navigation
* Final score display
* Simple and responsive desktop UI
* Easy-to-extend question structure

## Tech Stack

| Technology       | Purpose                  |
| ---------------- | ------------------------ |
| **Java**         | Application development  |
| **Java Swing**   | Graphical User Interface |
| **AWT**          | Event handling           |
| **JFrame**       | Application window       |
| **JRadioButton** | Answer selection         |
| **ButtonGroup**  | Single-option selection  |
| **JButton**      | Navigation               |
| **JOptionPane**  | Result display           |

## Project Structure

```text
Java-Swing-Quiz-Application/
│
├── QuizApplication.java
└── README.md
```

## Application Architecture

The application follows a simple event-driven approach:

```text
                ┌──────────────────┐
                │  Start Application│
                └────────┬─────────┘
                         │
                         ▼
                ┌──────────────────┐
                │ Display Question │
                └────────┬─────────┘
                         │
                         ▼
                ┌──────────────────┐
                │ Select an Answer │
                └────────┬─────────┘
                         │
                         ▼
                ┌──────────────────┐
                │ Click "Next"     │
                └────────┬─────────┘
                         │
                         ▼
                ┌──────────────────┐
                │ Validate Answer  │
                └────────┬─────────┘
                         │
                         ▼
                ┌──────────────────┐
                │ Update Score     │
                └────────┬─────────┘
                         │
                  More Questions?
                    /          \
                  Yes           No
                   │             │
                   ▼             ▼
            Next Question    Final Score
```

## Question Data Structure

Questions and answers are maintained using a two-dimensional `String` array.

```java
String questions[][] = {
    {
        "Which language is platform independent?",
        "C",
        "C++",
        "Java",
        "Python",
        "Java"
    }
};
```

Each question contains:

```text
Index 0 → Question
Index 1 → Option 1
Index 2 → Option 2
Index 3 → Option 3
Index 4 → Option 4
Index 5 → Correct Answer
```

This structure makes it easy to add or modify quiz questions.

## Core Implementation

### Question Display

The `setData()` method loads the current question and its options into the GUI.

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

### Answer Validation

The `checkAnswer()` method compares the selected option with the correct answer.

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

### Score Calculation

The score is incremented whenever the selected answer is correct.

```java
if (checkAnswer())
    count++;
```

After all questions are completed, the final score is displayed.

```java
JOptionPane.showMessageDialog(
    this,
    "Quiz Completed!\nScore: " + count + "/" + questions.length
);
```

## Sample Quiz

The current version includes Java and Object-Oriented Programming questions.

| Question                                          | Correct Answer |
| ------------------------------------------------- | -------------- |
| Which language is platform independent?           | Java           |
| Which keyword is used to inherit a class in Java? | extends        |
| Which of the following is not an OOP concept?     | Recursion      |

## Getting Started

### Prerequisites

Make sure Java is installed on your system.

Verify the installation:

```bash
java -version
```

### Clone the Repository

```bash
git clone https://github.com/your-username/Java-Swing-Quiz-Application.git
```

### Navigate to the Project

```bash
cd Java-Swing-Quiz-Application
```

### Compile

```bash
javac QuizApplication.java
```

### Run

```bash
java QuizApplication
```

## Future Enhancements

The application can be further improved by adding:

* [ ] Timer-based questions
* [ ] Random question selection
* [ ] Multiple quiz categories
* [ ] Difficulty levels
* [ ] Question database integration
* [ ] User authentication
* [ ] Score history
* [ ] Leaderboard
* [ ] Restart quiz functionality
* [ ] Improved modern UI/UX
* [ ] Database integration using JDBC
* [ ] Persistent user results

## Learning Outcomes

This project demonstrates practical usage of:

* Java Swing GUI development
* Object-Oriented Programming
* Event-driven programming
* Action listeners
* GUI components
* Arrays and data management
* Conditional statements
* Methods and class design
* Basic application state management

## Author

**Nikkeshkanna C V**

Computer Science & Engineering Student
Java Developer | Full Stack Development Enthusiast

## License

This project is developed for **educational and learning purposes**.
