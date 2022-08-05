package org.generation.productsAPI.controller.dto;

public class ProductDto {
    private String name;

    private String description;

    private String imageUrl;

    //Does this constructor need the createdAt parameter and instance variable?

    public ProductDto( String name, String description, String imageUrl ) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription( String description ) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl( String imageUrl ) {
        this.imageUrl = imageUrl;
    }
}
