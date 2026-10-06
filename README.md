# 🧠 Java Swing Quiz Application

A simple **Quiz Application built using Java Swing**.
The application displays multiple-choice questions, allows users to select an answer, and calculates the final score after completing the quiz.

## 📌 Features

* 🎯 Multiple-choice quiz questions
* ☕ Built using Java Swing
* 🖥️ Simple graphical user interface
* ✅ Automatic answer validation
* 📊 Final score calculation
* 🔘 Radio buttons for answer selection
* ➡️ Next button to navigate between questions
* 🚫 Prevents multiple answer selection using `ButtonGroup`

## 🛠️ Technologies Used

* **Java**
* **Java Swing**
* **AWT Event Handling**
* **JFrame**
* **JRadioButton**
* **JButton**
* **JLabel**
* **ButtonGroup**
* **JOptionPane**

## 📂 Project Structure

```text
QuizApplication/
│
├── QuizApplication.java
└── README.md
```

## 🎮 How It Works

The application stores questions and answers inside a two-dimensional `String` array.

Each question contains:

```text
Question
Option 1
Option 2
Option 3
Option 4
Correct Answer
```

For example:

```java
{"Which language is platform independent?",
 "C",
 "C++",
 "Java",
 "Python",
 "Java"}
```

The application displays one question at a time.

When the user selects an option and clicks **Next**:

1. The selected answer is checked.
2. If the answer is correct, the score is increased.
3. The next question is displayed.
4. After the last question, the final score is displayed.

## 🖥️ Application Flow

```text
Start Application
       ↓
Display Question
       ↓
Select Answer
       ↓
Click "Next"
       ↓
Check Answer
       ↓
Update Score
       ↓
More Questions?
   ↙           ↘
 Yes            No
 ↓              ↓
Next Question   Show Final Score
```

## 🚀 How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/QuizApplication.git
```

### 2. Open the Project

Open the project in any Java IDE such as:

* IntelliJ IDEA
* Eclipse
* VS Code
* NetBeans

### 3. Compile the Program

```bash
javac QuizApplication.java
```

### 4. Run the Application

```bash
java QuizApplication
```

## 📋 Sample Questions

The current application contains questions related to Java and Object-Oriented Programming.

| # | Question                                          | Correct Answer |
| - | ------------------------------------------------- | -------------- |
| 1 | Which language is platform independent?           | Java           |
| 2 | Which keyword is used to inherit a class in Java? | extends        |
| 3 | Which of the following is not OOP concept?        | Recursion      |

## 🧩 Important Java Concepts Used

### `JFrame`

Used to create the main application window.

```java
public class QuizApplication extends JFrame
```

### `JRadioButton`

Used to display multiple-choice options.

```java
JRadioButton rb1, rb2, rb3, rb4;
```

### `ButtonGroup`

Ensures that only one option can be selected at a time.

```java
ButtonGroup bg = new ButtonGroup();

bg.add(rb1);
bg.add(rb2);
bg.add(rb3);
bg.add(rb4);
```

### `ActionListener`

Used to handle the **Next** button click.

```java
btnNext.addActionListener(this);
```

### `JOptionPane`

Used to display the final score.

```java
JOptionPane.showMessageDialog(
    this,
    "Quiz Completed!\nScore: " + count + "/" + questions.length
);
```

## 🔮 Future Improvements

The project can be extended with:

* ⏱️ Timer for each question
* 📝 More quiz questions
* 🏆 Different difficulty levels
* 📚 Different categories
* 🔀 Randomized questions
* 🎨 Improved UI design
* 📈 Score history
* 🔄 Restart quiz option
* 🏅 Leaderboard
* 💾 Database integration
* 👤 User login and registration

## 👨‍💻 Author

**Nikkeshkanna C V**

Computer Science & Engineering Student
Interested in **Java, Data Structures, Full Stack Development, and Software Engineering**.

## ⭐ Support

If you found this project useful, consider giving the repository a ⭐ on GitHub.

---

### 📄 License

This project is created for **learning and educational purposes**.
