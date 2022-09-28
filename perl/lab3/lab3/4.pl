#!/usr/bin/perl 
use 5.010;
open(f, "<", "date.txt") or die $!; 
$count = 0;

while($line = <f>){
      foreach $word (split(' ',$line)) {
            if($word =~ m/^(\d)(\d)?\/(\d)(\d)?\/(20)[0-9]{2}$/){
            $count ++;
            }
      }
}

say("the date count is ".$count);

close(f); 
