from selenium import webdriver
import time


driver = webdriver.Firefox()
driver.get("http://www.baidu.com")
time.sleep(1)

driver.find_element_by_link_text("贴吧").click()

driver.maximize_window()

driver.sleep(2)
driver.quit()