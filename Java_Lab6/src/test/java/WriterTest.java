import java.util.List;
import org.junit.Test;
//import org.junit.jupiter.api.Test;
import ua.Lviv.iot.*;
import ua.Lviv.iot.Exhibition;

import java.util.LinkedList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class WriterTest {


    Exhibition exhibition = new Exhibition(5, "6", 6);
    private List<Exhibit> exhibitList = new LinkedList<>();
    @Test
    public void testWriter() {
        Writer writer = new Writer();
        exhibitList.add(new Sword(ExhibitName.SWORD,ExhibitAge.FIVEBC, "Weapon", "Rome", "Average", 5.4, 1.2));
        exhibitList.add(new Shield(ExhibitName.SHIELD, ExhibitAge.EIGHTBC, "Weapon", "Rome", "Average", 5.4, "Square"));
        exhibitList.add(new Clothes(ExhibitName.CLOTHES, ExhibitAge.SEVENBC, "ua.Lviv.iot.Clothes", "Rome", "Average", 5.4, "Leather"));
        exhibitList.add(new Chronicle(ExhibitName.CHRONICLE, ExhibitAge.SIXBC, "ua.Lviv.iot.Chronicle", "Rome", "Average", 5.4, 234));

        try {
            writer.writeToFile(exhibitList);
        } catch (Exception e) {
            assertFalse(false);
        }
    }


}
