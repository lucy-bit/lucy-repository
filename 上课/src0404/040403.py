from selenium import webdriver
import time
from selenium.webdriver.common.keys import Keys

driver = webdriver.Chrome()
driver.get("https://www.baidu.com/")
driver.maximize_window()
driver.find_element_by_id("kw").send_keys("端午节")
driver.find_element_by_id("su").click()
driver.implicitly_wait(10)

driver.find_element_by_id("kw").send_keys(Keys.CONTROL, 'a')
time.sleep(5)
driver.find_element_by_id("kw").send_keys(Keys.CONTROL, 'x')
time.sleep(4)
driver.find_element_by_id("kw").send_keys("龙舟")
driver.find_element_by_id("su").click()
time.sleep(6)
driver.quit()
