from exhibits.Exhibit import *
from enums.ExhibitName import *
from enums.ExhibitAge import *


class Chronicle(Exhibit):
    exhibit_age = ExhibitAge.FIVE_BC
    exhibit_name = ExhibitName.CHRONICLE

    def __init__(self, number_of_pages, name, age, kind_of_art, place_of_manufacture, condition, weight):
        self.number_of_pages = number_of_pages
        Exhibit.__init__(self, name, age, kind_of_art, place_of_manufacture, condition, weight)

    def __str__(self):
        return "Name : " + str(self.name) + " age: " + str(self.age) + " the number of pages of chronicle is " + str(
            self.number_of_pages)