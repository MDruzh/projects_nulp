class Helicopter:
    total_passengers = 0

    def __init__(self, name="no name", passengers=0, crew=0, max_height=0, range_of_flight=0):
        self.name = name
        self.passengers = passengers
        self.__crew = crew
        self.max_height = max_height
        self.range_of_flight = range_of_flight
        Helicopter.total_passengers += self.passengers

    def to_string(self):
        print("Name: " + self.name + ", passengers: " + str(self.passengers) + ", crew: " + str(self.crew) + ", max_height: " + str(self.max_height) + ", range_of_flight: " + str(self.range_of_flight))

    def print_sum(self):
        print("Total passengers of the helicopter " + self.name + " are " + str(self.passengers) + " people")

    @staticmethod
    def print_static_sum():
        print("The total number of passengers of all helicopters is " + str(Helicopter.total_passengers))

if __name__ == "__main__":
    agusta = Helicopter()
    robinson = Helicopter("Robinson", 1, 1, 4250)
    sikorsky = Helicopter("Sikorsky", 9, 1, 7050, 320)

    agusta.to_string()
    robinson.to_string()
    sikorsky.to_string()

    Helicopter.print_static_sum()
    robinson.print_sum()
    sikorsky.print_sum()