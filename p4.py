a=raw_input("Enter number 1:")
b=raw_input("Enter number 2:")
c=raw_input("Enter number 3:")
a = int(a)
b = int(b)
c = int(c)
max=max(a,b,c)
min=min(a,b,c)
num=a+b+c-max-min
print "Ascending order is:"
print(min,num,max)
