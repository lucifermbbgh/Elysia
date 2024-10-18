package com.elysia.market.stock.excel.handler;

import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ExcelWriteHandlerTest {
    @Test
    public void testReadExcel() {
        String readFilePath = "D:\\文档\\标段\\标包1";
//        String readWorkBookName = new String ("标包1（专用零配件）标段1-1采购意向清单");
//        String readWorkBookName = new String ("标包1（专用零配件）标段1-2采购意向清单");
//        String readWorkBookName = new String ("标包1（专用零配件）标段1-3采购意向清单");
//        String readWorkBookName = new String ("标包1（专用零配件）标段1-4采购意向清单");
//        String readWorkBookName = new String ("标包1（专用零配件）标段1-5采购意向清单");
//        String readWorkBookName = new String ("标包1（专用零配件）标段1-6采购意向清单");
//        String readWorkBookName = new String ("标包1（专用零配件）标段1-7采购意向清单");
//        String readWorkBookName = new String ("标包1（专用零配件）标段1-8采购意向清单");
//        String readWorkBookName = new String ("标包1（专用零配件）标段1-9采购意向清单");
//        String readWorkBookName = new String ("标包1（专用零配件）标段1-10采购意向清单");
//        String readWorkBookName = new String ("标包1（专用零配件）标段1-11采购意向清单");
//        String readWorkBookName = new String ("标包1（专用零配件）标段1-12采购意向清单");
//        String readWorkBookName = new String ("标包1（专用零配件）标段1-13采购意向清单");
//        String readWorkBookName = new String ("标包1（专用零配件）标段1-14采购意向清单");
        String readSheetName = "Sheet1";

        List<String> readWorkBookNameList = new ArrayList<>();
//        readWorkBookNameList.add("标包1（专用零配件）标段1-1采购意向清单");
//        readWorkBookNameList.add("标包1（专用零配件）标段1-2采购意向清单");
//        readWorkBookNameList.add("标包1（专用零配件）标段1-3采购意向清单");
//        readWorkBookNameList.add("标包1（专用零配件）标段1-4采购意向清单");
//        readWorkBookNameList.add("标包1（专用零配件）标段1-5采购意向清单");
//        readWorkBookNameList.add("标包1（专用零配件）标段1-6采购意向清单");
//        readWorkBookNameList.add("标包1（专用零配件）标段1-7采购意向清单");
//        readWorkBookNameList.add("标包1（专用零配件）标段1-8采购意向清单");
//        readWorkBookNameList.add("标包1（专用零配件）标段1-9采购意向清单");
//        readWorkBookNameList.add("标包1（专用零配件）标段1-10采购意向清单");
//        readWorkBookNameList.add("标包1（专用零配件）标段1-11采购意向清单");
        readWorkBookNameList.add("标包1（专用零配件）标段1-12采购意向清单");
//        readWorkBookNameList.add("标包1（专用零配件）标段1-13采购意向清单");
//        readWorkBookNameList.add("标包1（专用零配件）标段1-14采购意向清单");

        for (int i = 0; i < readWorkBookNameList.size(); i++) {
            ExcelReadHandler excelReadHandler = new ExcelReadHandler(readFilePath, readWorkBookNameList.get(i), readSheetName);
            excelReadHandler.readExcel(readFilePath + File.separator + readWorkBookNameList.get(i) + ".xlsx");
        }
    }
}