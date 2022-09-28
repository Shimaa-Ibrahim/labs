# Perl program to illustrate the 
# Scope of Global variables 

# declaration of global variable 
$name = "ITI"; 

# printing global variable 
print "$name\n";	 

# global variable can be used 
# inside a block, hence the we 
# are taking a block in which 
# we will print the value of 
# $name i.e. global variable 
{ 

	# here ITI will print 
	print "$name\n"; 
	
	# values in global variable can be 
	# changed even within a block, 
	# hence the value of $name is 
	# now changed to "Open Source" 
	$name = "Open Source"; 
	
	# print function prints 
	# "Open Source" 
	print "$name\n"; 
} 

# changes made inside the above block' 
# are reflected in the whole program 
# so here Open Source will print 
print "$name\n"; 

