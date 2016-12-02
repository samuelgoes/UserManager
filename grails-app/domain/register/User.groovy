package register


import grails.rest.*

@Resource(uri="/users", readOnly = false, formats = ['json', 'xml'])
class User {
	String username
	String name
}