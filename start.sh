#!/bin/bash
javac -d classes -classpath . src/*/* && cd classes && java comparaisons.ComparaisonRefs && cd data && gnuplot premier_script.plt && eog plot.png && cd ../..
