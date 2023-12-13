package models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@MappedSuperclass
public class BaseModel {
    // Base model will contain the attributes which are common to all the entities.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Primary key
    private Date createdAt;
    private Date lastModifiedAt;

}
