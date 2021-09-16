package ApachePoi;

import org.apache.poi.ss.usermodel.*;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_WriteInTheExcel {
    public static void main(String[] args) throws IOException {


        String path = "src/test/java/ApachePoi/resources/WriteInTheExcelFile.xlsx";

        FileInputStream fileReader = new FileInputStream(path);

        Workbook workbook = WorkbookFactory.create(fileReader);

        Sheet sheet = workbook.getSheet("Sheet1");
//hafizada olusturma ve yazma islemleri yapiliyor.
        Row row=sheet.createRow(0);//satir acildi ama kullanabilir durumda degil
        Cell cell=row.createCell(0);// hucre olusturuldu A1 kullanilabilir bir hucre var.
        cell.setCellValue("Merhaba dunya");// bilgi yazildi

        for (int i = 1; i < 10; i++) {
             cell=row.createCell(i);
            cell.setCellValue(i);
        }
        //yazma islemine gecebilmek icin okuma modunu kapatmaliyiz.
        fileReader.close();

        //yazma islemi icin excel i yazma modunda acip yazma islemini yapacagiz.
        FileOutputStream fileReaderout=new FileOutputStream(path);
        workbook.write(fileReaderout);
        fileReaderout.close();
        //yazma islemi kapatildi.

    }
}
