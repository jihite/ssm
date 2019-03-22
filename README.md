# ssm
Spring SpringMVC MyBatis template

功能完善列表
2019年 

3.21 ssm基本功能实现

3.22 添加MyBatis自测脚本：MyBatisTest， 参考：http://www.mybatis.org/mybatis-3/zh/getting-started.html
基本原理：当框架启动时，通过configuration解析config.xml配置文件和mapper.xml映射文件，映射文件可以使用xml方式或者注解方式，然后由configuration获得sqlsessionfactory对象，再由sqlsessionfactory获得sqlsession数据库访问会话对象，通过会话对象获得对应DAO层的mapper对象，通过调用mapper对象相应方法，框架就会自动执行SQL语句从而获得结果。
