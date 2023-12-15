package com.huawei.codearts.dto;

import java.io.Serializable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Luis Enrique Carranza - Huawei Cloud
 */

@Data
@Getter
@Setter
public class UsersDTO implements Serializable{
    private int id;
    private String name;
    private String sex;
    private String nationality;
    private String age;
}