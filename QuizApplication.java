import javax.swing.*;
import java.awt.event.*;

public class QuizApplication extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton rb1, rb2, rb3, rb4;
    JButton btnNext;
    ButtonGroup bg;
    int count = 0, current = 0;
    Timer timer;

    String questions[][] = {
            {"Which language is platform independent?", "C", "C++", "Java", "Python", "Java"},
            {"Which keyword is used to inherit a class in Java?", "super", "this", "extends", "implements", "extends"},
            {"Which of the following is not OOP concept?", "Inheritance", "Polymorphism", "Encapsulation", "Recursion", "Recursion"}
    };

    QuizApplication() {
        label = new JLabel();
        label.setBounds(30, 40, 450, 20);
        add(label);

        rb1 = new JRadioButton();
        rb1.setBounds(50, 80, 200, 20);
        rb2 = new JRadioButton();
        rb2.setBounds(50, 110, 200, 20);
        rb3 = new JRadioButton();
        rb3.setBounds(50, 140, 200, 20);
        rb4 = new JRadioButton();
        rb4.setBounds(50, 170, 200, 20);

        bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        bg.add(rb4);

        add(rb1);
        add(rb2);
        add(rb3);
        add(rb4);

        btnNext = new JButton("Next");
        btnNext.setBounds(100, 240, 100, 30);
        btnNext.addActionListener(this);
        add(btnNext);

        setData();

        setSize(600, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    void setData() {
        label.setText("Q" + (current + 1) + ": " + questions[current][0]);
        rb1.setText(questions[current][1]);
        rb2.setText(questions[current][2]);
        rb3.setText(questions[current][3]);
        rb4.setText(questions[current][4]);
        bg.clearSelection();
    }

    public void actionPerformed(ActionEvent e) {
        if (checkAnswer())
            count++;
        current++;
        if (current < questions.length) {
            setData();
        } else {
            JOptionPane.showMessageDialog(this, "Quiz Completed!\nScore: " + count + "/" + questions.length);
            System.exit(0);
        }
    }

    boolean checkAnswer() {
        String ans = "";
        if (rb1.isSelected()) ans = rb1.getText();
        if (rb2.isSelected()) ans = rb2.getText();
        if (rb3.isSelected()) ans = rb3.getText();
        if (rb4.isSelected()) ans = rb4.getText();
        return ans.equals(questions[current][5]);
    }

    public static void main(String args[]) {
        new QuizApplication();
    }
}
