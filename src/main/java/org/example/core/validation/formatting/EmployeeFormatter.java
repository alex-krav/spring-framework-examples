package org.example.core.validation.formatting;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;
import java.util.StringJoiner;

public class EmployeeFormatter implements Formatter<Employee> {

    @Override
    public Employee parse(String text, Locale locale) throws ParseException {

        String[] split = text.split(",");
        if (split.length != 3) {
            throw new ParseException("The Employee string format " +
                    "should be in this format: Mike, Account, 111-111-1111",
                    split.length);
        }
        return new Employee(split[0].trim(), split[1].trim(), split[2].trim());
    }

    @Override
    public String print(Employee employee, Locale locale) {
        return new StringJoiner(", ")
                .add(employee.getName())
                .add(employee.getDept())
                .add(employee.getPhoneNumber())
                .toString();

    }
}