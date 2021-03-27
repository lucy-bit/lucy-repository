from selenium import webdriver
import time

driver = webdriver.Firefox()
driver.get("http://www.baidu.com")
time.sleep(1)
driver.find_element_by_name("wd").send_keys("马嘉祺")
driver.find_element_by_id("su").click()
time.sleep(1)
driver.find_element_by_name("wd").clear()
driver.find_element_by_class_name("s_ipt").send_keys("龚俊")
driver.find_element_by_id("su").submit()
time.sleep(1)
driver.quit()