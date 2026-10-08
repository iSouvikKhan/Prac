# Prac

A small Java practice project for data structures and algorithms, set up as an Eclipse project (Java 20 compliance).

## Contents

- `src/DSA/Binary_Tree.java` - Builds a sample binary tree (3, 9, 20, 15, 7), prints its inorder traversal and its height. Also contains a `Node` class, a `BinaryTree` class, and a static `maxDepth` helper.
- `src/DSA/BST.java` - Placeholder for a binary search tree exercise; its `main` method is currently empty.

## Prerequisites

- JDK 20 or later

## How to run

Open the folder in Eclipse as an existing project and run `Binary_Tree`, or use the command line from the repository root:

```bash
javac -d bin src/DSA/*.java
java -cp bin DSA.Binary_Tree
```

Expected output:

```
The Inorder traversal of given binary tree is - 
9 3 15 20 7 
Height: 3
```
