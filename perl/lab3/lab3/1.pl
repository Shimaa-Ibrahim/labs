#!/usr/bin/perl 
use 5.010;
open(f, "<", "search.txt") or die $!; 
$count = 0;
say('search for a word :');
chomp ($pattern = <>);

while($line = <f>){
      foreach $word (split(' ',$line)) {
            if($word =~ m/$pattern/){
            $count ++;
            }
      }
}

say("number of word '".$pattern."' in the file is : ".$count);

close(f); 
