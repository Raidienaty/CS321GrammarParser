#!/bin/bash

antlr="/usr/local/lib/antlr-4.9-complete.jar"
grammar=`ls | grep g4`

shopt -s extglob
rm -R .antlr

set -e
rm -v !("${grammar}"|"README.md"|"recompile.sh")


java -Xmx500M -cp ${antlr} org.antlr.v4.Tool ${grammar}

javac `echo ${grammar} | cut -f1 -d'.'`*.java