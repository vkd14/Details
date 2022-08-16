package com.credwise.task.Details.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("general_details")
public class Details  {
    @Id
    private String id;
    @Field(name = "name")
    private String name;
    @Field(name = "age")
    private Integer age;
    @Field(name = "identity")
    private Identity identity;

}

