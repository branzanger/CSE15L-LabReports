# Lab Report 4

## Step 4
Log into ieng6
```
ssh cs<tab><enter>
```
![SSHing ieng6](https://github.com/branzanger/CSE15L-LabReports/assets/66757687/39653bea-571d-4c0c-be0a-01ebcc32c6c3)

## Step 5
Clone your fork of the repository from your GitHub account (using the `SSH` URL)
```
git clone[<shift><ins>]<enter>
```
`<shift><ins>` is the paste hot key for git bash terminal
![Clone Fork](https://github.com/branzanger/CSE15L-LabReports/assets/66757687/53bc796c-1d17-46c2-a8b9-4a14cae002df)

## Step 6
Run the tests, demonstrating that they fail
```
cd l<tab><enter>
```
![cd lab7](https://github.com/branzanger/CSE15L-LabReports/assets/66757687/b992980f-08d8-4867-a3cd-4845f396f8d4)
```
bash t<tab><enter>
```
![run tests](https://github.com/branzanger/CSE15L-LabReports/assets/66757687/ad976f32-24af-43bc-8c58-28b7dacd2c80)

## Step 7
Edit the code file to fix the failing test
```
vim Li<tab>.<tab><enter>
```
![image](https://github.com/branzanger/CSE15L-LabReports/assets/66757687/32c128df-cad7-45d6-a8b8-ba3954a7462d)
```
/index1 +<enter>nner2
```
![image](https://github.com/branzanger/CSE15L-LabReports/assets/66757687/ba7621cc-34c9-4e45-83c3-6b8655453405)
```
:wq
```
![image](https://github.com/branzanger/CSE15L-LabReports/assets/66757687/e206540a-3c97-4bf7-bd87-d97ad4eaadd6)

## Step 8
Run the tests, demonstrating that they now succeed
```
bash t<tab><enter>
```
![image](https://github.com/branzanger/CSE15L-LabReports/assets/66757687/05b4c103-91c2-402f-86e0-a0c62185bcae)

## Step 9
Commit and push the resulting change to your Github account (you can pick any commit message!)
```
git add .<enter>
git commit -m "fixed an issue where merge would increment the wrong index"<enter>
git push origin main
```
![image](https://github.com/branzanger/CSE15L-LabReports/assets/66757687/4743cd2e-d9bb-4357-965a-288dff1e4a0e)











