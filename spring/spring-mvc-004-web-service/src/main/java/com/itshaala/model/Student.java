package com.itshaala.model;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Student {
    private int id;

    @NotNull
    @Size(min = 2, max = 50)
    private String name;

    @NotNull
    private String email;
    private String phone;

}
