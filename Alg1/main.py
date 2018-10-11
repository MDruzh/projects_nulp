import time
from Hotel import Hotel
from Merge_sort import mergeSort


def bubbleSort(Slist):
    print("Bubble sort:")
    comparing_time = 0
    swaps = 0
    for i in range(len(Slist)-1, 0, -1):
        comparing_time = comparing_time + 1
        for j in range(i):
            if Slist[j].amount_of_visitors < Slist[j+1].amount_of_visitors:
                temp = Slist[j]
                Slist[j] = Slist[j+1]
                Slist[j+1] = temp
                swaps = swaps+1
    print("Comparing time: " + str(comparing_time))
    print("Total swaps: " + str(swaps))

if __name__ == "__main__":
    Slist = []
    name = 0
    amount_of_visitors = 1
    number_of_rooms = 2
    file = open('Hotel_List')
    for line in file:
        values = line.split(',')
        hotel = Hotel(int(values[amount_of_visitors]), values[name],int(values[number_of_rooms]))
        Slist.append(hotel)
    for item in Slist:
        print(item)

    sort_time = time.perf_counter()
    print(" ")
    bubbleSort(Slist)
    print("Time of sorting: " + str(time.perf_counter() - sort_time))
    print(Slist)
    for hotel in Slist:
        print(hotel)

    print(" ")
    print("Merge sort: ")
    sort_time = time.perf_counter()
    mergeSort(Slist)
    print("Time of sorting: " + str(time.perf_counter() - sort_time))
    print(Slist)
    for hotel in Slist:
        print(hotel)
