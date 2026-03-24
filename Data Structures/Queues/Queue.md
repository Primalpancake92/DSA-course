Queue:

It is also similar to an arrayList, however its behaviour different compared to it and the stack ADT. This is because it is similar to waiting in a 'queue', hence the name of this ADT. Not the removal of an element is at the front of the data structure, and the deletions occur at the back of the ADT. This behaviour is called first in first out (FIFO).

This data structure has the following methods:
    - push(): This method adds an element to the front.
    - front(): This method returns the oldest value in the queue.
    - pop(): This method removes the front element of the queue.
    - size(): This returns the size of the queue.

The same limitations do apply to the queue when used over a deque, as it was for a stack over a vector. This is because you are giving up some operations, without gaining any performance. This makes it difficult to debug when you cannot sese what is in the queue without destroying it.
