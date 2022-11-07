public class Birds extends Animals {
    String livingEnvironment;

    private String typeOfFood;
    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }


    public Birds(String typeOfFood, String livingEnvironment) {
        if (typeOfFood == null || typeOfFood.isEmpty()) {
            this.typeOfFood = "insects";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    @Override
    public void eat() {
        System.out.println("Тип еды животного" + typeOfFood);

    }

    @Override
    public void sleep() {
        System.out.println("спит");
    }

    @Override
    public void go() {
        System.out.println("летает");
    }

    public void hunt() {
        System.out.println("охотится");
    }
}
