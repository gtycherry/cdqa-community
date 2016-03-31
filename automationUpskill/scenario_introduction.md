# 推荐实现的scenario

## *Web Example*: Buy a policy on Suncorp website

#### Check Points:
	1. Lunch the browser
	2. Switch to the targeted URL - [suncorp](http://www.suncorp.com.au/insurance)
	3. Act on kinds of web elements - Button,Radiobutton,Textbox and Selection list … to finish the purchase journey
	4. Generate a pretty report to show your test result (Better to have captures) 

#### You may met:
	* How to deal with multiple browser windows popup?
	* How to deal with the page loading and timeout issues?

#### User Journey: will demonstrate at catchup meeting

## *App Example*: Send your Wechat comment automatically
#### Check Points:
	1. Install app(ipa or apk files) into your phone or simulator by automation script
	2.  Launch the app 
	3.  Login the Wechat
	4. Swtich to comments and send a text or photo comment - Act on the app elements similar as web above
	5. Verify your comment shown successfully
#### You may met:
	* Painful env setup
	* Connection with your mobile or simulator
	* Can NOT find elements?

----

# 推荐case里面应该使用到的selenium的功能点

#### 能够使用不同的方法去定位页面的元素
      * by 
      	* id 
      	* name
      	* xpath
      	* cssselector
      	* tag name
      	* class name
      	* link by link text 

#### 页面元素操作
     	* 按钮 - 点击
     	* 下拉菜单 - 选取
     	* 文本框 - 清除 输入
     	* checkbox radiobutton - 选取 取消 判断状态
     	* 取到页面的警告信息（文本）

#### 页面操作
     	* 浏览器历史记录back
     	* 浏览器历史记录forward
     
#### 能够截图保存

#### 不同window之间的切换

#### cookies
     	* 能读
     	* 能写

#### 测试数据分离
     能够把测试数据放到配置文件或是变量文件里面单独管理，与测试代码分离

#### 处理popup dialogs (alert, confirm)
     	* 能够accpet  dismiss
     	* 能够读取文本

#### 使用wait处理ajax的请求

#### (optional) 文件上传下载

