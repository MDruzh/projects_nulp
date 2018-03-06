import java.util.*;

public class Exhibition {
    private int date;
    private String subject;
    private double ticketPrice;
    private List<Exhibit> exhibitList = new LinkedList<Exhibit>();

    public Exhibition(int date, String subject, double ticketPrice) {
        this.date = date;
        this.subject = subject;
        this.ticketPrice = ticketPrice;
    }

    public void addExhibit(Exhibit addExhibit) {
        exhibitList.add(addExhibit);
    }

    public List<Exhibit> sortExhibitByAge() {
        exhibitList.sort((Exhibit o1, Exhibit o2) -> o1.getAge() - o2.getAge());
        return exhibitList;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setExhibitList(List<Exhibit> exhibitList) {
        this.exhibitList = exhibitList;
    }

    public List<Exhibit> findExhibitByAge(int age) {
        List<Exhibit> result = new LinkedList<>();
        for (Exhibit exhibit : exhibitList) {
            if (exhibit.getAge() == age) {
                result.add(exhibit);
            }
        }
        return result;
    }

    public List<Exhibit> getExhibitList() {
        return exhibitList;
    }
}