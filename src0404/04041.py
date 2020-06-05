from selenium import webdriver
import time
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.action_chains import ActionChains
import os


import os
driver = webdriver.Chrome()
driver.get("https://www.baidu.com/")
driver.find_element_by_id("kw").send_keys("大虞海棠")
driver.find_element_by_id("su").click()
driver.maximize_window()
time.sleep(8)
#浏览器的滚动条拖动到最底端
# js = "var q=document.documentElement.scrollTop=100000"
# driver.execute_script(js)
# time.sleep(8)
# 浏览器的滚动条拖动顶端
js = "var q=document.documentElement.scrollTop=0"
driver.execute_script(js)
time.sleep(5)
driver.set_window_size(400, 800)
time.sleep(5)

#同时控制浏览器的左右，上下
js = "window.scrollTo(200,200);"
driver.execute_script(js)
time.sleep(8)
driver.quit()
