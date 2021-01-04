package com.ImportUseDemo;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class ImportUse implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata annotationMetadata) {
		return new String[]{"com.entity.Dog","com.entity.Cat"};
	}
}
