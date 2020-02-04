a = []
b = []
output = 'valid'
for i in range(5):
    a.append(input())
    for j in range(len(a[i])):
        if (a[i][j] == 'k'):
            b.append([i, j])
for k in b:
    for l in b:
        if ((l == [k[0]+2, k[1]+1]) or (l == [k[0]+2, k[1]-1]) or ([k[0]-2, k[1]+1] == l) or ([k[0]-2, k[1]-1] == l) or ([k[0]+1, k[1]+2] == l) or ([k[0]+1, k[1]-2] == l) or ([k[0]-1, k[1]+2] == l) or ([k[0]-1, k[1]-2] == l)):
            output = 'invalid'
        elif (output == 'valid'):
            output = 'valid'
            
print(output)
