/**
 * 
 */
package com.sid.java8.tutorials.Chapter13Streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.sid.java8.tutorials.Chapter13Streams.data.DummyDataTable;

/**
 * @author Lenovo
 *
 */
public class Section080MethodsofStreamsfilterandmap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] states = DummyDataTable.stringArrayData();
		Predicate<String> predicateForState = name -> name.charAt(0) == 'K';
		Arrays.stream(states).filter(predicateForState).forEach((String stateName) -> {
			System.out.println("State name : " + stateName);
		});

		Function<String, Integer> fun = (String name) -> {
			return name.length();
		};
		System.out.println(fun.apply("Siddhant"));
		String[] data = DummyDataTable.stringArrayData();
		List<String> woSpace = Arrays.asList(data).stream().map(functionMapper()).collect(Collectors.toList());
		woSpace.stream().forEach(printValue());

		Map<String, String> stateCapital = DummyDataTable.stringMapData();
		Map<String, String> resultMap = stateCapital.entrySet().stream()
				.sorted((Map.Entry<String, String> o1, Map.Entry<String, String> o2) -> {
					return o1.getValue().compareTo(o2.getValue());
				}).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (old, newobject) -> newobject,
						LinkedHashMap::new));
		System.out.println(resultMap);
	}

	private static Consumer<String> printValue() {
		return (String stateNameWOSpace) -> {
			System.out.println(stateNameWOSpace);
		};
	}

	private static Function<String, String> functionMapper() {
		Function<String, String> mapper = (String stateName) -> {
			stateName = stateName.replace(" ", "");
			return stateName;
		};
		return mapper;
	}
}
