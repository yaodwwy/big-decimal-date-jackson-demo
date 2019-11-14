package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@SpringBootApplication
@RestController
public class DemoApplication {


    @RequestMapping("/")
    public Person json(Person person) {

        if (person == null) {
            person = new Person();
        }

        if (person.getBigDecimal() == null) {
            person.setBigDecimal(new BigDecimal(Long.MAX_VALUE));
        }

        return Person.builder().id(person.getId())
                .date(new Date())
                .integer(Integer.MAX_VALUE)
                .localDate(LocalDate.now())
                .localDateTime(LocalDateTime.now())
                .bigDecimal(person.getBigDecimal())
                .name("参数是id: " + person.getId() + "  bigDecimal: " + person.getBigDecimal())
                .build();
    }

    @RequestMapping("/long")
    public Long max(@RequestParam(required = false) Long id) {
        if (id != null) {
            return id;
        }
        return Long.MAX_VALUE;
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
