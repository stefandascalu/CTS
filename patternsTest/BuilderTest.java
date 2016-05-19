package com.ptt.cts.tests.patternsTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ptt.cts.patterns.builder.EpicBuilderImpl;
import com.ptt.entity.Epic;

public class BuilderTest {
	@Test
	public void test() {
		Epic epic = new EpicBuilderImpl().setEpicName("My Test Epic")
				.setEpicDescription("My Test Description for this epic").setOwnerId(1).setProjectId(2).build();
		assertNotNull(epic);
	}
}
