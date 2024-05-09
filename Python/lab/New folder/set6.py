#Q1 square list
def SQUARE_SEQUENCE():
    n=int(input("Starting limit : "))
    n1=int(input("End limit : "))
    List=[i*i for i in range(n,n1+1)]
    print(List)
SQUARE_SEQUENCE()


# #Q2 WAP to remove duplicate word and then sort it
# l=set(input().split())
# l=sorted(l)
# print(' '.join(l))


# #Q3 WAP count alphanumerically
# l=l1=input().split()
# l=sorted(set(l))
# for i in l:
#     print(i,":",l1.count(i))
