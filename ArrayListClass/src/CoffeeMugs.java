public class CoffeeMugs {
    int sizeOz;
    boolean seals;

    public CoffeeMugs(int sizeOz, boolean seals) {
        this.sizeOz = sizeOz;
        this.seals = seals;
    }

    public void isSealable(){
        if(seals = true){
            System.out.println("good mug");
        }
        if(seals = false){
            System.out.println("bad mug");
        }
    }
}
