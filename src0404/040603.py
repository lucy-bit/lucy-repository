from selenium import webdriver
import time
import os
driver = webdriver.Chrome()
file_path = 'file:///'+os.path.abspath("C:\\课件\\我的课件\\测试\\selenium2\\locateElement\\selenium2html\\modal.html")
driver.get(file_path)
driver.maximize_window()
#点击click
driver.find_element_by_id("show_modal").click()
time.sleep(5)

#点击 click me
ddiv = driver.find_element_by_class_name("modal-body")
ddiv.find_element_by_id("click").click()
time.sleep(5)
#关闭alert
buttons = driver.find_elements_by_tag_name("button")
buttons[0].click()
time.sleep(5)


driver.quit()

