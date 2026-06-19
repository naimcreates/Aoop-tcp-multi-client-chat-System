# TCP Multi-Client Chat Application

A Java-based TCP Multi-Client Chat Application developed as part of the Advanced Object-Oriented Programming (AOOP) course.

This project demonstrates TCP socket communication, multithreading, object serialization, message broadcasting, and chat history management in a client-server architecture.

---

## Features

* Multiple client connections
* TCP socket communication
* Dedicated thread for each connected client
* Real-time message broadcasting
* Automatic client labeling (Client-1, Client-2, Client-3, ...)
* Chat history storage
* New clients receive previous chat history upon joining
* Object-based message transfer using serialization

---

## Technologies Used

* Java
* TCP Socket Programming
* Multithreading
* Object Serialization
* ArrayList
* Client-Server Architecture

---

## Project Structure

```text
TCPassignment/

├── Server.java
├── Client.java
├── ClientHandler.java
├── ClientReader.java
├── NetworkUtil.java
└── Data.java
```

---

## System Workflow

1. The server starts and listens for incoming client connections.
2. Each newly connected client receives a unique label.
3. Clients send messages to the server using serialized Data objects.
4. The server stores messages in chat history.
5. The server broadcasts messages to all other connected clients.
6. When a new client joins, previous messages are automatically delivered from history.

---

## Example

```text
Client-1: Hello Everyone
Client-2: Hi
Client-3: Good Morning
```

When Client-4 joins:

```text
Client-1: Hello Everyone
Client-2: Hi
Client-3: Good Morning
```

The new client immediately receives the previous conversation history.

---

## Learning Outcomes

This project helped practice:

* TCP Socket Programming
* Client-Server Communication
* Java Threads
* Concurrent Client Handling
* Object Serialization
* Broadcast Messaging
* Network Programming Fundamentals

---

## Author

Nasir Khan Naim

Department of Computer Science and Engineering (CSE)

United International University (UIU)

Bangladesh
