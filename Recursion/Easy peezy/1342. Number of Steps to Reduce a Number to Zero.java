class Solution {

    public int func(int num){
        int steps = 0;

        if(num == 0)return 0;

        if(num % 2 == 0){
                steps = 1 + func(num/2);
                return steps;

                 }
        else {
            steps = 1 + func(num - 1);
            return steps;
        }
    }

    public int numberOfSteps(int num) {
        return func(num);
    }
}
