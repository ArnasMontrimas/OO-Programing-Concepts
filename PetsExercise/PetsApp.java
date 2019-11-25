package PetsExercise;

public class PetsApp {
    public static void main(String[] args){
        //Creating Objects
        Pets dog1 = new Dog("Bob","James",5,"Labrador",60);
        Pets dog2 = new Dog("Tom","Arnas",10,"GermanShepard",80);
        Pets dog3 = new Dog("Larz","Karl",4,"Labrador",30);
        Pets dog4 = new Dog("Bob","James",5,"Labrador",60);
        Pets dog5 = new Dog("Bob","James",5,"Labrador",60);
        Pets dog6 = new Dog("Bob","James",5,"Labrador",60);

        Pets hamster1 = new Hamster("Hammy","Ross",1,"Blue");
        Pets hamster2 = new Hamster("Pork","Frank",3,"Brown");
        Pets hamster3 = new Hamster("Hery","Heinz",2,"Grey");

        myPets myPets = new myPets("MyPets");

        //Testing Methods
        myPets.addPet(dog1);
        myPets.addPet(dog2);
        myPets.addPet(dog3);
        myPets.addPet(dog4);
        myPets.addPet(dog5);
        myPets.addPet(dog6);
        myPets.addPet(hamster1);
        myPets.addPet(hamster2);
        myPets.addPet(hamster3);

        myPets.listPets();
        System.out.println(myPets.totalCost());
        System.out.println(myPets.totalIncomeFromDogs());
        System.out.println(myPets.findHamsterByColour("Grey"));
        System.out.println(myPets.findDogsByBreed("Labrador"));
        System.out.println(myPets.breedOfHeaviestDog());
        System.out.println(myPets.numberOfDogsEqualToAnother(dog1));
        System.out.println(myPets.countPetsByType(hamster1));
        System.out.println(myPets.numberOfPetsEqualToAnother(dog1));
    }
}
