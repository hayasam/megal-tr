package org.softlang.megal.plugins.prelude;

import org.softlang.megal.mi2.Entity;

import org.softlang.megal.plugins.GuidedReasonerPlugin;

public class PartOfReasoner extends GuidedReasonerPlugin {
		
	@Override
	protected void guidedDerive(Entity entity) throws Throwable {
		
		when(entity.getName().contains("."));
		String first = entity.getName().substring(0, entity.getName().lastIndexOf("."));

		if (entity.getKB().getEntity(first) != null)
			relationship(entity.getName(), first, "partOf");
	}
}
