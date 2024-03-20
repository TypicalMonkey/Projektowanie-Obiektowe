#!/bin/bash

PASCAL_FILE="paradygmat.pas"

docker pull emilburzo/pascal-compiler
docker pull emilburzo/pascal-runtime
docker run --rm -v "$(pwd)":/usr/src/app -w /usr/src/app delphilo/pascal:compiler fpc $PASCAL_FILE

EXECUTABLE_FILE="${PASCAL_FILE%.*}"
docker run --rm -v "$(pwd)":/usr/src/app -w /usr/src/app delphilo/pascal:runtime ./$EXECUTABLE_FILE
