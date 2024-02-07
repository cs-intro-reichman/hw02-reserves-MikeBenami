public class OneOfEachStats1 {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        int totalChildren = 0;
        int familiesWithTwoChildren = 0;
        int familiesWithThreeChildren = 0;
        int familiesWithFourOrMoreChildren = 0;
        int maxCount = 0;
        int mode = 2;

        for (int i = 0; i < T; i++) {
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
                } else {
                    girlCount++;
                    haveGirl = true;
                }
                childCount++;
            }

            totalChildren += childCount;

            if (childCount == 2) {
                familiesWithTwoChildren++;
            } else if (childCount == 3) {
                familiesWithThreeChildren++;
            } else {
                familiesWithFourOrMoreChildren++;
            }

            if (familiesWithTwoChildren > maxCount) {
                maxCount = familiesWithTwoChildren;
                mode = 2;
            }
            if (familiesWithThreeChildren > maxCount) {
                maxCount = familiesWithThreeChildren;
                mode = 3;
            }
            if (familiesWithFourOrMoreChildren > maxCount) {
                maxCount = familiesWithFourOrMoreChildren;
                mode = 4;
            }
        }

        double averageChildren = (double) totalChildren / T;

        System.out.println("Average: " + averageChildren + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + familiesWithTwoChildren);
        System.out.println("Number of families with 3 children: " + familiesWithThreeChildren);
        System.out.println("Number of families with 4 or more children: " + familiesWithFourOrMoreChildren);
        System.out.println("The most common number of children is " + mode + ".");
    }
}