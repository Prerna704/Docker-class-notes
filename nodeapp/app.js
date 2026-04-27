const http = require('http');
http.createServer((req,res)=>{
  res.end("Node Docker App");
}).listen(5000);