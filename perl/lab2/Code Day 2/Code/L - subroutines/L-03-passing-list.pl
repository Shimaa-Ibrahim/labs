# Perl program to demonstrate the 
# passing of lists to subroutines 

#!/usr/bin/perl 

# Subroutine definition 
sub Display_List { 
	
# array variable to store 
# the passed arguments 
my @para_list = @_; 
	
# to print the passed list elements 
print "Given list is @para_list\n"; 
} 

# passing scalar argument 
$sc = 100; 

# passing list 
@li = (10, 20, 30, 40); 

# Calling Subroutine with scalar 
# and list parameter 
Display_List($sc, @li); 

