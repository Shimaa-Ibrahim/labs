#!/usr/bin/perl 
use 5.010;

foreach $arg(@ARGV) {
	unlink $arg;
}


