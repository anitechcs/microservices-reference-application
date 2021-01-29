// ------------------------------------------------
// * Author: chanduthedev@gmail.com
// ------------------------------------------------

"use strict";

module.exports = {
    SUCCESS: {
        status: 200,
        code: 200,
        message: "Success."
    },
    CREATED: {
        status: 201,
        code: 201,
        message: "Record created in the DB."
    },
    UPDATED: {
        status: 200,
        code: 200,
        message: "Record updated in the DB."
    },
    DELETED: {
        status: 200,
        code: 200,
        message: "Record deleted in the DB."
    },
    NO_DATA_FOUND: {
        status: 204,
        code: 204,
        message: "No data found."
    },
    BAD_REQUEST: {
        status: 400,
        code: 400,
        message: "Invalid request body."
    },
    UNAUTHORIZED: {
        status: 401,
        code: 401,
        message: "Unauthorized access."
    },
    PAGE_NOT_FOUND: {
        status: 404,
        code: 404,
        message: "NO page found."
    },
    RESOURCE_NOT_FOUND: {
        status: 404,
        code: 4041,
        message: "NO resource found."
    }
};
