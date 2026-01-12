public class NoofDigit {
    public static void main(String[] args) {
        int n = 20;
        int base = 2; // base of the number which we have to find the like to decimal
        int ans = (int) (Math.log(n)/ Math.log(base)) +1;
        System.out.println(ans); //  this wil give you the digit of that number
    }
}
