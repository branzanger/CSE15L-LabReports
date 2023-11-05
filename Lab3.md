# Lab Report 3

## Part 1 - Bugs
* ``` Failure inducing input
  @Test 
	public void testReverseInPlace() {
		int[] input = {3, 5, 6};
		ArrayExamples.reverseInPlace(input);
		assertArrayEquals(new int[]{ 3 }, input);
	}
  ```
* ``` Non-failure inducing input
  @Test
	public void emptyArray(){
		int[] input = new int[0];
		ArrayExamples.reverseInPlace(input);
		assertArrayEquals(input, input);
	}
  ```
* ![JUnit Extension](https://github.com/branzanger/CSE15L-LabReports/assets/66757687/f4f8d191-67c1-4f91-baf4-f86fa9a8ecfa)
* ![JUnit Terminal](https://github.com/branzanger/CSE15L-LabReports/assets/66757687/056f7e78-b462-4f93-90ed-bb3babda46f4)
* ```
    static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = arr[arr.length - i - 1];
    }
  }
  ```
  Bugged Code
* ```
    static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length/2; i += 1) {
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
  }
  ```
* Debugged Code
* The fix was cutting down the iterations by half so it wouldn't swap the array then swap it back again
* Then actually swapping the variables instead of just deleting one of them and not modifying one


  ## Part 2 - Researching Commands
  We will research the `grep` command with the 4 options `-v`, `-c`, `-i`, and `-n`. 

  ### `-v` This option will return anything not matching our pattern
* ```
  $ find technical/government/ | grep -v ".txt"
  technical/government/
  technical/government/About_LSC
  technical/government/Alcohol_Problems
  technical/government/Env_Prot_Agen
  technical/government/Gen_Account_Office
  technical/government/Media
  technical/government/Post_Rate_Comm
  ```
* Here we are finding everything that is not a text file in the `technical/government` directory and the only things that aren't textfiles are the working directory and subdirectories. 
* ```
  $ find technical/government/Alcohol_Problems/ | grep -v "Session"
  technical/government/Alcohol_Problems/
  technical/government/Alcohol_Problems/DraftRecom-PDF.txt
  ```
* Here we are finding all items in the `technical/government/Alcohol_Problems/` directory without the word `"Session"` in it

### `-c` This option will return only the count of matching directories and files
* ```
  $ find technical/ | grep -c ".txt"
  1391
  ```
* Here we take a count of all files and directories under `technical/` and find all that don't match the `".txt"` pattern. 
* ```
  $ find technical/ | grep -c ""
  1402
  ```
* Here we have no pattern so we count all items in the `technical/` directory

### `-i` This option will ignore case and return all matching lines regardless of case.
* ```
  $ find technical/government/About_LSC/ | grep -i "legal"
  technical/government/About_LSC/LegalServCorp_v_VelazquezDissent.txt
  technical/government/About_LSC/LegalServCorp_v_VelazquezOpinion.txt
  technical/government/About_LSC/LegalServCorp_v_VelazquezSyllabus.txt
  technical/government/About_LSC/ONTARIO_LEGAL_AID_SERIES.txt
  ```
* Here we searched for the pattern `"legal"` and were able to get files that didn't match our exact case.
* ```
  $ find technical/government/About_LSC/ | grep -i "STATE"
  technical/government/About_LSC/State_Planning_Report.txt
  technical/government/About_LSC/State_Planning_Special_Report.txt
  ```
* Here we searched for `"STATE"` and were able to find 2 txt files with inexact casing.

### `-n` This option will return the normal input but with a line number on every matching output
* ```
  $ find technical/ | grep -nv ".txt"
  1:technical/
  2:technical/911report
  20:technical/biomed
  858:technical/government
  859:technical/government/About_LSC
  877:technical/government/Alcohol_Problems
  882:technical/government/Env_Prot_Agen
  897:technical/government/Gen_Account_Office
  989:technical/government/Media
  1135:technical/government/Post_Rate_Comm
  1150:technical/plos
  ```
* Here we print the line numbers of all items that don't have `".txt"` in them
* ```
  $ find technical/ | grep -nc ".txt"
  1391
  ```
* Here we can see that the `-c` option overrides the `-n` option and will not print any lines and instead just prints the count of all matching items
  

Sources: \
[https://www.geeksforgeeks.org/grep-command-in-unixlinux/](https://www.geeksforgeeks.org/grep-command-in-unixlinux/) \
`grep --help` command in git bash
