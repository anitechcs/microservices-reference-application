/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Returns ratings for a particulat book
*
* bookId Long Id of book to return ratings
* returns RatingSuccessResponse
* */
const getBookRatings = ({ bookId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        bookId,
      }));
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
