import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class WriterTest {


    Exhibition exhibition = new Exhibition(5, "6", 6);
    @Test
    public void testWriter() {
        Writer writer = new Writer();
        exhibition.addExhibit(new Sword(ExhibitName.SWORD, ExhibitAge.SEVENBC, "Weapon", "Rome", "Average", 5.4, 1.2));
        exhibition.addExhibit(
                new Shield(ExhibitName.SHIELD, ExhibitAge.SIXBC, "Weapon", "Rome", "Average", 5.4, "Square"));
        exhibition.addExhibit(
                new Clothes(ExhibitName.CLOTHES, ExhibitAge.FIVEBC, "Clothes", "Rome", "Average", 5.4, "Leather"));
        exhibition.addExhibit(
                new Chronicle(ExhibitName.CHRONICLE, ExhibitAge.EIGHTBC, "Chronicle", "Rome", "Average", 5.4, 234));

        try {
            writer.writeToFile(exhibition.getExhibitList());
        } catch (Exception e) {
            assertFalse(false);
        }
    }


}
