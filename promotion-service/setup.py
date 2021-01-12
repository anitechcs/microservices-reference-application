# coding: utf-8

import sys
from setuptools import setup, find_packages

NAME = "promotionservice"
VERSION = "1.0.0"

# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = [
    "connexion>=2.0.2",
    "swagger-ui-bundle>=0.0.2",
    "python_dateutil>=2.6.0"
]

setup(
    name=NAME,
    version=VERSION,
    description="PromotionService API Specification",
    author_email="contact@anitechcs.com",
    url="",
    keywords=["OpenAPI", "PromotionService API Specification"],
    install_requires=REQUIRES,
    packages=find_packages(),
    package_data={'': ['openapi/openapi.yaml']},
    include_package_data=True,
    setup_requires=['pytest-runner', 'flake8'],
    tests_require=['pytest', 'Flask_Testing'],
    entry_points={
        'console_scripts': ['promotionservice=promotionservice.__main__:main']},
    long_description="""\
    This API server exposes required endpoints for managing book promotions in Microservices reference application.
    """
)

