#!/usr/bin/perl -w 
use 5.010;

say("Enter a list of element and when you end press Ctrl + d");
@list = <STDIN>;
@rev = reverse(@list);
say("reverse list is:");

for $i (0 .. $#rev) 
{ 
    print $rev[$i]; 
} 
