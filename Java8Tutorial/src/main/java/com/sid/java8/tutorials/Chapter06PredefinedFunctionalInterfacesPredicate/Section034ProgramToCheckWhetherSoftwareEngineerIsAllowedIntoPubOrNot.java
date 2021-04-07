package com.sid.java8.tutorials.Chapter06PredefinedFunctionalInterfacesPredicate;

import java.util.List;
import java.util.function.Predicate;

import com.sid.java8.tutorials.Chapter06PredefinedFunctionalInterfacesPredicate.data.DummyDataTable;
import com.sid.java8.tutorials.Chapter06PredefinedFunctionalInterfacesPredicate.data.SoftwareEngineer;

public class Section034ProgramToCheckWhetherSoftwareEngineerIsAllowedIntoPubOrNot {
	public static void main(String[] args) {
		List<SoftwareEngineer> engineers = DummyDataTable.getSoftwareEngineer();
		Predicate<SoftwareEngineer> predicate = sr -> sr.getAge() >= 18 && sr.isHavingGf();
		engineers.stream().filter(predicate).forEach(softwareEngineer -> System.out.println(softwareEngineer));
	}
}
