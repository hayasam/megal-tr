package org.softlang.megal.plugins.prelude;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.plugins.api.GuidedReasonerPlugin;

public class LanguageResolver extends GuidedReasonerPlugin {

	private boolean checkURL(String url) {
		
		Socket socket = new Socket();
		
		try {
			
			socket.connect(new InetSocketAddress(url,80));
			socket.close();
			
		} catch (IOException e) {
			
			System.err.println("LanguageResolver: '" + url + "' is not reachable!");
			
			return false;
			
		}
		
		return true;
		
	}
	
	@Override
	protected void guidedDerive(Entity entity) {
		when(!entity.hasBinding());
		
		String url = "http://dbpedia.org/page/" + entity.getName()
				+ "_(programming_language)";
		
		
		
		if (checkURL(url) && getArtifact(url).exists())
			binding(entity.getName(), url);
			
		
	}
}
