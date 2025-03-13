# Project-Expense-Tracker

## Description
**Project-Expense-Tracker** is a simple command-line application for tracking personal expenses. Users can add, update, delete, list, and summarize their expenses. The application stores expenses in a JSON file, but the JSON file is not loaded back into the program.

## Features
- Add expenses with a description and amount.
- Delete expenses by ID.
- Update an expense's description and amount.
- List all expenses.
- Summarize all expenses or summarize by month.
- Saves and loads expenses from a JSON file.

## Prerequisites
- Java 8 or later

## Installation
1. Clone the repository (if using Git):

    ```bash
    git clone https://github.com/fa635/Project-Task-Tracker.git
    cd Project-Task-Tracker
    ```

2. Compile the project:

    ```bash
    javac *.java
    ```

3. **No additional libraries** are required as the project uses basic Java functionalities (file I/O and collections).

## Usage
After compiling, you can run the program with the following commands:

### Add a New Expense
```bash
java Main add "Groceries" 50.00
```
### Delete an Expense
```bash
java Main delete 1
```
### Update an Expense's Description or Amount
```bash
java Main update 1 "Updated Description" 75.00
```

### List All Expenses
```bash
java Main all
```

### Summarize All Expenses
```bash
java Main summery
```

### Summarize Expenses by Month
```bash
java Main summeryM 3
```

## Notes
- The `expenses.json` file is automatically created and used to store expenses.

## Future Enhancements
- Implement filtering expenses by date.
- Add support for categories or priorities of expenses.
- Improve command-line interaction with better user feedback.

## License
This project is open-source and free to use.