import java.io.*;
import java.net.UnknownHostException;
import java.sql.SQLException;


public class Scan {

    public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, SQLException, InterruptedException
    {
        String test = "http://www.gov.ru/";
        Crawler crawl = new Crawler(test, 1);
        crawl.startCrawl();

    }

}