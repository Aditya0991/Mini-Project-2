# # from tokenize import Name


# # def greet():
# #     print("Good Morning ",end = '')
    
# #     print(Name)
# # Name = input("Enter the name:")
# # greet()


# # Program - 2
# def sum(a,b): 
#     c = a+b
#     return c
# out = sum(2,8)
# print(out)

# # Program - 3 Returning two values
# def sum_sub(a,b):
#     add = a+b
#     sub = a-b
#     return add, sub
# add , sub = sum_sub(10,8)
# print(f"Additioin {add}")
# print(f"Substraction {sub} ")

##Test
# dic = {}
# def foo(a,b,*args,**kwargs):
#     print(a,b)
#     for arg in args:
#         print(arg)
#     for key in kwargs:
#         dic[key] = kwargs[key]
#     print(dic)
# foo(1,2,3,Name = 'Aditya' , Course = 'BTech')

#Local and Global variable
def greet():
    global a 
    a = 10
a = 100
greet()
print(a)