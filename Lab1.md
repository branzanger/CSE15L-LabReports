## Lab 1
---
### ```cd```
1. No args
```
[user@sahara ~/lecture1]$ cd
[user@sahara ~]$ 
```
The working directory was ```/home/lecture1```.\
The cd command without arguments will change your directory to the home directory automatically.
Here we changed from the ```/home/lecture1``` directory to the /home directory. \
The output was not an error.

2. Path to a directory
```
[user@sahara ~]$ cd lecture1/messages/
[user@sahara ~/lecture1/messages]$
```
The working directory was ```/home```.\
The cd command with a directory as an argument will change the directory to the specified directory. \
Here we changed from the ```/home``` directory to the /home/lecture1/messages directory. \
The output was not an error.

3. Path to a file
```
[user@sahara ~]$ cd lecture1/messages/en-us.txt 
bash: cd: lecture1/messages/en-us.txt: Not a directory
[user@sahara ~]$
```
The working directory was ```/home```.\
The cd command with a file as an argument will not work as a file is not a directory. \
The output was an error as cd (change directory) only works on directories and \
is used to navigate through different directories.

### ```ls```
1. No args
```
[user@sahara ~]$ ls
lecture1
[user@sahara ~]$
```
The working directory was ```/home.```\
The ls command without arguments will list all files and directories in the current working directory. \
Here we are in the ```/home``` directory and lecture1 directory is the only thing inside ```/home```. \
The output was not an error. 

2. Path to a directory
```
[user@sahara ~]$ ls lecture1/
Hello.class  Hello.java  messages  README
[user@sahara ~]$
```
The working directory was ```/home```.\
The ls command with a directory as an argument will list all files and directories in the directory specified \
by the argument.\
The output was not an error. 

3. Path to a file
```
[user@sahara ~]$ ls lecture1/messages/en-us.txt 
lecture1/messages/en-us.txt
[user@sahara ~]$
```
The working directory was ```/home```.\
The ls command with a directory as an argument will list the file specified.\
The output was not an error. 

### ```cat```

1. No args
```
[user@sahara ~]$ cat
[user@sahara ~]$
```
The working directory was ```/home```. \
The cat command without arguments will wait for keyboard input and repeat whatever was inputted once it receives \
and EOF(end of file) signal. \
The output was not an error. 

2. Path to a directory
```
[user@sahara ~]$ cat lecture1/
cat: lecture1/: Is a directory
[user@sahara ~]$
```
The working directory was ```/home```. \
The cat command with a directory as an argument will print the relative directory and say  "Is a directory". \
The output was an error as the cat command is specifically used to view, create, and modify files and won't work 
with directories. 

3. Path to a file
```
[user@sahara ~]$ cat lecture1/messages/en-us.txt 
Hello World!
[user@sahara ~]$
```
The working directory was ```/home```. \
The cat command with a single file path as an argument will display the contents of the file in txt form. \
Here the contents of "en-us.txt" were "Hello World!" as displayed by the cat command. \
The output was not an error. 

