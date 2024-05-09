def fun(n):
    s = str(n)
    d = []
    for i in s:
        if int(i) % 2 == 0:
            d.append(True)
        else:
            d.append(False)
    return d

m = [i for i in range(100, 2001) if all(fun(i))]
print(m)
