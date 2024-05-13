class Queue:
    def __init__(self):
        self.stack1 = Stack()
        self.stack2 = Stack()

    def enqueue(self, item):
        while not self.stack1.is_empty():
            self.stack2.push(self.stack1.pop())
        self.stack1.push(item)
        while not self.stack2.is_empty():
            self.stack1.push(self.stack2.pop())

    def dequeue(self):
        if self.is_empty():
            raise IndexError("dequeue from empty queue")
        return self.stack1.pop()

    def peek(self):
        if self.is_empty():
            raise IndexError("peek from empty queue")
        return self.stack1.peek()

    def is_empty(self):
        return self.stack1.is_empty()