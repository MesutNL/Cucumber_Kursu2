package ApachePoi;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_NewExcelWrite {

    public static void main(String[] args) throws IOException {

        //hafizada yeni workbook olustur, sonra sheet olustur, sonra row olustur, sonra cell olustur.
        XSSFWorkbook workbook=new XSSFWorkbook();//hafizada workbook olustur.
        XSSFSheet sheet =workbook.createSheet("Sayfa1");

        Row row= sheet.createRow(0);
        Cell cell=row.createCell(0);
        cell.setCellValue("Merhaba Dunya biz geliyoruz.");//hucreye hafizada yaz.

        for (int i = 1; i < 10; i++) {

            row= sheet.createRow(i);//satir olustur,
            cell=row.createCell(0);//hucre olustur
            cell.setCellValue(i);//hucre hafizada yazar.
        }
        FileOutputStream outputStream=new FileOutputStream("src/test/java/ApachePoi/resources/yeniExcel.xlsx");
        workbook.write(outputStream);//icine hafizdaki bilgileri yazdik.
        workbook.close();//hafizayi bosalttik
        outputStream.close();// dosyayi kapattik

    }
}
