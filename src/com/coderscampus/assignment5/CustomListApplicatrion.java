package com.coderscampus.assignment5;

public class CustomListApplicatrion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomList<String> myCustomList = new CustomArrayList<>();

		myCustomList.add("Aa");
		myCustomList.add("Bb");
		myCustomList.add("Cc");
		myCustomList.add("Dd");
		myCustomList.add("Ee");
		myCustomList.add("Ff");
		myCustomList.add("Gg");
		myCustomList.add("Hh");
		myCustomList.add("Ii");
		myCustomList.add("Jj");
		myCustomList.add("Kk");
		myCustomList.add("Ll");
		myCustomList.add("Mm");
		myCustomList.add("Nn");
		myCustomList.add("Oo");
		myCustomList.add("Pp");
		myCustomList.add("Qq");
		myCustomList.add("Rr");
		myCustomList.add("Ss");
		myCustomList.add("Tt");
		myCustomList.add("Uu");
		myCustomList.add("Vv");
		myCustomList.add("Ww");
		myCustomList.add("Xx");
		myCustomList.add("Yy");
		myCustomList.add("Zz");

		System.out.println("Size of the list: " + myCustomList.getSize());

		for (int i = 0; i < myCustomList.getSize(); i++) {

			System.out.println("Index" + i + ": " + myCustomList.get(i));
		}

		System.out.println(myCustomList);

	}

}