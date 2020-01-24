

public class Dog {
    private String name;
    private String breed;
    private int age;
    private String color;

    public Dog (String name, String breed, int age, String color){
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.color=color;
    }

    public Dog() {

    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age=age;

    }

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color=color;
    }
}


