# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from promotionservice.models.inline_response200 import InlineResponse200  # noqa: E501
from promotionservice.models.promotion_error_response import PromotionErrorResponse  # noqa: E501
from promotionservice.test import BaseTestCase


class TestPromotionServiceController(BaseTestCase):
    """PromotionServiceController integration test stubs"""

    def test_get_book_promotions(self):
        """Test case for get_book_promotions

        """
        headers = {
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/promotion/{book_id}'.format(book_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_book_promotions_for_offer_data(self):
        """Test case for get_book_promotions response validation for valid book id
        """
        headers = {
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/promotion/{book_id}'.format(book_id=56),
            method='GET',
            headers=headers)

        data = json.loads(response.data)
        expected_color_codes = ["#CD2626", "#FF7F0F", "#FF9CEE",
                                "#6EB5FF", "#B10501"]
        expected_discount = [10, 15, 20, 25, 30]
        self.assertEqual(200, data['statusCode'])
        self.assertEqual("Success", data['message'])
        self.assertTrue(data['promotions']['color'] in expected_color_codes)
        self.assertTrue(int(data['promotions']['text'][:2]) in expected_discount)

    def test_get_book_promotions_for_invalid_book_id(self):
        """Test case for get_book_promotions response validation for invalid book
        """
        headers = {
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/promotion/{book_id}'.format(book_id=0),
            method='GET',
            headers=headers)

        data = json.loads(response.data)
        self.assertEqual(404, data['statusCode'])


if __name__ == '__main__':
    unittest.main()
