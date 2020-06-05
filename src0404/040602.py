from selenium import webdriver
import time
import os
driver = webdriver.Chrome()
file_path = 'file:///'+os.path.abspath("C:/课件/我的课件/测试/selenium2/locateElement/selenium2html/send.html")
driver.get(file_path)
time.sleep(3)
driver.maximize_window()
driver.find_element_by_xpath("//html//body//input").click()
time.sleep(3)
alert = driver.switch_to.alert

alert.send_keys("蔡徐坤")
time.sleep(3)
alert.accept()
time.sleep(6)
driver.quit()
