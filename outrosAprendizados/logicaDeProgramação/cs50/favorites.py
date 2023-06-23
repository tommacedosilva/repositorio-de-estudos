import csv

title = input("Title: ").strip().upper()

counter = 0

with open("favorites.csv", "r") as file:
    reader = csv.DictReader(file)
    for row in reader:
        if row["title"].strip().upper() == title:
            counter += 1


print(counter)


        #if title in titles:
            #titles[title] = 0
        #titles[title] += 1

#def get_value(title):
   # return titles[title]

#for title in sorted(titles, key=lambda title: titles[title], reverse=True):
   # print(title, titles[title])