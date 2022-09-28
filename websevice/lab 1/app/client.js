const soap = require('soap');
const url = 'http://localhost:8000/wsdl?wsdl';


soap.createClient(url,function(err,client) {
  client.firstStudent('',function(err,result) {
    console.log(result);
  });

  client.secondStudent('',function(err,result) {
    console.log(result);
  });

  client.thirdStudent('',function(err,result) {
    console.log(result);
    console.log(client.describe());
  });


});