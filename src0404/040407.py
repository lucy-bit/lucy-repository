from selenium import webdriver
import time
import os
from selenium.webdriver.common.action_chains import ActionChains

driver = webdriver.Chrome()
file_path = 'file:///'+os.path.abspath("C:/课件/我的课件/测试/selenium2/locateElement/selenium2html/level_locate.html")
driver.get(file_path)

driver.find_element_by_link_text("Link1").click()

action = driver.find_element_by_link_text("Action")
ActionChains(driver).move_to_element(action).perform()
time.sleep(10)


# #driver.implicitly_wait(10)
# driver.find_element_by_link_text("Link1").click()
# driver.implicitly_wait(10)
# #定位一组元素
# list = driver.find_element_by_id("dropdown1").find_element_by_link_text("Action")
# ActionChains(driver).move_to_element(list).perform()
# time.sleep(6)
driver.quit()



