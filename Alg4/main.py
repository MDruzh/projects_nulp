import math

oneWay=[]
allWays=[]
converted_to_int = []
vertex_path=[]


def main():
    for i in range(numberOfVertexes):
        for j in range(numberOfVertexes):
            if vertexesList[i][j] == 0:
                if j == numberOfVertexes-1:
                    number=vertexesList[i][0]
                else:
                    number=vertexesList[i][j + 1]
                vertex_path.append(number)


def reverse():
    vertexesList[0], vertexesList[numberOfVertexes - 1]= vertexesList[numberOfVertexes - 1], vertexesList[0]
    for i in range(numberOfVertexes):
        vertexesList[i][0], vertexesList[i][numberOfVertexes - 1]= vertexesList[i][numberOfVertexes - 1], vertexesList[i][0]
    return vertexesList


for line in open("profes.txt"):
    values= line.split(",")

for v in values:
    converted_to_int.append(int(v))

numberOfVertexes = int(math.sqrt(len(values)))
factorial=math.factorial(numberOfVertexes)

vertexesList = [[0 for i in range(numberOfVertexes)] for i in range(numberOfVertexes)]
for i in range(numberOfVertexes):
    for j in range(numberOfVertexes):
        vertexesList[i][j] = converted_to_int[i * numberOfVertexes + j]

for i in range(factorial):
    main()
    reverse()

for i in vertex_path:
    if len(oneWay) < numberOfVertexes:
        oneWay.append(i)
    else:
        h=oneWay.copy()
        allWays.append(h)
        oneWay.clear()

print(allWays)

for i in allWays:
    difference=max(i)- min(i)
    oneWay.append(difference)
print(vertexesList)
print(min(oneWay))
