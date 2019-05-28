package ZXD_2018_4_1;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Excel_Poi {
            /**
             * @功能：手工构建一个简单格式的Excel
             */
            private static List<Person> getMember() throws Exception{
                  List list = new ArrayList();
                  SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");

                  Person user1 = new Person ("rbl1", 24, "男", 12008165, df.parse("1993-08-28"));
                  Person user2 = new Person ("rbl2", 23, "女", 12008165, df.parse("1994-08-19"));
                  Person user3 = new Person ("rbl3", 24, "男", 12008165, df.parse("1983-11-22"));
                  list.add(user1);
                  list.add(user2);
                  list.add(user3);

                  return list;
            }

            public static void main(String[] args) throws Exception
            {
                  // 第一步，创建一个webbook，对应一个Excel文件
                  HSSFWorkbook wb = new HSSFWorkbook();
                  // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
                  HSSFSheet sheet = wb.createSheet("学生表一");
                  //设置宽度
                  sheet.setColumnWidth(0,4000);
                  sheet.setColumnWidth(1,4000);
                  sheet.setColumnWidth(2,4000);
                  sheet.setColumnWidth(3,4000);
                  sheet.setColumnWidth(4,4000);

                  // 第三步，在sheet中添加表头第0行
                  HSSFRow row = sheet.createRow((int) 0);
                  // 第四步，创建单元格，并设置值表头 设置表头居中
                  HSSFCellStyle style = wb.createCellStyle();
                  // 创建一个居中格式
                  style.setAlignment(HorizontalAlignment.CENTER);

                  HSSFCell cell = row.createCell((short) 0);
                  cell.setCellValue("姓名");
                  cell.setCellStyle(style);

                  cell = row.createCell((short) 1);
                  cell.setCellValue("年龄");
                  cell.setCellStyle(style);

                  cell = row.createCell((short) 2);
                  cell.setCellValue("性别");
                  cell.setCellStyle(style);

                  cell = row.createCell((short) 3);
                  cell.setCellValue("学号");
                  cell.setCellStyle(style);

                  cell = row.createCell((short) 4);
                  cell.setCellValue("生日");
                  cell.setCellStyle(style);

                  // 第五步，写入实体数据 实际应用中这些数据从数据库得到，
                  List list = Excel_Poi.getMember();

                  for (int i = 0; i < list.size(); i++)
                  {

                        row = sheet.createRow((int) i + 1);
                        Person stu = (Person) list.get(i);
                        // 第四步，创建单元格，并设置值和样式
                        cell = row.createCell((short) 0);
                        cell.setCellValue(stu.getName());
                        cell.setCellStyle(style);

                        cell = row.createCell((short) 1);
                        cell.setCellValue(stu.getAge());
                        cell.setCellStyle(style);

                        cell = row.createCell((short) 2);
                        cell.setCellValue(stu.getSex());
                        cell.setCellStyle(style);

                        cell = row.createCell((short) 3);
                        cell.setCellValue(stu.getCode());
                        cell.setCellStyle(style);

                        cell = row.createCell((short) 4);
                        cell.setCellValue(new SimpleDateFormat("yyyy-mm-dd")
                                .format(stu.getBirth()));
                        cell.setCellStyle(style);
                  }

                  // 第六步，将文件存到指定位置
                  try {
                        FileOutputStream fout = new FileOutputStream("D:\\delelop\\js\\rbl.xls");
                        wb.write(fout);
                        fout.close();
                        //打开文件
                        Runtime.getRuntime().exec("explorer D:\\delelop\\js\\rbl.xls");

                  }
                  catch (Exception e)
                  {
                        e.printStackTrace();
                  }
            }


      }


