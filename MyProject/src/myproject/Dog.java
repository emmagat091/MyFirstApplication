package myproject;

//Clase Dog.
public class Dog implements IntAnimal {
    
    
    
    //Constructor de clase.
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    String name = "Rex"; //Variables adicionadas a la clase.
    int age; //Variables adicionadas a la clase.

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Dog() {
        super();
    }
    //Código agregado por el proyecto.
    public String sayHowDoYouDo(String name) {
        return " woof " + name;
    }
    //Código agregado por el proyecto.
    public static void main(String[] args) {
        //Cat myCat = new Cat();
        //TODO create a Cat class
        Dog myDog = new Dog();
        for (int count = 0; count < 3; count++) {
            System.out.println(count + myDog.sayHowDoYouDo("Jeff"));
        }

    }


}
