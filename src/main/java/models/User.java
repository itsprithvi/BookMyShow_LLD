package models;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class User extends BaseModel{
    private String username;
    private String email;

    @OneToMany
    private List<Booking> bookings;

}

// Cardinality
/*
*     1  ->  M
*   User  Booking  1 : M
*    1   <-  1
* */