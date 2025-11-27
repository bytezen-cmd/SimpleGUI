import javax.swing.*;

void main() {
    JFrame frame = new JFrame("My First GUI");
    frame.setSize(300, 150);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);

    JTextField textField = new JTextField();
    textField.setBounds(20,20,150,25);

    JButton button = new JButton("Click Me!");
    button.setBounds(180,20,90,25);

    JLabel label = new JLabel("Hello!");
    label.setBounds(20,60,250,25);

    frame.add(label);
    frame.add(button);
    frame.add(textField);

    button.addActionListener(_ -> {
        String name = textField.getText();
        label.setText("Hello, " + name + "!");
    });

    frame.setVisible(true);

}
