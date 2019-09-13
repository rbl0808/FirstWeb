package ZXD_2018_4_1;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//2018年4月1日22:20:17
public class JavaPicture{
    public static  void  main(String[] args)throws FileNotFoundException, IOException {
        /*
          Image、ImageIO、BufferImage、Icon、ImageIcon
         */
        //得到图片缓冲区
        BufferedImage bi = new BufferedImage(170, 70,BufferedImage.TYPE_INT_ARGB);
        //得到它的绘制环境
        Graphics2D g2 =(Graphics2D)bi.getGraphics();
        //设置颜色
        g2.setColor(Color.white);
        //填充整张图片,即设置背景色
        g2.fillRect(0,0,180,70);
        //设置字体格式
        g2.setFont(new Font("宋体",Font.BOLD,25));
        //设置字体颜色
        g2.setColor(Color.red);
        //向图片上写字符串
        g2.drawString("HelloWorld",20,45);
        ImageIO.write(bi,"JPEG",new FileOutputStream(
                "C:\\Users\\84536\\Desktop\\study/a.jpg"));

    }
}
