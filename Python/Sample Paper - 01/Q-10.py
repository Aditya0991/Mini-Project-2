def pan(n):
    a = "abcdefghijklmnopqrstuvwxyz"
    for i in a:
        if i not in n.lower():
            return False
  
    return True
      
n = input()
if(pan(n) == True):
    print("Panagram")
else:
    print("Not a Panagram")
