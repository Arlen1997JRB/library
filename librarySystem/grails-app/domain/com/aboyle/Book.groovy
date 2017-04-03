package com.aboyle

class Book {
String title
String subject
String author
String isbn
Date dateBorrowed
Date returnDate
Student name
Boolean overdue
Library buildingName

static hasMany = [reviewTitle:BookReview]

    static constraints = {
title blank:false, nullable:false
subject blank:false, nullable:false, maxSize: 300
author blank:false, nullable:false
isbn blank:false, nullable:false
dateBorrowed blank:false, nullable:false
returnDate blank:false, nullable:false
name blank:false, nullable:false
buildingName blank:false, nullable:false
    }
}
