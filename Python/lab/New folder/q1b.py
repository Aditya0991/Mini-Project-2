p_day = 275000
t_days = 365

year = int(input("Enter the year: "))
month = int(input("Enter the month: "))

    
if((month==2) and ((year%4==0)  or ((year%100==0) and (year%400==0)))) :
    print("Number of days is 29")
    rainy_ses = int(275000+(275000*0.15)*29)

elif(month==2) :
    print("Number of days is 28")
    rainy_ses = int(275000+(275000*0.15)*28)

elif(month==1 or month==3 or month==5 or month==7 or month==8 or month==10 or month==12) :
    print("Number of days is 31")
    rainy_ses = int(275000+(275000*0.15)*31)

else :
    print("Number of days is 30")
    rainy_ses = int(275000+(275000*0.15)*30)
print(rainy_ses)

out = p_day*t_days
print(f'{out} peple travel yearly')