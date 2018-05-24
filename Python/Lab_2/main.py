from Museum import *
from exhibits.Sword import *
from exhibits.Chronicle import *
from exhibits.Clothes import *
from exhibits.Shield import *

if __name__ == '__main__':
    museum = Museum()

    sword = Sword(0.8, 'Gladius', 2437, 'Weapon', 'Rome', 'good', 0.7)
    shield = Shield('rectangle', 'Skutum', 2672, 'Weapon', 'Rome', 'good', 5)
    clothes = Clothes('wool', 'Toga', 2550, 'Clothes', 'Rome', 'bad', 0.3)
    chronicle = Chronicle(212, 'Ancient Rome', 2447, 'Chronicle', 'Rome', 'good', 0.6)

    museum.exhibits = [sword, shield, clothes, chronicle]
    print("Previous list:")
    museum.print_list()

    museum.sort_by_age()
    print("Sorted list")
    museum.print_list()







