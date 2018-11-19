from collections import defaultdict


class Graph:
    def __init__(self, graph):
        self.graph = graph
        self.marked = {}
        self.stack = []
        for v in list(graph):
            if v not in self.marked:
                self.dfs(v)

    def dfs(self, vertex):
        self.marked[vertex] = True
        for v in self.graph[vertex]:
            if v not in self.marked.keys():
                self.dfs(v)
        self.stack.append(vertex)


if __name__ == "__main__":
    documents = defaultdict(list)
    for line in open("input.txt"):
        vertexes = line.split()
        if len(vertexes) != 2:
            break
        documents[vertexes[0]].append(vertexes[1])
    result = Graph(documents).stack
    print(result)
    govern_out = open("output.txt", 'w')
    for res in result:
        govern_out.write(res + "\n")