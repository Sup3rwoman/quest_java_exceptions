import java.util.ArrayList;

public class OddSum {

    public static void main(String[] args) {
        //Call method run
        run(args, false);

    }

    public static int run(String[] args, boolean test) {

        ArrayList<Integer> listInt = new ArrayList<>();
        int res;

        //Displays list of Elements in String Array args
        if (!test) {
            System.out.println("Elements' list :");
            for (String v : args)
                System.out.print(" " + v);
            System.out.println();
        }

        //Transforms Strings of String Array args into Integer values and add them to ArrayList listInt
        try{
            for (int i = 0; i < args.length; i++) {
                listInt.add(Integer.parseInt(args[i]));
            }

            //Call method sum
            res = sum(listInt);

            if (test) {
                return res;
            }

            System.out.println("Sum of odd elements : " + res);
            System.out.println("END!");

            return 0;

        }catch(NumberFormatException e){
            System.err.println("You tried to transform a letter into an integer. That's not possible. Program stopped.");
            return -1;
        }
    }

    public static int sum(ArrayList<Integer> listInt) {

        int result = 0;
        for (int value : listInt) {
            if (value % 2 != 0) {
                result += value;
            }
        }
        return result;
    }
}
