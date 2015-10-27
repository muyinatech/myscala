package muyinatech.myscala.accessmodifiers

class Authentication {
  private[this] val password = "jason" // can only be access within the object in which it is defined
  def validate = password.size > 0
}
