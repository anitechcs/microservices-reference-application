const { expect } = require('chai');
let chai = require('chai');
var should = chai.should();
const commonUtils = require('../../utils/commonUtils.js');
const constants = require('../../utils/constants');
const commonResponseCodes = require('../../utils/commonResponseCodes');

describe('Utility test cases', () => {
    describe('getRandomNumberWithinRange function', () => {
        it('Should return value bewtween 250 and 1000', () => {
            const expected_value = commonUtils.getRandomNumberWithinRange(250, 1000)
            expect(expected_value).to.lessThan(1000)
            expect(expected_value).to.greaterThan(249)
          });
     });

    describe('getRating function', () => {
        it('Should return value bewtween 2.5 and 5.0', () => {
            const actual_value = commonUtils.getRating(5)
            expect(actual_value).to.greaterThan(2.4)
            expect(actual_value).to.lessThan(6.0)
          });
     });

    describe('getRating function', () => {
    it('Should return -1 when input value is below 0', () => {
        const actual_value = commonUtils.getRating(-1)
        expect(actual_value).to.equal(-1)
        });
    });

    describe('getRating function', () => {
        it('Should return -1 when input value more than Max value', () => {
            const actual_value = commonUtils.getRating(10)
            expect(actual_value).to.equal(-1)
            });
        });

    describe('getPayload function', () => {
    it('Should return valid json object', () => {
        const actual_value = commonUtils.getPayload(5, 270)
        expect(actual_value).to.be.an("object");
        expect(actual_value.statusCode).to.equal(200)
        expect(actual_value.message).to.equal('Success.')
        expect(actual_value.ratings).to.have.property("rating");
        expect(actual_value.ratings).to.have.property("ratingCount");
        });
    }); 

    describe('getPayload function', () => {
    it('Should return empty json object for invalid rating', () => {
        const actual_value = commonUtils.getPayload(-1, 270)
        expect(actual_value).to.be.an("object");
        expect(actual_value).to.be.empty;
        });
    });
    
    describe('getPayload function', () => {
    it('Should return empty json object for invalid ratingCount', () => {
        const actual_value = commonUtils.getPayload(5, 0)
        expect(actual_value).to.be.an("object");
        expect(actual_value).to.be.empty;
        });
    });
})