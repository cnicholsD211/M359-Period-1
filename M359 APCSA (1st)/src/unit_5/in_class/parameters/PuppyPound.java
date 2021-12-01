package unit_5.in_class.parameters;

public class PuppyPound {
    public static void main(String[] args) {
        Dog brandy = new Dog("Brandy", 6);
        int brandyAge = 6;

        brandy.addDogYears(brandyAge);  // suppose to add 7
        System.out.println(brandyAge);

        System.out.println(brandy.getAge());
        haveBirthday(brandy);
        System.out.println(brandy.getAge());
    }

    public static void haveBirthday(Dog pupper){
        pupper.setAge(pupper.getAge() + 1);
    }
}
