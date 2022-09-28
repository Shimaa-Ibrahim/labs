#!/usr/bin/perl 
use 5.010;
use File::Copy;

if ($#ARGV > 1){
    say("invalid number of args");
}else{
    say @ARGV[0];
    say @ARGV[1];
    move("@ARGV[0]", "@ARGV[1]");
 }





