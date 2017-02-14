package com.my.catalina.realm;

import java.security.Principal;
import java.util.Arrays;

import org.apache.catalina.realm.GenericPrincipal;
import org.apache.catalina.realm.RealmBase;

/**
 * A custom realm for Tomcat 8.
 */
public class BrmsRealm extends RealmBase {

	private static final String NAME = "BrmsRealm";

	@Override
	protected String getName() {
		return NAME;
	}

	@Override
	protected String getPassword(String username) {
		return "123";
	}

	@Override
	protected Principal getPrincipal(String username) {
		return new GenericPrincipal(username, "123", Arrays.asList("admin", "kie-server"));
	}

}
