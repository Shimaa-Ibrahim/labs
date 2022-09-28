# Perl program to illustrate the use 
# of our keyword 

# Pack1 namespace declared 
# by using the package keyword 
package Pack1; 

	# declaring $Pack1::first_name 
	# for rest of lexical scope 
	our $first_name;	 
	$first_name = "Ziyad"; 
	
	# declaring $Pack1::second_name for 
	# only this namespace 
	$second_name;	 
	$second_name = "Elgendy"; 

# Pack2 namespace declared 
package Pack2; 

	# prints value of $first_name, as it 
	# refers to $Pack1::first_name 
	print "first_name = ".$first_name."\n"; 
	
	# It will print nothing as $second_name 
	# does not exist in Pack2 package scope 
	print "second_name = ".$second_name."\n"; 

