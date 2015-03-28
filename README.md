## 设计模式的表述格式

- 模式名：某个模式的名字
- 应用场景：在面向对象的系统设计中反复出现的特定场合，它导致我们采用这个模式
- 参与者：这个模式中所用到的类在这其中扮演的角色
- 示例：代码
- 相关模式：其他相关模式，以及它们之间的异同

- - -

## 设计模式的原则

### 迪米特法则 ###

>定义：迪米特法则（Law of Demeter）又叫作最少知识原则（Least Knowledge Principle 简写LKP），就是说一个对象应当对其他对象有尽可能少的了解,不和陌生人说话。英文简写为: LoD.

###### 还有一个更简单的定义：只与直接的朋友通信 ######

我们称出现成员变量、方法参数、方法返回值中的类为直接的朋友，而出现在局部变量中的类则不是直接的朋友。也就是说，陌生的类最好不要作为局部变量的形式出现在类的内部

### 里氏替换原则 ###

>定义：里氏替换原则通俗的来讲就是：子类可以扩展父类的功能，但不能改变父类原有的功能。

它包含以下4层含义：

- 子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法。
- 子类中可以增加自己特有的方法。
- 当子类的方法重载父类的方法时，方法的前置条件（即方法的形参）要比父类方法的输入参数更宽松。
- 当子类的方法实现父类的抽象方法时，方法的后置条件（即方法的返回值）要比父类更严格。

### 依赖倒置原则 ###

>定义：高层模块不应该依赖低层模块，二者都应该依赖其抽象；抽象不应该依赖细节；细节应该依赖抽象。

- A.高层次的模块不应该依赖于低层次的模块，他们都应该依赖于抽象。
- B.抽象不应该依赖于具体，具体应该依赖于抽象。

问题由来：类A直接依赖类B，假如要将类A改为依赖类C，则必须通过修改类A的代码来达成。这种场景下，类A一般是高层模块，负责复杂的业务逻辑；类B和类C是低层模块，负责基本的原子操作；假如修改类A，会给程序带来不必要的风险。

解决方案：将类A修改为依赖接口I，类B和类C各自实现接口I，类A通过接口I间接与类B或者类C发生联系，则会大大降低修改类A的几率。

依赖倒置原则基于这样一个事实：相对于细节的多变性，抽象的东西要稳定的多。以抽象为基础搭建起来的架构比以细节为基础搭建起来的架构要稳定的多。在java中，抽象指的是接口或者抽象类，细节就是具体的实现类，使用接口或者抽象类的目的是制定好规范和契约，而不去涉及任何具体的操作，把展现细节的任务交给他们的实现类去完成。

>传递依赖关系有三种方式：接口传递、构造方法传递和setter方法传递。

```
在实际编程中，我们一般需要做到如下3点：
1. 低层模块尽量都要有抽象类或接口，或者两者都有。
2. 变量的声明类型尽量是抽象类或接口。
3. 使用继承时遵循里氏替换原则。
```

依赖倒置原则的核心就是要我们面向接口编程，理解了面向接口编程，也就理解了依赖倒置。

- - -
