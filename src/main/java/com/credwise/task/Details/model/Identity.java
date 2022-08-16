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
public class Identity {

    @Field(name = "aadhar")
    @Indexed(unique = true)
    private String aadhar;
    @Field(name = "pan")
    @Indexed(unique = true)
    private String pan;
}
