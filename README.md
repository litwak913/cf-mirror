# cf-mirror  
 <p align="center">
 <a>CurseForge 镜像站搭建工具</a>
<img src="https://img.shields.io/github/license/litwak913/cf-mirror?style=flat-square" alt="GitHub">
<img src="https://img.shields.io/badge/Java-1.8.0-orange?style=flat-square" alt="Java version">
</p>
 


## 简介
该工具通过搭建CurseForge镜像站来解决CurseForge新的hCaptcha验证码慢，1020问题及部分地区被墙的问题
### 环境要求

- JRE运行环境（可到https://www.java.com/ 下载）
- 如果你要镜像所有文件，建议准备一个好用的梯子
- 如果自行编译，需要安装JDK（可到https://www.oracle.com/java/technologies/javase-downloads.html 下载）和 git （可到https://git-scm.com/下载）

## 使用

1. 从 https://github.com/Litwak913/cf-mirror/release 中下载cf-mirror，如果下载慢或无法下载，请看下面的教程自行编译。
2. 运行 cf-mirror
   ```shell
   java -jar cf-mirror.jar <mode> [output] [verbose]
   ```
   参数：

   - `<mode>`：选择镜像模式，可用的如下：
     `list`：镜像列表  
     `file`：镜像文件  
     `all`：镜像所有  
   - `[output]`：指定输出目录
   - `[verbose]`:详细日志输出

   如果你使用代理：
   可以通过添加参数的方式设置代理，`<host>`表示代理服务器的地址，`<port>`表示开放代理的端口。

   使用socks代理的方式：
   ```shell
   java -DsocksProxyHost=<host> -DsocksProxyPort=<port> -jar cf-mirror.jar 
   ```
   针对https资源使用http代理的方式：
   ```shell
   java -Dhttps.proxyHost=<host> -Dhttps.proxyPort=<port> -jar cf-mirror.jar
   ```
   针对http资源使用http代理的方式：
   ```shell
   java -Dhttp.proxyHost=<host> -Dhttp.proxyPort=<port> -jar cf-mirror.jar
   ```
   举个例子： 
   
   ```shell
   #镜像所有mods列表,并保存到当前目录下的mirror文件夹
   java -jar cf-mirror.jar --type mods --mode list --output ./mirrors
   ```
   Shadowsocks客户端默认监听127.0.0.1:1080作为代理服务来运行, 当您配置完Shadowsocks后您可以执行以下命令来使用代理进行镜像:
   ```shell
   #使用代理镜像所有mods文件,并保存到当前目录下的mirror文件夹
   java -Dhttps.proxyHost=127.0.0.1 -Dhttp.proxyHost=127.0.0.1 -Dhttps.proxyPort=1080 -Dhttp.proxyPort=1080 -jar cf-mirror.jar --type mods --mode file --output ./mirrors
   ```
  3.耐心等待，直到出现绿色 <font color=#008000>ALL DONE</font> 时完成。
    如果出现红色的 <font color=red>FAILED</font> ,请再试一次。可以重新运行相同的命令尝试，如果还是不可以，可以尝试使用上面提到的使用代理的模式。
## 自行编译
  1.下载源代码
  ```shell
  git clone https://github.com/litwak913/cf-mirror.git
  ```
  2.编译并生成可运行jar文件
  ```shell
  ./gradlew build
  ./gradlew shadowJar
  ```
  完成后，jar文件存放于当前目录下的build/libs文件夹中。
## 常见问题
  Q：为什么下载mod文件，获取列表下载慢？  
  A：请看上面使用代理的方式来下载。  
  
  Q：文件保存到哪了？  
  A：默认在当前目录下的data文件夹，可用`--output`指定位置。  

## 鸣谢
  cf-mirror使用了以下开源库，在此对这些开源库的作者表示致谢。
  - [Gson](https://github.com/google/gson)
  - [Okhttp3](https://github.com/square/okhttp)
 

