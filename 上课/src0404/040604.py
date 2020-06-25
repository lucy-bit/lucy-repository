from selenium import webdriver
import time
import os

driver = webdriver.Chrome()
file_path = 'file:///'+os.path.abspath("C:/课件/我的课件/测试/selenium2/locateElement/selenium2html/upload.html")
driver.get(file_path)
time.sleep(3)
driver.find_element_by_name("file").send_keys("C:/课件\\课间歌单\\歌单.txt")

time.sleep(3)
driver.quit()
