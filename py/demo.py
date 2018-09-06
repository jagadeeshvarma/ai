class Wolf:
    def __init__(self,name,color):
        self.name = name
        self.color = color
    def bark(self):
        print('Grrrr.....')

class Dog(Wolf):
    pass
    # def bark(self):
    #     print('Woof! Woof!')

my_dog = Dog('Raju','Black')
print(my_dog.name,my_dog.color)
my_dog.bark()
