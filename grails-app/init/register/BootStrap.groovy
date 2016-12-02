package register

class BootStrap {

    def init = { servletContext ->
    	new User(username: "samuelgoes", name: "Samu").save()
    	new User(username: "joseto", name: "Jose").save()
    }
    def destroy = {
    }
}
