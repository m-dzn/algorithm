s = input()
s = s.lower()
alphabet = list(range(97,123))
l = []
for i in alphabet:
    l.append(s.count(chr(i)))
if l.count(max(l)) > 1:
    print("?")
else:
    print(chr(97+l.index(max(l))).upper())