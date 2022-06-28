public class Chain {
    Processor chain;

    public Chain(){
        buildChain();
    }

    private void buildChain(){
        chain = new Infant(new Child(new Adolescent(new Adult(new Mature(new Old(null))))));
    }

    public void proceed(Person person){
        chain.proceed(person);
    }
}