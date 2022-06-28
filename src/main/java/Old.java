public class Old extends Processor{
    public Old(Processor nextPeriod) {
        super(nextPeriod);
    }

    public void proceed(Person person){
        if (person.getAge() > 65){
            System.out.println(person.getName() + " is an Old!");
        }else{
            super.proceed(person);
        }
    }
}
