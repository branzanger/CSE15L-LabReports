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
  We will research the `grep` command with the 4 options `-c`, `-h`, `-i`, and `-v`. /

  * `-v` This option will return anything not matching our pattern
  * ```
    $ $ find technical/government/ | grep -v ".txt"
	technical/government/
	technical/government/About_LSC
	technical/government/Alcohol_Problems
	technical/government/Env_Prot_Agen
	technical/government/Gen_Account_Office
	technical/government/Media
	technical/government/Post_Rate_Comm
	```
* Here we are finding everything that is not a text file in the `technical/government` directory and the only things that aren't textfiles are the working directory and sub directoores. /


