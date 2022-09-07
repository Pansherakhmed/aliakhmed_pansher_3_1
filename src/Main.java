public class Main {
    public static void main(String[] args) {
        double[] nums = {8,-2,-4, 2, 3, 6, 35, -46, -57, 79, -44, 80, 3, -2, 5};
        double result = 0;
        boolean negative = false;
        for (double hi : nums) {
            if (hi < 0) {
                negative = true;
                continue;
            }
            if (negative) {
                result += hi;
            }
        }
        System.out.println(result / nums.length);

    }
}