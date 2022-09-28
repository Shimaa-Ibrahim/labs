#!/usr/bin/perl 
use 5.010;

say("Enter a list of numbers and when you end press Ctrl + d :");
@list = <STDIN>;
$count = 0;
foreach $a(@list){
	last if($a == 999);
    $count = $count + $a; 
}
say("list count equals = ". $count);
