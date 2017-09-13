package model;

/**
 * Created by JinSei on 6/5/2017.
 */

public class User {

    private int id;
    private String item;
    private int amount;

    public int getId(){
        return  id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;

    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
