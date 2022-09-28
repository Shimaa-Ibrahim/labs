#Perl code to reverse an array using inbuilt function reverse 

#declaring an array of integers 
@arr = (2, 3, 4, 5, 6, 7); 

#Print the original array 
print "The original array is : "; 
for $i (0 .. $#arr) 
{ 
	print $arr[$i], " "; 
} 

#store the reversed array in @rev_arr 
@rev_arr = reverse(@arr); 

#Print the reversed array 
print "\nThe reversed array is : "; 
for $i (0 .. $#rev_arr) 
{ 
	print $rev_arr[$i], " "; 
} 

