package com.aboyle

class Book {
String title
String subject 
String author
String isbn
Date dateBorrowed
Date returnDate
String student
Boolean overdue

    static constraints = {
title blank:false, nullable:false
subject blank:false, nullable:false, bio maxSize: 300
author blank:false, nullable:false
isbn blank:false, nullable:false
dateBorrowed blank:false, nullable:false
returnDate blank:false, nullable:false
student blank:false, nullable:false, bio maxSize: 100
    }
}
