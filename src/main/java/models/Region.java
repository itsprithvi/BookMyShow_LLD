package models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Setter
@Getter
public class Region extends BaseModel{
    private String name;
    private List<Theatre> theatres;
}
