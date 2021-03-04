package org.example.core.validation.formatting;

import org.springframework.format.support.DefaultFormattingConversionService;

public class CustomFormatterExample {
    public static void main(String[] args) {
        DefaultFormattingConversionService service = new DefaultFormattingConversionService(false);
        service.addFormatter(new EmployeeFormatter());

        Employee employee = new Employee("Joe", "IT", "123-456-7890");
        String string = service.convert(employee, String.class);
        System.out.println(string);

        Employee e = service.convert(string, Employee.class);
        System.out.println(e);
    }
}
