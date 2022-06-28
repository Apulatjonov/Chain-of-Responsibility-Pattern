public class Infant extends Processor{
    public Infant(Processor nextPeriod) {
        super(nextPeriod);
    }

    public void proceed(Person person){
        if (person.getAge() == 0 || person.getAge() == 1){
            System.out.println(person.getName() + " is an Infant!");
        }else{
            super.proceed(person);
        }
    }
}
