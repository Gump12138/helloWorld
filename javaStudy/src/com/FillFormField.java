
package com;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.io.File;

public class FillFormField {
    public static void READPDF(String inputFile){
        //创建文档对象
        PDDocument doc;
        String content;
        try {
            //加载一个pdf对象
            doc =PDDocument.load(new File(inputFile));
            //获取一个PDFTextStripper文本剥离对象
            PDFTextStripper textStripper =new PDFTextStripperByArea();
            textStripper.setSortByPosition( true );
            textStripper.setStartPage( 1 );
            textStripper.setEndPage( 1 );
            content=textStripper.getText(doc);
            System.out.println("内容："+content);
            System.out.println("全部页数："+doc.getNumberOfPages());
            doc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
