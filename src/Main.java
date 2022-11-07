public class Main {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("растения", "земля", 100);
        Herbivores giraffe = new Herbivores("растения", "земля", 60);
        Herbivores horse = new Herbivores("растения", "земля", 80);
        System.out.println(giraffe.equals(horse));
        System.out.println(gazelle.equals(giraffe));
        giraffe.animalClass();
        horse.animalClass();
        gazelle.live();
        giraffe.live();
        horse.live();

        Predators hyena = new Predators("мясо", "земля", 50);
        Predators tiger = new Predators("мясо", "земля", 90);
        Predators bear = new Predators("мясо", "земля", 55);
        System.out.println(bear.equals(tiger));
        hyena.animalClass();
        tiger.animalClass();
        tiger.live();
        bear.live();
        hyena.live();

        Amphibians frog = new Amphibians("water");
        Amphibians snake = new Amphibians("water");
        System.out.println(frog.equals(snake));
        frog.animalClass();
        snake.animalClass();

        Flightless peacock = new Flightless("go");
        Flightless penguin = new Flightless("go");
        Flightless Dodo = new Flightless("go");
        System.out.println(penguin.equals(peacock));
        penguin.animalClass();
        peacock.live();


        Flying seagull = new Flying("fly");
        Flying albatross = new Flying("fly");
        Flying falcon = new Flying("fly");
        System.out.println(seagull.equals(albatross));
        falcon.animalClass();
        seagull.live();
        falcon.live();
        albatross.live();
         albatross.eat();
    }
}