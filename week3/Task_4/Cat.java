public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }

    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
        Object obj = (Animal) myCat.clone();
        if (obj instanceof Animal) {
            Cat myCat_2 = (Cat) obj;
            myCat_2.testInstanceMethod();
        }
        System.out.println("\nObject myCat is equal to clone of object obj: " + myCat.equals(obj));
        System.out.println("\nClass type of object obj: " + obj.getClass().getSimpleName());
        System.out.println("\nHash code of myCat: " + myCat.hashCode());
        System.out.println("\nString representation of myCat: " + myCat.toString());
    }
}
