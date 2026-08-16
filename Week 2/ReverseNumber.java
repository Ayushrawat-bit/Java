public class ReverseNumber {
    public static int reverseNumber(int number){
        int digit = 0;
        int reversed = 0;
        do{
        digit = number % 10;
        reversed = reversed * 10 + digit;
        number = number / 10;
        } while(number != 0);
        return reversed;
    } 
}
