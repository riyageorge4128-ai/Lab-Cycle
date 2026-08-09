abstract class RescueRobot {

    protected String robotId;
    protected String robotName;
    protected int batteryLevel;

    public RescueRobot(String robotId, String robotName, int batteryLevel) {
        this.robotId = robotId;
        this.robotName = robotName;
        this.batteryLevel = batteryLevel;
    }

    public void displayStatus() {
        System.out.println("-----------------------------------------------------");
        System.out.println("Robot ID     : " + robotId);
        System.out.println("Robot Name   : " + robotName);
        System.out.println("Battery Level: " + batteryLevel + "%");
    }

    public void rechargeBattery() {
        batteryLevel = 100;
        System.out.println(robotName + ": battery recharged to 100%.");
    }

    protected boolean hasEnoughPower(int requiredPercent) {
        if (batteryLevel < requiredPercent) {
            System.out.println(robotName + ": WARNING - battery too low (" + batteryLevel
                    + "%) for this mission! Recharge recommended.");
            return false;
        }
        return true;
    }

    public abstract void performMission();
}

interface Flyable {
    void fly(int altitudeMeters);
    void land();
}

interface Swimmable {
    void swim(int depthMeters);
    void surface();
}

interface Climbable {
    void climb(String terrainType);
    void descend();
}

class DroneRescueRobot extends RescueRobot implements Flyable {

    public DroneRescueRobot(String robotId, String robotName, int batteryLevel) {
        super(robotId, robotName, batteryLevel);
    }

    @Override
    public void fly(int altitudeMeters) {
        System.out.println(robotName + ": flying at " + altitudeMeters + " meters to scan disaster zone.");
    }

    @Override
    public void land() {
        System.out.println(robotName + ": landing safely.");
    }

    @Override
    public void performMission() {
        if (!hasEnoughPower(20)) return;
        System.out.println(robotName + ": MISSION - Aerial search and thermal-camera survey.");
        fly(80);
        System.out.println(robotName + ": survivor heat signature detected, relaying coordinates.");
        land();
    }
}

class SubmarineRescueRobot extends RescueRobot implements Swimmable {

    public SubmarineRescueRobot(String robotId, String robotName, int batteryLevel) {
        super(robotId, robotName, batteryLevel);
    }

    @Override
    public void swim(int depthMeters) {
        System.out.println(robotName + ": diving to " + depthMeters + " meters to search flooded area.");
    }

    @Override
    public void surface() {
        System.out.println(robotName + ": surfacing.");
    }

    @Override
    public void performMission() {
        if (!hasEnoughPower(15)) return;
        System.out.println(robotName + ": MISSION - Underwater search for flood victims.");
        swim(12);
        System.out.println(robotName + ": sonar located a trapped survivor, deploying flotation device.");
        surface();
    }
}

class SpiderRescueRobot extends RescueRobot implements Climbable {

    public SpiderRescueRobot(String robotId, String robotName, int batteryLevel) {
        super(robotId, robotName, batteryLevel);
    }

    @Override
    public void climb(String terrainType) {
        System.out.println(robotName + ": climbing over " + terrainType + " using six articulated legs.");
    }

    @Override
    public void descend() {
        System.out.println(robotName + ": descending carefully.");
    }

    @Override
    public void performMission() {
        if (!hasEnoughPower(25)) return;
        System.out.println(robotName + ": MISSION - Search collapsed building rubble.");
        climb("collapsed rubble");
        System.out.println(robotName + ": found a gap leading to a survivor, alerting rescue team.");
        descend();
    }
}

class HybridRescueRobot extends RescueRobot implements Flyable, Swimmable, Climbable {

    public HybridRescueRobot(String robotId, String robotName, int batteryLevel) {
        super(robotId, robotName, batteryLevel);
    }

    @Override
    public void fly(int altitudeMeters) {
        System.out.println(robotName + ": switching to flight mode, ascending to " + altitudeMeters + "m.");
    }

    @Override
    public void land() {
        System.out.println(robotName + ": landing.");
    }

    @Override
    public void swim(int depthMeters) {
        System.out.println(robotName + ": switching to amphibious mode, diving to " + depthMeters + "m.");
    }

    @Override
    public void surface() {
        System.out.println(robotName + ": surfacing.");
    }

    @Override
    public void climb(String terrainType) {
        System.out.println(robotName + ": switching to crawler mode, climbing over " + terrainType + ".");
    }

    @Override
    public void descend() {
        System.out.println(robotName + ": descending.");
    }

    @Override
    public void performMission() {
        if (!hasEnoughPower(40)) return;
        System.out.println(robotName + ": MISSION - Multi-terrain disaster response (flood + collapse).");
        fly(50);
        System.out.println(robotName + ": aerial scan complete, descending toward flooded rubble.");
        land();
        swim(8);
        System.out.println(robotName + ": navigated flooded basement, found dry path to rubble.");
        surface();
        climb("unstable rubble");
        System.out.println(robotName + ": reached survivor location - mission successful!");
        descend();
    }
}

public class Main {
    public static void main(String[] args) {

        RescueRobot[] robots = new RescueRobot[4];
        robots[0] = new DroneRescueRobot("DR-01", "SkyEye Drone", 60);
        robots[1] = new SubmarineRescueRobot("SB-02", "AquaSeeker", 50);
        robots[2] = new SpiderRescueRobot("SP-03", "RubbleCrawler", 70);
        robots[3] = new HybridRescueRobot("HB-04", "TerraAmphiFly", 90);

        for (RescueRobot robot : robots) {
            robot.displayStatus();
            robot.performMission();
        }

        System.out.println("\n=== Recharging all robots (shared concrete method) ===");
        for (RescueRobot robot : robots) {
            robot.rechargeBattery();
        }

        System.out.println("\n=== Interface reference demo: every Flyable robot takes off ===");
        Flyable[] flyers = { (Flyable) robots[0], (Flyable) robots[3] };
        for (Flyable f : flyers) {
            f.fly(100);
            f.land();
        }

        System.out.println("\n=== Interface reference demo: every Swimmable robot dives ===");
        Swimmable[] swimmers = { (Swimmable) robots[1], (Swimmable) robots[3] };
        for (Swimmable s : swimmers) {
            s.swim(5);
            s.surface();
        }
    }
}