class Hotel:
    def __init__(self, amount_of_visitors, name, number_of_rooms):
        self.amount_of_visitors = amount_of_visitors
        self.name = name
        self.number_of_rooms = number_of_rooms

    def __str__(self):
        return "Name: " + str(self.name) + "; " + "visitors: " + str(self.amount_of_visitors) + "; " + "rooms: " + str(self.number_of_rooms) + ";"