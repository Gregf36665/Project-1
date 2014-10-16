#!/bin/bash
for i in {1..5}
	do
	for j in {1..5}
		do
			echo $i , $j > outputP${i}A${j}.csv
			
			for k in {1..50}
			do
				java ExperimentController $i $j 120 >>outputP${i}A${j}.csv
printf .
			done
echo done $i pumps and $j attendents;
		done
	done


