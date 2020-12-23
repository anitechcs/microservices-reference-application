# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from promotionservice.models.base_model_ import Model
from promotionservice import util


class Promotion(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, text=None, color=None):  # noqa: E501
        """Promotion - a model defined in OpenAPI

        :param text: The text of this Promotion.  # noqa: E501
        :type text: str
        :param color: The color of this Promotion.  # noqa: E501
        :type color: str
        """
        self.openapi_types = {
            'text': str,
            'color': str
        }

        self.attribute_map = {
            'text': 'text',
            'color': 'color'
        }

        self._text = text
        self._color = color

    @classmethod
    def from_dict(cls, dikt) -> 'Promotion':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Promotion of this Promotion.  # noqa: E501
        :rtype: Promotion
        """
        return util.deserialize_model(dikt, cls)

    @property
    def text(self):
        """Gets the text of this Promotion.

        Text to show in promotion  # noqa: E501

        :return: The text of this Promotion.
        :rtype: str
        """
        return self._text

    @text.setter
    def text(self, text):
        """Sets the text of this Promotion.

        Text to show in promotion  # noqa: E501

        :param text: The text of this Promotion.
        :type text: str
        """

        self._text = text

    @property
    def color(self):
        """Gets the color of this Promotion.

        Hex code for the Color  # noqa: E501

        :return: The color of this Promotion.
        :rtype: str
        """
        return self._color

    @color.setter
    def color(self, color):
        """Sets the color of this Promotion.

        Hex code for the Color  # noqa: E501

        :param color: The color of this Promotion.
        :type color: str
        """

        self._color = color