from selenium import webdriver
import time
import os
driver = webdriver.Chrome()
file_path = 'file:///'+os.path.abspath("C:/课件/我的课件/测试/selenium2/locateElement/selenium2html/checkbox.html")
driver.get(file_path)
driver.maximize_window()
inputs = driver.find_elements_by_tag_name("input")
time.sleep(6)
for input in inputs:
    if input.get_attribute('type') == "checkbox":
        input.click()
time.sleep(6)
driver.quit()

