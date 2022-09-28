#!/usr/bin/perl -w 
use 5.010;

say("Enter a list of element and when you end press Ctrl + d");
@list = <STDIN>;

say("reversed list :");
for($i=$#list; $i>=0; $i--){ 
      print $list[$i];
} 
 