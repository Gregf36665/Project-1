#!/bin/bash
if [ -f output.csv ]; then
	rm output*.csv
fi
for i in {1..5}
	do
	for j in {1..5}
		do
			echo $i pumps, $j attendent >> outputP${i}A${j}.csv
			
			for k in {1..5}
			do
				java ExperimentController $i $j 120 >>outputP${i}A${j}.csv
			done
echo done $i pumps and $j attendents;
		done
	done


