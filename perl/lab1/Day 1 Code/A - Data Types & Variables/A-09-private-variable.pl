# Perl program to illustrate the 
# scope of private variables 

# declaration of global variable 
$name = "Global"; 
$count = 1; 

# printing global variables 
print $count." ".$name."\n"; 

# incrementing the value of count 
# i.e it become 2 
$count++; 

# block starting 
{ 
	
	# declaring private variable by using my 
	# keyword which can only be used 
	# within this block 
	my $new_name = "Private - Block"; 
	
	# global variables are 
	# accessible inside block 
	print $count." ".$name."\n"; 
	
	# incrementing the value 
	# of global variable 
	# here it become 3 
	$count++; 
	
	print $name." and ".$new_name."\n"; 
} 

# $new_name variable cannot 
# be used outside, hence nothing 
# is going to print 
print "Variable defined in above block: ".$new_name."\n"; 

# declaring function 
sub func { 

	# this private variable declaration 
	# hides the global variable which define 
	# in the beginning of program 
	my $name = "Subrotine"; 
	print $count." ".$name."\n"; 

} 

# calling the function 
func(); 

