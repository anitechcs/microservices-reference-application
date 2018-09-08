
module.exports = function(app) {
    var categoryController = require('../controllers/CategoryController');
  
    // Routes
    app.route('/categories')
        .get(categoryController.list_all_categories)
        .post(categoryController.create_a_category);


    app.route('/categories/:categoryId')
        .get(categoryController.read_a_category)
        .put(categoryController.update_a_category)
        .delete(categoryController.delete_a_category);

};