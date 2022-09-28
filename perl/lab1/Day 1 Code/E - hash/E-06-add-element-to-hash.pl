# Perl program to add an element in a hash 

#use warnings; 

# creating hash 
%rateof = ('Mango' => 64, 'Apple' => 54, 'Grapes' => 44, 'Strawberry'=>23); 

# array of keys 
@keys = keys %rateof; 

$size = @keys; 
print "SIZE OF HASH BEFORE ADDING: is $size\n"; 

# Adding new key/value pair into hash 
$rateof{'Potato'} = 20; 

# array of keys 
@keys= keys %rateof; 

$size = @keys; 
print "SIZE OF HASH AFTER ADDING: is $size\n"; 

