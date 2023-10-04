## Lab 1
---
### cd
1. no args
```
[user@sahara ~/lecture1]$ cd
[user@sahara ~]$ 
```
The working directory was /home/lecture1.
The output was not an error.

2. Path to a directory
```
[user@sahara ~]$ cd lecture1/messages/
[user@sahara ~/lecture1/messages]$
```
The working directory was /home.
The output was not an error.

3. Path to a file
```
[user@sahara ~]$ cd lecture1/messages/en-us.txt 
bash: cd: lecture1/messages/en-us.txt: Not a directory
[user@sahara ~]$
```
The working directory was /home.
The output was an error as cd (change directory) only works on directories and \n is used to navigate through different directories



