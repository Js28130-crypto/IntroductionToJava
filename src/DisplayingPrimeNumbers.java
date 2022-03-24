public class DisplayingPrimeNumbers {
    public static void main(String[] args) {
        final int NUMBERS_OF_PRIME = 50; //number of primes to display
        final int NUMBER_OF_PRIME_LINE = 10; //display 10 per line
        int count = 0; //count the number of prime numbers
        int num = 2; //a number to be tested for primeness

        System.out.println("The first 50 prime numbers are: \n");

        //repeatedly find prime numbers
        while (count < NUMBERS_OF_PRIME) {
            //assume the number is prime
            boolean isPrime = true; //is this current number prime?

            //test whether number is prime
            for (int divisor = 2; divisor <= num / 2; divisor++) {
                if (num % divisor == 0) {//if true, number is not prime
                    isPrime = false;//set isPrime to false
                    break; //exit the for loop
                }
            }

            //display the prime number and increas the count
            if (isPrime) {
                count++;  //increase the count

                if (count % NUMBER_OF_PRIME_LINE == 0) {
                    //display the number and advance to the new line
                    System.out.println(num);
                } else System.out.print(num + "  ");
            }  //check if the next number is prime
            num++;
        }
    }
}
