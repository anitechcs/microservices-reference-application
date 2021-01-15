import connexion
import six

from promotionservice.models.promotion_error_response import PromotionErrorResponse  # noqa: E501
from promotionservice.models.promotion_success_response import PromotionSuccessResponse  # noqa: E501
from promotionservice.models.promotion import Promotion  # noqa: E501
from promotionservice import util
from random import randint
from flask_api import status


# from constants import COLOR_CODE_LIST, OFFER_LIST
from promotionservice import constants


def get_book_promotions(book_id):  # noqa: E501
    """get_book_promotions

    Returns promo details for a particulat book # noqa: E501

    :param book_id: Id of book to return promotions
    :type book_id: int

    :rtype: PromotionSuccessResponse
    """

    if not book_id:
        return PromotionErrorResponse(status.HTTP_404_NOT_FOUND,
                                      "Book Id cannot be zero.")

    # Random value between 0 and 4 (both includes)
    offer_index = randint(0, constants.DATA_LIST_SIZE-1)

    # Offer % basing on offer_index
    offer_text = f"{constants.OFFER_LIST[offer_index]}% off"

    # Offer color code basing on offer_index
    color_code = constants.COLOR_CODE_LIST[offer_index]

    promotion = Promotion(offer_text, color_code)

    return PromotionSuccessResponse(status.HTTP_200_OK,
                                    "Success", promotion)
