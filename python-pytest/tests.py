# simple hello world test
# 
# docs: https://docs.pytest.org/en/stable/contents.html
#
from main import *

def test_hello():
    assert hello() == "Hello"  
