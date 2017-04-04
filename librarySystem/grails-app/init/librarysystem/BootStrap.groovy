package com.aboyle

class BootStrap {

    def init = { servletContext ->
	def Library = new Library(
	buildingName:'Adsetts',
	address:'Some made up address',
	openingHours:'09:00',
	location:'Sheffield',
	studySpaces:'100'
	).save()

	def Librarian = new Librarian(
	name:'Aidan Black',
	email:'na@na.com',
	office:'The Office US',
	userName:'aidan123',
	password:'patryk123',
	telephone:'+4478523928',
	buildingName:Library
	).save()

	def Course = new Course(
	title:'lolol',
	code:'123abc123',
	leader:'hehehe',
	department:'asgkjasgj',
	description:'asgasgas',
	studyMode:'aksgasgh'
	).save()

	def Student = new Student(
	name:'Patryk Ginter',
	email:'na@na.com',
	userName:'patrykginter123',
	password:'pgint123',
	studentId:'123abc123',
	title:Course,
	buildingName:Library
	).save()

	def Book = new Book(
	title:'life of patryk ginter',
	subject:'horror',
	author:'patryk ginter',
	isbn:'123abc123',
	dateBorrowed:new Date('12/12/12'),
	returnDate:new Date('12/12/13'),
	name:Student,
	overdue:true,
	buildingName:Library
	).save()

	def BookReview = new BookReview(
	title:Book,
	dateReviewed:new Date('11/11/2016'),
	userName:Student,
	review:'blablabla',
	reviewTitle:'blablabla'
	).save()
	
	def Library2 = new Library(
	buildingName:'Howard',
	address:'Some made up address2',
	openingHours:'08:00',
	location:'Rotherham',
	studySpaces:'99'
	).save()

	def Librarian2 = new Librarian(
	name:'Edan Blick',
	email:'na@na.com',
	office:'The Office UK',
	userName:'aidan321',
	password:'patryk321',
	telephone:'+44788888',
	buildingName:Library2
	).save()
	
	def Course2 = new Course(
	title:'hahah',
	code:'321cba321',
	leader:'huehuehuehue',
	department:'random',
	description:'qweqweqwe',
	studyMode:'qweqweqwe'
	).save()

	def Student2 = new Student(
	name:'Pasgka Huewville',
	email:'na@wue.com',
	userName:'pasgkahuewville123',
	password:'pasgkahuewville321',
	studentId:'321cba321',
	title:Course2,
	buildingName:Library2
	).save()

	def Book2 = new Book(
	title:'life of aidan black',
	subject:'horror',
	author:'aidan black',
	isbn:'321cba321',
	dateBorrowed:new Date('13/13/13'),
	returnDate:new Date('12/12/15'),
	name:Student2,
	overdue:false,
	buildingName:Library2
	).save()

	def BookReview2 = new BookReview(
	title:Book2,
	dateReviewed:new Date('12/12/2016'),
	userName:Student2,
	review:'qweqweqweq',
	reviewTitle:'qweqweq'
	).save()


	
	
	
	

    }
    def destroy = {
    }
}
