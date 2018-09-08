
module.exports = function(app) {
    var reviewController = require('../controllers/ReviewController');
  
    // Routes
    app.route('/reviews')
        .get(reviewController.list_all_reviews)
        .post(reviewController.create_a_review);


    app.route('/reviews/:reviewId')
        .get(reviewController.read_a_review)
        .put(reviewController.update_a_review)
        .delete(reviewController.delete_a_review);

};