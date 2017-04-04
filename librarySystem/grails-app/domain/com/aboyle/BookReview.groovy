package com.aboyle

class BookReview {
Book title
Date dateReviewed
Student userName
String review
String reviewTitle

String toString(){
return title
}

    static constraints = {
dateReviewed blank:false, nullable:false
review blank:false, nullable:false, widget:'textarea'
title blank:false, nullable:false
userName blank:false, nullable:false, unique:true
reviewTitle blank:false, nullable:false
    }
}
