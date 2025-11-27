# SimpleGUI

A simple Java GUI application built with Swing that demonstrates basic graphical user interface creation.

## Overview

SimpleGUI is a beginner-friendly project showcasing fundamental Swing components and event handling. The application features a text input field, a button, and a label that updates based on user input.

## Features

- **Text Input Field**: Users can enter their name
- **Interactive Button**: Clicking the button triggers an action
- **Dynamic Label**: Displays personalized greetings based on input
- **Simple Layout**: Demonstrates basic component positioning with absolute layout

## Requirements

- Java Development Kit (JDK) 25 or higher
- No external dependencies (uses Java's built-in Swing library)

## Project Structure

```
SimpleGUI/
├── src/
│   └── Main.java          # Main application file
├── .gitignore             # Git ignore configuration
├── LICENSE.txt            # MIT License
├── README.md              # This file
└── SimpleGUI.iml          # IntelliJ IDEA module configuration
```

## Getting Started

### Compilation

To compile the project:

```bash
javac src/Main.java
```

### Running the Application

To run the application:

```bash
java -cp src Main
```

A window titled "My First GUI" will appear with a text field, button, and greeting label.

## How to Use

1. Launch the application
2. Enter your name in the text field
3. Click the "Click Me!" button
4. The label will display a personalized greeting

## Code Overview

The application creates a Swing `JFrame` window containing three main components:

- **JTextField**: Accepts user input (name entry)
- **JButton**: Triggers the greeting action on click
- **JLabel**: Displays the greeting message

When the button is clicked, an action listener retrieves the text from the input field and updates the label with a personalized message.

## License

This project is licensed under the MIT License. See the LICENSE.txt file for details.

## Author

Himansh Mewada

## Future Enhancements

Potential improvements for this project:

- Use a layout manager (e.g., GridLayout, BorderLayout) instead of absolute positioning
- Add input validation
- Implement additional GUI components (checkboxes, radio buttons, etc.)
- Create a more sophisticated user interface with multiple windows
- Add keyboard shortcuts and tooltips