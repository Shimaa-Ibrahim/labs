# Calling the objects and 
# the methods of each class 
# using the corresponding objects. 

use strict; 
use warnings; 
use lib '/home/ziyad/Desktop/PERL Day 3/Code/R - OOP/R - 04- method override';
use Vehicle;
# Using the derived class as parent 
use Car; 

# Object creation and initialization 
my $ob1 = Vehicle -> new(2550, 170); 
my $ob2 = Car -> new(2500, 250); 

# Calling methods using Overriding 
$ob1->get_mileage(); 
$ob2->get_mileage(); 

