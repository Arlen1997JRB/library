package com.aboyle

class BookReview {
String book
Date dateCreated
String student
String review

    static constraints = {
book blank:false, nullable:false maxSize: 100
dateCreated blank:false, nullable:false
student blank:false, nullable:false
review blank:false, nullable:false bio widget:'textarea'
    }
}
