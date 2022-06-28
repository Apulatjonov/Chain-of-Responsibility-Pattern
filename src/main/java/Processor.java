public abstract class Processor {
    private Processor nextPeriod;

    public Processor(Processor nextPeriod){
        this.nextPeriod = nextPeriod;
    }

    public void proceed(Person human){
        if (nextPeriod != null){
            nextPeriod.proceed(human);
        }
    }

}
