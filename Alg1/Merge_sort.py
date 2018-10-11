def mergeSort(Slist):
    if len(Slist) > 1:
        mid = len(Slist)//2
        left = Slist[:mid]
        right = Slist[mid:]

        mergeSort(left)
        mergeSort(right)

        i, j, k = 0, 0, 0
        while i < len(left) and j < len(right):
            if left[i].number_of_rooms < right[j].number_of_rooms:
                Slist[k] = left[i]
                i = i + 1
            else:
                Slist[k] = right[j]
                j = j + 1
            k = k + 1

        while i < len(left):
            Slist[k] = left[i]
            i = i + 1
            k = k + 1

        while j < len(right):
            Slist[k] = right[j]
            j = j + 1
            k = k + 1