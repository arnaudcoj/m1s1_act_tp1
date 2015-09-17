#------uncomment to get pngs
#set terminal png
#set output 'plot.png'

set xrange [0:40] 
set yrange [0:100] 
plot "comparaisons_refs.txt" using 1:2 title "f(n)=n" with lines, "comparaisons_refs.txt" using 1:3 title "g(n)=log(n)" with lines, "comparaisons_refs.txt" using 1:4 title "h(n)=n*log(n)" with lines, "comparaisons_refs.txt" using 1:5 title "i(n)=exp(n)" with lines, "comparaisons_refs.txt" using 1:6 title "j(n)=k^n" with lines, "comparaisons_refs.txt" using 1:7 title "k(n)=n!" with lines, "comparaisons_refs.txt" using 1:8 title "l(n)=n^n" with lines

#------uncomment if you want the gnuplot window to stay alive
pause -1