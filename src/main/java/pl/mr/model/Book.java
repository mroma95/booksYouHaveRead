package pl.mr.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Digits(integer = 13,fraction = 0)
    private int isbn;
    @NotBlank
    private String title;
    @Min(value = 1900)
    @Max(value = 2021)
    private int publishYear;
    @Min(value = 1)
    private int pages;
    @Column(columnDefinition = "BLOB")
    @Lob
    private String image;
    @ManyToOne
    private Author author;
    @ManyToOne
    private Publisher publisher;


}
