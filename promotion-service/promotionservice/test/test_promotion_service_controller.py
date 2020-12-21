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


if __name__ == '__main__':
    unittest.main()
