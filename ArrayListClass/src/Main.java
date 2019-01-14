import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CoffeeMugs starbucks = new CoffeeMugs(24, true);
        ArrayList<CoffeeMugs> coffeeMugs = new ArrayList<>();
        coffeeMugs.add(starbucks);
        for (int i = 0; i < 100; i++){
            if(i%2 == 0){
                coffeeMugs.add(new CoffeeMugs(i, true));
            }
            else coffeeMugs.add(new CoffeeMugs(i, false));
        }
        /*
        for(CoffeeMugs c : coffeeMugs){
            System.out.println(c.sizeOz);
        }*/ // these two for loops do the same thing
        for(int i = 0; i<coffeeMugs.size(); i++){
            System.out.println(coffeeMugs.get(i).sizeOz);
        }

        for(int i = 0; i<coffeeMugs.size(); i++){
            coffeeMugs.get(i).isSealable();
        }
    }
}
