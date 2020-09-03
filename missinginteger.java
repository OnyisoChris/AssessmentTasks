
// Finding a missing number in an array using a java program

class Main {

    // A function used for finding a missing number

    static int getMissingNo(int K[], int N)

    {

        int i, integerTotal;

        integerTotal = (N + 1) * (N + 2) / 2;

        for (i = 0; i < N; i++)

            integerTotal -= K[i];

        return integerTotal;

    }
 

    //Testing the above function

    public static void main(String args[])

    {

        int K[] = { 3, 5, 4, 1 };

        int missing = getMissingNo(K, 4);

        System.out.println(missing);

    }
}
