package ua.Lviv.iot;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Writer{
    public void writeToFile(final List <Exhibit> exhibitList) throws IOException {
        try (PrintWriter writer = new PrintWriter("file.csv")){

            exhibitList.forEach(( Exhibit x )->  {
                writer.println(x.getHeaders());
                writer.println(x.toCVS());
            });

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
