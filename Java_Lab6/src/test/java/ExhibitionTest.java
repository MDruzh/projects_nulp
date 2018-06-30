import org.junit.Test;
import ua.Lviv.iot.*;


import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ExhibitionTest {
    private List<Exhibit> exhibitList = new LinkedList<>();
    private List<Exhibit> result = new LinkedList<>();
    private Exhibition exhibition = new Exhibition(exhibitList);
    private Exhibit exhibit;

    @Test
    public void addExhibit(){
        exhibitList.add(new Sword(ExhibitName.SWORD, ExhibitAge.FIVEBC, "war","weapon",
                "well", 13.5, 25.7));
        exhibitList.add(new Sword(ExhibitName.SWORD, ExhibitAge.SIXBC, "war","weapon",
                "bad", 15, 30));
        exhibitList.add(new Shield(ExhibitName.SHIELD, ExhibitAge.FIVEBC, "war","defense",
                "well", 10, "circle"));
        exhibitList.add(new Shield(ExhibitName.SHIELD, ExhibitAge.SEVENBC, "war","defense",
                "very bad", 13, "oval"));
        exhibitList.add(new Clothes(ExhibitName.CLOTHES, ExhibitAge.FIVEBC, "craft","clothes",
                "well", 2, "hemp"));
        exhibitList.add(new Clothes(ExhibitName.CLOTHES, ExhibitAge.EIGHTBC, "craft","clothes",
                "good", 2, "hemp"));
        exhibitList.add(new Chronicle(ExhibitName.CHRONICLE, ExhibitAge.FIVEBC, "writing","book",
                "good", 4, 400));
        exhibitList.add(new Chronicle(ExhibitName.CHRONICLE, ExhibitAge.SIXBC, "writing","book",
                "good", 4, 500));
    }

    @Test
    public void findByAge(){
        addExhibit();
        List<Exhibit> findResult = exhibition.findExhibitByAge(ExhibitAge.FIVEBC);
        assertEquals(ExhibitName.SWORD, findResult.get(0).getName());
        assertEquals(ExhibitName.SHIELD, findResult.get(1).getName());
        assertEquals(ExhibitName.CLOTHES, findResult.get(2).getName());
        assertEquals(ExhibitName.CHRONICLE, findResult.get(3).getName());
    }

    @Test
    public void  sortByAge(){
        addExhibit();
        List<Exhibit> sortedExhibits = exhibition.sortExhibitByAge(exhibitList);
        assertEquals(ExhibitAge.EIGHTBC.toString(), sortedExhibits.get(0).getAge());
        assertEquals(ExhibitAge.FIVEBC.toString(), sortedExhibits.get(1).getAge());
        assertEquals(ExhibitAge.SEVENBC.toString(), sortedExhibits.get(2).getAge());
        assertEquals(ExhibitAge.SIXBC.toString(),sortedExhibits.get(3).getAge());

    }

}
