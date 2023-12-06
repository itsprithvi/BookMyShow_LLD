package models;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Setter
@Getter
public class Screen extends BaseModel{
    private String screenNumber;
    private List<Seat> seats;
    private List<Feature> features;
}
