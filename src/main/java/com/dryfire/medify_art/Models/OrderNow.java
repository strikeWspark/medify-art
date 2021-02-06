package com.dryfire.medify_art.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Objects;

@Entity
public class OrderNow {

    @Id
    @GeneratedValue
    private Long ordernow_id;
    private String ordernow_itemName;
    private String ordernow_shopName;
    private float ordernow_price_of_item;
    private int ordernow_amount_of_calories;
    private String ordernow_dietType;
    private ArrayList<String> ordernow_ingridients;


    public OrderNow(){

    }
    public OrderNow(String ordernow_itemName, String ordernow_shopName, float ordernow_price_of_item, int ordernow_amount_of_calories, String ordernow_dietType, ArrayList<String> ordernow_ingridients) {
        this.ordernow_id = ordernow_id;
        this.ordernow_itemName = ordernow_itemName;
        this.ordernow_shopName = ordernow_shopName;
        this.ordernow_price_of_item = ordernow_price_of_item;
        this.ordernow_amount_of_calories = ordernow_amount_of_calories;
        this.ordernow_dietType = ordernow_dietType;
        this.ordernow_ingridients = ordernow_ingridients;
    }

    public Long getOrdernow_id() {
        return ordernow_id;
    }

    public void setOrdernow_id(Long ordernow_id) {
        this.ordernow_id = ordernow_id;
    }

    public String getOrdernow_itemName() {
        return ordernow_itemName;
    }

    public void setOrdernow_itemName(String ordernow_itemName) {
        this.ordernow_itemName = ordernow_itemName;
    }

    public String getOrdernow_shopName() {
        return ordernow_shopName;
    }

    public void setOrdernow_shopName(String ordernow_shopName) {
        this.ordernow_shopName = ordernow_shopName;
    }

    public float getOrdernow_price_of_item() {
        return ordernow_price_of_item;
    }

    public void setOrdernow_price_of_item(float ordernow_price_of_item) {
        this.ordernow_price_of_item = ordernow_price_of_item;
    }

    public int getOrdernow_amount_of_calories() {
        return ordernow_amount_of_calories;
    }

    public void setOrdernow_amount_of_calories(int ordernow_amount_of_calories) {
        this.ordernow_amount_of_calories = ordernow_amount_of_calories;
    }

    public String getOrdernow_dietType() {
        return ordernow_dietType;
    }

    public void setOrdernow_dietType(String ordernow_dietType) {
        this.ordernow_dietType = ordernow_dietType;
    }

    public ArrayList<String> getOrdernow_ingridients() {
        return ordernow_ingridients;
    }

    public void setOrdernow_ingridients(ArrayList<String> ordernow_ingridients) {
        this.ordernow_ingridients = ordernow_ingridients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderNow orderNow = (OrderNow) o;
        return Float.compare(orderNow.ordernow_price_of_item, ordernow_price_of_item) == 0 && ordernow_amount_of_calories == orderNow.ordernow_amount_of_calories && Objects.equals(ordernow_id, orderNow.ordernow_id) && Objects.equals(ordernow_itemName, orderNow.ordernow_itemName) && Objects.equals(ordernow_shopName, orderNow.ordernow_shopName) && Objects.equals(ordernow_dietType, orderNow.ordernow_dietType) && Objects.equals(ordernow_ingridients, orderNow.ordernow_ingridients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordernow_id, ordernow_itemName, ordernow_shopName, ordernow_price_of_item, ordernow_amount_of_calories, ordernow_dietType, ordernow_ingridients);
    }

    @Override
    public String toString() {
        return "OrderNow{" +
                "ordernow_id=" + ordernow_id +
                ", ordernow_itemName='" + ordernow_itemName + '\'' +
                ", ordernow_shopName='" + ordernow_shopName + '\'' +
                ", ordernow_price_of_item=" + ordernow_price_of_item +
                ", ordernow_amount_of_calories=" + ordernow_amount_of_calories +
                ", ordernow_dietType='" + ordernow_dietType + '\'' +
                ", ordernow_ingridients=" + ordernow_ingridients +
                '}';
    }
}
