package ApachePoi;

import org.apache.poi.ss.usermodel.*;


import java.io.FileInputStream;
import java.io.IOException;

public class _04_ApachePOIGetAllData {

    public static void main(String[] args) throws IOException {

        String path = "src/test/java/ApachePoi/resources/ApacheExcel2.xlsx";

        FileInputStream fileReader = new FileInputStream(path);

        Workbook workbook = WorkbookFactory.create(fileReader);

        Sheet sheet = workbook.getSheet("Sheet1");

        //Calismaa sayfasinin toplam satir sayisini veriyor.
        int rowCount = sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < rowCount; i++) {

            Row row = sheet.getRow(i);
            //bu satirdaki toplam hucre sayisi alindi
            int cellCount = row.getPhysicalNumberOfCells();


            for (int j = 0; j < cellCount; j++) {
                Cell cell = row.getCell(j);//bu satirdaki siradaki hucreyi aldim


                System.out.print(cell + " ");
            }
            System.out.println();
        }


    }
}
