package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int skipped_sum = 0;
        int counted_sum = 0;

        if(numberToSkip > lastInRow){System.out.println("number to skip is bugger then the last");}
        else if(lastInRow < 0){System.out.println("last number in row is negative");}
        else{

            for(int i = 1; i<= lastInRow; i++){
                if(i <= numberToSkip){
                    skipped_sum+=i;
                    continue;
                }
                counted_sum+=i;
            }

            System.out.println("skipped sum is " + skipped_sum);
            System.out.println("counted sum is " + counted_sum);
        }


    }
}
