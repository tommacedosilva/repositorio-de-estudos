let sportsOne: string[] = ["Golf", "Cricket", "Tennis", "Swimming"];

// simplicar o loop simplificado

for (let tempSport of sportsOne) {
    if (tempSport == "Cricket") {
        console.log(tempSport + " << My Favorite");
    } else {
        console.log(tempSport);
    }
}