#!/usr/bin/perl 
use 5.010;

say("Enter a list of element and when you end press Ctrl + d");
@list = <STDIN>;
 $index = rand @list;
say("the selected string is: ".$list[$index]);
  