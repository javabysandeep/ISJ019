package com.itshaala.springbootspringmvcjdbcwebservice.model;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Student {
    private int id;
    private String name;
    private String email;
    private String phone;

}