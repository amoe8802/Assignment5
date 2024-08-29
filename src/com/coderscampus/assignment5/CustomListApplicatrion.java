package com.coderscampus.assignment5;

public class CustomListApplicatrion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomList<String> customList = new CustomArrayList<>();

		customList.add("Aa");
		customList.add("Bb");
		customList.add("Cc");
		customList.add("Dd");
		customList.add("Ee");
		customList.add("Ff");
		customList.add("Gg");
		customList.add("Hh");
		customList.add("Ii");
		customList.add("Jj");
		customList.add("Kk");
		customList.add("Ll");
		customList.add("Mm");
		customList.add("Nn");
		customList.add("Oo");
		customList.add("Pp");
		customList.add("Qq");
		customList.add("Rr");
		customList.add("Ss");
		customList.add("Tt");
		customList.add("Uu");
		customList.add("Vv");
		customList.add("Ww");
		customList.add("Xx");
		customList.add("Yy");
		customList.add("Zz");

		System.out.println("Size of the list: " + customList.getSize());

		for (int i = 0; i < customList.getSize(); i++) {

			System.out.println("Index" + i + ": " + customList.get(i));
		}

		System.out.println(customList);

	}

}