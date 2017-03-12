package model;

/**
 * A class that represents a single pizza order.
 *
 * @author Matthew Brady
 */
public class PizzaOrder {

    private int id;
    private String email;
    private String size;
    private String toppings;
    private String orderTime;

    public PizzaOrder() {
        id = 0;
        email = "";
        size = "";
        toppings = null;
        orderTime = "";
    }

    public PizzaOrder(int id, String email, String size, String toppings, String orderTime) {
        this.id = id;
        this.email = email;
        this.size = size;
        this.toppings = toppings;
        this.orderTime = orderTime;
    }
    
    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    @Override
    public String toString() {
        return "PizzaOrder{" + "id=" + id + ", email=" + email + ", size=" + size + ", toppings=" + toppings + ", orderTime=" + orderTime + '}';
    }
    
    
}
