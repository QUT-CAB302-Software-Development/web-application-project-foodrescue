package application.food_rescue.models;

import jakarta.persistence.*;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
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
    @Column(nullable = false)
    private LocalDateTime pickupTime;
    @Column(nullable = false)
    private String pickupLocation;
    @Column
    private LocalDateTime expiryDate;
    @Column
    private LocalDateTime preparationTime;

    public FoodListing(String title, String description, Integer quantity, String dietaryRequirements, LocalDateTime pickupTime, String pickupLocation) {
        this.title = title;
        this.description = description;
        this.quantity = quantity;
        this.dietaryRequirements = dietaryRequirements;
        this.pickupTime = pickupTime;
        this.pickupLocation = pickupLocation;
    }

    public FoodListing() { }

    public void setExpiryDate(LocalDateTime expiryDate){
        this.expiryDate = expiryDate;
    }

    public void setPreparationTime(LocalDateTime preparationTime){
        this.preparationTime = preparationTime;
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

    public void setDietaryDetails(String dietaryDetails){
        this.dietaryRequirements = dietaryDetails;
    }

    public void setPickupTime(LocalDateTime time){
        this.pickupTime = time;
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

    public Integer getQuantity(){
        return this.quantity;
    }

    public String getDietaryDetails(){
        return this.dietaryRequirements;
    }

    public LocalDateTime getPickupTime(){
        return this.pickupTime;
    }

    public String getPickupLocation(){
        return this.pickupLocation;
    }

    public LocalDateTime getExpiryDate(){
        return this.expiryDate;
    }

    public LocalDateTime getPreparationTime(){
        return this.preparationTime;
    }
}
