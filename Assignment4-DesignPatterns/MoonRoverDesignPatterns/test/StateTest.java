import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StateTest {

    @Test
    void testPressRightPedal() {
        Rover rover = new Rover();
        rover.pressRightPedal(1); // Should transition to Move Forward state
        rover.printStateAndSubState();
        assertEquals("Move Forward", rover.currentState.name);
    }

    @Test
    void testPressLeftPedalForTime() {
        Rover rover = new Rover();
        rover.pressLeftPedalForTime(2); // Should transition to Move Backward state
        rover.printStateAndSubState();
        assertEquals("Move Backward", rover.currentState.name);
    }
}
