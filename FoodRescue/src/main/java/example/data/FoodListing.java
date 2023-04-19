package example.data;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FoodListing {
    public String title;
    public String description;
    public Integer quantity;
    public List<String> dietaryDetails;
    public LocalDateTime pickupTime;
    public String pickupLocation;
    public LocalDateTime expiryDate;
    public LocalDateTime preparationTime;

    public FoodListing(String title, String description, Integer quantity, ArrayList<String> dietaryDetails, LocalDateTime pickupTime, String pickupLocation) {
        this.title = title;
        this.description = description;
        this.quantity = quantity;
        this.dietaryDetails = dietaryDetails;
        this.pickupTime = pickupTime;
        this.pickupLocation = pickupLocation;
    }

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

    public void setDietaryDetails(List<String> dietaryDetails){
        this.dietaryDetails = dietaryDetails;
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

    public List<String> getDietaryDetails(){
        return this.dietaryDetails;
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
