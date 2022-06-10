# Javaweb项目

## 使用

注意：

* 运行项目前请自行导入lib中的jar包
* 测试JDBC时，请删除自己本地的数据库，使用项目中的sql重新构建，避免不匹配的情况出现
* 更改dbinfo中的数据库账户+密码

## 安排

之后的课程内容也会及时保持同步更新，防止在协同开发过程中出现代码不一致的问题



欢迎各位学习git使用共同推进项目建设！！！

请使用本地仓库练习，防止出错导致整体项目延误

## 分工
- Accommodation：齐豪+王渝普
- Answer：陈泓达
- Bed：李欣然
- Doctor：齐豪
- Patient：王渝普
- Question：陈泓达
- RareManage：吴思天
- RareUse：吴思天
- Room：李欣然

## 问题

- 注意结合课堂模板修改前端界面
- 注意其中部分选择框不兼容问题
- 输入结合具体场景加以限制
- 页面细节部分优化

## Tip

#### 如何实现html->jsp

1. 复制html文件

2. ```
   <%@ page contentType="text/html;charset=UTF-8" language="java" %>//添加至html前端
   ```

3. 修改代码中的相关路径，例如：

   *  `href="css/bootstrap.min.css"`更改成`href="${pageContext.request.contextPath}/css/bootstrap.min.css"`
   * `src="js/jquery.min.js">`更改成`src="${pageContext.request.contextPath}/js/jquery.min.js`

4. 把代码中的html跳转改成jsp后缀

#### 简单Git使用

首先安装git(最好开启全局VPN)

```
git init
git pull https://github.com/Cookieser/hospital_server.git master//拉取最新版本
......进行修改编辑
git add .
git commit -m "commit注释"
git push -u https://github.com/Cookieser/hospital_server.git master//上传commit至GitHub仓库
```

**注意：感兴趣可以点击fork新建仓库尝试，不要直接用项目主仓库尝试**

## 任务完成

- [ ] 主页修改
- [ ] 添加患者
- [ ] 办理入驻
- [ ] 查询患者信息
- [ ] 查询入驻信息
- [x] 问题表查询
- [x] 答案表查询
- [x] 添加问题
- [x] 添加答案
- [x] 床位查询
- [x] 床位添加
- [ ] 员工查询
- [x] 员工添加
- [ ] 设备使用
- [ ] 设备管理

