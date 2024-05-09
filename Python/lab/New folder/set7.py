# Q1 check all occurences of each element using dictionary
'''s=input().split()
s1=set(s)
s1=list(s1)
d={s1[i]:s.count(s1[i]) for i in range(len(s1))}
print(d)
'''

st = input('Enter the string: ')
d={}
for i in st:
    d[i] = st.count(i)
print(d)



#Q2 buuble sort
def bubble_sort(lst):
    for i in range(len(lst)-1,0,-1):
        for j in range(i):
            if lst[j]>lst[j+1]:
                temp = lst[j]
                lst[j]=lst[j+1]
                lst[j+1]=temp
    print(lst)

bubble_sort([4,1,6,9,2])

