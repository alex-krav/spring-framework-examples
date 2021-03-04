package org.example.core.validation.formatting;

import org.springframework.core.convert.ConversionService;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.datetime.DateFormatterRegistrar;
import org.springframework.format.datetime.standard.DateTimeFormatterRegistrar;
import org.springframework.format.number.NumberFormatAnnotationFormatterFactory;
import org.springframework.format.support.DefaultFormattingConversionService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DefaultFormatterListExample {
    public static void main (String[] args) {
        DefaultFormattingConversionService service = new DefaultFormattingConversionService(false);
        service.addFormatterForFieldAnnotation(new NumberFormatAnnotationFormatterFactory());
//        System.out.println(service);
        DateTimeFormatterRegistrar registrar = new DateTimeFormatterRegistrar();
//        registrar.setDateFormatter(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        registrar.setDateFormatter(DateTimeFormatter.ofPattern("d MMMM"));
//        registrar.setUseIsoFormat(true);
        registrar.registerFormatters(service);

//        LocalDate localDate = service.convert("2017-11-05", LocalDate.class);
        LocalDate localDate = LocalDate.of(2017,11,05);
        String date = service.convert(localDate, String.class);
        System.out.println("localDate: " + localDate);
        System.out.println("date: " + date);
    }
}
