package testprogram

class User {
    String name
    String email
    String mobileNUmber
    String password
    static constraints = {
        name size: 3..50, blank:false
        email email: true, blank:false
        mobileNUmber size:11, blank:false
        password size: 5..15, blank:false
    }
}
