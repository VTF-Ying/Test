## Quartz定时任务的框架
>- 1.任务: 做什么事情……  实现Job
>- 2.触发器: 定义时间
>- 3.调度器: 将任务、触发器 一一对应

#### jar包的引入
	<dependency>
	    <groupId>org.quartz-scheduler</groupId>
	    <artifactId>quartz</artifactId>
	    <version>2.2.2</version>
	</dependency>

*需要定义  job、触发器、调度器 才能执行*
##!--注意--!
scheduler.shutdown() 如果直接写 那运行时不管程序有没有运行完都会立即关闭
scheduler.shutdown(flase) = scheduler.shutdown()
scheduler.shutdown(true) 等待任务执行完毕后 再关闭
