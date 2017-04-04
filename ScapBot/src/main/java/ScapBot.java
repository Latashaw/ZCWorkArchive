import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;
import robocode.WinEvent;

import java.awt.*;
import java.util.Random;

/**
 * Created by latashawatson on 2/20/17.
 */
public class ScapBot extends AdvancedRobot {
    int gunDirection = 1;
    double previousEnergy = 100;
    int movementDirection = 1;


    public void run() {
        setTurnGunRight(99999);
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        setColors();
        stayAtRightAngles(e);
        scanToDodge(e);
        retaliate(e);
    }

    // Stay at right angles to the opponent
    public void stayAtRightAngles(ScannedRobotEvent e) {
        setTurnRight(e.getBearing() + 90 - 30 * movementDirection);
    }

    //If the bot has small energy drop,
    //assume its bc it fired
    public void scanToDodge(ScannedRobotEvent e) {
        double changeInEnergy = previousEnergy - e.getEnergy();
        if (changeInEnergy > 0 && changeInEnergy <= 3) {
            dodge(e);
        }
    }

    // Dodge!
    public void dodge(ScannedRobotEvent e) {
        movementDirection = -movementDirection;
        setAhead((e.getDistance() / 4 + 25) * movementDirection);
    }


    public void retaliate(ScannedRobotEvent e) {
        // When a bot is spotted,
        // turn the gun and radar
        gunDirection = -gunDirection;
        setTurnGunRight(99999 * gunDirection);

        // Fire at target
        fire(2);

        // Track the energy levels
        previousEnergy = e.getEnergy();
    }

    public void onWin(WinEvent e) {
        for (int i = 0; i < 50; i++) {
            turnRight(30);
            turnLeft(30);
        }
    }

    public void setColors() {
        setBodyColor(randColor());
        setGunColor(randColor());
        setRadarColor(randColor());
        setBulletColor(randColor());
        setScanColor(randColor());
    }

    public Color randColor() {
        int red = randint(0, 255);
        int green = randint(0, 255);
        int blue = randint(0, 255);
        Color randColor = new Color(red, green, blue);
        return randColor;
    }

    public int randint(int min, int max) {
        Random random = new Random();
        return random.nextInt() * (max - min) + min;
    }
}

