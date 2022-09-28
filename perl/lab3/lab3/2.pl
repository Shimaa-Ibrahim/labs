#!/usr/bin/perl 
use 5.010;

BEGIN 
{ 
    open(f, "<", "search.txt") or die $!; 
    $count = 0;
    say('enter a word to search for :');
    chomp ($pattern = <>);
} 

END 
{ 
	say("number of word '".$pattern."' in the file is : ".$count);
    close(f); 
} 

while($line = <f>){
      foreach $word (split(' ',$line)) {
            if($word =~ m/$pattern/){
         $count ++;
         }
      }
}