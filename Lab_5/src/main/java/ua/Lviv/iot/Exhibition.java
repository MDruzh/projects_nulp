package ua.Lviv.iot;

import ua.Lviv.iot.Exhibit;

import javax.enterprise.context.Dependent;
import java.util.*;

@Dependent
public class Exhibition {
    private int date;
    private String subject;
    private double ticketPrice;
    private List<Exhibit> exhibitList;

    public Exhibition(int date, String subject, double ticketPrice) {
        this.date = date;
        this.subject = subject;
        this.ticketPrice = ticketPrice;
        this.exhibitList = new LinkedList<>();

    }

    public void addExhibit(Exhibit addExhibit) {
        exhibitList.add(addExhibit);
    }

    public List<Exhibit> sortExhibitByAge() {
        exhibitList.sort((Exhibit o1, Exhibit o2) -> o1.getAge().getAge() - o2.getAge().getAge());
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
            if (exhibit.getAge().getAge() == age) {
                result.add(exhibit);
            }
        }
        return result;
    }

    public List<Exhibit> getExhibitList() {
        return exhibitList;
    }




}