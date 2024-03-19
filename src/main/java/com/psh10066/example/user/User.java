package com.psh10066.example.user;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Getter
public class User {

    @Id // MongoDB에서의 Id는 String or ObjectId
    private String id;
    private String name;
}
