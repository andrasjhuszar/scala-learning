package basics

object ArgumentApp extends App {
  for(s <-args.reverse) print(s + " ")
}