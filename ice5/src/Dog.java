public class Dog {
    private DogBreed breed;
    private double weight;
    private String name;
    private String sex;

    public Dog (DogBreed dogBreed, double dogWeight, String dogName, String dogSex){
        breed = dogBreed;
        weight = dogWeight;
        name = dogName;
        sex = dogSex;
    }

    public DogBreed getDogBreed(){
        return breed;
    }
}
