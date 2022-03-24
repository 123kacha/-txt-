import jdk.internal.util.xml.impl.XMLWriter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Random;

//import static sun.util.locale.LocaleUtils.isNumeric;
//23116556
public class 随机数生成器{
    public static JFrame windows = new JFrame("随机生成器");
    public static JButton 背诵2=new JButton("背诵");//背诵按钮
    public static  JButton 录入2=new JButton("录入");//录入按钮
    public static JButton 下一个2=new JButton("下一个");//下一个按钮
    public static  JButton 背诵=new JButton("背诵");//背诵按钮
    public static  JButton 录入=new JButton("录入");//录入按钮
    public static  JButton 下一个=new JButton("下一个");//下一个按钮
    public static  JButton 验证=new JButton("验证");//验证按钮
    public static  JButton 验证2=new JButton("验证");//验证按钮
    public static  JButton 文件存在=new JButton("文件不存在");//验证按钮
    public static  JButton 文件存在2=new JButton("文件不存在");//验证按钮
    public static    JButton 文件名2=new JButton("文件名");//文件名按钮
    public static   JButton 文件名=new JButton("文件名");//文件名按钮
    public static     JTextField 输入文件名=new JTextField("请输入文件名");
    public static   JTextField 输入文本=new JTextField("请输入文本");
    public static   JTextField 输入文件名2=new JTextField("请输入文件名");
    public static  JTextField 输出文本2=new JTextField("输出文本");
    public static String name;//txt文件名
    public static int a=0;
    public static int getmax_time=0;//获取最大值次数
    public static void main(String[] args) {
        windows(1);
        connect();
    }
    public  static void windows(int jpanel){//显示窗口和按钮
    //    JFrame windows = new JFrame("随机生成器");
        windows.setSize(1000, 500);
        windows.setLocation(300, 200);
        windows.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel interface1=new JPanel();
   //     windows.setContentPane(interface1);//使窗口与录入界面连接
        interface1.setLayout((LayoutManager)null);
//        JButton 背诵=new JButton("背诵");//背诵按钮
//        JButton 录入=new JButton("录入");//录入按钮
//        JButton 下一个=new JButton("下一个");//下一个按钮
        背诵.setBounds(50, 10, 100, 50);
        录入.setBounds(170, 10, 100, 50);
        验证.setBounds(800, 80, 100, 50);
        文件存在.setBounds(680, 80, 100, 50);
        文件名.setBounds(550, 10, 100, 50);
        输入文件名.setBounds(750, 10, 200, 50);
        输入文本.setBounds(250, 150, 500, 100);
        下一个.setBounds(400, 300, 200, 100);//定义位置
        输入文本.setFont(new Font("宋体", 3, 50));
        输入文件名.setFont(new Font("宋体", 3, 30));
        interface1.add(背诵);
        interface1.add(文件存在);
        interface1.add(录入);
        interface1.add(验证);
        interface1.add(输入文件名);
        interface1.add(输入文本);
        interface1.add(下一个);
        interface1.add(文件名);//按钮和界面相连接
        windows.setVisible(true);
        JPanel interface2=new JPanel();
  //      windows.setContentPane(interface2);//使窗口与录入界面连接
        interface2.setLayout((LayoutManager)null);
//        JButton 背诵2=new JButton("背诵");//背诵按钮
//        JButton 录入2=new JButton("录入");//录入按钮
//        JButton 下一个2=new JButton("下一个");//下一个按钮

        背诵2.setBounds(50, 10, 100, 50);
        录入2.setBounds(170, 10, 100, 50);
        文件名2.setBounds(550, 10, 100, 50);
        输入文件名2.setBounds(750, 10, 200, 50);
        输出文本2.setBounds(250, 150, 500, 100);
        验证2.setBounds(800, 80, 100, 50);
        文件存在2.setBounds(680, 80, 100, 50);
        下一个2.setBounds(400, 300, 200, 100);//定义位置
        输出文本2.setFont(new Font("宋体", 3, 50));
        输入文件名2.setFont(new Font("宋体", 3, 30));
        interface2.add(背诵2);
        interface2.add(录入2);
        interface2.add(文件存在2);
        interface2.add(输入文件名2);
        interface2.add(验证2);
        interface2.add(输出文本2);
        interface2.add(下一个2);
        interface2.add(文件名2);//按钮和界面相连接
        if(jpanel==1){
            windows.setContentPane(interface1);
}//使窗口与录入界面连接}
        else if(jpanel==2){
            windows.setContentPane(interface2);}//使窗口与录入界面连接}
        windows.setVisible(true);
    }
    public static void connect(){
        背诵功能 背诵功能2=new 背诵功能();
        背诵.addActionListener(背诵功能2);
        背诵2.addActionListener(背诵功能2);
        录入功能 录入功能2=new 录入功能();
        录入.addActionListener(录入功能2);
        录入2.addActionListener(录入功能2);
        验证功能 验证功能3=new 验证功能();
        验证功能2 验证功能4=new 验证功能2();
        验证.addActionListener(验证功能3);
        验证2.addActionListener(验证功能4);
        nextone_1 输入功能=new nextone_1();
        下一个.addActionListener(输入功能);
        nextone_2 输出功能=new nextone_2();
        下一个2.addActionListener(输出功能);
    }
    public static class 背诵功能 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
        windows(2);
        }
    }
    public static class 录入功能 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            windows(1);
        }
    }
    public static class 验证功能 implements ActionListener{//确认文件夹及文件是否存在，若不存在则创建

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                fold();
                txt_1();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    public static class 验证功能2 implements ActionListener{//确认文件夹及文件是否存在，若不存在则创建

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                fold();
                txt_2();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    public static class nextone_1 implements ActionListener {//将文本框内数据输入到txt文件中

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                num_a();
                输入();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    public static class nextone_2 implements ActionListener {//将文本框内数据输入到txt文件中

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                输出();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    public static void fold() throws IOException {
        File 文件夹= new File("c:\\需背诵的资料");
        if(文件夹.exists()!=true){
            文件夹.mkdir();
     //       文件存在.setText("文件已创建");
        }
  //      else{文件存在.setText("文件已存在");}
    }
    public static void txt_1() throws IOException {
        name= 输入文件名.getText();
        File 文件= new File("c:\\需背诵的资料\\"+name+".txt");
        if(文件.exists()!=true){
            FileWriter tool=new FileWriter("c:\\需背诵的资料\\"+name+".txt");
            文件存在.setText("文件已创建");
        }
        else{文件存在.setText("文件已存在");}
    }
    public static void txt_2() throws IOException {
        name= 输入文件名2.getText();
        File 文件= new File("c:\\需背诵的资料\\"+name+".txt");
        if(文件.exists()!=true){
            FileWriter tool=new FileWriter("c:\\需背诵的资料\\"+name+".txt");
            文件存在2.setText("文件已创建");
        }
        else{文件存在2.setText("文件已存在");}
    }
    public static void 输入() throws IOException {
    BufferedWriter tool=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:\\需背诵的资料\\"+name+".txt",true)));
    String data=输入文本.getText();
    tool.write(a+"."+data+"\r\n");
    输入文本.setText("");
    tool.close();
    }
    public static void num_a() throws IOException {//录入界面计算a的值
        if(getmax_time==0){getmax();getmax_time=1;}
        a++;//第一次打开文件
    }
    public static void getmax() throws IOException {//获取原文件中a最大值
        BufferedReader tool=new BufferedReader(new FileReader("c:\\需背诵的资料\\"+name+".txt"));
        String data=null;
        String data_2=null;
        while(true)
        {   data_2=data;
            data=tool.readLine();
        if(data==null||data==""){data=data_2;break;}}
        if(data!=null&&data!=""){
        String data_02=data.substring(0,2);//前三位
        String data_01=data.substring(0,1);//前两位
        String data_0=data.substring(0,0);//第一位
        if(isNumeric(data_02)==true){//前三位均为数字
            a=Integer.valueOf(data_02);
        }
        else if(isNumeric(data_01)==true){//前两位均为数字
            a=Integer.valueOf(data_01);
        }
        else if(isNumeric(data_0)==true){//第一位为数字
            a=Integer.valueOf(data_0);
        }}

    }
    public static boolean isNumeric(String str){
            for (int i = str.length();--i>=0;){
                    if (!Character.isDigit(str.charAt(i))){
                            return false;
                        }
                }
            return true;
         }
    public static void 输出() throws IOException {//获取随机值，定位随机值所在txt文件行，除去前缀，输出
        BufferedReader tool=new BufferedReader(new FileReader("c:\\需背诵的资料\\"+name+".txt"));
        String data=null;
        getmax();//使a变为原文件中最大值
        Random r=new Random();
        int i= r.nextInt(a)+1;
        for(int j=0;j<i;j++)
        {
            data= tool.readLine();//读到a所在行
        }
        if(data!=null&&data!=""){
            String data_02=data.substring(0,2);//前三位
            String data_01=data.substring(0,1);//前两位
            String data_0=data.substring(0,0);//第一位
            if(isNumeric(data_02)==true){//前三位均为数字
                data=data.substring(3);
            }
            else if(isNumeric(data_01)==true){//前两位均为数字
                data=data.substring(2);

            }
            else if(isNumeric(data_0)==true){//第一位为数字
                data=data.substring(1);
            }
    输出文本2.setText(data);
        }
        else {输出文本2.setText("文件为空");}
    }
}
