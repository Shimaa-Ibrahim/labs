package Area; 

sub new 
{ 
	my ($class, $args) = @_; # since the values will be 
							# passed dynamically 
	my $self = 
	{ 
		length => $args->{length} || 1, # by default the value is 1 (stored) 
		width => $args->{width} || 1, # by default the value is 1 (stored) 
	}; 
	return bless $self, $class; 
} 

# we have added the get_area function to 
# calculate the area as well 
sub get_area 
{ 
	my $self = shift; 
	
	# getting the area by multiplication 
	my $area = $self->{length} * $self->{width}; 
	return $area; 
} 

sub DESTROY 
{ 
	# DEFINE Destructors 
	my $self = shift; 
	print "Object Destroyed "; 
} 


1; 

