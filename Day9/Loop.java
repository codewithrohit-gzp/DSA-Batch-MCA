package Day9;

public class Loop {
    public static void main(String[] args) {
        // for Loop


        // first Loop 
        for (int p = 1; p <= 10; p++) {
            System.out.println("Pushup " + p);
        }

        // second Loop 
        for (int s = 1; s <= 3; s++) {
            System.out.println("set :"+s);
            for (int p = 1; p <= 10; p++) {
                System.out.println("Pushup " + p);
            }
        }

    }
}