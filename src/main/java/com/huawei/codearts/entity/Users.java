package com.huawei.codearts.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author: Luis Enrique Carranza - Huawei Cloud
 * 
 * En esta Clase se define la estructura de la tabla Users
 * 
 */

@Data
@Entity
@Table(name = "users")
public class Users implements Serializable{

    @Id //Esta anotación indica que id es la llave primaria de la tabla.
    @Column(name="user_id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="sex")
    private String sex;
    @Column(name="nationality")
    private String nationality;
    @Column(name="age")
    private String age;
}