public class Herbivores extends Mammals {
    private final String typeOfFood;
    private String livingEnvironment;
    private int movementSpeed;

    public Herbivores(String typeOfFood, String livingEnvironment, int movementSpeed) {
        if (typeOfFood == null || typeOfFood.isEmpty()) {
            this.typeOfFood = "flowers";
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

    public void animalClass() {
        System.out.println("класс млекопитающие");
    }

    public void live() {
        System.out.println("Животное питается " + typeOfFood + " обитает на " + livingEnvironment + "  при беге развивает скорость " + movementSpeed);
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }


    @Override
    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    @Override
    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    @Override
    public int getMovementSpeed() {
        return movementSpeed;
    }

    @Override
    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void go() {

    }

    public void walking() {
    }

    public void graze() {
    }
}

