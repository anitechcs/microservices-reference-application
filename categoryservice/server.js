var express = require('express');
var app = express();
var port = process.env.PORT || 3000;

mongoose = require('mongoose'),
Category = require('./api/models/Category'), //created model loading here
bodyParser = require('body-parser');

// mongoose instance connection url connection
mongoose.Promise = global.Promise;
mongoose.connect('mongodb://localhost/categorydb', { useNewUrlParser: true }); 


app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

// register the routes
var routes = require('./api/routes/CategoryRoutes');
routes(app); 

app.use(function(req, res) {
    res.status(404).send({url: req.originalUrl + ' not found'})
});

// start the server
app.listen(port);

console.log('CategoryService Listening on: ' + port);