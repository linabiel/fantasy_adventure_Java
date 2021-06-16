import org.junit.Before;
import org.junit.Test;
import room.Exit;
import room.Room;

import java.util.Arrays;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private ArrayList<Exit> exits;
    Room room;

    @Before
    public void before(){
        exits.addAll(Arrays.asList(Exit.values()));
        room = new Room("Minas Tirith", exits);
    }

    @Test
    public void roomHasExits() {
        assertEquals(4, exits.size());
    }
}
