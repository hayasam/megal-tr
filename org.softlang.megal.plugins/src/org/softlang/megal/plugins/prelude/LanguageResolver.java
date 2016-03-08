package org.softlang.megal.plugins.prelude;

import org.softlang.megal.mi2.Entity;

import org.softlang.megal.plugins.GuidedReasonerPlugin;

public class LanguageResolver extends GuidedReasonerPlugin {

	@Override
	protected void guidedDerive(Entity entity) {
		when(!entity.hasBinding());

		String url = "http://dbpedia.org/page/" + entity.getName()
				+ "_(programming_language)";
		if (getArtifact(url).exists())
			binding(entity.getName(), url);
	}
}
