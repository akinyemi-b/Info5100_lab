//public class AtRest extends State {
//    
//    AtRest() {
//        this.name = "At Rest";
//        this.subState = "None";
//    }
//
//    public Boolean pressRightPedal(int numOfTimesPressed) {
//        if(numOfTimesPressed != 1) {
//            System.out.println("Error: Can only press Right Pedal once when in At Rest State.\nUnable to move.");
//            return false;
//        } else {
//            System.out.println("Transitioning from At Rest State to Move Forward State...");
//            return true;
//        }
//    }
//
//    protected Boolean pressLeftPedalForTime(int numOfSecondsPressed) {
//        if(numOfSecondsPressed != 5) {
//            System.out.println("Error: Must press Right Pedal for 5 seconds when in At Rest State.\nUnable to move.");
//            return false;
//        } else {
//            System.out.println("Transitioning from At Rest State to Move Backward State...");
//            return true;
//        }
//    }
//}
public class AtRest extends State {

    public AtRest() {
        this.name = "At Rest";
        this.subState = "None";
    }

    @Override
    public boolean pressRightPedal(int numOfTimesPressed) {
        if(numOfTimesPressed != 1) {
            System.out.println("Error: Can only press Right Pedal once when in At Rest State.");
            return false;
        } else {
            System.out.println("Transitioning from At Rest State to Move Forward State...");
            return true;
        }
    }

    @Override
    public boolean pressLeftPedal(int numOfTimesPressed) {
        if(numOfTimesPressed != 1) {
            System.out.println("Error: Must press Left Pedal once when in At Rest State.");
            return false;
        }
        return true;
    }

    @Override
    public void pressRightPedalForTime(int numOfSecondsPressed) {
        System.out.println("Error: Cannot press Right Pedal for time while in At Rest State.");
    }

    @Override
    public void pressLeftPedalForTime(int numOfSecondsPressed) {
        if (numOfSecondsPressed == 5) {
            System.out.println("Transitioning from At Rest to Move Backward State...");
        } else {
            System.out.println("Error: Left Pedal must be pressed for 5 seconds.");
        }
    }
}
