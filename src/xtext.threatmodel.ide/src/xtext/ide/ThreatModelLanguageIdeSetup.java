/*
 * generated by Xtext 2.33.0
 */
package xtext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import xtext.ThreatModelLanguageRuntimeModule;
import xtext.ThreatModelLanguageStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class ThreatModelLanguageIdeSetup extends ThreatModelLanguageStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new ThreatModelLanguageRuntimeModule(), new ThreatModelLanguageIdeModule()));
	}
	
}
