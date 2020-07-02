package com.example.restfulwebservice.user;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor  //모든 필드에 대해서 parameter로 갖는 생성자 추가.
public class User {
    private Integer id;
    private String name;
    private Date joinDate;





}
