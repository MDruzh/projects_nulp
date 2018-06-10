class Museum:
    exhibits = []

    def __init__(self):
        pass

    def sort_by_age(self):
        self.exhibits.sort(key=lambda exhibit: exhibit.age)

    def find_by_age(self, age):
        found_exhibits = []

        for exhibit in self.exhibits:
            if exhibit.price == exhibit:
                found_exhibits.append(exhibit)

        return found_exhibits

    def add_exhibit(self, exhibit):
        self.exhibits += exhibit

    def print_list(self):
        for good in self.exhibits:
            print(good)
        print("\n")