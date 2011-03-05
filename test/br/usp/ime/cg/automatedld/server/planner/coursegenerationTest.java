package br.usp.ime.cg.automatedld.server.planner;


import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import com.gamalocus.jshop2rt.util.DomainCompiler;
import com.gamalocus.jshop2rt.util.ProblemCompiler;

public class coursegenerationTest {

	private static String basePath = "/home/geiser/workspace/automated-learning-design/";

	private File srcdir;
	private File destdir;
	private File outputPath;

	@Before
	public void setUp() throws Exception {
		// compile domain
		srcdir = new File(basePath + "resource");
		destdir = new File(basePath + "src");
		outputPath = new File(basePath + "war/WEB-INF/classes");
		//new coursegeneration(null);
	}

	@Test
	public void testCompileDomain() throws Exception {
		DomainCompiler.generateJavaClass(srcdir, coursegeneration.class, outputPath, destdir);
		System.out.println("success compilation");
		assertTrue(true);
	}

	@Test
	public void testCompileProblemJavaClass() throws Exception {
		//File srcdir = new File(basePath + "src/main/resources");
		//File destdir = new File(basePath + "src/main/java");
		//File outputPath = new File(basePath + "/build/classes");

		//DomainCompiler.generateConstantTxt(srcdir, coursegeneration.class, destdir);
		//System.out.println("... file of constants generated");
		//ProblemCompiler.generateJavaClass(srcdir, coursegeneration.class, outputPath, destdir);
		//System.out.println("... java class generate of problem");
		assertTrue(true);
	}

}
