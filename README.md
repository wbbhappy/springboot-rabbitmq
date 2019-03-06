1.安装RabbitMQ，具体怎么安装，百度一下！

2.配置RabbitMQ的ip，端口，用户名，密码，具体见：application.properties

3.启动Application.java类

4.执行RabbitMQTest.java类的send方法

对于Queue模式，一个发布者发布消息，下面的接收者按队列顺序接收，比如发布了10个消息，两个接收者A,B那就是A,B总共会收到10条消息，不重复。
