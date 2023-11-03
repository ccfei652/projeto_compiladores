#!/bin/zsh

currentdir="$(pwd)"
JAR="antlr-4.13.1-complete.jar"
CLASSPATH=".:$currentdir/$JAR:$CLASSPATH"
export CLASSPATH
javac *.java -Xlint:unchecked