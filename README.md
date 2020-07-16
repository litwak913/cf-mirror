# cf-mirror  
CurseForge 列表生成工具
![license](https://img.shields.io/github/license/litwak913/cf-mirror?style=flat-square")
![java-version](https://img.shields.io/badge/Java-1.8.0-orange?style=flat-square")
![Build CFMirror](https://github.com/litwak913/cf-mirror/workflows/Build%20CFMirror/badge.svg)

 


## 简介
该工具通过镜像CurseForge列表来解决CurseForge新的hCaptcha验证码慢，1020问题及部分地区被墙的问题  
**注：为尊重原作者权益，不提供下载模组文件的功能，不要给我发任何要求添加下载功能的issus和添加下载功能的pr。**
### 环境要求

- JRE运行环境（可到https://www.java.com/ 下载）
- 如果你要镜像所有文件，建议准备一个好用的梯子
- 如果自行编译，需要安装JDK（可到https://www.oracle.com/java/technologies/javase-downloads.html 下载）和 git （可到https://git-scm.com/下载）

## 使用

1. 从 https://github.com/Litwak913/cf-mirror/releases 中下载cf-mirror，如果下载慢或无法下载，请看下面的教程自行编译。
2. 运行 cf-mirror
   ```shell
   java -jar cf-mirror.jar --output [output]
   ```
   参数：
   - `[output]`：指定输出目录，默认保存到当前目录的output文件夹


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
   java -jar cf-mirror.jar --type mods --output ./mirrors
   ```
   Shadowsocks客户端默认监听127.0.0.1:1080作为代理服务来运行, 当您配置完Shadowsocks后您可以执行以下命令来使用代理进行镜像:
   ```shell
   #使用代理镜像所有mods列表,并保存到当前目录下的mirror文件夹
   java -Dhttps.proxyHost=127.0.0.1 -Dhttp.proxyHost=127.0.0.1 -Dhttps.proxyPort=1080 -Dhttp.proxyPort=1080 -jar cf-mirror.jar --output ./mirrors
   ```
  3.耐心等待，直到出现 ALL DONE 时完成。
    如果出现Network Error或Fatal Error,请再试一次。可以重新运行相同的命令尝试，如果还是不可以，可以尝试使用上面提到的使用代理的模式。
## 自行编译
  1.下载源代码
  ```shell
  git clone https://github.com/litwak913/cf-mirror.git
  ```
  2.编译并生成可运行jar文件
  ```shell
  ./gradlew build
  ```
  完成后，jar文件存放于当前目录下的build/libs文件夹中。
## 常见问题
  Q：为什么获取mod列表慢？
  A：请看上面使用代理的方式来下载。  
  
  Q：文件保存到哪了？  
  A：默认在当前目录下的output文件夹，可用`--output`指定位置。

## 鸣谢
  cf-mirror使用了以下开源库，在此对这些开源库的作者表示致谢。
  - [Gson](https://github.com/google/gson)
  - [Log4j2](http://logging.apache.org)
  - [httpclient](http://hc.apache.org)
  - [jcommander](https://github.com/cbeust/jcommander)
 

