#!/usr/bin/perl   
use 5.010;
use POSIX qw(strftime);
say(strftime "%c", localtime);  