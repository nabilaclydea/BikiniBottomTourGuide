package com.example.android.bikinibottom;

public class Place {
    /**
     * Name for the place
     */
    private String name;

    /**
     * Description for the place
     */
    private String description;

    /**
     * Image resource ID for the word
     */
    private int image;

    /**
     * Create a new Place object.
     */
    public Place(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    /**
     * Get the name of the place.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the description of the place.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImage() {
        return image;
    }
}