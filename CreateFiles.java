package com.codercampus.assignment;

import java.util.Arrays;
import java.util.Comparator;

public class CreateFiles extends Student {
	
	private static final long serialVersionUID = 1L;
	
	public Student[]organized (Student[] students){
		Arrays.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				if(o1 == null && o2 == null) {
					return 0;
				} if (o1 == null) {
					return 1;
				} if(o2 == null) {
					return -1;
				}
				
				return o2.getGrade().compareTo(o1.getGrade());
			}
			
		});
		return students;
	}

}
