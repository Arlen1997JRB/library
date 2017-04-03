package com.aboyle

class Student {
String name
String email
String username
String password
String studentId
String course

    static constraints = {
name blank:false, nullable:false
email blank:false, nullable:false
username blank:false, nullable:false, unique:true
password blank:false, nullable:false
studentId blank:false, nullable:false, unique:true
course blank:false, nullable:false
    }
}
