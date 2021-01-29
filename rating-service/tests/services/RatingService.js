// ------------------------------------------------
// * Author: chanduthedev@gmail.com
// ------------------------------------------------
const chai = require("chai");
const chaiHttp = require("chai-http");
const expect = chai.expect;

chai.use(chaiHttp);
const host = "http://localhost:8080";
const endpoint = "/v1/rating/12356";

describe("Rating api unit test", () => {
    it("Rating api should return valid rating json object", done => {
        chai.request(host)
            .get(endpoint)
            .end((err, res) => {
                if (err) {
                    console.log(err);
                    throw new Error("API Error");
                }    
                expect(res.body).to.be.an("object");
                expect(res.body.statusCode).to.equal(200)
                expect(res.body.message).to.equal('Success.')
                expect(res.body.ratings).to.have.property("rating");
                expect(res.body.ratings).to.have.property("ratingCount");
                expect(res.body.ratings.rating).to.greaterThan(2.4)
                expect(res.body.ratings.rating).to.lessThan(6)

                done();
            });
    });
});