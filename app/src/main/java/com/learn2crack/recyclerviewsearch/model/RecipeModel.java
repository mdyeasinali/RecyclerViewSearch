
package com.learn2crack.recyclerviewsearch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RecipeModel {

    @SerializedName("catId")
    @Expose
    private String catId;
    @SerializedName("userId")
    @Expose
    private String userId;
    @SerializedName("recName")
    @Expose
    private String recName;
    @SerializedName("recImage")
    @Expose
    private String recImage;
    @SerializedName("recDes")
    @Expose
    private String recDes;
    @SerializedName("recIng")
    @Expose
    private String recIng;
    @SerializedName("recDir")
    @Expose
    private String recDir;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("PreTime")
    @Expose
    private String preTime;
    @SerializedName("CookTime")
    @Expose
    private String cookTime;
    @SerializedName("publishDate")
    @Expose
    private String publishDate;
    @SerializedName("reviews")
    @Expose
    private String reviews;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RecipeModel() {
    }

    /**
     * 
     * @param recImage
     * @param reviews
     * @param recDes
     * @param recDir
     * @param userId
     * @param catId
     * @param rating
     * @param cookTime
     * @param recName
     * @param publishDate
     * @param preTime
     * @param recIng
     */
    public RecipeModel(String catId, String userId, String recName, String recImage, String recDes, String recIng, String recDir, String rating, String preTime, String cookTime, String publishDate, String reviews) {
        super();
        this.catId = catId;
        this.userId = userId;
        this.recName = recName;
        this.recImage = recImage;
        this.recDes = recDes;
        this.recIng = recIng;
        this.recDir = recDir;
        this.rating = rating;
        this.preTime = preTime;
        this.cookTime = cookTime;
        this.publishDate = publishDate;
        this.reviews = reviews;
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRecName() {
        return recName;
    }

    public void setRecName(String recName) {
        this.recName = recName;
    }

    public String getRecImage() {
        return recImage;
    }

    public void setRecImage(String recImage) {
        this.recImage = recImage;
    }

    public String getRecDes() {
        return recDes;
    }

    public void setRecDes(String recDes) {
        this.recDes = recDes;
    }

    public String getRecIng() {
        return recIng;
    }

    public void setRecIng(String recIng) {
        this.recIng = recIng;
    }

    public String getRecDir() {
        return recDir;
    }

    public void setRecDir(String recDir) {
        this.recDir = recDir;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPreTime() {
        return preTime;
    }

    public void setPreTime(String preTime) {
        this.preTime = preTime;
    }

    public String getCookTime() {
        return cookTime;
    }

    public void setCookTime(String cookTime) {
        this.cookTime = cookTime;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

}
