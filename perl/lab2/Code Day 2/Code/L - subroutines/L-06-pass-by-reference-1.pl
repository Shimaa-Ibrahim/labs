#!/usr/bin/perl 

# Initialising an array 'a' 
@a = (0..10); 

# Array before subroutine call 
print("Values of an array before function call: = @a\n"); 

# calling subroutine 'sample' 
sample(@a); 

# Array after subroutine call 
print("Values of an array after function call: = @a"); 

# Subroutine to represent 
# Passing by Reference 
sub sample 
{ 
	$_[0] = "A"; 

	$_[1] = "B"; 
} 

