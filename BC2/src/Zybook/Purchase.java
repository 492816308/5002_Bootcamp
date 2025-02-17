package Zybook;

public class Purchase {
    private String food;
    private int quantity;

    public void setFoodAndQuantity(String newFood, int newQuantity) {
        food = newFood;
        quantity = newQuantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
