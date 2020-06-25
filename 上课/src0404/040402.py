from selenium import webdriver
import time
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.action_chains import ActionChains
import os


import os
driver = webdriver.Chrome()
#http://127.0.0.1/biz/user-login.html
driver.get("http://127.0.0.1:88/biz/user-login.html")
driver.implicitly_wait(10)
driver.find_element_by_id("account").send_keys("admin")
driver.find_element_by_id("account").send_keys(Keys.TAB)
time.sleep(3)
driver.find_element_by_name("password").send_keys("Huiwen890830")
time.sleep(6)
driver.find_element_by_name("password").send_keys(Keys.ENTER)
time.sleep(6)
driver.quit()
