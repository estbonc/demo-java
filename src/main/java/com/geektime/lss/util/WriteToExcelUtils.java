package com.geektime.lss.util;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

/**
 * Author: liushuaishuai
 * Email: liushuaishuai@91zdan.com
 * Date: 2017-09-26 09:32
 * Description:
 * History:
 */
public class WriteToExcelUtils {

    public void writeXlsToDisk(String targetFile, String[] titleArr, List<Object[]> dataList) {
        ByteArrayOutputStream os = null;
        OutputStream fos = null;
        HSSFWorkbook wb = null;
        try {
            wb = new HSSFWorkbook();
            //生成一个sheet1
            HSSFSheet sheet = wb.createSheet("sheet1");

            HSSFRow row = null; //代表行
            HSSFCell cell = null; //代表列

            //为sheet1生成第一行，用于放表头信息
            row = sheet.createRow(0);
            //开始生成第一行的标题信息
            for (int i = 0; i < titleArr.length; i++) {
                //cell.setEncoding(HSSFCell.ENCODING_UTF_16); //设置编码
                cell = row.createCell(i);
                cell.setCellValue(titleArr[i]);
            }

            //开始写入数据
            Object[] dataArr = null;
            for (int k = 0; k < dataList.size(); k++) {
                dataArr = dataList.get(k);
                //数据每增加一行，表格就再生成一行
                row = sheet.createRow(k + 1);
                for (int j = 0; j < titleArr.length; j++) {
                    cell = row.createCell(j);
                    // cell.setEncoding(HSSFCell.ENCODING_UTF_16);
                    if (dataArr[j] instanceof Integer) {
                        cell.setCellValue((Integer) dataArr[j]);
                    } else if (dataArr[j] instanceof Boolean) {
                        cell.setCellValue(String.valueOf(dataArr[j]));
                    } else if (dataArr[j] instanceof Date) {
                        cell.setCellValue((Date) dataArr[j]);
                    } else if (dataArr[j] instanceof Long) {
                        cell.setCellValue((Long) dataArr[j]);
                    } else {
                        cell.setCellValue(dataArr[j].toString());
                    }
                }
            }
            os = new ByteArrayOutputStream();
            wb.write(os);
            byte[] content = os.toByteArray();
            File file = new File(targetFile);//Excel文件生成后存储的位置。
            fos = new FileOutputStream(file);
            fos.write(content);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (Exception e) {

                } finally {
                    os = null;
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (Exception e) {

                } finally {
                    fos = null;
                }
            }
            if (wb != null) {
                try {
                    wb.close();
                } catch (Exception e) {

                } finally {
                    wb = null;
                }
            }
        }

    }

    public void writeXlsxToDisk(String targetFile, String[] titleArr, List<Object[]> dataList) {
        ByteArrayOutputStream os = null;
        OutputStream fos = null;
        XSSFWorkbook wb = null;
        try {
            wb = new XSSFWorkbook();
            //生成一个sheet1
            XSSFSheet sheet = wb.createSheet("sheet1");

            XSSFRow row = null; //代表行
            XSSFCell cell = null; //代表列

            //为sheet1生成第一行，用于放表头信息
            row = sheet.createRow(0);
            //开始生成第一行的标题信息
            for (int i = 0; i < titleArr.length; i++) {
                //cell.setEncoding(HSSFCell.ENCODING_UTF_16); //设置编码
                cell = row.createCell(i);
                cell.setCellValue(titleArr[i]);
            }

            //开始写入数据
            Object[] dataArr = null;
            for (int k = 0; k < dataList.size(); k++) {
                dataArr = dataList.get(k);
                //数据每增加一行，表格就再生成一行
                row = sheet.createRow(k + 1);
                for (int j = 0; j < titleArr.length; j++) {
                    cell = row.createCell(j);
                    // cell.setEncoding(HSSFCell.ENCODING_UTF_16);
                    if (dataArr[j] instanceof Integer) {
                        cell.setCellValue((Integer) dataArr[j]);
                    } else if (dataArr[j] instanceof Boolean) {
                        cell.setCellValue(String.valueOf(dataArr[j]));
                    } else if (dataArr[j] instanceof Date) {
                        cell.setCellValue((Date) dataArr[j]);
                    } else if (dataArr[j] instanceof Long) {
                        cell.setCellValue((Long) dataArr[j]);
                    } else {
                        cell.setCellValue(dataArr[j].toString());
                    }


                }
            }
            os = new ByteArrayOutputStream();
            wb.write(os);
            byte[] content = os.toByteArray();
            File file = new File(targetFile);//Excel文件生成后存储的位置。
            fos = new FileOutputStream(file);
            fos.write(content);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (Exception e) {

                } finally {
                    os = null;
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (Exception e) {

                } finally {
                    fos = null;
                }
            }
            if (wb != null) {
                try {
                    wb.close();
                } catch (Exception e) {

                } finally {
                    wb = null;
                }
            }
        }

    }

}
