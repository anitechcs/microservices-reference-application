// ------------------------------------------------
// * Author: chanduthedev@gmail.com
// ------------------------------------------------

"use strict";
const responseCodes = require('./commonResponseCodes');
const constants = require('./constants');


function getRandomNumberWithinRange(min, max) {
  min = Math.ceil(min);
  max = Math.floor(max);
  //The maximum is exclusive and the minimum is inclusive
  return Math.floor(Math.random() * (max - min) + min); 
}
exports.getRandomNumberWithinRange = getRandomNumberWithinRange;

function getRandomNumber(max) {
  return Math.floor(Math.random() * Math.floor(max));
}
exports.getRandomNumber = getRandomNumber;

function getRating(pos) {
  const ratingList = constants.ranting_values
  if ((pos < 0) || (pos > ratingList.length - 1) ) {
    return -1;
  }

  return ratingList[pos];
}
exports.getRating = getRating;

function getPayload(rating, ratingCount) {
  
  // Invalid rating
  if (rating > 5 || rating < 0){
    return {}
  }
  // Invalid ratingCount
  if (ratingCount < 1){
    return {}
  }

  var payload = {};
  payload.ratings = {};
  payload.ratings.rating = rating;
  payload.ratings.ratingCount = ratingCount;
  payload.message=responseCodes.SUCCESS.message;
  payload.statusCode=responseCodes.SUCCESS.code;
  return payload;
}
exports.getPayload = getPayload;