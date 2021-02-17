package com.dhm.kafkaspringsampleone;

import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    private String name;
    private String department;
    private double salary;
}
