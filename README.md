### LINKS

https://www.infoworld.com/article/3379043/what-is-jpa-introduction-to-the-java-persistence-api.html
https://www.tutorialspoint.com/jpa/jpa_orm_components.htm
https://stackabuse.com/guide-to-jpa-with-hibernate-basic-mapping/
https://www.baeldung.com/java-dao-pattern

https://www.baeldung.com/java-9-modularity
https://javarush.ru/groups/posts/2650-ispoljhzovanie-jndi-v-java
https://www.baeldung.com/jndi

https://github.com/spring-projects/spring-framework/wiki/Spring-Annotation-Programming-Model
https://github.com/spring-projects/spring-framework/wiki/Spring-Framework-5-FAQ
https://stackoverflow.com/questions/10664182/what-is-the-difference-between-jdk-dynamic-proxy-and-cglib/24588880#24588880

https://en.wikipedia.org/wiki/Programming_paradigm
https://www.info.ucl.ac.be/~pvr/paradigms.html
https://www.janeve.me/software-programming/understanding-programming-paradigms

https://www.baeldung.com/spring-framework-design-patterns
https://habr.com/ru/post/222579/
https://habr.com/ru/company/jugru/blog/218203/
https://habr.com/ru/post/490586/

### GIT

#### Syncing a fork
git remote -v 
git remote add upstream git@github.com:spring-projects/spring-framework.git
git fetch upstream
git checkout master
git merge upstream/master

#### Pushing branch
git branch -r
git push --set-upstream origin docs/InnerClassNames


### Accessing differently scoped target beans
- lookup method injection
- ObjectFactory/ Provider injection point
- org.springframework.beans.factory.config.ServiceLocatorFactoryBean


### XML configuration
- doesn't modify source code
- hierarchy (abstract beans)
- instance-based (different instantiations of same class)


### @Bean
    @Configuration
        CGLIB
        inter-bean dependencies
    @Component / POJO
        no CGLIB
        operate on their containing component’s internal state and, optionally, on arguments that they may declare


### Lifecycle order
- @PostConstruct
- InitializingBean::afterPropertiesSet()
- custom init() method


- @PreDestroy
- DisposableBean::destroy()
- custom destroy() method

### Properties
- JVM system properties:    System.getProperties(): -D command-line args
- JVM system environment:   System.getenv():        OS env variables
- properties files


### TODO (done)
+ 1. The @Bean methods in a regular Spring component are processed differently than their counterparts inside a Spring @Configuration class.
+ 2. @Configuration classes are subclassed at startup-time with CGLIB
+ 3. Calls to static @Bean methods never get intercepted by the container, not even within @Configuration classes (as described earlier in this section), due to technical limitations: CGLIB subclassing can override only non-static methods.
+ 4. CGLIB: configuration classes must not be final.
+ 5. Also, be particularly careful with BeanPostProcessor and BeanFactoryPostProcessor definitions through @Bean. Those should usually be declared as static @Bean methods,
+ 6. ScopedProxyMode.TARGET_CLASS vs ScopedProxyMode.INTERFACES
   ScopedProxyMode.TARGET_CLASS -> cglib
   ScopedProxyMode.INTERFACES -> com.sun.proxy.$Proxy14
   
7. Why? 
    getInstantiationStrategy() = CGLIB
    -> SimpleInstantiationStrategy().instantiate()
        @Configuration -> MyConfig$$EnhancerBySpringCGLIB$$obj
        @Component     -> MyComponent 
    
            spring-beans > ConstructorResolver
                @Bean
                    @Component -> MyBean                 -> jdk:invokeStatic 
                    @Configuration -> enhancer -> MyBean -> jdk:invokeStatic 
                static @Bean
                    MyBean                               -> jdk:invokeStatic

    spring-beans / InstantiationStrategy

8. @Profile: If the conditions are inconsistent, only the condition on the first declaration among the overloaded methods matters. Couldn't reproduce.


### Conversion
- java.beans.PropertyEditor
- Conversion
      - Converter SPI, ConverterFactory, GenericConverter, ConditionalGenericConverter
      - ConversionService API

### Formatting
- java.beans.PropertyEditor
- Formatter 

### Validation
Method validation relies on AOP Proxies around the target classes, either JDK dynamic proxies for methods on interfaces or CGLIB proxies.

