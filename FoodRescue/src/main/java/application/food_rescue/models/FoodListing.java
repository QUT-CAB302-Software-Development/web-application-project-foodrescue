package application.food_rescue.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class FoodListing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private Integer quantity;
    @Column
    private String dietaryRequirements;
    @Column
    private String imageUrl;
    @Column
    private String pickupLocation;
    @Column
    private LocalDate pickupDate;


    public FoodListing(String title, String description, Integer quantity, String dietaryRequirements,
                      String pickupLocation, LocalDate pickupDate) {
        this.title = title;
        this.description = description;
        this.quantity = quantity;
        this.dietaryRequirements = dietaryRequirements;
        this.pickupLocation = pickupLocation;
        this.pickupDate = pickupDate;
    }

    public FoodListing() { }

    public LocalDate getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(LocalDate pickupDate) {
        this.pickupDate = pickupDate;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    public void setDietaryRequirements(String dietaryRequirements){
        this.dietaryRequirements = dietaryRequirements;
    }

    public void setPickupLocation(String location){
        this.pickupLocation = location;
    }

    public String getTitle(){
        return this.title;
    }
    public String getDescription(){
        return this.description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getQuantity(){
        return this.quantity;
    }

    public String getDietaryRequirements(){
        return this.dietaryRequirements;
    }


    public String getPickupLocation(){
        return this.pickupLocation;
    }

}
