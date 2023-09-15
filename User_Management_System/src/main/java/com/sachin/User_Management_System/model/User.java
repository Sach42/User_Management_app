package com.sachin.User_Management_System.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer  UserId;
    private String Name;
    private String UserName ;
    private String  Address;
    private String PhoneNumber;
}
