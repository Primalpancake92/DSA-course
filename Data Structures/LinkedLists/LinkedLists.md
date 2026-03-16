What is a Linked List?

A linked list is a list of sequential list of nodes that hold data whic point to other nodes also containing data.

Data -> Data -> Data -> Data -> null

Observe how there are pointers that point to the next data element in the sequence. The last points to null, which 
is the null pointer.

Where are they used?
- They are used in many Lists, Queue and stack implementations because they are great for adding and removing elements.
- Great for creating circular lists - lists that point back to the beginning.
- Can easily model real world objects like train carts.
- Used hashtables to deal with hash clashes (separate chaining)
- Often used in the implementation of adjacency lists for graphs.

Terminology:
- Head: first node of the LinkedList.
- Tail: the last element of the LinkedList.
- Pointers: points to the next node, which is indicated via the arrows.
- Node: object that contains the element and the pointer.

Singly LinkedList:
This is the LinkedList goes from left to right because that the nodes holds a pointer to the next element.
When implementing this, you must maintain a reference to the head and a tail for quick insertions and deletions of 
elements.

    - Benefits:
        - Less memory use
        - Simpler implementation
    - Drawbacks: 
        - Cannot easily access the previous element.

Doubly LinkedLists:
A doubly LinkedList is when every node has two pointers that points both backwards and forwards. This must also have 
a head and a tail to make it have quick insertions and deletion of elements.

    - Benefits:
        - Can go backwards and forwards.
    - Drawbacks:
        - Takes twice the memory.