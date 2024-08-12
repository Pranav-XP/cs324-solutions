
---

# Observer Pattern Demo

## Introduction
This project demonstrates the use of the Observer Design Pattern in Java. The Observer Pattern is a behavioral design pattern in which an object, known as the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes. This pattern is particularly useful for implementing distributed systems where changes in one component need to be reflected across multiple components.

## Project Structure

- **`myObserver` Interface**: Defines the `update()` method that observers must implement.
- **`mySubject` Class**: Manages a list of observers and includes methods to add, remove, and notify observers of changes.
- **`number` Class**: Extends `mySubject` and represents the state being observed. This class has methods to get and set an integer value. When the value is changed, it triggers notification to all observers.
- **`HexNumber` Class**: Implements the `myObserver` interface to observe the `number` class. Converts the observed number into a hexadecimal string and displays it when notified of a change.
- **`BinNumber` Class**: Implements the `myObserver` interface to observe the `number` class. Converts the observed number into a binary string and displays it when notified of a change.
- **`ObserverDemo` Class**: The main program that demonstrates the functionality of the Observer Pattern. It continuously prompts the user for a number, updates the `number` class, and displays the hexadecimal and binary representations of the number.

### Visual Representation:
Here’s how the UML diagram would look:

```
+-----------------+      +-------------------+
| <<Interface>>   |      |   mySubject        |
|   myObserver    |<-----|-------------------|
|-----------------|      | - observers       |
| + update() : void|     | + addObserver(o)   |
+-----------------+      | + removeObserver(o)|
                         | + notifyObservers()|
                         +-------------------+
                                 ^
                                 |
                                 |
                         +---------------+
                         |   number       |
                         |---------------|
                         | - value : int  |
                         | + getValue()   |
                         | + setValue(v)  |
                         +---------------+
                             ^    ^
                             |    |
            +----------------+    +---------------+
            |                                 |
    +---------------+              +---------------+
    |   HexNumber   |              |   BinNumber   |
    |---------------|              |---------------|
    | + update() : void|           | + update() : void|
    +---------------+              +---------------+

                 +---------------+
                 | ObserverDemo   |
                 |---------------|
                 | + main(args: String[])|
                 +---------------+
```

## Getting Started

### Prerequisites
- Java Development Kit (JDK) installed on your system.
- An Integrated Development Environment (IDE) like IntelliJ IDEA, Eclipse, or NetBeans.

### Running the Program
1. Clone or download the repository to your local machine.
2. Open the project in your preferred IDE.
3. Run the `ObserverDemo` class.
4. Enter integer values when prompted. The program will display the number in both hexadecimal and binary formats.
5. To exit the program, you can modify the code to include an exit condition or handle input exceptions as described below.

### Exception Handling
To handle incorrect inputs, such as non-integer values, an `InputMismatchException` is caught and handled. The program will prompt the user to enter a valid integer if invalid input is provided.

Example:
```java
while(true) {
    try {
        System.out.print("\nEnter a number: ");
        n.setValue(input.nextInt());
    } catch (InputMismatchException e) {
        System.out.println("Invalid input! Please enter a valid integer.");
        input.next(); // Clear the invalid input from the scanner buffer
    }
}
```

## Features
- **Observer Design Pattern**: Demonstrates a practical implementation of the Observer Pattern.
- **Real-time Updates**: Observers are notified immediately when the state of the subject changes.
- **Hexadecimal and Binary Conversion**: Displays the observed number in both hexadecimal and binary formats.

## Contributing
If you wish to contribute to this project, you can:
- Fork the repository.
- Create a new branch.
- Make your changes and commit them.
- Open a pull request with a description of your changes.

## License
This project is licensed under the MIT License. You are free to use, modify, and distribute this software in any manner.

## Acknowledgements
This project was created as part of the lab exercises for the CS 324 Distributed Systems course at the University of the South Pacific.

---
