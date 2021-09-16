package ApachePoi;

import org.apache.poi.ss.usermodel.*;


import java.io.FileInputStream;

import java.io.IOException;

public class _03_ApachePOIStart {

    public static void main(String[] args) throws IOException {

        //EXCELL OKUMA
        //Dosyanin yolu alindi.
        String path="src/test/java/ApachePoi/resources/ApacheExcel2.xlsx";
        //String path="src\\test\\java\\ApachePoi\\resources\\ApacheExcel2.xlsx";

        //Dosya okuma islemcisine dosyanin yolunu veriyoruz.
        FileInputStream fileReader=new FileInputStream(path);

        //fileReader uzerinden calisma kitabini aliyorum
        Workbook workbook= WorkbookFactory.create(fileReader);

        //istedigim isimdeki calisma sayfasini aliyorum
        Sheet sheet=workbook.getSheet("Sheet1");
        //Sheet sheet=workbook.getSheetAt(0);

        //istenen satiri aliyorum
        Row row=sheet.getRow(0);


        //istenen satirdaki istenen hucre aliniyor
        Cell cell=row.getCell(0);

        System.out.println("cell = " + cell);









    }
}
