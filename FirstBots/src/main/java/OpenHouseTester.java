//import robocode.AdvancedRobot;
//import robocode.ScannedRobotEvent;
//import robocode.WinEvent;
//
//import java.awt.*;
//
///**
// * Created by latashawatson on 2/20/17.
// */
//public class OpenHouseTester extends AdvancedRobot {
//    int gunDirection = 1;
//    double previousEnergy = 100;
//    int movementDirection = 1;
//    int scannedX = Integer.MIN_VALUE;
//    int scannedY = Integer.MIN_VALUE;
//
//
//    public void run() {
//        setTurnGunRight(99999);
//    }
//
//    public void onScannedRobot(ScannedRobotEvent e) {
//        setAllColors();
//        stayAtRightAngles(e);
//        scanToDodge(e);
//        retaliate(e);
//    }
//
//    // Stay at right angles to the opponent
//    public void stayAtRightAngles(ScannedRobotEvent e) {
//        setTurnRight(e.getBearing() + 90 - 30 * movementDirection);
//    }
//
//    //If the bot has small energy drop,
//    //assume its bc it fired
//    public void scanToDodge(ScannedRobotEvent e) {
//        double changeInEnergy = previousEnergy - e.getEnergy();
//        if (changeInEnergy > 0 && changeInEnergy <= 3) {
//            dodge(e);
//        }
//    }
//
//    // Dodge!
//    public void dodge(ScannedRobotEvent e) {
//        movementDirection = -movementDirection;
//        setAhead((e.getDistance() / 4 + 25) * movementDirection);
//    }
//
//
//    public void retaliate(ScannedRobotEvent e) {
//        // When a bot is spotted,
//        // turn the gun and radar
//        gunDirection = -gunDirection;
//        setTurnGunRight(99999 * gunDirection);
//
//        // Fire at target
//        fire(2);
//
//        // Track the energy levels
//        previousEnergy = e.getEnergy();
//    }
//
////    public void turnDirection(double radian) {
////        if(radian)
////    }
////    public void getBotCoordinates(ScannedRobotEvent e){
////        double angle = Math.toRadians((getHeading() + e.getBearing()) % 360);
////        scannedX = (int)(getX() + Math.sin(angle) * e.getDistance());
////        scannedY = (int)(getY() + Math.cos(angle) * e.getDistance());
////    }
//
//    public Color getColor(){
//        return new Color((float)Math.random(),(float)Math.random(),(float)Math.random());
//    }
//    public void setAllColors() {
//        setBulletColor(getColor());
//        setBodyColor(getColor());
//        setGunColor(getColor());
//        setRadarColor(getColor());
//    }
//
//    public void onWin(WinEvent e) {
//        for (int i = 0; i < 50; i++) {
//            turnRight(30);
//            turnLeft(30);
//        }
//    }
//
//}
//
