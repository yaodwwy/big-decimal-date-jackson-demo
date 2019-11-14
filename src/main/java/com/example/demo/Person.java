package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Adam
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {

    private Long id;
    private Integer integer;
    private Date date;
    private LocalDate localDate;
    private LocalDateTime localDateTime;
    private BigDecimal bigDecimal;
    private String name;
}
