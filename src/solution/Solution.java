package solution;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public int solution(int N) throws UnsupportedOperationException{
        String binaryValue = Integer.toBinaryString(N);
        int largestGap = 0;
        int currentGap;

        String pattern = "[1](0+)[1]";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(binaryValue);

        if (N < 0) throw new UnsupportedOperationException("Value must be positive!");
        if (isPerfectSquareRoot(N) || isPerfectSquareRoot(N+1)) return 0;

        while(m.find()){
            currentGap = m.end() - m.start() - 2;
            if (currentGap > largestGap) largestGap = currentGap;
        }
        return largestGap;
    }

    private boolean isPerfectSquareRoot(int number){
        double sr = Math.sqrt(number);
        boolean b = sr - Math.floor(sr) == 0;
        return b;
    }
}
