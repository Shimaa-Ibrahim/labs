use strict;
use warnings;
use Test::More;


use Catalyst::Test 'Book';
use Book::Controller::Books;

ok( request('/books')->is_success, 'Request should succeed' );
done_testing();
