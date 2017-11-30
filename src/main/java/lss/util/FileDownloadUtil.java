package lss.util;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Author: liushuaishuai
 * Email: liushuaishuai@91zdan.com
 * Date: 2017-09-27 15:08
 * Description:
 * History:
 */
public class FileDownloadUtil {
    /**
     * 下载
     * @param response
     * @param titleArr
     * @param dataList
     * @throws Exception
     */
    public static void download( HttpServletResponse response, String[] titleArr, List<Object[]> dataList,String fileName) throws Exception {
        ByteArrayOutputStream os = null;
        OutputStream outputStream = response.getOutputStream();
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
                    } else if (dataArr[j] instanceof BigDecimal) {
                        cell.setCellValue(dataArr[j].toString());
                    } else if (dataArr[j] == null) {
                        cell.setCellValue("");
                    } else {
                        cell.setCellValue(dataArr[j].toString());
                    }
                }
            }
            os = new ByteArrayOutputStream();
            wb.write(os);
            //使用Servlet实现文件下载的时候，避免浏览器自动打开文件
            response.addHeader("Content-Disposition", "attachment;filename=" + fileName);
            os.writeTo(outputStream);
            outputStream.flush();
        } catch (Exception e) {
            //e.printStackTrace();
            throw new RuntimeException("文件导出失败");
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (Exception e) {

                } finally {
                    os = null;
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception e) {

                } finally {
                    outputStream = null;
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
