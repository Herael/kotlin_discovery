package class_hard

data class User (var email:String, var password:String, var urlImage:String) {

    companion object {
        fun newInstance(email: String, password: String, urlImage: String) = User(email, password, urlImage)
    }

}


