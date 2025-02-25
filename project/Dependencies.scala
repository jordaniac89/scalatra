import sbt._
import Keys._

object Dependencies {
  lazy val parserCombinators        =  "org.scala-lang.modules"  %% "scala-parser-combinators"   % "2.1.1"
  lazy val xml                      =  "org.scala-lang.modules"  %% "scala-xml"                  % "2.1.0"
  lazy val collectionCompact        =  "org.scala-lang.modules"  %% "scala-collection-compat"    % "2.8.1"
  lazy val akkaActor                =  "com.typesafe.akka"       %% "akka-actor"                 % akkaVersion
  lazy val akkaTestkit              =  "com.typesafe.akka"       %% "akka-testkit"               % akkaVersion
  lazy val commonsFileupload        =  "commons-fileupload"      %  "commons-fileupload"         % "1.4"
  lazy val commonsIo                =  "commons-io"              %  "commons-io"                 % "2.8"
  lazy val commonsText              =  "org.apache.commons"      %  "commons-text"               % "1.9"
  lazy val httpclient               =  "org.apache.httpcomponents" % "httpclient"                % httpcomponentsVersion
  lazy val httpmime                 =  "org.apache.httpcomponents" % "httpmime"                  % httpcomponentsVersion
  lazy val jettyServer              =  "org.eclipse.jetty"       %  "jetty-server"               % jettyVersion
  lazy val jettyPlus                =  "org.eclipse.jetty"       %  "jetty-plus"                 % jettyVersion
  lazy val jettyServlet             =  "org.eclipse.jetty"       %  "jetty-servlet"              % jettyVersion
  lazy val jettyWebsocket           =  "org.eclipse.jetty.websocket" %"websocket-server"         % jettyVersion
  lazy val jettyWebapp              =  "org.eclipse.jetty"       %  "jetty-webapp"               % jettyVersion
  lazy val json4sCore               =  "org.json4s"              %% "json4s-core"                % json4sVersion
  lazy val json4sJackson            =  "org.json4s"              %% "json4s-jackson"             % json4sVersion
  lazy val json4sNative             =  "org.json4s"              %% "json4s-native"              % json4sVersion
  lazy val json4sXml                =  "org.json4s"              %% "json4s-xml"                 % json4sVersion
  lazy val junit                    =  "junit"                   %  "junit"                      % "4.13.2"
  lazy val scalatestJunit           =  "org.scalatestplus"       %% "junit-4-13"                 % "3.2.13.0"
  lazy val jUniversalChardet        =  "com.github.albfernandez" %  "juniversalchardet"          % "2.4.0"
  lazy val logbackClassic           =  "ch.qos.logback"          %  "logback-classic"            % "1.2.11"
  lazy val mockitoAll               =  "org.mockito"             %  "mockito-core"               % "4.6.1"
  lazy val scalatest                =  Seq(
                                         "funspec",
                                         "wordspec",
                                         "flatspec",
                                         "freespec",
                                         "featurespec",
                                         "funsuite",
                                         "shouldmatchers",
                                         "mustmatchers",
                                       ).map(x => "org.scalatest" %% s"scalatest-$x" % scalatestVersion)
  lazy val servletApi               =  "jakarta.servlet"         %  "jakarta.servlet-api"        % "5.0.0"
  lazy val slf4jApi                 =  "org.slf4j"               %  "slf4j-api"                  % "1.7.36"
  lazy val specs2                   =  Seq(
                                       "org.specs2"              %% "specs2-core",
                                       "org.specs2"              %% "specs2-matcher-extra"
                                       ).map(_ % specs2Version)
  lazy val metricsScala             =  "nl.grons"                %% "metrics4-scala"             % "4.2.9"
  lazy val metricsServlets          =  "io.dropwizard.metrics"   %  "metrics-jakarta-servlets"   % "4.2.11"
  lazy val metricsServlet           =  "io.dropwizard.metrics"   %  "metrics-jakarta-servlet"    % "4.2.11"
  lazy val googleGuava              =  "com.google.guava"        %  "guava"                      % "31.1-jre"
  lazy val twirlApi                 =  "com.typesafe.play"       %% "twirl-api"                  % "1.6.0-M6"

  private val akkaVersion             = "2.6.19"
  private val httpcomponentsVersion   = "4.5.6"
  private val jettyVersion            = "11.0.11"
  private val json4sVersion           = "4.0.5"
  private val specs2Version           = "4.16.1"
  private val scalatestVersion        = "3.2.13"
}
