#!/usr/bin/perl 
use 5.010;
use Scalar::Util 'looks_like_number';

say('insert a number:');
chomp ($num = <>);
if (looks_like_number($num)){
    say("Enter a list of element and when you end press Ctrl + d");
    @list = <STDIN>;
    say("the selected string is: ".$list[$num]);
}else{
    say("$num is not a number try again later!");
}    