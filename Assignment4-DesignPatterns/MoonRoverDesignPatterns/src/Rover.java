//
//import static java.nio.file.Files.move;
//
//////public class Rover {
//////    protected State currentState = new AtRest();
//////
//////    Rover() {}
//////
//////    protected void pressRightPedal(int numOfTimesPressed) {
//////        Boolean move;
//////        switch (this.currentState.name) {
//////            case "At Rest":
//////                move = this.currentState.pressRightPedal(numOfTimesPressed);
//////                if(move){ // no error
//////                    this.currentState = new MoveForward(); // current state becomes state MoveForward
//////                }
//////                break;
//////            case "Move Forward":
//////                move = this.currentState.pressRightPedal(numOfTimesPressed);
//////                // current state only changes to At Rest State if numOfTimesPressed is 3
//////                if(move) {
//////                    this.currentState = new AtRest();
//////                }
//////                break;
//////            default:
//////                System.out.println("Error: Can only press Right Pedal when in At Rest or inside Move Forward States.\nUnable to move.");
//////                break;
//////        }
//////    }
//////
//////    protected void pressRightPedalForTime(int numOfSecondsPressed) {
//////        if(this.currentState.name == "Move Backward" || this.currentState.name == "At Rest") {
//////            System.out.println("Error: Can only press Right Pedal for Time when inside Move Forward State.\nUnable to move.");
//////            return;
//////        }
//////        this.currentState.pressRightPedalForTime(numOfSecondsPressed);
//////    }
//////
//////    protected void pressLeftPedal(int numOfTimesPressed) {
//////        if(this.currentState.name == "Move Forward" || this.currentState.name == "At Rest") {
//////            System.out.println("Error: Can only press Left Pedal when inside Move Backward State.\nUnable to move.");
//////            return;
//////        }
//////        Boolean move = this.currentState.pressLeftPedal(numOfTimesPressed);
//////        // current state only changes to At Rest State if numOfTimesPressed is 3
//////        if(move) {
//////            this.currentState = new AtRest();
//////        }
//////    }
//////
//////    protected void pressLeftPedalForTime(int numOfSecondsPressed) {
//////        switch (this.currentState.name) {
//////            case "At Rest":
//////                Boolean move = this.currentState.pressLeftPedalForTime(numOfSecondsPressed);
//////                if(move) { // no error
//////                    this.currentState = new MoveBackward(); // current state becomes state MoveBackward
//////                }
//////                break;
//////            case "Move Backward":
//////                this.currentState.voidPressLeftPedalForTime(numOfSecondsPressed);
//////                break;
//////            default:
//////                System.out.println("Error: Can only press Left Pedal for Time when in At Rest or inside Move Backward States.\nUnable to move.");
//////                break;
//////        }
//////    }
//////
//////    protected void printStateAndSubState() {
//////        System.out.println("Current State: " + this.currentState.name);
//////        System.out.println("Current SubState: " + this.currentState.subState);
//////    }
//////
//////    public static void main(String[] args) {
//////        Rover rover = new Rover();
//////
//////        // Move Forward State 
//////        rover.pressRightPedal(1); // Move Forward - Accelerate
//////        rover.printStateAndSubState();
//////        rover.pressRightPedalForTime(5); //ConstantSpeed
//////        rover.printStateAndSubState();
//////        rover.pressRightPedalForTime(3); //Decelerate
//////        rover.printStateAndSubState();
//////        rover.pressRightPedal(2); //Accelerate
//////        rover.printStateAndSubState();
//////        rover.pressRightPedal(3); //Error
//////        rover.printStateAndSubState();
//////        rover.pressRightPedal(2); // Decelerate
//////        rover.printStateAndSubState();
//////
//////        // Transition to At Rest
//////        rover.pressRightPedal(3);
//////        rover.printStateAndSubState();
//////
//////        // Move Backward State
//////        rover.pressLeftPedalForTime(5); // Move Backward - Accelerate
//////        rover.printStateAndSubState();
//////        rover.pressLeftPedalForTime(3); // ConstantSpeed
//////        rover.printStateAndSubState();
//////        rover.pressLeftPedal(1); // Decelerate
//////        rover.printStateAndSubState();
//////        rover.pressLeftPedal(2); // Accelerate
//////        rover.printStateAndSubState();
//////        rover.pressLeftPedal(3); // Error
//////        rover.printStateAndSubState();
//////        rover.pressLeftPedal(2); // Decelerate
//////        rover.printStateAndSubState();
//////        rover.pressLeftPedal(3); // At Rest
//////        rover.printStateAndSubState();
//////    }
//////}
////
////public class Rover {
////    private State currentState;
////
////    public Rover() {
////        currentState = new AtRest(); // Initial state
////    }
////
////    public void pressRightPedal(int numOfTimesPressed) {
////        if (currentState.pressRightPedal(numOfTimesPressed)) {
////            if (currentState instanceof AtRest) {
////                setState(new MoveForward());
////            } else if (currentState instanceof MoveForward) {
////                setState(new AtRest());
////            }
////        }
////    }
////
////    public void pressLeftPedal(int numOfTimesPressed) {
////        if (currentState.pressLeftPedal(numOfTimesPressed)) {
////            if (currentState instanceof MoveBackward) {
////                setState(new AtRest());
////            }
////        }
////    }
////
////    public void pressRightPedalForTime(int numOfSecondsPressed) {
////        currentState.pressRightPedalForTime(numOfSecondsPressed);
////    }
////
////    public void pressLeftPedalForTime(int numOfSecondsPressed) {
////        currentState.pressLeftPedalForTime(numOfSecondsPressed);
////    }
////
////    void setState(State newState) {
////        currentState = newState;
////    }
////
////    public String getCurrentState() {
////        return currentState.name;
////    }
////}
//public class Rover {
//    protected State currentState = new AtRest();
//
//    Rover() {}
//
//    // Method to change the state
//    public void setState(State state) {
//        this.currentState = state;
//    }
//
//    protected void pressRightPedal(int numOfTimesPressed) {
//        Boolean move;
//        switch (this.currentState.name) {
//            case "At Rest":
//                move = this.currentState.pressRightPedal(numOfTimesPressed);
//                if(move){ // no error
//                    setState(new MoveForward()); // current state becomes MoveForward
//                }
//                break;
//            case "Move Forward":
//                move = this.currentState.pressRightPedal(numOfTimesPressed);
//                // current state only changes to At Rest State if numOfTimesPressed is 3
//                if(move) {
//                    setState(new AtRest());
//                }
//                break;
//            default:
//                System.out.println("Error: Can only press Right Pedal when in At Rest or inside Move Forward States.\nUnable to move.");
//                break;
//        }
//    }
//
//    protected void pressRightPedalForTime(int numOfSecondsPressed) {
//        if(this.currentState.name == "Move Backward" || this.currentState.name == "At Rest") {
//            System.out.println("Error: Can only press Right Pedal for Time when inside Move Forward State.\nUnable to move.");
//            return;
//        }
//        this.currentState.pressRightPedalForTime(numOfSecondsPressed);
//    }
//
//    protected void pressLeftPedal(int numOfTimesPressed) {
//        if(this.currentState.name == "Move Forward" || this.currentState.name == "At Rest") {
//            System.out.println("Error: Can only press Left Pedal when inside Move Backward State.\nUnable to move.");
//            return;
//        }
//        Boolean move = this.currentState.pressLeftPedal(numOfTimesPressed);
//        // current state only changes to At Rest State if numOfTimesPressed is 3
//        if(move) {
//            setState(new AtRest());
//        }
//    }
//
//    protected void pressLeftPedalForTime(int numOfSecondsPressed) {
//        switch (this.currentState.name) {
//            case "At Rest":
//               Boolean move = this.currentState.pressLeftPedalForTime(numOfSecondsPressed);
//                if(move) { // no error
//                    setState(new MoveBackward()); // current state becomes MoveBackward
//                }
//                break;
//            case "Move Backward":
//                this.currentState.voidPressLeftPedalForTime(numOfSecondsPressed);
//                break;
//            default:
//                System.out.println("Error: Can only press Left Pedal for Time when in At Rest or inside Move Backward States.\nUnable to move.");
//                break;
//        }
//    }
//
//    protected void printStateAndSubState() {
//        System.out.println("Current State: " + this.currentState.name);
//        System.out.println("Current SubState: " + this.currentState.subState);
//    }
//}
public class Rover {
    protected State currentState;  // Current state of the Rover
    
    // Constructor to initialize Rover with an initial state
    public Rover(State initialState) {
        this.currentState = initialState;
    }

    Rover() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Setter for state, allowing the state to be updated
    public void setState(State state) {
        this.currentState = state;
    }

    // Press the right pedal and transition based on the state
    public boolean pressRightPedal(int numOfTimesPressed) {
        // Delegate the method to the current state's behavior
        return this.currentState.pressRightPedal(numOfTimesPressed);
    }

    // Press the left pedal for a specific amount of time
    public void pressLeftPedalForTime(int numOfSecondsPressed) {
        // Call the void method directly, no need to store the result in a variable
        this.currentState.pressLeftPedalForTime(numOfSecondsPressed);
    }

    // Print current state and sub-state for debugging purposes
    public void printStateAndSubState() {
        System.out.println("Current State: " + this.currentState.name);
        System.out.println("Current SubState: " + this.currentState.subState);
    }
}
