from selenium import webdriver
import time
import os
from selenium.webdriver.support.ui import WebDriverWait

driver = webdriver.Chrome()
file_path='file:///'+os.path.abspath("C:\\课件\\我的课件\\测试\\selenium2\\locateElement\\selenium2html\\drop_down.html")
driver.get(file_path)
driver.maximize_window()
# xpath定位
# driver.find_element_by_xpath("//*[@value='10.69']").click()
# time.sleep(8)
# 通过定位一组元素
lists = driver.find_elements_by_tag_name("option")
#通过循环
# for list in lists:
#     if list.get_attribute('value') == "10.69":
#         list.click()
#通过下标
lists[2].click()

time.sleep(8)

driver.quit()
