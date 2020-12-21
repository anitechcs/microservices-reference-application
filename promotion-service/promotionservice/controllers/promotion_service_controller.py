import connexion
import six

from promotionservice.models.promotion_error_response import PromotionErrorResponse  # noqa: E501
from promotionservice.models.promotion_success_response import PromotionSuccessResponse  # noqa: E501
from promotionservice import util


def get_book_promotions(book_id):  # noqa: E501
    """get_book_promotions

    Returns promo details for a particulat book # noqa: E501

    :param book_id: Id of book to return promotions
    :type book_id: int

    :rtype: PromotionSuccessResponse
    """
    return 'do some magic!'
