class Stk:
    def init(self, sz):
        self.max = sz
        self.arr = [0] * self.max
        self.top = -1

    def psh(self, val):
        if self.top < self.max - 1:
            self.top += 1
            self.arr[self.top] = val
        else:
            print("Stack is full, cannot push element.")

    def pop(self):
        if self.top >= 0:
            val = self.arr[self.top]
            self.top -= 1
            return val
        else:
            print("Stack is empty, cannot pop element.")
            return -1