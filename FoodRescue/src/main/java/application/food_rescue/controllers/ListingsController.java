package application.food_rescue.controllers;

import application.food_rescue.models.FoodListing;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class ListingsController {

    public List<FoodListing> allListings = new ArrayList<>();

    public void addListing(FoodListing listing){
        allListings.add(listing);
    }

    public void deleteListing(FoodListing listing){
        allListings.remove(listing);
    }

    public List<FoodListing> dietaryFilter(List<FoodListing> allListings, String dietaryRequirement){
        List<FoodListing> filteredListings = new ArrayList<>();
        for(FoodListing listing: allListings){
            if(listing.getDietaryDetails().contains(dietaryRequirement)){
                filteredListings.add(listing);
            }

        }
        return filteredListings;
    }

    public List<FoodListing> pickupTimeFilter(List<FoodListing> allListings, Time time){
        List<FoodListing> filteredListings = new ArrayList<>();
        for(FoodListing listing: allListings){
            if(listing.getPickupTime().equals(time)){
                filteredListings.add(listing);
            }

        }
        return filteredListings;
    }

    public List<FoodListing> quantityFilter(List<FoodListing> allListings, Integer quantity){
        List<FoodListing> filteredListings = new ArrayList<>();
        for(FoodListing listing: allListings){
            if(listing.getQuantity() >= quantity){
                filteredListings.add(listing);
            }

        }
        return filteredListings;
    }

    public List<String> getAllListings(){
        List<String> listings = new ArrayList<String>();
        for(FoodListing listing : allListings){
            System.out.println(listing.getTitle());
        }
        return listings;
    }

}