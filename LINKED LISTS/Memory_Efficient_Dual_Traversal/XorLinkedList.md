# Memory-Efficient Dual Traversal (XOR Linked List)

## Introduction

An **XOR Linked List** is a memory-efficient variation of a doubly linked list. Instead of storing separate **previous** and **next** pointers, each node stores the XOR of both addresses in a single field. This reduces the memory required for each node while still allowing traversal in both directions.

## How Traversal Works

During traversal, the address of the next node is calculated using the previous node's address and the XOR value stored in the current node.

**Formula**

```text
Next = Previous XOR Current->both
```

Similarly, to move backward:

```text
Previous = Next XOR Current->both
```

Since the previous node's address is already known during traversal, the next node's address can be computed efficiently.

## Advantages

* Uses only one pointer field instead of two.
* Reduces memory usage compared to a doubly linked list.
* Supports both forward and backward traversal.
* Suitable for memory-constrained systems.

## Disadvantages

* Difficult to understand and debug.
* Cannot be implemented directly in Java because Java does not provide access to raw memory addresses.
* Not compatible with automatic garbage collection.
* Pointer arithmetic makes maintenance more complex.

## Conclusion

An XOR Linked List is useful when memory optimization is more important than implementation simplicity. Although it saves memory, its complexity and lack of support in modern programming languages such as Java make it uncommon in real-world applications.

## References

* GeeksforGeeks – XOR Linked List (Memory Efficient Doubly Linked List)
  https://www.geeksforgeeks.org/xor-linked-list-a-memory-efficient-doubly-linked-list-set-1/

* Wikipedia – XOR Linked List
  https://en.wikipedia.org/wiki/XOR_linked_list

* TutorialsPoint – XOR Linked List
  https://www.tutorialspoint.com/data_structures_algorithms/xor_linked_list.htm
