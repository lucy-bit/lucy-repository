/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -15
 * Time: 15:55
 */

/*题目描述：
        数组a的长度为n，元素都是正整数，定义目标数值c，数组a的n个数中一共有c个数的数值不小于c，剩下的n-c个数都不大于c。求出c的值。



        输入描述
        数组a

        输出描述
        数组a的目标数值c


        样例输入
        2 3 6 1 4
        样例输出
        3*/


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            String[] str_array = str.split(" ");
            int n = str_array.length;
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = Integer.valueOf(str_array[i]);
            }
            Arrays.sort(arr);

            for(int i = 0; i < n; i++) {
                if(arr[i] >= n - i)  {
                    System.out.println(n - i);
                    break;
                }
            }
        }
    }
}

/*
    Select Bus data
        时间限制： 3000MS
        内存限制： 589824KB
        题目描述：
        现有一张汽车信息表Bus_Info，有以下关键字段

        BusID：BusID，主键

        BusCode：汽车唯一code

        BusModel：汽车类型

        CreateTime：创建时间

        一张汽车发车时间表Bus_Schedule，有以下关键字段

        BusSID：BusSID，主键

        BusCode：汽车唯一code

        DepartTime：发车时间

        CreateTime：创建时间

        一张司机信息表Bus_Driver，有以下关键字段

        DriverID：DriverID，主键

        BusCode：汽车唯一code

        DriverName：司机姓名

        Age：年龄

        请用一条SQL语句对以上三张表进行联合数据查询操作，要求查询所有表信息，并且满足条件

        汽车类型为“BenzE”“Bmw7”

        发车时间大于等于“2020-01-01”且小于等于“2020-02-01”

        司机年龄小于40岁

        按照发车时间做升序排列



        输入描述
        select * from Bus_Info

        BusID  BusCode BusModel  CreateTime

        1          BUS01     BenzC        2015-01-01

        2          BUS02     BenzE        2015-01-01

        3          BUS03     BenzS        2015-01-01

        4          BUS04     BenzGLE    2015-01-01

        5          BUS05     BenzSLK    2015-01-01

        6          BUS06     BmwX1      2015-01-01

        7          BUS07     BmwX5      2015-01-01

        8          BUS08     BmwX7      2015-01-01

        9          BUS09     Bmw1        2015-01-01

        10        BUS10     Bmw3        2015-01-01

        11        BUS11     Bmw5        2015-01-01

        12        BUS12     Bmw7        2015-01-01

        -----------------------------------------------

        select * from Bus_Schedule

        BusSID  BusCode  DepartTime  CreateTime

        1          BUS01     2020-01-01    2015-01-01

        2          BUS02     2020-02-02    2015-01-01

        3          BUS02     2019-01-01    2015-01-01

        4          BUS02     2020-01-07    2015-01-01

        5          BUS02     2020-01-01    2015-01-01

        6          BUS03     2020-01-01    2015-01-01

        7          BUS04     2020-01-01    2015-01-01

        8          BUS05     2020-01-01    2015-01-01

        9          BUS06     2020-01-01    2015-01-01

        10        BUS07     2020-01-01    2015-01-01

        11        BUS08     2020-01-01    2015-01-01

        12        BUS09     2020-01-01    2015-01-01

        13        BUS09     2020-01-01    2015-01-01

        14        BUS10     2020-01-01    2015-01-01

        15        BUS11     2020-01-01    2015-01-01

        16        BUS12     2020-01-04    2015-01-01

        17        BUS12     2020-01-22    2015-01-01

        18        BUS12     2020-05-01    2015-01-01

        19        BUS12     2015-01-01    2015-01-01

        -----------------------------------------------

        select * from Bus_Driver

        DriverID  BusCode  DriverName  Age

        1              BUS01     ZHANG1         18

        2              BUS02     ZHANG2         18

        3              BUS02     ZHANG3         36

        4              BUS10     ZHANG4         21

        5              BUS11     ZHANG5         28

        6              BUS12     ZHANG6         19

        7              BUS12     ZHANG7         45


        输出描述
        执行语句后，根据题干条件过滤相关不符合要求数据，只显示符合要求的BusCode，BusModel ，DriverName，DepartTime 并根据DepartTime顺序排列


        样例输入
        CREATE TABLE  Bus_Info (
        BusID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
        BusCode varchar(50) NOT NULL,
        BusModel varchar(50) NOT NULL,
        CreateTime DATE NOT NULL
        );

        CREATE TABLE Bus_Schedule (
        BusSID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
        BusCode varchar(50) NOT NULL,
        DepartTime DATE NOT NULL,
        CreateTime DATE NOT NULL
        );
        CREATE TABLE Bus_Driver (
        DriverID INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
        BusCode varchar(50) NOT NULL,
        DriverName varchar(10) NOT NULL,
        Age int(10) NOT NULL
        );
        INSERT INTO Bus_Info(BusCode,BusModel,CreateTime) VALUES ('BUS01','BenzC','2015-01-01'),
        ('BUS02','BenzE','2015-01-01'),
        ('BUS03','BenzS','2015-01-01'),
        ('BUS04','BenzGLE','2015-01-01'),
        ('BUS05','BenzGLK','2015-01-01'),
        ('BUS06','BmwX1','2015-01-01'),
        ('BUS07','BmwX5','2015-01-01'),
        ('BUS08','BmwX7','2015-01-01'),
        ('BUS09','Bmw1','2015-01-01'),
        ('BUS10','Bmw3','2015-01-01'),
        ('BUS11','Bmw5','2015-01-01'),
        ('BUS12','Bmw7','2015-01-01');

        INSERT INTO Bus_Schedule(BusCode,DepartTime,CreateTime) VALUES
        ('BUS01','2020-01-01','2015-01-01'),
        ('BUS02','2020-02-02','2015-01-01'),
        ('BUS02','2019-01-01','2015-01-01'),
        ('BUS02','2020-01-07','2015-01-01'),
        ('BUS02','2020-01-01','2015-01-01'),
        ('BUS03','2020-01-01','2015-01-01'),
        ('BUS04','2020-01-01','2015-01-01'),
        ('BUS05','2020-01-01','2015-01-01'),
        ('BUS06','2020-01-01','2015-01-01'),
        ('BUS07','2020-01-01','2015-01-01'),
        ('BUS08','2020-01-01','2015-01-01'),
        ('BUS09','2020-01-01','2015-01-01'),
        ('BUS09','2020-01-01','2015-01-01'),
        ('BUS10','2020-01-01','2015-01-01'),
        ('BUS11','2020-01-01','2015-01-01'),
        ('BUS12','2020-01-04','2015-01-01'),
        ('BUS12','2020-01-22','2015-01-01'),
        ('BUS12','2020-05-01','2015-01-01'),
        ('BUS12','2015-01-01','2015-01-01');

        INSERT INTO Bus_Driver(BusCode,DriverName,Age) VALUES
        ('BUS01','ZHANG1',18),
        ('BUS02','ZHANG2',18),
        ('BUS02','ZHANG3',36),
        ('BUS10','ZHANG4',21),
        ('BUS11','ZHANG5',28),
        ('BUS12','ZHANG6',19),
        ('BUS12','ZHANG7',45);
        样例输出
        BusCode   BusModel    DriverName  DepartTime
        BUS02        BenzE           ZHANG2        2020-01-01
        BUS02        BenzE           ZHANG3        2020-01-01
        BUS12        Bmw7           ZHANG6        2020-01-04
        BUS02        BenzE           ZHANG2        2020-01-07
        BUS02        BenzE           ZHANG3        2020-01-07
        BUS12        Bmw7           ZHANG6       2020-01-22*/


    select i.BusCode,i.BusModel,d.DriverName,s.DepartTime
        from Bus_Info i
        left join Bus_Schedule s
        on i.BusCode = s.BusCode
        where i.BusCode in(
        select i.BusCode
        from i
        where i.BusModel = 'BenzE' OR i.BusModel = 'Bmw7'
        )
        and s.BusCode in (
        select s.BusCode FROM s
        where s.DepartTime BETWEEN '2020-01-01' AND '2020-02-01'
        order by s.DepartTime
        )

        left join Bus_Driver d
        on i.BusCode = d.BusCode
        where d.BusCode in (
                select d.BusCode
                from d
                where d.Age < 40
        )
        order by s.DepartTime;

   /* select i.BusCode,i.BusModel,d.DriverName,s.DepartTime
        from Bus_Info i ,Bus_Schedule s,Bus_Driver d
        where i.BusCode = s.BusCode and i.BusCode = d.BusCode and i.BusCode = s.BusCode
        where i.BusCode in(
        select i.BusCode
        from i
        where i.BusModel = 'BenzE' OR i.BusModel = 'Bmw7'
        )
        and s.BusCode in (
        select s.BusCode FROM s
        where s.DepartTime BETWEEN '2020-01-01' AND '2020-02-01'
        order by s.DepartTime
        )
        and d.BusCode in (
        select d.BusCode
        from d
        where d.Age < 40
        )
        order by s.DepartTime;
*/
