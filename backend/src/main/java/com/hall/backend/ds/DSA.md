
---

# 🎯 1. Core Data Structures (Must Have)

### 🔹 Arrays / 2D Arrays (Matrix)

* Represent seats in a hall
* Example: `seats[row][col]`
* Use for:

  * Seat availability
  * Layout visualization

---

### 🔹 HashMap (Very Important)

* Store fast lookup data
* Use for:

  * `userId → booking`
  * `movieId → show details`
  * `seatId → booking status`

---

### 🔹 Linked List

* Maintain booking history / logs
* Useful for:

  * Undo operations
  * Recently booked tickets

---

### 🔹 Stack

* For undo/cancel operations
* Example:

  * Undo last booking action

---

### 🔹 Queue

* Handle booking requests (FIFO)
* Useful for:

  * High traffic scenarios
  * Waiting queue for booking

---

# 🚀 2. Intermediate Data Structures (Important for Optimization)

### 🔹 Priority Queue (Heap)

* For dynamic pricing / premium seat allocation
* Use cases:

  * Best available seat selection
  * VIP prioritization

---

### 🔹 Tree (Binary Tree / BST)

* Organize shows, users, or booking records
* Helps in:

  * Efficient searching
  * Sorting-based operations

---

### 🔹 Segment Tree / Fenwick Tree (Advanced 🔥)

* Range queries on seats
* Example:

  * Find continuous empty seats in a row
* Very useful for:

  * Group booking (e.g., 5 seats together)

---

# 🧠 3. Algorithms (Core Logic)

### 🔹 Searching Algorithms

* Binary Search
* Use for:

  * Finding show timings
  * Searching movies efficiently

---

### 🔹 Sorting Algorithms

* Sort movies by:

  * Rating
  * Price
  * Time

---

### 🔹 Greedy Algorithms

* Best seat allocation
* Example:

  * Closest seats to center

---

### 🔹 Backtracking (Advanced)

* Used in:

  * Finding all possible seat combinations
* Example:

  * Suggest alternative seating arrangements

---

### 🔹 Graph Algorithms (Very Important 🔥)

* Model:

  * Users ↔ Movies ↔ Theatres
* Use cases:

  * Recommendation system
  * Multi-theatre navigation

---

# ⚡ 4. Concurrency & Real-Time (CRITICAL for Booking System)

### 🔹 Locking Mechanisms (Conceptual DSA + OS)

* Prevent double booking
* Techniques:

  * Mutex / Semaphore
  * Optimistic locking

---

### 🔹 Disjoint Set (Union-Find)

* Track connected seats or seat blocks
* Useful in:

  * Group seat allocation

---

# 📊 5. Advanced System-Level Structures

### 🔹 Trie

* For search autocomplete
* Example:

  * Movie name search ("Avengers", "Avatar")

---

### 🔹 LRU Cache

* Cache frequently accessed data
* Example:

  * Popular movies
  * Show timings

---

### 🔹 Bloom Filter (Advanced)

* Fast membership check
* Example:

  * Check if user exists (quick filter)

---

# 🏗️ 6. Real-Life Mapping (VERY IMPORTANT)

| Feature               | DSA Used             |
| --------------------- | -------------------- |
| Seat Layout           | 2D Array             |
| Booking System        | HashMap + Queue      |
| Seat Allocation       | Greedy + Heap        |
| Group Booking         | Segment Tree         |
| Search Movies         | Trie + Binary Search |
| Recommendation        | Graph                |
| Undo Booking          | Stack                |
| High Traffic Handling | Queue + Locking      |

---

# 🔥 If You Want Industry-Level System

You should definitely implement:

* HashMap
* Heap (Priority Queue)
* Trie
* Segment Tree (for seat blocks)
* Graph (for recommendations)
* Queue (for booking requests)
* Concurrency control (VERY IMPORTANT)

---

# (Important)

A cinema booking system like BookMyShow is NOT just CRUD.

It is:

* **Real-time distributed system**
* **High concurrency problem**
* **Optimization-heavy system**

---

