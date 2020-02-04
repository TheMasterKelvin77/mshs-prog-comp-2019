import sys

lines = sys.stdin.readlines()

floats = map(float, lines[1:])
avgs = []

for num in floats:
    avgs.append((num + 1)/2)

print("{:0.3f}".format(sum(avgs)/len(avgs)))
