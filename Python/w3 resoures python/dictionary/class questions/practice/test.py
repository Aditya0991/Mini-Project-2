# nums = [1,2,3,4,5,6]
# events  =list(filter(lambda n:n%2==0,nums))
# print(events)
lst = []
n = int(input('Enter the number of element in lst : '))
for i in range(1,n+1):
    lst.append(int(input(f'Enter the {i} elemet')))
print(lst)