package ApachePoi;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _06_GetColumnAllData {

    /**
     * Verilen Exceldeki password bilgisini bir metoda aracılığı bularak yazdırınız,
     * yani metoda "password" kelimesi gönderilecek, dönen değr password un kendisi olacak.
     */
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("istenen sutun=  ");
        int word = scanner.nextInt();

        String donenSonuc = find(word);
        System.out.println("donenSonuc = " + donenSonuc);
    }

    public static String find(int column) {
        String kelime = "";
        String path = "src/test/java/ApachePoi/resources/LoginData.xlsx";
        Workbook workbook = null;

        try {
            FileInputStream fileReader = new FileInputStream(path);

            workbook = WorkbookFactory.create(fileReader);
        } catch (Exception x) {


        }

        Sheet sheet = workbook.getSheetAt(0);
        int rowCount = sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i);

            int cellCount=row.getPhysicalNumberOfCells();// 2 verdiginde hucrelerin indexi 0 ve 1 olabilir.

            if (cellCount>column){
            kelime+=row.getCell(column)+" ";}

            }
        return kelime; }



    }



