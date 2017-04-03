package com.aboyle

class Course {
String title
String code
String leader
String department
String description
String studyMode

    static constraints = {
title blank:false, nullable:false, maxSize: 100
code blank:false, nullable:false, unique:true 
leader blank:false, nullable:false, maxSize: 100
department blank:false, nullable:false, maxSize: 100
description blank:false, nullable:false, maxSize: 1000
studyMode blank: false, nullable:false 
    }

}
