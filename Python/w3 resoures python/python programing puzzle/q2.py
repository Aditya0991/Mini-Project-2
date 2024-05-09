input_string = input('Enter elements of a list separated by space ')
print("\n")
user_list = input_string.split()
# print list
print('list: ', user_list)

length=len(user_list)
ele=user_list[5]
tim=user_list.find(ele)
print(tim)
for i in user_list:
    if i==ele:
        print(True)

