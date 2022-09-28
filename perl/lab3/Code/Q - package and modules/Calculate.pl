#!/usr/bin/perl 

# Using the Package 'Calculator' 
use lib '/home/ziyad/Desktop/PERL Day 3/Code/Q - package and modules'; 
use Calculator;

# Defining values to the variables 
$a = 5; 
$b = 10; 

# Subroutine call 
Calculator::multiplication($a, $b); 


# Defining values to the variables 
$a = 45; 
$b = 5; 

# Subroutine call 
Calculator::division($a, $b); 

