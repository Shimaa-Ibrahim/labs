#!/usr/bin/perl 

# Initializing list with alphabets A to Z 
@list = (A..Z); 

# Printing the original list 
print "List: @list\n"; 

# Using join function introducing 
# hyphen between each alphabets 
print "\nString after join operation:\n"; 
print join("-", @list); 

