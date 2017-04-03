package com.aboyle

class Student {
String name
String email
String userName
String password
String studentId
Course title
Library buildingName

static hasMany = [reviewTitle:BookReview, title:Book]

    static constraints = {
name blank:false, nullable:false
email blank:false, nullable:false
userName blank:false, nullable:false, unique:true
password blank:false, nullable:false
studentId blank:false, nullable:false, unique:true
title blank:false, nullable:false
buildingName blank:false, nullable:false
    }
}
