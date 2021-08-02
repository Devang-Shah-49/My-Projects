# MAIN LOGIC
d={}
n=int(input())

for i in range(n):
    s=input()
    if s in d.keys():
        d[s]+=1
    else:
        d[s]=1

print(len(d.keys()))
print(' '.join([str(d[k]) for k in d.keys()]))



# BONUS 
MaxValue = max(d.items(), key=lambda x: x[1])
list1 = list()
for key, value in d.items():
    if value == MaxValue[1]:
        list1.append(key)
print('Most Repeated Word(s) : ', list1)

MinValue = min(d.items(), key=lambda x: x[1])
list2 = list()
for key, value in d.items():
    if value == MinValue[1]:
        list2.append(key)
print('Least Repeated Word(s) : ', list2)

list3=list()
list3=list1+list2
print('Each distinct word in the input according to their occurrences in descending order : ', list3)
