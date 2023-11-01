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
* 

