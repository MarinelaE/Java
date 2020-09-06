package AnimalRescuer;

public class AppMain {
    public static void main(String[] args) {
        Dog azorel=new Dog();
        System.out.println("Dog name: " + azorel.name +"\nDog age: " +azorel.age + "\nDog healt level: " + azorel.healthLevel
                + "\nDog hungry level: " + azorel.hungryLevel+ "\nDog favorite activitie: " + azorel.favoriteActivity
                + "\nDog favorite food: " + azorel.favoriteFood+ "\nDog state level: " + azorel.stateLevel);
        Adopter a = new Adopter();
        System.out.println("Adopter name: " + a.name+ "\nAdopter amount of money availeble: " +a.money);
        Veterinarian v = new Veterinarian();
        System.out.println("Veterian name: " + v.name+ "\nVeterian domain: " +v.domain);
        Activity activity=new Activity();
        System.out.println("Activity: " + activity.name);
        AnimalFood food = new AnimalFood();
        System.out.println("Food name: " + food.name+ "\nFood price: " +food.price+ "\nFood quantity: " +food.quantity
                + "\nFood stock: " +food.stock);


    }
}
