package com.diego.transaccionalExample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {
    private String name;
    private Long phoneNumber;
    private String adress;
    private String email;
    private String officeAddress;
    private String bankAccount;
}
