import re


def search():
    count = 0
    file = open('log')
    for line in file:
        if re.search('(23/Mar/2009:17:[1-5][8-9]:[2-5][6-9])|(24/Mar/2009)|(25/Mar/2009:[0-1][0-2]:[0-1][0-2]:0[0-9]).*POST.*200', str(line)):
            count += 1
    print(count)
    file.close()


if __name__ == "__main__":
    search()