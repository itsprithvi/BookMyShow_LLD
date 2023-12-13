package models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Setter
@Getter
@Entity
public class Screen extends BaseModel{
    private String screenNumber;

    @OneToMany
    private List<Seat> seats;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features;
}


// Cardinality

/*
*    1    ->     M
*   Screen  -   Seat   1 : M
*    1   <-      1
*
*     1    ->    M
*   Screen  -  Feature   M : M
*     M    <-    1
* */