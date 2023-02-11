 public class Main {
     public static void main(String[] args) {
        Animal animal = new Animal("Mammals");
        System.out.println(animal.toString());

        Mammal mammal = new Mammal("Cat");
        System.out.println(mammal.toString());

        Cat c1 = new Cat("Masya");
         System.out.println(c1.toString());
         c1.greets();

         Dog d1 = new Dog("Chernysh");
         System.out.println(d1.toString());
         d1.greets();
         d1.greets(d1);
     }
 }
