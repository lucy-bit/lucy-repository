from selenium import webdriver
import time
import os
driver = webdriver.Chrome()
file_path = 'file:///'+os.path.abspath("C:/课件/我的课件/测试/selenium2/locateElement/selenium2html/alert.html")
driver.get(file_path)
driver.maximize_window()

driver.find_element_by_id("tooltip").click()
time.sleep(3)

alert = driver.switch_to.alert
print("text:  "+alert.text)

alert.accept()



time.sleep(6)









# driver.find_element_by_id("tooltip").click()
# time.sleep(3)
# alert = driver.switch_to.alert
#
# #输入alert框的内容
# print("alert：  " + alert.text)
# alert.accept()
# time.sleep(8)
driver.quit()
