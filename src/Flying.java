public class Flying {
    private String typeOfMovement;

    public Flying(String typeOfMovement) {
        if (typeOfMovement == null || typeOfMovement.isEmpty()) {
            this.typeOfMovement = "fly";
        } else {
            this.typeOfMovement = typeOfMovement;
        }
    }
    public void animalClass(){
        System.out.println("класс птицы");

    }
    public void live() {
        System.out.println("Тип передвижения животного: " + typeOfMovement);
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        this.typeOfMovement = typeOfMovement;
    }

    public void fly() {
    }
}
