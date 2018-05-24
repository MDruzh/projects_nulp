from exhibits.Exhibit import *
from enums.ExhibitName import *
from enums.ExhibitAge import *


class Sword(Exhibit):
    exhibit_age = ExhibitAge.FIVE_BC
    exhibit_name = ExhibitName.SWORD

    def __init__(self, sword_length, name, age, kind_of_art, place_of_manufacture, condition, weight):
        self.sword_length = sword_length
        Exhibit.__init__(self, name, age, kind_of_art, place_of_manufacture, condition, weight)

    def __str__(self):
        return "Name : " + str(self.name) + " age: " + str(self.age) + " the length of sword is " + str(
            self.sword_length)
