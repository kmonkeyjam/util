import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  override def repositories = Set("twitter.artifactory" at "http://artifactory.local.twitter.com/repo/")
  override def ivyRepositories = Seq(Resolver.defaultLocal(None)) ++ repositories

  val twitterMaven = "twitter.com" at "http://maven.twttr.com/"
  val defaultProject = "com.twitter" % "standard-project" % "0.11.16-NEST"
}
