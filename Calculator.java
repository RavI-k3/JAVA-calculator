import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton addButton, subtractButton, multiplyButton, divideButton, equalsButton, clearButton;

    Font font = new Font("Arial", Font.BOLD, 20);

    double number1, number2, result;
    char operation;

    public Calculator() {
        createGUI();
    }

    public void createGUI() {
        frame = new JFrame("Calculator");
        frame.setSize(300, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField();
        textField.setBounds(20, 20, 260, 40);
        textField.setFont(font);
        frame.add(textField);

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(font);
        }

        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        equalsButton = new JButton("=");
        clearButton = new JButton("C");

        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        equalsButton.addActionListener(this);
        clearButton.addActionListener(this);

        addButton.setFont(font);
        subtractButton.setFont(font);
        multiplyButton.setFont(font);
        divideButton.setFont(font);
        equalsButton.setFont(font);
        clearButton.setFont(font);

        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(multiplyButton);
        frame.add(divideButton);
        frame.add(equalsButton);
        frame.add(clearButton);

        frame.add(numberButtons[0]);
        frame.add(numberButtons[1]);
        frame.add(numberButtons[2]);
        frame.add(numberButtons[3]);
        frame.add(numberButtons[4]);
        frame.add(numberButtons[5]);
        frame.add(numberButtons[6]);
        frame.add(numberButtons[7]);
        frame.add(numberButtons[8]);
        frame.add(numberButtons[9]);

        addButton.setBounds(20, 70, 50, 50);
        subtractButton.setBounds(80, 70, 50, 50);
        multiplyButton.setBounds(140, 70, 50, 50);
        divideButton.setBounds(200, 70, 50, 50);
        equalsButton.setBounds(260, 70, 50, 50);
        clearButton.setBounds(260, 130, 50, 50);

        numberButtons[7].setBounds(20, 130, 50, 50);
        numberButtons[8].setBounds(80, 130, 50, 50);
        numberButtons[9].setBounds(140, 130, 50, 50);
        numberButtons[4].setBounds(20, 190, 50, 50);
        numberButtons[5].setBounds(80, 190, 50, 50);
        numberButtons[6].setBounds(140, 190, 50, 50);
        numberButtons[1].setBounds(20, 250, 50, 50);
        numberButtons[2].setBounds(80, 250, 50, 50);
        numberButtons[3].setBounds(140, 250, 50, 50);
        numberButtons[0].setBounds(20, 310, 50, 50);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText() + i);
            }
        }

        if (e.getSource() == addButton) {
            number1 = Double.parseDouble(textField.getText());
            operation = '+';
            textField.setText("");
        }

        if (e.getSource() == subtractButton) {
            number1 = Double.parseDouble(textField.getText());
            operation = '-';
            textField.setText("");
        }

        if (e.getSource() == multiplyButton) {
            number1 = Double.parseDouble(textField.getText());
            operation = '*';
            textField.setText("");
        }

        if (e.getSource() == divideButton) {
            number1 = Double.parseDouble(textField.getText());
            operation = '/';
            textField.setText("");
        }

        if (e.getSource() == equalsButton) {
            number2 = Double.parseDouble(textField.getText());
            switch (operation) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                case '/':
                    result = number1 / number2;
                    break;
            }
            textField.setText(String.valueOf(result));
        }

        if (e.getSource() == clearButton) {
            textField.setText("");
        }
    }

    public static void main(String[]args) {
        new Calculator();
    }
}