package com.aboyle

class Librarian {
String name
String email
String office
String userName
String password
String telephone
Library buildingName

String toString(){
return name
}

    static constraints = {
name blank:false, nullable:false
email blank:false, nullable:false
office blank:false, nullable:false
userName blank:false, nullable:false
password blank:false, nullable:false
telephone blank:false, nullable:false, maxSize: 20
buildingName blank:false, nullable:false
    }
}
