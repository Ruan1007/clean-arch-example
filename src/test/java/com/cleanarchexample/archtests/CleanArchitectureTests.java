package com.cleanarchexample.archtests;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

@AnalyzeClasses(packages = "com.cleanarchexample", importOptions = {ImportOption.DoNotIncludeTests.class, ImportOption.DoNotIncludeJars.class})
public class CleanArchitectureTests {

    @ArchTest
    static ArchRule layers_should_respect_clean_architecture_patterns =
            layeredArchitecture()
            .consideringAllDependencies()
                    .layer("api").definedBy("..api..")
                    .layer("application").definedBy("..application..")
                    .layer("domain").definedBy("..domain..")
                    .layer("infrastructure").definedBy("..infrastructure..")
                    .whereLayer("api").mayNotBeAccessedByAnyLayer()
                    .whereLayer("infrastructure").mayOnlyBeAccessedByLayers("api")
                    .whereLayer("application").mayOnlyBeAccessedByLayers("api", "infrastructure");
}
