##外观模式
##定义
提供了一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更容易使用。
##使用原则
- 最少知识原则：只和你的密友谈话
>如何不要赢得太多的朋友和影响太多的对象？
>>答：就任何对象而言，在该对象的方法中，我们只应该调用属于一下范围的方法：1、该对象本身；2、被当作方法的参数而传递进来的对象；3、该方法所创建或实例化的任何对象；4、对象的任何组件（即对象的实例属性）。
##实例
咖啡调料和配料（Starbuzz）