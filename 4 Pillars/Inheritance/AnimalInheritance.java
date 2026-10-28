
//super class

class Animal{
    void eat(){
        System.out.println("Eating");
    }
    void drink(){
        System.out.println("Drinking");
    }
}

//sub-class

class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
        
}

class AnimalInheritance{
    public static void main(String args[]){
        Dog d=new Dog();
        System.out.println("Characteristics of Dogs: ");
        d.eat();
        d.drink();
        d.bark();
    }
}