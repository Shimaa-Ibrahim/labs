# Perl program to element element from hash 

#use warnings; 

# creating hash 
%rateof = ('Mango' => 64, 'Apple' => 54, 'Grapes' => 44, 'Strawberry'=>23); 

# creating array of keys 
@keys= keys %rateof; 

# finding size of hash 
$size = @keys; 
print "SIZE OF HASH BEFORE DELETING: $size\n"; 

# using delete function 
delete $rateof{'Mango'}; 

# creating array of keys 
@keys= keys %rateof; 

# finding size of hash 
$size = @keys; 
print "SIZE OF HASH AFTER DELETING: $size\n"; 

