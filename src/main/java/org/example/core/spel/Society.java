package org.example.core.spel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Society {

    public static String Advisors = "advisors";
    public static String President = "president";

    private String name;
    private List<Inventor> members = new ArrayList<>();
    private Map officers = new HashMap();

    public Society(String name) {
        this.name = name;
    }

    public List getMembers() {
        return members;
    }

    public void setMembers(List<Inventor> members) {
        this.members = members;
    }

    public Map getOfficers() {
        return officers;
    }

    public void setOfficers(Map officers) {
        this.officers = officers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMember(String name) {
        for (Inventor inventor : members) {
            if (inventor.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
