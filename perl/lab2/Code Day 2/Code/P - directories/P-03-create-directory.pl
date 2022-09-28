#!/usr/bin/perl

$dir = "/home/ziyad/test/new_Dir";

# This creates perl directory in /tmp directory.
mkdir( $dir ) or die "Couldn't create $dir directory, $!";
print "Directory created successfully\n";