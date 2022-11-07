public abstract class Animals {
    String name;
    int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void go();

    public String toString() {
        return "Animals" +
                "name =" + name + '/' +
                " year =" + year;

    }

//public boolean equals(Object giraffe){
    //  if (this == giraffe)
    //     return true;
    //if (giraffe == null || getClass() != giraffe.getClass())
    //  return false;
    // Animals animals = (Animals) giraffe;
    //  return name == animals.name && year == animals.year;
}

