public class OneWayNoRepeatList
{
    public static int START_POSITION = 1;
    public static int DEFAULT_SIZE = 50;

    private int countOfEntries;
    private String[] entry;

    public OneWayNoRepeatList(int maximumNumberOfEntries)
    {
        entry = new String[maximumNumberOfEntries];
        countOfEntries = 0;
    }
    public OneWayNoRepeatList()
    {
        entry = new String[DEFAULT_SIZE];
        countOfEntries = 0;
    }
    public boolean isFull()
    {
        return countOfEntries == entry.length;
    }
    public boolean isEmpty()
    {
        return  countOfEntries == 0;
    }

    public void addItem(String item)
    {
        if(!isOnList(item))
        {
            if(countOfEntries == entry.length)
            {
                System.out.print("Adding to a full list");
                System.exit(0);
            }
            else
            {
                entry[countOfEntries] = item;
                countOfEntries++;
            }
        }
    }

    public boolean isOnList(String item)
    {
        boolean found = false;
        int i = 0;
        while (!found &&i<countOfEntries)
        {
            if(item.equalsIgnoreCase(entry[i]))
                found = true;
            else
                i++;
        }
        return  found;
    }
    public String getEntryAt(int position)
    {
        String result = null;
        if((1 <= position)&&(position <= countOfEntries))
            result = entry[position-1];

        return  result;
    }

    public boolean atLastEntry(int position)
    {
        return  position == countOfEntries;
    }

    public int getMaximumNumberOfEntries()
    {
        return  entry.length;
    }

    public int getNumberOfEntries()
    {
        return countOfEntries;
    }

    public void eraseList()
    {
        countOfEntries = 0;
    }

}
