package AddTwoNumbers;

import java.util.*;

public class AddTwoNumbers {

	public static LinkedList<Integer> AddTwoNumbers(LinkedList<Integer> input1, LinkedList<Integer> input2) {
		int remainder = 0;
		int i = 0;
		int sum = 0;
		int value = 0;
		int i1=0;
		int i2=0;
		LinkedList<Integer> result = new LinkedList<Integer>();
		while (i < Math.max(input1.size(), input2.size())) {
			if(i >= input1.size())
				i1 = 0;
			else
				i1 = input1.get(i);
			if(i >= input2.size())
				i2 = 0;
			else
				i2 = input2.get(i);
			sum = remainder + i1 + i2;
			if (sum >= 10) {
				value = sum % 10;
				remainder = 1;
			}
			else {
				value = sum;
				remainder = 0;
			}
			result.add(value);
			i++;
		}
		if (remainder>0)
			result.add(remainder);
		return result;

	}

	public static void main(String[] args) {
		LinkedList<Integer> input1 = new LinkedList<Integer>();
		LinkedList<Integer> input2 = new LinkedList<Integer>();
		LinkedList<Integer> result = new LinkedList<Integer>();
		input1.add(2);
		input1.add(6);
		input1.add(1);
		input1.add(9);
		input1.add(9);
		input1.add(9);
		input2.add(4);
		input2.add(7);
		input2.add(5);
		input2.add(9);
		result = AddTwoNumbers(input1, input2);
		System.out.println(result);
	}


}
