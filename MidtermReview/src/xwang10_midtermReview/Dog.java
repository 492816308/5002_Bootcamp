package xwang10_midtermReview;

public class Dog {
    private String breed;
    private double weight;
    private boolean female;

    public Dog(boolean isFemale) {
        female = isFemale;
        weight = 0.0;
        breed = "";
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isFemale() {
        return female;
    }

    public boolean isMale() {
        return !female;
    }
}
