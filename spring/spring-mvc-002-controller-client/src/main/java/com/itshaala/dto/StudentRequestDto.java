package com.itshaala.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class StudentRequestDto {
    private String email;
    private String psw;
    private String psw_repeat;
}
