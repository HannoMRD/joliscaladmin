
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/hanno/Development/joliscaladmin/conf/routes
// @DATE:Thu Sep 03 03:07:36 SAST 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
