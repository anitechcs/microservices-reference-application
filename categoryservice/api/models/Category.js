const mongoose = require('mongoose');

const CategorySchema = new mongoose.Schema({
  name: {
    type: String,
    required: 'Kindly enter the category name'
  },
  description: {
    type: String,
    default: ''
  },
  parent: {
    type: String,
    default: ''
  }
});

module.exports = mongoose.model('Category', CategorySchema);