# 如何优雅的停止我们正在运行的工程

这个项目的目的是为了服务收到了"kill -15"停止命令的时候，可以有一个等待的时间，因为我们不希望程序有正在运行着的代码，而忽然间被叫停。

网上已经有了很多关于"Graceful shutdown"的案例，但是大多数情况下都是将bean注入到了启动类中。

此项目与别的项目的不同就是把配置放在可配置类中。
