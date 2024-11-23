/**
 * State class - the description of this class
 * @author Boss name, sayed mohsin rezaz
 * @version 9.1
 */
//public class State {
//    protected String name = "NULL";
//    protected String subState = "NULL";
//
//    State() {}
//    
//    /** 
//     * Press right pedal reza
//     * @param numOfTimesPressed Use to get how many times pressed
//     * @return boolean
//     */
//    public Boolean pressRightPedal(int numOfTimesPressed) {
//        return false;
//    }
//    
//    
//    /** 
//     * Press right pedal reza
//     * @param numOfTimesPressed Use to get how many times pressed
//     * @return boolean
//     */
//    protected void pressRightPedalForTime(int numOfSecondsPressed) {}
//
//    protected Boolean pressLeftPedal(int numOfTimesPressed) {
//        return false;
//    }
//
//    protected Boolean pressLeftPedalForTime(int numOfSecondsPressed) {
//        return false;
//    }
//
//    protected void voidPressLeftPedalForTime(int numOfSecondsPressed) {}
//
//}
public abstract class State {
    protected String name;
    protected String subState;

    public abstract boolean pressRightPedal(int numOfTimesPressed);
    public abstract boolean pressLeftPedal(int numOfTimesPressed);
    public abstract void pressRightPedalForTime(int numOfSecondsPressed);
    public abstract void pressLeftPedalForTime(int numOfSecondsPressed);

    void voidPressLeftPedalForTime(int numOfSecondsPressed) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
