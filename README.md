# StudentAdministration
Spring/Hibernate Java Project about Basic Student Administration
<a href="https://ibb.co/YWGSNzN"><img src="https://i.ibb.co/8BVwmWm/student-administration.jpg" alt="student-administration" border="0"></a>

Welcome to my Spring/Hibernate Java project.This is a basic interface to make some known sql operations like select,insert,delete,update using Hibernate.
General structure based on Spring MVC(Model View Controller)

<a href="https://imgbb.com/"><img src="https://i.ibb.co/KVVysqF/image-servicedao.png" alt="image-servicedao" border="0"></a>

As you can see on the schema(above),designed 4 classes;Student(has getter,setter methods and variables),Service Interface and ServiceImpl provides us to make transaction tasks,StudentDAO provides us to create an object from database.Due to MVC there are views as JSP files for webpages.
To add yourown database connections you have to modify these lines on the spring-mvc-crud-demo-servlet.xml
  <!-- Step 1: Define Database DataSource / connection pool -->
	<bean id="myDataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource"
          destroy-method="close">
        <property name="driverClass" value="com.mysql.jdbc.Driver" />
        <property name="jdbcUrl" value="jdbc:mysql://localhost:3306/ogrenci_schema?useSSL=false" />
        <property name="user" value="root" />
        <property name="password" value="password" /> 
Here's a view from my example database.You have to create a database according to same column names.
<a href="https://imgbb.com/"><img src="https://i.ibb.co/CVn5kWz/databaseexample.jpg" alt="databaseexample" border="0"></a>
I explained all other details as command lines on the project files.So according this structure you can create your-own projects.
