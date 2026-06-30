### LinkedList as a Queue (FIFO) and Stack (LIFO)

- **Queue (FIFO)**:
  - Add: `addLast()`
  - Remove: `removeFirst()`
  - **Behavior**: First element added is the first to be removed.

- **Stack (LIFO)**:
  - Add: `addFirst()`
  - Remove: `removeFirst()`
  - **Behavior**: Last element added is the first to be removed.

### Summary Table
| Structure | Add Method  | Remove Method  | Order         |
|-----------|-------------|----------------|---------------|
| Queue     | `addLast()` | `removeFirst()`| FIFO (First In, First Out) |
| Stack     | `addFirst()`| `removeFirst()`| LIFO (Last In, First Out) |