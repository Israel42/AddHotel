package com.example.addhotel;

public class DisplayDetail {
    String hotelname;
    String imageurl;
    String Address;
    float rating;
    DisplayDetail(){

    }

    public DisplayDetail(String hotelname, String imageurl, String address,float rating) {
        this.hotelname = hotelname;
        this.imageurl = imageurl;
       this.Address = address;
       this.rating=rating;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
