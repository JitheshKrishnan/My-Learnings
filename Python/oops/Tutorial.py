class Math(object):
    def __init__(self, a, b):
        self.a = a
        self.b = b
    def add(self):
        return self.a + self.b
    def sub(self):
        return self.a - self.b
    def mul(self):
        return self.a * self.b
    def div_quotient(self):
        return self.a / self.b
    def div_remainder(self):
        return self.a // self.b
a = input("Enter the first number: ")
b = input("Enter second number: ")
x = True

while x == True:
    print('What operation to perform?\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Quotient\n5. Remainder\n6. Exit')
    c = input("Enter yoyr choice: ")
    s = Math(a, b)
    if c == 1:
    print(s.add())
if c == 2:
    print(s.sub())
if c == 3:
    print(s.mul())
if c == 4:
    print(s.div_quotient())
if c == 5:
    print(s.div_remainder())
else:
    print("Invalid choice")4
