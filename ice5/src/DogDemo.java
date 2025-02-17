public class DogDemo {
    public static void main(String[] args) {
        // Create 2 Dog objects.
        Dog dog1 = new Dog(DogBreed.BEAGLE, 15.5, "Nana", "Female");
        Dog dog2 = new Dog(DogBreed.HUSKY, 23.0, "Patrick", "Male");

        // Get the dog breed and switch on it.
        switch (dog1.getDogBreed()) {
            case BULLDOG :
                System.out.println("The ordinal value for " + DogBreed.BULLDOG +
                                   " is " + DogBreed.BULLDOG.ordinal());
                break;
            case HUSKY :
                System.out.println("The ordinal value for " + DogBreed.HUSKY +
                                   " is " + DogBreed.HUSKY.ordinal());
                break;
            case BEAGLE :
                System.out.println("The ordinal value for " + DogBreed.BEAGLE +
                                   " is " + DogBreed.BEAGLE.ordinal());
                break;
            case POODLE :
                System.out.println("The ordinal value for " + DogBreed.POODLE +
                                   " is " + DogBreed.POODLE.ordinal());
                break;
            case OTHER :
                System.out.println("The ordinal value for " + DogBreed.OTHER +
                                   " is " + DogBreed.OTHER.ordinal());
        }
    }
}
