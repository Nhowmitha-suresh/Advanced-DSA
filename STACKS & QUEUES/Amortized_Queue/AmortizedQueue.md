# The Amortized Queue

## Introduction

A queue follows the **FIFO (First In, First Out)** principle, whereas a stack follows the **LIFO (Last In, First Out)** principle. A queue can be implemented using two stacks by using one stack for insertion and another stack for deletion.

## Working

Two stacks are used:

* **Stack 1** stores newly inserted elements.
* **Stack 2** is used during dequeue operations.

When an element is enqueued, it is pushed into Stack 1.

When a dequeue operation is performed:

* If Stack 2 is not empty, remove the top element.
* If Stack 2 is empty, transfer all elements from Stack 1 to Stack 2 and then remove the top element.

This transfer reverses the order of elements, making the oldest element available first.

## Amortized Analysis

A single dequeue operation may take **O(n)** time when all elements are transferred from Stack 1 to Stack 2.

However, each element is:

* Pushed into Stack 1 exactly once.
* Moved to Stack 2 exactly once.
* Popped from Stack 2 exactly once.

Therefore, each element is processed a constant number of times.

For **n** elements:

* Total Push operations = **n**
* Total Transfer operations = **n**
* Total Pop operations = **n**

Total work = **3n**

Average cost per operation:

```text
3n / n = O(1)
```

Hence, the **amortized time complexity of dequeue is O(1)**, even though an individual dequeue operation may occasionally require **O(n)** time.

## Complexity

* Enqueue: **O(1)**
* Dequeue (Worst Case): **O(n)**
* Dequeue (Amortized): **O(1)**
* Space Complexity: **O(n)**

## References

* GeeksforGeeks – Queue using Stacks
  https://www.geeksforgeeks.org/queue-using-stacks/

* LeetCode 232 – Implement Queue using Stacks
  https://leetcode.com/problems/implement-queue-using-stacks/

* MIT OpenCourseWare – Amortized Analysis
  https://ocw.mit.edu/courses/6-006-introduction-to-algorithms-fall-2011/
