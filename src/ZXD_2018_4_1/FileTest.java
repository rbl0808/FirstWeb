package ZXD_2018_4_1;

import org.junit.Test;

import java.io.*;

public class FileTest {
    @Test
    public void  File1() throws IOException {
        String str1 = "he" + "llo";
        String str2 = "hello";
        System.out.println(str1 == str2);
       /*
        //以当前路径来创建一个File对象

        File file = new File("..");
        //直接获取文件名,输出一点
        System.out.println(file.getName());
        //获取绝对路径
        System.out.println(file.getAbsoluteFile());
        //在当前路径下创建一个临时文件
        File tmpFile = File.createTempFile("zxd",".txt",file);
        //指定当JVM退出时删除该文件
        tmpFile.deleteOnExit();
        //以系统当前时间作为新文件名来创建新文件
        File newFile = new File(System.currentTimeMillis() + "");
        System.out.println("newFile对象是否存在:" + newFile.exists());
        //以指定newFile对象来创建一个文件
        newFile.createNewFile();
        //以newFIle对象来创建一个目录,因为newFile已经存在,所以下面方法返回false
        newFile.mkdirs();
        //使用list()方法列出当前路径的所有文件和路径
        String[] fileList = file.list();
        System.out.println("====当前路径下所有文件和路径如下====");
        for (String fileName : fileList){
            System.out.println(fileName);
        }
        //listRoots()静态方法列出所有的磁盘根路径
        File[] roots = File.listRoots();
        System.out.println("====系统所有根路径如下====");
        for (File root : roots){
            System.out.println(root);
        }
        */

    }
    //读取文件内容
    @Test
    public void ReadFile() throws IOException {
        File file = new File("D:\\Noname1.txt");//定义一个file对象，用来初始化FileReader
        FileReader reader = new FileReader(file);//定义一个fileReader对象，用来初始化BufferedReader
        BufferedReader bReader = new BufferedReader(reader);//new一个BufferedReader对象，将文件内容读取到缓存
        StringBuilder sb = new StringBuilder();//定义一个字符串缓存，将字符串存放缓存中
        String s = "";
        while ((s = bReader.readLine()) != null) {//逐行读取文件内容，不读取换行符和末尾的空格
            sb.append(s + "\n");//将读取的字符串添加换行符后累加存放在缓存中
            System.out.println(s);
        }
        bReader.close();
        String str = sb.toString();
        System.out.println(str);
    }

    }

