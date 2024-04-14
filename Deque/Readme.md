Deque in short for double ended queue provides the operations like insertion in front and back, deletion at front and back and retrieval of from start and end.
This is an important data structure as it is used to implement the java collections stack.

Implentation of deque by two ways:

Array Deque:    Deque<Integer> deque = new ArrayDeque<>();

Linked List:   Deque<Integer> deque = new LinkedList<>();

Some of its important and most frequently used functions are:

add(int x) : This method is used to insert a specified element into the queue represented by the deque.
addFirst(int x) : Inserts the specified element at the front of the deque.
addLast(int x) : Inserts the specified element at the end of the deque.

getFirst() : Retrieves but does not remove the first element of the deque.
getLast() : Retrieves but does not remove the last element of the deque.

pollFirst() :	Retrieves and remove the first element of the deque or may return null if the deque is empty.
pollLast() : Retrieves and remove the last element of the deque or may return null if the deque is empty.

size() : Returns the total number of elements in the deque.

Further Links to refer

https://www.javatpoint.com/java-deque

https://www.javatpoint.com/ds-deque
