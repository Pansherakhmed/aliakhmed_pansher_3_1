public class Main {
    public static void main(String[] args) {
        double[] nums = {124, 333, 456, -222, -930, 133, 356, -456, -567, 179, -444, 580, 23, -23, 55};
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