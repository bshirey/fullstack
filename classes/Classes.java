package classes;

class Animal
{
    private double height;
    private double weight;
    private String animalType;
    private String bloodType;

    public Animal(double height, double weight, String animalType, String bloodType)
    {
        this.height = height;
        this.weight = weight;
        this.animalType = animalType;
        this.bloodType = bloodType;
    }

    public String toString()
    {
        return "Height: " + this.height + ", Weight: " + this.weight + ", Animal Type: " + this.animalType + ", Blood Type: " + this.bloodType;
    }

    public void ShowInfo()
    {
        System.out.println("Info... " + toString());
    }
}

class Reptile extends Animal
{
    private boolean hasSoftEggs;

    public Reptile(double height, double weight, String animalType, boolean hasSoftEggs)
    {
        super(height, weight, animalType, "Cold");
        this.hasSoftEggs = hasSoftEggs;
    }

    public String toString()
    {
        return super.toString() + ", Has Dry Skin, Has Backbone, " + 
            (this.hasSoftEggs ? "Has Soft Eggs" : "Has Hard Eggs");
    }
}

class Crocodile extends Reptile
{
    public Crocodile(double height, double weight)
    {
        super(height, weight, "Crocodile", false);
    }
}

class Fish extends Animal
{
    public Fish(double height, double weight, String animalType)
    {
        super(height, weight, animalType, "Cold");
    }

    public String toString()
    {
        return super.toString() + ", Lives in Water, Has Gills";
    }
}

class Eel extends Fish
{
    public Eel(double height, double weight)
    {
        super(height, weight, "Eel");
    }

    public String toString()
    {
        return super.toString() + ", Releases Electric Charge";
    }
}

class Bird extends Animal
{
    public Bird(double height, double weight, String animalType)
    {
        super(height, weight, animalType, "Warm");
    }

    public String toString()
    {
        return super.toString() + ", Can Fly, Has Feathers";
    }
}

class Eagle extends Bird
{
    public Eagle(double height, double weight)
    {
        super(height, weight, "Eagle");
    }
}

public class Classes {
    public static void main(String args[])
    {
        Reptile snake = new Reptile(1.5, 14, "Snake", true);
        Crocodile croc = new Crocodile(13, 280);
        Fish lionFish = new Fish(4, 0.5, "Fish");
        Eel eel = new Eel(5, 8);
        Bird bird = new Bird(6.5, 2.0, "Bird");
        Eagle eagle = new Eagle(11.75, 15.5);
        Animal badger = new Animal(22, 50, "Badger", "Warm");

        Animal animals[] = {snake, croc, lionFish, eel, bird, eagle, badger};

        for (Animal animal : animals)
        {
            animal.ShowInfo();
            System.out.println("------------------");
        }
    }
}
