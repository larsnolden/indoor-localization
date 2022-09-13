import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.p oi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Reader {


    public static void main(String[] args) throws IOException {

        Database database = new Database();

        File myFile = new File("TrackingApp/app/src/main/beacons-Ravelijn.xlsx");
        FileInputStream fis = new FileInputStream(myFile);

        // Finds the workbook instance for XLSX file
        XSSFWorkbook myWorkBook = new XSSFWorkbook (fis);

        // Return first sheet from the XLSX workbook
        XSSFSheet mySheet = myWorkBook.getSheetAt(0);

        // Get iterator to all the rows in current sheet

        Iterator<Row> rowIterator = mySheet.iterator();

        // Traversing over each row of XLSX file
        while (rowIterator.hasNext()) {
            Beacons Beacons1 = new Beacons();
            Row row = rowIterator.next();
            if(row.getRowNum()==0){
                continue;
            }
            Beacons1.setId((int)Float.parseFloat(row.getCell(0).toString()));
            Beacons1.setDeviceName(row.getCell(1).toString());
            Beacons1.setMacAddress(row.getCell(2).toString());
            Beacons1.setLongitude(Float.parseFloat(row.getCell(3).toString()));
            Beacons1.setLatitude(Float.parseFloat(row.getCell(4).toString()));
            Beacons1.setFloor((int)Float.parseFloat(row.getCell(5).toString()));
            database.myList.add(Beacons1);


        }
        System.out.println(database.myList);
    }

}
