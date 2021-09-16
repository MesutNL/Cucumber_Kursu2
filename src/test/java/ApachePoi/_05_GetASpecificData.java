package ApachePoi;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _05_GetASpecificData {

    /**
     * Verilen Exceldeki password bilgisini bir metoda aracılığı bularak yazdırınız,
     * yani metoda "password" kelimesi gönderilecek, dönen değr password un kendisi olacak.
     */
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("aranana kelime= ");
        String word = scanner.nextLine();

        String donenSonuc=find(word);
        System.out.println("donenSonuc = " + donenSonuc);
    }

    public static String find(String findingWords)  {
String kelime = "";
        String path = "src/test/java/ApachePoi/resources/LoginData.xlsx";
        Workbook workbook=null;
        try{
        FileInputStream fileReader = new FileInputStream(path);

         workbook = WorkbookFactory.create(fileReader);}
        catch (Exception x){


        }

        Sheet sheet = workbook.getSheetAt(0);
        int rowCount=sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < rowCount; i++) {
            Row row=sheet.getRow(i);
            row.getCell(0);
            //aradigim kelime 1.hucrede var mi :her satirin 1.hucresini kontrol ettim
            if(row.getCell(0).toString().equalsIgnoreCase(findingWords)){
                //yandaki hucrelerin hepsini ekleyip tek bir stringe donusturuoyurm.
                int cellCount = row.getPhysicalNumberOfCells();
                for (int j = 1; j < cellCount; j++) {
                    Cell cell = row.getCell(j);
                    kelime+=row.getCell(j);


                }

            }
        }



        return kelime;
    }
}
