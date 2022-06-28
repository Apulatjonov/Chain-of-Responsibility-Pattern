public class Child extends Processor{
    public Child(Processor nextPeriod) {
        super(nextPeriod);
    }

    public void proceed(Person person){
        if (person.getAge() > 1 && person.getAge() < 13){
            System.out.println(person.getName() + " is a Child!");
        }else{
            super.proceed(person);
        }
    }
}
