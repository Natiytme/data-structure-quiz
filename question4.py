class Que:
    def init(self):
        self.s1 = Stk(100)
        self.s2 = Stk(100)

    def enq(self, val):
        self.s1.psh(val)

    def deq(self):
        if self.s2.top == -1:
            while self.s1.top != -1:
                self.s2.psh(self.s1.pop())
        if self.s2.top != -1:
            return self.s2.pop()
        else:
            print("Queue is empty, cannot dequeue.")
            return -1

    def pek(self):
        if self.s2.top == -1:
            while self.s1.top != -1:
                self.s2.psh(self.s1.pop())
        if self.s2.top != -1:
            return self.s2.arr[self.s2.top]
        else:
            print("Queue is empty, cannot peek.")
            return -1