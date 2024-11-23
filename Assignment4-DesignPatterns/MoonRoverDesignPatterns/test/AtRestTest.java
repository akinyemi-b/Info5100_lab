import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AtRestTest {

    @Test
    public void testPressRightPedal() {
        Rover rover = new Rover(new AtRest());
        assertTrue(rover.pressRightPedal(1), "Right pedal should be successfully pressed.");
    }

    @Test
    public void testPressLeftPedalForTime() {
        Rover rover = new Rover(new AtRest());
        rover.pressLeftPedalForTime(5);  // Should transition to MoveBackward state
        rover.printStateAndSubState();
    }

    @Test
    public void testPressLeftPedalForTimeFailure() {
        Rover rover = new Rover(new AtRest());
        rover.pressLeftPedalForTime(3);  // Should fail since AtRest requires 5 seconds
        rover.printStateAndSubState();
    }
}
