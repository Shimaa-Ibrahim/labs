#!/usr/bin/perl -w 
use strict; 
use warnings; 

print "Enter a list of element and when you end press Ctrl + d \n";

my @list = <STDIN>;
print "the list is \n @list";
