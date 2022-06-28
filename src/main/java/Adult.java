public class Adult extends Processor{
    public Adult(Processor nextPeriod) {
        super(nextPeriod);
    }

    public void proceed(Person person){
        if (person.getAge() > 20 && person.getAge() < 31){
            System.out.println(person.getName() + " is an Adult!");
        }else{
            super.proceed(person);
        }
    }
}
