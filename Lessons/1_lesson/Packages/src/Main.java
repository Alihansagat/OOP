import mypackage.Student;

// to import a single class from the mypackage package
// import mypackage.Date;

// to import all the public classes from the mypackage package
// import mypackage.*;

// * is used to import classes at the current package level. It will NOT
// import classes in a sub-package.


// What if you have a name conflict?
// import java.util.*;
// import java.sql.*;
// Date today = new Date( ); -> ERROR:java.util.Date or java.sql.Date?

// if you only need to refer to one of them, import that class explicitly
// import java.util.*;
// import java.sql.*;
// import java.util.Date;
// Date today = new Date( ); -> java.util.Date

// if you need to refer to both of them, you have to use the full
// package name before the class name
// import java.util.*;
// import java.sql.*;
// java.sql.Date today = new java.sql.Date( );
// java.util.Date nextDay = new java.util.Date( );

class first{
    public static void main(String[] args) {
        Student s=new Student();

        s.print();
    }
}


// import java.lang.Math;
// public class importTest {
// double x = sqrt(1.44); }  -> ERROR
// Remember, for the static members, you refer them as
// className.memberName, in our case it will be Math.sqrt(1.44)


// static belongs to class not to a object
// if we create static field in class it is will be general to whole objects,
// if we create without static, each object has own fields
// static int count = 0;

/// Relationships among Classes
// Association
// class Teacher { }
// class Student {
//    Teacher teacher; // association }

// Student connected with Teacher but classes are independence, Teacher can exist without
// Student