public class Mature extends Processor{
    public Mature(Processor nextPeriod) {
        super(nextPeriod);
    }

    public void proceed(Person person){
        if (person.getAge() > 30 && person.getAge() < 66){
            System.out.println(person.getName() + " is an Mature!");
        }else{
            super.proceed(person);
        }
    }
}
