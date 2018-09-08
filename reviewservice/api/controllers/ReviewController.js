var mongoose = require('mongoose'),
Review = mongoose.model('Review');

exports.list_all_reviews = function(req, res) {
    Review.find({}, function(err, review) {
        if (err) {
            res.send(err);
        }
        res.json(review);
    });
};

exports.create_a_review = function(req, res) {
    var new_review = new Review(req.body);
    new_review.save(function(err, review) {
        if (err)
            res.send(err);
        res.json(review);
    });
}

exports.read_a_review = function(req, res) {
    Review.findById(req.params.reviewId, function(err, review) {
        if (err)
            res.send(err);
        res.json(review);
    });
}

exports.update_a_review = function(req, res) {
    Review.findOneAndUpdate({_id: req.params.reviewId}, req.body, {new: true}, function(err, review) {
        if (err)
            res.send(err);
        res.json(review);
    });
}

exports.delete_a_review = function(req, res) {
    Review.remove({
        _id: req.params.reviewId
        }, function(err, review) {
        if (err)
            res.send(err);
        res.json({ message: 'Review successfully deleted' });
    });
}
