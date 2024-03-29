package com.example.shoppingcart.Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.json.bind.annotation.JsonbProperty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private int id;
    @JsonbProperty("title")
    private String title;
    @JsonbProperty("description")
    private String description;
    @JsonbProperty("imageAddr")
    private String imageAddr;
    @JsonbProperty("price")
    private String price;
    @JsonbProperty("Qnt")
    private String Qnt;
}