'''Q3. Write a Python program to sort a list of tuples using 
Lambda.'''

sub_m = [('English', 88), ('Science', 90), ('Maths', 97), ('Social sciences', 82)]

sub_m.sort(key=lambda x: x[1])
print(sub_m)
