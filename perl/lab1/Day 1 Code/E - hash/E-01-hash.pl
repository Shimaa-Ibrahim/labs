#!/usr/bin/perl 

# Initializing Hash1 by 
# directly assinging values 
$stud1{'Comp'} = 10; 
$stud1{'Inft'} = 20; 
$stud1{'Extc'} = 30; 

# printing elements of stud 
print "Printing values of Hash1\n"; 
print "$stud1{'Comp'}\n"; 
print "$stud1{'Inft'}\n"; 
print "$stud1{'Extc'}\n"; 

# Initializing Hash2 by taking 
# indiviual pairs 
%stud2 = ('Comp', 15, 'Inft', 18, 'Extc', 22); 

# Extracting values using keys 
print "\nPrinting values of Hash2\n"; 
print "computer = $stud2{'Comp'}"; 
print "\ninft = $stud2{Inft}"; 
print "\nextc = $stud2{'Extc'}\n"; 


# Initializing Hash3 using '=>' 
%stud3 = ('Comp' => 45, 'Inft' => 42, 'Extc' => 35); 

# printing elements of stud3 
print "\nPrinting values of Hash3\n"; 
print "$stud3{'Comp'}\n"; 
print "$stud3{'Inft'}\n"; 
print "$stud3{'Extc'}\n"; 


