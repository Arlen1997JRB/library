package com.aboyle

class Library {
String buildingName
String address
String openingHours
String location
String studySpaces

static hasMany = [name:Librarian, title:Book, name:Student]

    static constraints = {
buildingName blank:false, nullable:false
address blank:false, nullable:false
openingHours blank:false, nullable:false
location blank:false, nullable:false
studySpaces blank:false, nullable:false
    }
}
