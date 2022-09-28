#!/usr/bin/perl 
use 5.010;

for $i (0 .. 32){
    $a = $i;
    $b = $a**2;
    printf "%5g %8g\n",$a, $b;
}
