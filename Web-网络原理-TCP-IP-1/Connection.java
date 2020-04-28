// 类型全部是伪代码
public class Connection {
    // 1. 连接的唯一标识 —— 五元组
    String 协议;    // TCP
    String 本地ip;
    String 本地端口;
    String 远端ip;
    String 远端port;

    // 2. SN 和 ASN
    int 下一次要发送的数据的序列号;     // SN
    int 下一次收到数据后，应该回复的确认序列号基准;     // ASN

    // 3. 缓冲区相关
    byte[] 发送缓冲区;
    byte[] 接收缓冲区;

    // ...



    Map<五元组, Connection> 所有连接;

    // 接收
    当收到 TCP 的 Segment 时候，可以根据收到的数据中的 ip + 端口信息，找到相应的 Connection 对象
    根据 Segment 的长度  +  connection.ASN 计算出，应该回复的 TCP Segment 中填写的 ASN

    // 发送
    通过 Socket，找到对应的 Connnection 对象
    把数据封装成 TCP Segment，Segment 的 SN ，根据 connection.SN 填写即可。
}