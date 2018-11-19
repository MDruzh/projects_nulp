def listRemove(alist, param):
    i=0
    while (i < len(alist)):
        if alist[i] >= param:
            alist.remove(alist[i])
        else:
            i = i+1
    print("New list: " + str(alist))


def func(alist, param):
    for i in range(0, len(alist) - 2):
        for j in range(i + 1, len(alist) - 1):
            for k in range(j + 1, len(alist)):
                if alist[i] + alist[j] + alist[k] == param:
                    print("YES")
                    return;
    print("NO")


if __name__ == '__main__':
    alist = list(set(map(int, input('Enter your list: ').split())))
    param = int(input("Enter your number: "))
    listRemove(alist, param)
    func(alist, param)