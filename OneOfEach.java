public class OneOfEach {
    public static void main(String[] args) {
        int boyCount = 0;
        int girlCount = 0;
        int childCount = 0;

        boolean haveBoy = false;
        boolean haveGirl = false;

        while (!haveBoy || !haveGirl) {
            double randomNumber = Math.random();
            if (randomNumber < 0.5) { 
                boyCount++;
                haveBoy = true;
                System.out.print("b ");
            } else {
                girlCount++;
                haveGirl = true;
                System.out.print("g ");
            }
            childCount++;
        }

        System.out.println("You made it... and you now have " + childCount + " children.");
    }
}