package models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{

    @ManyToOne
    private Show show;

    @ManyToOne
    private Seat seat;

    private ShowSeatStatus showSeatStatus;
}


// Cardinality

/*
*       1     ->  1
*    ShowSeat - Show   M : 1
*       M     <-   1
*
*       1    ->  1
*    ShowSeat - Seat  M : 1
*       M   <-   1
*
* */