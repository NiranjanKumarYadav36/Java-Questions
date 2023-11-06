class NumberPrinter extends Thread{

    private int start;
    private int end;
    private boolean isEven;

    NumberPrinter(int start, int end, boolean isEven){
        this.start = start;
        this.end = end;
        this.isEven = isEven;
    }

    @Override
    public void run(){
        for(int i = start; i<=end; i++){
        if((i%2 == 0)== isEven){
                System.out.println(+i"");
            }
        } 
    }
}

public class eigth{
    public static void main(String[] args){
        System.out.println("Welcome to the Even and Odd Number Printer");

        int start,end;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("enter the starting number");
        start = scanner.nextInt();
        System.out.println("enter the ending number");
        end = scanner.nextInt();



        NumberPrinter evenPrinter = new NumberPrinter(start, end, true);
        NumberPrinter oddPrinter = new NumberPrinter(start, end, false);

        evenPrinter.start();
        oddPrinter.start();


        try{
            evenPrinter.join();
            oddPrinter.join();
        }catch(InterruptedException e){
            System.out.println("Thread Interrupted.");
        }

        System.out.println("\n program finished");
    }
}