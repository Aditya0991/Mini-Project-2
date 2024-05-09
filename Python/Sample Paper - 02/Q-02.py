n = int(input())
h = 10
r = 5
fr = 15
v = 22 / 7 * r * r * h
t = n * fr
if t > v:
    print("Overflow")
    print("Overflow Volume", t - v)
elif t < v:
    ht = t / (22 / 7 * r * r)
    hr = h - ht
    print("Underflow")
    print("Filled Height: ", ht)
    print("Remaining Height: ", hr)
elif t == v:
    print("Fill")
