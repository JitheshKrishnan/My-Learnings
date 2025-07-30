class Person():
    number_of_pepole = 0 #Class attribute
    def __init__(self, name):
        self.name = name
        Person.add_person()
    @classmethod
    def number_of_pepole_(cls):
        return cls.number_of_pepole
    @classmethod
    def add_person(cls):
        cls.number_of_pepole += 1
p1 = Person("Tim")
print(Person.number_of_pepole_())
print(p1.number_of_pepole_())
p2 = Person("Jill")
print(Person.number_of_pepole_())
print(p1.number_of_pepole_())
print(p2.number_of_pepole_())
p3 = Person("Bill")
print(Person.number_of_pepole_())