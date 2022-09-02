# Temperature-Converter
This is Temperature Converter app.  
It's based on JDK-18 and JAVA-FX and turn into JAR(JAVA ARCHIVE) to use is as stand alone.

To use it as JAR file you hav to do this following steps. 

Install Java on your Computer.  

If you are using Linux you have to install JDK and JavaFX modules(from openFX).   

***LINUX (UBUNTU)***  

To install JDK-18,use this command.

>     sudo apt update
    
>     java   
>sudo apt install default-jre              # version 2:1.11-72build1.   
>sudo apt install openjdk-11-jre-headless  # version 11.0.14+9-0ubuntu2.   
>sudo apt install openjdk-17-jre-headless  # version 17.0.2+8-1.   
>sudo apt install openjdk-18-jre-headless  # version 18~36ea-1.   
>sudo apt install openjdk-8-jre-headless   # version 8u312-b07-0ubuntu1.   

Copy what ever version you want to install.
EXAMPLE:- 
>     sudo apt install default-jre  
After installation complete. check it's completely install or not by this command
>     java -version
You may need the **JDK** in addition to the **JRE** in order to compile and run some specific Java-based software. To install the **JDK**, execute the following command, which will also install the **JRE**. otherwise you just need **JRE** for **JAR APP**. 
Most program only need the **JRE** (Java Runtime Environment) but some programs need the Compiler at runtime in which case you need the **JDK**. 

**NOTE: - If you have the JDK, you don't need the JRE as well.**
Follow this command for **JDK**.
>     sudo apt install default-jdk
Check JDK install.
>     javac -version

***WINDOWS***

Simply Download JDK by this link  
https://www.oracle.com/java/technologies/downloads/#jdk18-windows   
![image](https://user-images.githubusercontent.com/75372853/188181616-5abc2b3a-8f23-4ef9-bc40-5d1bc77bafdf.png)
Click any of three. recommended **x64 Installer** for easy installation.    

>After downloading from x64 Installer, Double click on installation file. 

![image](https://user-images.githubusercontent.com/75372853/188183462-3545f9c1-6a48-47ab-abc2-38b383d4bba7.png)   
>Click on next and Install it in whatever location you want.   
![image](https://user-images.githubusercontent.com/75372853/188183801-7f85d858-4000-497d-858e-f92890d2b2b5.png)
