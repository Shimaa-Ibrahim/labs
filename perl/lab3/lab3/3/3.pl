#!/usr/bin/perl 
use 5.010;
open(fr, "<", "search.txt") or die $!; 
open($fw, ">", "result.txt") or die $!;

while(<fr>){
    $_ =~ s/ITI/OSAD/g;
    print {$fw} $_;
}

close(fr); 
close(fw);
