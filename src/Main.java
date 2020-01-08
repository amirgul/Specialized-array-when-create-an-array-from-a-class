import java.util.Scanner;

public class Main
{
    public static final int MAX_SIZE = 3;

    public static void main(String[] args)
    {
        OneWayNoRepeatList toDoLsit = new OneWayNoRepeatList(MAX_SIZE);
        System.out.println("Enter items for the list when prompted");
        boolean moreItems = true;
        String next = null;
        Scanner keyboard = new Scanner(System.in);
        while (moreItems && !toDoLsit.isFull())
        {
            System.out.println("Enter an item");
            next = keyboard.nextLine();
            toDoLsit.addItem(next);
            if(toDoLsit.isFull())
            {
                System.out.println("adding to the full list");
            }
            else
            {
                System.out.println("More items for the list");
                String ans = keyboard.nextLine();
                if(ans.equalsIgnoreCase("no"))
                    moreItems = false;
            }
        }
        System.out.println("the list contains");
        int positon = toDoLsit.START_POSITION;
        next = toDoLsit.getEntryAt(positon);
        while (next != null)
        {
            System.out.println(next);
            positon++;
            next = toDoLsit.getEntryAt(positon);
        }

    }
}
