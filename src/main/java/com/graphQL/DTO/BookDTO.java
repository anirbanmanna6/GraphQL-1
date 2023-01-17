package com.graphQL.DTO;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookDTO {
    private int id;
    private String title;
    private String description;
    private String author;
    private double price;
    private int pages;
}
