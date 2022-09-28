#!/usr/bin/perl 
package Animal;

sub new 
{ 
	my $class_name = shift; 
	# my $self = { 
	# 			'Name' => shift, 
	# 			'Age' => shift
	# 		}; 

	# rewrite constructor:
	my $self = 
	{ 
		Name => $args->{Name} || "wild",
		Age => $args->{Age} || 3, 
	}; 
	bless $self, $class_name; 
	return $self; 
} 
	 
sub get_Name
{ 
	my $self = shift; 
	my $name = $self->{'Name'};
	return $name;	
} 

sub get_age
{ 
	my $self = shift; 
	my $age = $self->{'Age'};
	return $age;	
} 


sub talk
{ 
	my $self = shift; 
	print "I am an animal\n"
} 


# my $dog = Animal->new("dog","2");
# print $dog->get_Name()."\n" ; 
# print $dog->get_age()."\n";  
# print $dog->talk(); 

1;