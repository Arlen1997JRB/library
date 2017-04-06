package com.aboyle

class StudentController {

    def scaffold = Student
    def login(){

}
    def validate(){
    def user = Student.findByUserName(params.username)
	if (user && user.password == params.password){

		session.user=user
		render view:'home'
}

    else{
	
	flash.message = "Invalid username and password."
	
	render view:'login'

}

}

    def logout ={

	session.user = null

	redirect(uri:'/')


}


   def advSearch(){

}

def advResults(){


    def books = Book.withCriteria{
	def bookProps = Book.metaClass.properties*.name
	"$params.queryType"{
		params.each{field, value->
		
			if(bookProps.grep(field) && value){
			ilike(field,value)
			}
		}
	}
    }	
	[ books : books ]
}
 
}
