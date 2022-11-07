public class Amphibians extends Animals {
    String livingEnvironment;

    public Amphibians(String livingEnvironment) {
        if (livingEnvironment == null || livingEnvironment.isEmpty()) {
            this.livingEnvironment = "water";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public void animalClass() {
        System.out.println("класс земноводные");
    }

    public void live() {
        System.out.println("Земноводное обитает на " + livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
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

    public void hunt() {
    }
}
