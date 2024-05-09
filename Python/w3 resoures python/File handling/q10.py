f = open('first.txt','r')
org_lst = f.readlines()
lst = []
for i in org_lst[:-1]:
    lst.append(i[:-1])
lst.append(org_lst[-1])
print(lst)
st = ''
for i in lst:
    st+=i
print(st)
lst1 = st.split(' ')
print(lst1)
for i in lst1:
    out = lst.find('Aditya')
    print(out,end =' ')