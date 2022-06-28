public class ChainMain {
    public static void main(String[] args) {
        Chain chain = new Chain();
        Person person1 = new Person("Bob", 1);
        Person person2 = new Person("Abraham", 36);
        Person person3 = new Person("Will", 69);
        Person person4 = new Person("Abdulaziz", 22);
        Person person5 = new Person("Patric", 10);
        Person person6 = new Person("Smith", 16);
        chain.proceed(person1);
        chain.proceed(person2);
        chain.proceed(person3);
        chain.proceed(person4);
        chain.proceed(person5);
        chain.proceed(person6);
    }
}
