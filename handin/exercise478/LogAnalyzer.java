/**
 * Read web server data and analyse
 * hourly access patterns.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2011.07.31
 */
public class LogAnalyzer
{
    // Where to calculate the hourly access counts.
    private int[] hourCounts;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;

    /**
     * Create an object to analyze hourly web accesses.
     */
    public LogAnalyzer()
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        // Create the reader to obtain the data.
        reader = new LogfileReader();
    }

    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeHourlyData()
    {
        while(reader.hasNext()) {
            LogEntry entry = reader.next();
            int hour = entry.getHour();
            hourCounts[hour]++;
        }
    }

    /**
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     */
    public void printHourlyCounts()
    {
        System.out.println("Hr: Count");
        for(int hour = 0; hour < hourCounts.length; hour++) {
            System.out.println(hour + ": " + hourCounts[hour]);
        }
    }
    
    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData()
    {
        reader.printData();
    }
    
    public void busiestHour()
    {
        int hoogste = 0;
        int tijdelijk = 0;
        for(int uren : hourCounts)
        {
            
            if(uren > hoogste)
            {
                hoogste = uren;
                
            }
        }++
        System.out.println(hoogste);

        }
    
     public void busiest2Hours()
    {
        int hoogste = 0;
        int som = 0;
        int eerste = 0;
        int tweede = 1;
        int eersteuur = 1;
        for(tweede = 1; tweede <= (hourCounts.length - 1); tweede++)
        {
            som = hourCounts[tweede] + hourCounts[tweede - 1];
            
            if(som > hoogste)
            {
                hoogste = som;
                eersteuur = hourCounts[tweede - 1];
            }
         
    }System.out.println(eersteuur);
}}
