import { CricketCoach } from "./CricketCoach";
import { GolfCoach } from "./GolfCoach";
import { Coach } from "./Coach";

let MyCricketCoach = new CricketCoach();
let myGolfCoach = new GolfCoach();

let theCoaches: Coach[] = [];

theCoaches.push(MyCricketCoach);
theCoaches.push(myGolfCoach);

for (const tempCoach of theCoaches) {
    console.log(tempCoach.getDailyWorkout());
}