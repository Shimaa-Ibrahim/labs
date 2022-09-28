use strict;
use warnings;

use Book;

my $app = Book->apply_default_middlewares(Book->psgi_app);
$app;

