var http = require('http');
var soap = require('soap');
var StudentService = {
  Student_Service: {
    Student_Port: {
        firstStudent: function(args,callback) {
        callback({
                name: "First student",
                age: 27,
                courses: ['arabic', 'math', 'english'],
                married: false
        });
      },
       secondStudent: function(args,callback) {
        callback({
            name: "Second student",
            age: 24,
            courses: ['math', 'english', 'french'],
            married: false
        });
      },
       thirdStudent: function(args,callback) {
        callback({
            name: "Third student",
            age: 25,
            courses: ['math', 'english', 'french'],
            married: false
        });
      },
      
    }
  }
};

var xml = require('fs').readFileSync('students.wsdl', 'utf8');

var server = http.createServer(function(request,response) {
          response.end("404: Not Found: "+request.url);
      });
server.listen(8000);
soap.listen(server, '/wsdl', StudentService, xml);