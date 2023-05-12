package com.example.demo.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RelativesDTO {
    private String fullName;
    private String gender;
    private String phoneNumber;
    private String relationship;

}
