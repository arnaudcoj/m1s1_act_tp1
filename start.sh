#!/bin/bash
javac -d classes -classpath . src/*/* && cd classes && java comparaisons.ComparaisonRefs && cd data && gnuplot script.plt && eog plot.png && cd ../..
