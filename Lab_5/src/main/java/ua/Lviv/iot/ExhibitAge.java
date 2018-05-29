package ua.Lviv.iot;

public enum ExhibitAge {

    FIVEBC(5), SIXBC(6), SEVENBC(7), EIGHTBC(8);


    private Integer age;

    ExhibitAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

}