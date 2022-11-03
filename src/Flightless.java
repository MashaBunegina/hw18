public class Flightless extends Birds{
    private String typeOfMovement;

    public Flightless(String typeOfMovement) {
        if (typeOfMovement == null || typeOfMovement.isEmpty()) {
            this.typeOfMovement = "go";
        } else {
            this.typeOfMovement = typeOfMovement;
        }
    }
    public void animalClass() {
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

    public void walk(){

   }
}
