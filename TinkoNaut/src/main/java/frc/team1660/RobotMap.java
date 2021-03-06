/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team1660;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

      
    // Joystick ports
    public final static int DRIVER_JOYSTICK_PORT = 0;
    public final static int MANIPULATOR_JOYSTICK_PORT = 1;
    
    //Drive Joystick
    public final static int FORWARD_AXIS = RIGHT_Y_AXIS;
    public final static int STRAFE_AXIS = RIGHT_X_AXIS;
    public final static int TURN_AXIS = LEFT_X_AXIS;
    public final static int MOVING_Y_AXIS = RIGHT_Y_AXIS;
    public final static int MOVING_X_AXIS = RIGHT_X_AXIS;
    public final static int HEADING_Y_AXIS = LEFT_Y_AXIS;
    public final static int HEADING_X_AXIS = LEFT_X_AXIS;
    public final static int FIELD_DRIVING_FLAG_ON_BUTTON = RB_BUTTON;
    public final static int FIELD_DRIVING_FLAG_OFF_BUTTON = LB_BUTTON;
    public final static int YAW_ZERO_BUTTON = START_BUTTON;
    public final static int FACE_BACKWARD_POV = POV_DOWN;
    public final static int FACE_LEFT_POV = POV_LEFT;
    public final static int FACE_RIGHT_POV = POV_RIGHT;
    public final static int FACE_FORWARD_POV = POV_UP;
    
    //Mani Joystick
    public final static int LIFT_AXIS = LEFT_Y_AXIS;	
    public final static int EAT_BUTTON = A_BUTTON;
    public final static int SPIT_BUTTON = B_BUTTON;
    public final static int ZERO_ENCODER_BUTTON = BACK_BUTTON;
    public final static int RELAX_MOTOR_BUTTON = START_BUTTON;
    public final static int LIFT_BOTTOM_HEIGHT_POV = POV_DOWN;
    public final static int LIFT_EXCHANGE_HEIGHT_POV = POV_LEFT;
    public final static int LIFT_TIER2_HEIGHT_POV = POV_RIGHT;
    public final static int LIFT_SWITCH_HEIGHT_POV = POV_UP;
    public final static int REACH_BUTTON =  Y_BUTTON;
    public final static int PULL_UP_BUTTON =  X_BUTTON;
    public final static int FLIP_AXIS = RT_AXIS;
    public final static int DIP_AXIS = LT_AXIS;
    public final static int LOCK_BUTTON = 75;
    public final static int LIFT_TOP_HEIGHT = LB_BUTTON;

    //public final static int COMPRESSOR_BUTTON = LB_BUTTON;
    public final static int SCALE_HEIGHT_AXIS = RIGHT_Y_AXIS;
    public final static int PRESSURE_OVERRIDE_BUTTON = RB_BUTTON;
  
    // Drive channels
    public final static int DRIVE_FRONT_LEFT_CHANNEL = 3;
    public final static int DRIVE_BACK_LEFT_CHANNEL = 4;
    public final static int DRIVE_FRONT_RIGHT_CHANNEL = 2;
    public final static int DRIVE_BACK_RIGHT_CHANNEL = 1;
      
    // Other channels
    public final static int CARGO_ROLLER_CHANNEL = 6;
    public final static int MOUTH_LEFT_CHANNEL = 5;
    public final static int MOUTH_LIMITER_CHANNEL = 0;
  
    // Lift motor channel
    public final static int LIFT_MOTOR_CHANNEL = 7;
    public final static int LIFT_LIMIT_TOP_CHANNEL = 1;
      
    //NavX angles
    public final static double LEFT_WALL_ANGLE = -90.0; //270.0?
    public final static double RIGHT_WALL_ANGLE = 90.0;
    public final static double BACK_WALL_ANGLE = 179.9;
    public final static double FRONT_WALL_ANGLE = 0.0;
  
  


}
