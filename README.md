1.安装RabbitMQ，具体怎么安装，百度一下！

2.配置RabbitMQ的ip，端口，用户名，密码，具体见：application.properties

3.启动Application.java类

4.执行RabbitMQTest.java类的send方法

JMS（Java Messaging Service）是Java平台上有关面向消息中间件的技术规范，它便于消息系统中的Java应用程序进行消息交换,
并且通过提供标准的产生、发送、接收消息的接口简化企业应用的开发。

JMS类似与JDBC,sun提供接口，由各个厂商（provider）来进行具体的实现。市面上众多成熟的JMS规范实现的框架Kafk,RabbitMQ,ActiveMQ,ZeroMQ,RocketMQ等。

队列(queue)与主题(topic)模式消息

我们从ActiveMQ来实践:(安装部署省掉)
Queue模式实践:
对于Queue模式，一个发布者发布消息，下面的接收者按队列顺序接收，比如发布了10个消息，两个接收者A,B那就是A,B总共会收到10条消息，不重复。
Topic模式实现:
对于Topic模式，一个发布者发布消息，有两个接收者A,B来订阅，那么发布了10条消息，A,B各收到10条消息。

在RabbitMQ下的生产消费者模式与订阅发布模式一文中，笔者以“数据接入”和“事件分发”两种场景为例，
介绍了如何使用RabbitMQ来设计、实现生产消费者模式与订阅发布模式。

生产消费者模式，指的是由生产者将数据源源不断推送到消息中心，由不同的消费者从消息中心取出数据做自己的处理，
在同一类别下，所有消费者拿到的都是同样的数据；

订阅发布模式，本质上也是一种生产消费者模式，
不同的是，由订阅者首先向消息中心指定自己对哪些数据感兴趣，发布者推送的数据经过消息中心后，每个订阅者拿到的仅仅是自己感兴趣的一组数据。
这两种模式是使用消息中间件时最常用的，用于功能解耦和分布式系统间的消息通信。

RabbitMQ的五种队列：
    1、简单队列:QUEUE_NAME
    2、work 模式:QUEUE_NAME
    3、发布/订阅模式:EXCHANGE_NAME
    4、路由模式:EXCHANGE_NAME
    5、主题模式:EXCHANGE_NAME
    6、四种交换器
参考网址：https://www.cnblogs.com/ysocean/p/9251884.html#_label2
