var express = require('express');
var app = express();
var port = process.env.PORT || 3000;

mongoose = require('mongoose'),
Review = require('./api/models/Review'), //created model loading here
bodyParser = require('body-parser');

// mongoose instance connection url connection
mongoose.Promise = global.Promise;
mongoose.connect('mongodb://localhost/reviewdb', { useNewUrlParser: true }); 


app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

// register the routes
var routes = require('./api/routes/ReviewRoutes');
routes(app); 

app.use(function(req, res) {
    res.status(404).send({url: req.originalUrl + ' not found'})
});

// start the server
app.listen(port);

console.log('ReviewService Listening on: ' + port);