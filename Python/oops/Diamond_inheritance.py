# # Depth first traversal of inheritance trancig in parent classes
class A(object):
    def dothis(self):
        print('Doing this in A')
class B(A):
    pass
class C(A):
    def dothis(self):
        print('Doing this in C')
class D(B, C):
    pass
d_instance = D()
d_instance.dothis()
print(D.mro())