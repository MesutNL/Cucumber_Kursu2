package ApachePoi;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _09_Tasks {
    /*
    /  Soru 1:
     *  Çarpım tablosunu excele yazdırınız.
     *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
     *  sıfırdan excel oluşturarak.
     *  her bir onluktan sonra 1 satır boşluk bırakarak alt alata


        Soru 2:
            *  Çarpım tablosunu excele yazdırınız.
            *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
            *  sıfırdan excel oluşturarak.
        her bir onluktan sonra 1 kolon boşluk bırakarak yan yana

            */
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook=new XSSFWorkbook();//hafizada workbook olustur.
        XSSFSheet sheet =workbook.createSheet("Sayfa1");
        for (int i = 0; i < 10; i++) {
            int a=0;
            Row row = sheet.createRow(i);

            for (int j = 0; j < 10; j++) {

                Cell cell = row.createCell(a);
                cell.setCellValue(i + 1);
                cell = row.createCell(a + 1);
                cell.setCellValue("x");
                cell = row.createCell(a + 2);
                cell.setCellValue(j + 1);
                cell = row.createCell(a + 3);
                cell.setCellValue("=");
                cell = row.createCell(a + 4);
                cell.setCellValue((i + 1) * (j + 1));
                cell = row.createCell(a + 5);
                cell.setCellValue(" ");
                a+=6;

            }
        }

        try {
            FileOutputStream outputStream = new FileOutputStream("src/test/java/ApachePoi/resources/yeniExcel2.xlsx");
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
