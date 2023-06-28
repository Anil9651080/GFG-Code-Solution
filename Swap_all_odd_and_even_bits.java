public class Swap_all_odd_and_even_bits {
    public static int swapBits(int n) {
        int om = 0x55555555;
        int em = 0xAAAAAAAA;
        int odds = (n & om);
        int even = (n & em);
        odds <<= 1;
        even >>= 1;
        n = odds | even;

        return n;

    }
}
