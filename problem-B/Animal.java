public class Animal {
    private String name;

    public Animal(){

    }
    public Animal(String name){
        this.name = name;
    }
    public String getName(String name){
        return this.name;
    }
    public String toString(){
        return String.format("Animal[\"%s\"]",this.name);
    }
}
