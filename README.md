
#  Advanced Data Structures & Algorithms

## **1. Arrays & Strings**

### **1.1 The In-Place Shuffle**
- Implements random permutation generation using both Naive Shuffle and Fisher-Yates Shuffle algorithms.
- Analyzes why Fisher-Yates guarantees uniform randomness while maintaining O(n) time and O(1) space.
- Demonstrates the statistical bias introduced by naive random swapping through execution path analysis.

### **1.2 Memory Contiguity Conundrum**
- Explores why contiguous 1D arrays outperform fragmented 2D structures during sequential traversal.
- Examines CPU cache lines, spatial locality, and hardware prefetching mechanisms.
- Highlights the performance penalties caused by pointer chasing and cache misses.

---

## **2. Linked Lists**

### **2.1 Arbitrary Pointer**
- Constructs a deep copy of a linked list containing both next and random pointers.
- Achieves O(n) time complexity while using O(1) auxiliary space.
- Demonstrates node interleaving techniques to preserve arbitrary pointer relationships.

### **2.2 XOR Linked List**
- Implements memory-efficient bidirectional traversal using XOR pointer arithmetic.
- Stores previous and next node information within a single pointer field.
- Discusses practical limitations involving debugging and garbage collection systems.

---

## **3. Stacks & Queues**

### **3.1 Amortized Queue**
- Builds a FIFO queue using two underlying LIFO stack structures.
- Explains why dequeue operations achieve O(1) amortized complexity.
- Demonstrates the concept of cost distribution across multiple operations.

### **3.2 Browser History Engine**
- Simulates browser navigation using back, forward, and visit operations.
- Compares dual-stack architecture against doubly linked list implementations.
- Evaluates memory usage, navigation efficiency, and mutation handling.

---

## **4. Hash Tables**

### **4.1 Colliding Reality**
- Investigates collision resolution using Separate Chaining and Linear Probing.
- Analyzes lookup performance under high load factor conditions.
- Examines cache behavior and clustering effects in modern systems.

### **4.2 Cryptographic vs Non-Cryptographic Hashing**
- Compares secure hashing algorithms against high-performance lookup hashes.
- Evaluates throughput, collision probability, and computational overhead.
- Demonstrates why cryptographic hashes are unsuitable for general hash tables.

---

## **5. Trees**

### **5.1 Self-Balancing Pivot**
- Studies AVL tree balancing through single and double rotations.
- Explains Left-Right and Right-Left imbalance correction mechanisms.
- Maintains logarithmic search performance through height regulation.

### **5.2 Median Streamer**
- Continuously computes the median of an incoming data stream.
- Utilizes a Max Heap and Min Heap to maintain balanced partitions.
- Supports O(log n) insertion and O(1) median retrieval.

---

## **6. Advanced Trees**

### **6.1 Autocomplete Scale**
- Explores scalable prefix-search data structures for autocomplete systems.
- Compares Trie, Compressed Trie, Radix Tree, and Ternary Search Tree architectures.
- Focuses on reducing memory consumption without sacrificing search efficiency.

### **6.2 Range Update Dilemma**
- Implements efficient range updates using Segment Trees with Lazy Propagation.
- Avoids repeated traversal of unaffected regions during updates.
- Supports both updates and queries in O(log n) time complexity.

---

## **7. Graphs**

### **7.1 Negative Cycle Trap**
- Demonstrates failure cases of Dijkstra's Algorithm with negative edge weights.
- Uses Bellman-Ford Algorithm for accurate shortest path computation.
- Detects and verifies negative cycles through repeated edge relaxation.

### **7.2 Topological Web**
- Identifies Strongly Connected Components using Tarjan's or Kosaraju's Algorithm.
- Detects cyclic dependencies in distributed build systems.
- Generates valid execution orderings through Topological Sorting of DAGs.
```
