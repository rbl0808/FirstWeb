package ZXD_2018_4_1;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
2018年4月6日22:55:14
简易版网络爬虫
 */
public class FindGroup {
    public  static  void  main(String[] args){
        //使用字符串模拟从网络上得到的网页源码
        String str = "我想求购一本《疯狂Java讲义》,尽快联系我13535345833"
                + "交朋友,电话号码是15264933585"
                + "出售DNF账号,十个卢克C,电话15010492214";
        /*
        创建一个Pattern对象,并用它们建立一个Matcher对象
        该正则表达式之抓取13X和15X段的手机号
        想要抓取别的需要修改正则表达式
         */
        Matcher m = Pattern.compile("((13\\d)|(15\\d))\\d{8}").matcher(str);
        while (m.find()){
            System.out.println(m.group());
        }

        //java支持的国家和语言
      /*  Locale[] localeList = Locale.getAvailableLocales();
        for(int i = 0;i < localeList.length;i++){
            System.out.println(localeList[i].getCountry() + "="
                    + localeList[i].getDisplayLanguage() + "="
            +localeList[i].getLanguage() + " " +"第" + i + "个");
            int a = 1;
            boolean b = (a == 1 )?true:false;
            System.out.println(b);

        }*/
    }

}
