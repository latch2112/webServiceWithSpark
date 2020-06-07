package org

import spark.{Request, Response, Route}
import spark.Spark._


object Main extends App {

  port(8080)

  val routeBob : Route = (request : Request, response : Response) => "hello bob"

  get("/bob", routeBob)
  get("/hello", (request : Request, response : Response) => "hello world")

  get("/", (request : Request, response : Response) => {
    println("route root entered")
    "root entered"
  })

}
