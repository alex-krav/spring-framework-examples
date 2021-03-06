package org.example.core.spel;

import java.util.Date;
import java.util.GregorianCalendar;

public class InventorPublic {

    public String name;
    public String nationality;
    public String[] inventions;
    public Date birthdate;
    public PlaceOfBirth placeOfBirth;

    public InventorPublic(String name, String nationality) {
        GregorianCalendar c= new GregorianCalendar();
        this.name = name;
        this.nationality = nationality;
        this.birthdate = c.getTime();
    }

    public InventorPublic(String name, Date birthdate, String nationality) {
        this.name = name;
        this.nationality = nationality;
        this.birthdate = birthdate;
    }

    public InventorPublic() {
    }
}