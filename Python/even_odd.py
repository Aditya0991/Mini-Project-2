h = 10
r = 5/2
v = 22 / 7 * r**2 * h 
wf = 15 * num

if wf == v: 
     print("The tank is fully filled") 
 elif wf > v:
      print("The tank is overfilled")
      print("Over Flow Volume: ", wf-v)
 elif wf < v:
     print("The tank is underfilled")
     ht = v / (3.17 * r ** 2)
     hr = h - ht
     print("Filled Height", ht)
     print("Remaning Height", hr)
