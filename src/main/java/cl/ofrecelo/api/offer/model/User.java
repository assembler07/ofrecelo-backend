package cl.ofrecelo.api.offer.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
public class User {

    @Id
    private String id;

    private String email;

    private String name;

    private String lastName;

    private String password;
}