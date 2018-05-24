from exhibits.Exhibit import *
from enums.ExhibitName import *
from enums.ExhibitAge import *


class Shield(Exhibit):
    exhibit_age = ExhibitAge.SEVEN_BC
    exhibit_name = ExhibitName.SHIELD

    def __init__(self, shape, name, age, kind_of_art, place_of_manufacture, condition, weight):
        self.shape = shape
        Exhibit.__init__(self, name, age, kind_of_art, place_of_manufacture, condition, weight)

    def __str__(self):
        return "Name : " + str(self.name) + " age: " + str(self.age) + " the shape of shield is " + str(
            self.shape)