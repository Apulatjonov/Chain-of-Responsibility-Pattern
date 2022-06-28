public class Adolescent extends Processor{
    public Adolescent(Processor nextPeriod) {
        super(nextPeriod);
    }

    public void proceed(Person person){
        if (person.getAge() > 12 && person.getAge() < 21){
            System.out.println(person.getName() + " is an Adolescent!");
        }else{
            super.proceed(person);
        }
    }
}
