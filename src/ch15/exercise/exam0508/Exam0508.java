package ch15.exercise.exam0508;

import java.util.*;

public class Exam0508 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{8, 83, 93, 87, 88}
		};
		
		List<List<Integer>> list = List.of(
				List.of(95, 86),
				List.of(83, 92, 96),
				List.of(78, 83, 93, 87, 88));
		
		//문제6
		System.err.println(list.size());
		System.out.println(list.get(2).size());
		
		//문제8
		//합, 평균 구하기
		int sum = 0;
		int cnt = 0;
		for (List<Integer> l : list) { 
			for (Integer s : l) {
				sum += s;
				cnt ++;
			}
		}
		
		double avg = (double) sum / cnt;
		System.out.println("합: " + sum);
		System.out.println("평균: " + avg);

	}
}
