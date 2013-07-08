package com.godaddy.sonar.ruby;

import com.godaddy.sonar.ruby.core.Ruby;
import com.godaddy.sonar.ruby.simplecov.SimpleCovCsvParserImpl;
import com.godaddy.sonar.ruby.simplecov.SimpleCovSensor;

import org.sonar.api.Extension;
import org.sonar.api.Properties;
import org.sonar.api.SonarPlugin;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is the entry point for all extensions
 */
@Properties({ })
public final class RubyPlugin extends SonarPlugin {
	
	public List<Class<? extends Extension>> getExtensions() {
		List<Class<? extends Extension>> extensions = new ArrayList<Class<? extends Extension>>();
		extensions.add(Ruby.class);
		
		// simplecov
		extensions.add(SimpleCovSensor.class);
		extensions.add(SimpleCovCsvParserImpl.class);
		
		return extensions;
	}
}
