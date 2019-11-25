package PetsExercise;

import java.util.ArrayList;

public class myPets {
    private String listName;
    private ArrayList<Pets> myPets;

    public myPets(String listName) {
        this.listName = listName;
        this.myPets = new ArrayList<>();
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public boolean addPet(Pets pet) {
        return myPets.add(pet);
    }

    public boolean removePet(Pets pet) {
        return myPets.remove(pet);
    }

    public double totalCost() {
        double total = 0;
        for(Pets p: myPets) {
            total += p.calcCost();
        }
        return total;
    }

    public double totalIncomeFromDogs() {
        double total = 0;
        for(Pets p: myPets) {
            if(p instanceof Dog) {
                total += p.calcCost();
            }
        }
        return total;
    }

    public Pets findHamsterByColour(String colour) {
        Pets found = null;
        for(Pets p: myPets) {
            if(p instanceof Hamster) {
                if(((Hamster) p).getColour().equalsIgnoreCase(colour)) {
                   found = p;
                }
            }
        }
        return found;
    }

    public String breedOfHeaviestDog() {
        double max = Double.MIN_VALUE;
        String breed = "";
        for(Pets p: myPets) {
            if(p instanceof Dog){
                max = Math.max(((Dog) p).getWeight(), max);
                if(max == ((Dog) p).getWeight()) breed = ((Dog) p).getBreed();
            }
        }
        return breed;
    }

    public void listPets(){
        for(Pets p: myPets) {
            System.out.println(p.toString());
        }
    }

    public int findDogsByBreed(String breed) {
        int count = 0;
        for(Pets p: myPets){
            if(p instanceof Dog){
                if(((Dog) p).getBreed().equalsIgnoreCase(breed)){
                    count++;
                }
            }
        }
        return count;
    }

    public int countPetsByType(Pets type) {
        int count = 0;
        for(Pets p: myPets){
            if(p.getClass() == type.getClass()) {
                count++;
            }
        }
        return count;
    }

    private boolean compareDogsBreedWeight(Dog dog1, Dog dog2) {
        return (dog1.getBreed().equalsIgnoreCase(dog2.getBreed()) && dog1.getWeight() == dog2.getWeight());
    }

    private boolean comparePetsNameOwner(Pets pet1, Pets pet2) {
        return pet1.getOwner().equalsIgnoreCase(pet2.getOwner()) && pet1.getPetName().equalsIgnoreCase(pet2.getPetName());
    }

    public int numberOfDogsEqualToAnother(Pets another) {
        int count = -1;
        for(Pets p: myPets) {
            if(p instanceof Dog) {
                if(compareDogsBreedWeight((Dog)p,(Dog)another)) {
                    count++;
                }
            }
        }
        return count;
    }

    public int numberOfPetsEqualToAnother(Pets another) {
        int count = -1;
        for(Pets p: myPets) {
            if (comparePetsNameOwner(p, another)) {
                count++;
            }
        }
        return count;
    }
}
