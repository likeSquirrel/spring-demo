## 什么是切面（aop）？

* 切点(pointcut)，连接点(join point)，通知(advise)所在的类称为一个切面；
* 连接点(join point)是基本单位，通常用表达式表达多个连接点；
* 切点（pointcut）是连接点的集合；
* 切入切点的时机以及对应的逻辑是通知（advise）；


## aop proxy object是在什么时候生成的？
* 在初始化spring的时候，通过BeanPostProcessor实现类用cglib或者jdk代理生成的代理对象。