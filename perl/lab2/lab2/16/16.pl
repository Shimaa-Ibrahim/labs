#!/usr/bin/perl 
use 5.010;

open(f, "<", "words.txt") or die $!; 
$count = 0;
@list;
# ex: search for: area, pizza, poet or any other words
say('search for a word :');
chomp ($w = <>);

while($line = <f>){
    foreach $word (split(' ',$line)) {
      if($word =~ $w){
         $count ++;
         }
    push(@list, $word);
    }
}
say("number of '".$w."' in file is : ".$count);

# sorting words:
@arr = sort @list;
say("sorted words :");
for $i (0 .. $#arr) 
{ 
    say($arr[$i]); 
} 

close(f); 

