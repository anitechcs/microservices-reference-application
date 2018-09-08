const mongoose = require('mongoose');

const ReviewSchema = new mongoose.Schema({
  message: {
    type: String,
    required: 'Kindly enter the message'
  },
  Created_date: {
    type: Date,
    default: Date.now
  },
  author: {
    type: String,
    required: 'Kindly enter the author name'
  }
});

module.exports = mongoose.model('Review', ReviewSchema);