package Calculator; 


# Defining sub-routine for Multiplication 
sub multiplication 
{ 
	# Initializing Variables a & b 
	$a = $_[0]; 
	$b = $_[1]; 
	
	# Performing the operation 
	$res = $a * $b; 
	
	# Function to print the Sum 
	print "\n***Multiplication is $res \n"; 
} 

# Defining sub-routine for Division 
sub division 
{ 
	# Initializing Variables a & b 
	$a = $_[0]; 
	$b = $_[1]; 
	
	# Performing the operation 
	$a = $a / $b; 
	
	# Function to print the answer 
	print "\n***Division is $a \n"; 
} 
1; 

