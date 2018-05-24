from exhibits.Exhibit import *
from enums.ExhibitName import *
from enums.ExhibitAge import *


class Clothes(Exhibit):
    exhibit_age = ExhibitAge.SIX_BC
    exhibit_name = ExhibitName.CLOTHES

    def __init__(self, material, name, age, kind_of_art, place_of_manufacture, condition, weight):
        self.material = material
        Exhibit.__init__(self, name, age, kind_of_art, place_of_manufacture, condition, weight)

    def __str__(self):
        return "Name : " + str(self.name) + " age: " + str(self.age) + " the material of clothes is " + str(
            self.material)