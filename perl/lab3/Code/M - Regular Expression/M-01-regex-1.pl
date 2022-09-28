# Perl program to demonstrate 
# the m// and =~ operators 

# Actual String 
$a = "ITIOPENSOURCE"; 

# Prints match found if 
# its found in $a 
if ($a =~ m/ITI/) 
{ 
	print "Match Found\n"; 
} 

# Prints match not found 
# if its not found in $a 
else
{ 
	print "Match Not Found\n"; 
} 

