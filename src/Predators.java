public class Predators extends Mammals {
    private String typeOfFood;
    String livingEnvironment;
    int movementSpeed;


    public Predators(String typeOfFood, String livingEnvironment, int movementSpeed) {
        if (typeOfFood == null || typeOfFood.isEmpty()) {
            this.typeOfFood = "meat";
        } else {
            this.typeOfFood = typeOfFood;
        }
        if (livingEnvironment == null || livingEnvironment.isEmpty()) {
            this.livingEnvironment = "ground";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
        if (movementSpeed <= 0) {
            this.movementSpeed = 50;
        } else {
            this.movementSpeed = movementSpeed;

        }
    }

    public void live() {
        System.out.println("Животное питается " + typeOfFood + " обитает на " + livingEnvironment + " при беге развивает скорость " + movementSpeed);
    }

    public void animalClass() {
        System.out.println("класс млекопитающие");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public void hunt() {
    }
}