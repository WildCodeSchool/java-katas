#!/usr/bin/env bash
clear
if [[ -n "$1" ]]; then
    classname="$1"
    classname="$(tr '[:lower:]' '[:upper:]' <<< ${classname:0:1})${classname:1}"

    javac -classpath out:lib/junit-4.12.jar -d out src/kata/*.java 2> logs/checkmethod_output.txt
    if [[ $(< logs/checkmethod_output.txt) != "" ]]; then
        cat logs/checkmethod_output.txt
    else
        javac -classpath out:lib/junit-4.12.jar -d out src/test/${classname}Test.java

        java -classpath out:lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore ${classname}Test
    fi
else
    echo "Please specify the kata to test, e.g. : ./tester.sh PascalCase"
fi