package com.example.springcsrf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateDTO {
    private  String username;
    private  String email;
    private  String password;
}
