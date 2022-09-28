# Perl program to demonstrate the Quote 
# Like Operators 

#!/usr/local/bin/perl 

# taking a string variable 
$g = "ITI"; 

# using single quote Operators 
# this operator will not 
# interpolate the string variable 
$r = q{$g}; 

print "Value of g is = $r\n"; 

# using double quote Operators 
# this operator will interpolate 
# the string variable 
$r = qq{$g}; 

print "Value of g is = $r\n"; 

# Executing unix date command 
$d = qx{date}; 

print "Value of qx{date} = $d"; 

