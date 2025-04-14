# Custom Data Structures in Java

## Overview

This project demonstrates custom implementations of basic data structures in Java **without using `java.util.*`**, except for `Iterator`.

Implemented structures:
- `MyArrayList` – dynamic array
- `MyLinkedList` – singly linked list
- `MyStack` – stack based on `MyArrayList`
- `MyQueue` – queue (optional for now)
- `MyMinHeap` – min-heap (optional for now)

All structures are built on top of a base interface `MyList<T>`, which defines the core operations.

## Features

- Custom `add`, `remove`, `get`, `set`, `size`, and `clear` methods
- Full compatibility with generics (e.g., `MyArrayList<Integer>`, `MyLinkedList<String>`)
- Stack operations: `push`, `pop`, `peek`
- Clean and optimized `Main.java` to demonstrate usage

## Usage

To run the project:

```bash
javac Main.java
java Main
