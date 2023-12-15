package com.huawei.codearts.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.io.Serializable;

@Data
public class UserRequest implements Serializable {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("sex")
    private String sex;
    @JsonProperty("nationality")
    private String nationality;
    @JsonProperty("age")
    private String age;
}
