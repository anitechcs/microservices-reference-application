const commonResponseCodes = require('../utils/commonResponseCodes');

class Service {
  static rejectResponse(error, code = 500) {
    return { error, code };
  }

  static successResponse(payload, code = commonResponseCodes.SUCCESS.code) {
    return { payload, code };
  }
}

module.exports = Service;
