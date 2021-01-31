/* eslint-disable no-unused-vars */
const Service = require('./Service');
const commonUtils = require('../utils/commonUtils');
const constants = require('../utils/constants');
const commonResponseCodes = require('../utils/commonResponseCodes');

/**
* Returns ratings for a particulat book
*
* bookId Long Id of book to return ratings
* returns RatingSuccessResponse
* */
const getBookRatings = ({ bookId }) => new Promise(
  async (resolve, reject) => {
    try {
      
      const maxRange = constants.ranting_values.length
      const ratingCntMin = constants.ratingCntMinRange
      const ratingCntMax = constants.ratingCntMaxRange

      const ratingIndex = commonUtils.getRandomNumber(maxRange)
      const rating = commonUtils.getRating(ratingIndex)
      const ratingCount = commonUtils.getRandomNumberWithinRange(ratingCntMin, ratingCntMax)
      var payload = commonUtils.getPayload(rating, ratingCount)

      resolve(Service.successResponse(payload, commonResponseCodes.SUCCESS.code));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  getBookRatings,
};
