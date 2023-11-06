class NumberPrinter extends Thread {
    private int start;
    private int end;
    private boolean printEven;

    public NumberPrinter(int start, int end, boolean printEven) {
        this.start = start;
        this.end = end;
        this.printEven = printEven;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (printEven && i % 2 == 0) {
                System.out.print(i + " ");
            } else if (!printEven && i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

public class practice {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Welcome to the Even and Odd Number Printer!");

        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        NumberPrinter evenPrinter = new NumberPrinter(start, end, true);
        NumberPrinter oddPrinter = new NumberPrinter(start, end, false);

        System.out.print("Even numbers: ");
        evenPrinter.start();

        try {
            evenPrinter.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.print("\nOdd numbers: ");
        oddPrinter.start();

        try {
            oddPrinter.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
    }
}
