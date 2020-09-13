package AnimalRescuer;

public class AppMain {
    public static void main(String[] args) {
        Dog azorel = new Dog();
        Activity games = new Activity();
        Adopter adopter = new Adopter();
        AnimalFood food = new AnimalFood();
        Veterinarian vet = new Veterinarian();

        azorel.setName("Snow");
        azorel.setAge(2);
        azorel.setColor("white");
        azorel.setFavoriteActivity("jumping");
        azorel.setFavoriteFood("fish");
        azorel.setHealthLevel(1);
        azorel.setHungryLevel(1);
        azorel.setStateLevel(2);
        games.setName("rope jumping");
        adopter.setName("Marius Voiculescu");
        adopter.setMoney(500);
        food.setName("meat");
        food.setPrice(25);
        food.setQuantity(2);
        food.setStock(50);
        vet.setName("dr.Augustin Maior");
        vet.setDomain("chirurgie");

        System.out.println(azorel.getName()+ " has " + azorel.getAge() + " years old and is " + azorel.getColor()+ ".\nShe must go to "+
        vet.getName() + " specialist in " + vet.getDomain() + " because her health is " + azorel.getHealthLevel() + " level, and her state is " +
        azorel.getStateLevel() + " after the accident.\n"+ "After the intervention, her hungry level is " + azorel.getHungryLevel()+ ". \n" +
        azorel.getName()+"`s favorite food is " + azorel.getFavoriteFood()+ ". \n" + adopter.getName() +"buy this dog with " + adopter.getMoney()+
        " $.\n" + "He give to "+ azorel.getName() + " from his stock of " + food.getQuantity()+" " + food.getName() +" every day. \nAnd play " +
         games.getName() + " because " + adopter.getName() + " knows that "+azorel.getName()+" likes " + azorel.getFavoriteActivity());





        /*System.out.println("Dog name: " + azorel.name +"\nDog age: " +azorel.age + "\nDog healt level: " + azorel.healthLevel
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
                + "\nFood stock: " +food.stock);*/


    }
}
