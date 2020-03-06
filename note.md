##常用依赖
```xml
<dependencies>
        <!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.2.0.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>
    </dependencies>

```
##注解说明

- @Autowired：自动装配通过类型，名字   
如果@Autowired不能唯一自动装配上属性，则需要通过@Qualifier(value="xxx")去配置@Autowired的使用
- @Nullable	字段标记了这个注解，说明这个字段可以为null
- @Resource：自动装配通过名字，类型 
1. Bean注入  
@Component：组件，放在类上，说明这个类被spring管理了，就是Bean！
2. 属性注入  
@Value("kuangshen") 相当于
   ```xml
   <property name="name" value="kuangshen"/>
   ```  
3. 衍生的注解:@Component有几个衍生注解，我们在web开发中，会按照mvc三层架构分层！  
    3.1 dao【@Repository】  
    3.2 service【@Service】  
    3.3 controller【@Controller】  
    这四个注解功能都是一样的，都是代表将某个类注册到Spring中，装配Bean！  
4. 自动装配  
    ```
    -@Autowired:自动装配通过类型，名字
        如果Autowired不能唯一自动装配上属性，则需要通过@Qualifier(value="xxx")
    -@Nullable:字段标记了这个注解，说明这个字段可以为null
    -@Resource:自动装配通过名字，类型
5. 作用域  