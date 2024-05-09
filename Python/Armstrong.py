for i in range(100, 1000):
      n = i
      s = 0
      while(i>0):
       k= i%10
       s = s + (k ** 3)
       i = i // 10
       
      if s==n:
           print(s)
 
     
 
