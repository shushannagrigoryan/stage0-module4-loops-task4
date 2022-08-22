package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int skipped_sum = 0;
        int counted_sum = 0;

        if(numberToSkip > lastInRow){System.out.println("number to skip is bugger then the last");}
        else if(lastInRow < 0){System.out.println("last number in row is negative");}
        else{

            for(int i = 0; i<= lastInRow; i++){
                counted_sum+=i;
                if(i == numberToSkip){
                    continue;
                }
                skipped_sum+=i;
            }
        }

        System.out.println("skipped sum is number" + skipped_sum);
        System.out.println("counted sum is number" + counted_sum);
    }
}
