
# Ticketing Tool CLI 🚀

A simple command-line-based ticket queue management system written in Java. It simulates a basic IT support ticketing tool that can prioritize and process tickets.

---

## 📋 Features

- Add new tickets with or without priority
- View ticket queue (separated into priority and normal)
- Process next ticket in line (priority tickets go first)
- Update ticket status (`OPEN`, `IN_PROGRESS`, `RESOLVED`, etc.)
- Simple CLI interface with validation

---

## 💻 How to Run

1. Compile the Java files:
   ```bash
   javac Main.java TicketQueueManager.java Ticket.java

2.  Run the program:
 java Main

📦 Project Structure
.
├── Main.java
├── Ticket.java
├── TicketQueueManager.java
├── .gitignore
└── README.md

🛠 Technologies Used
Java 21

Git & GitHub (Version Control)

🙌 Future Improvements
Save tickets to a file or database

Add user authentication

Implement search/filter functionality

👨‍💻 Author
Made with ❤️ by @ravrranj