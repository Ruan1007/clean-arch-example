package com.cleanarchexample.archtests;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "com.cleanarchexample")
public class NamingConventionTests {

    @ArchTest
    ArchRule controllers_should_be_suffixed =
            classes()
                    .that()
                    .areNotAnonymousClasses()
                    .and()
                    .resideInAPackage("..api.controllers..")
                    .should()
                    .haveSimpleNameContaining("Controller");

    @ArchTest
    ArchRule middlewares_should_be_suffixed =
            classes()
                    .that()
                    .resideInAPackage("..api.middlewares..")
                    .should()
                    .haveSimpleNameContaining("Middleware");

    @ArchTest
    ArchRule mappers_should_be_suffixed =
            classes()
                    .that()
                    .resideInAPackage("..api.mappers")
                    .should()
                    .haveSimpleNameEndingWith("Mapper")
                    .orShould()
                    .haveSimpleNameEndingWith("MapperImpl")
                    .allowEmptyShould(true);

    @ArchTest
    ArchRule usecases_should_be_suffixed =
            classes()
                    .that()
                    .resideInAPackage("..application.usecases")
                    .should()
                    .haveSimpleNameEndingWith("UseCase")
                    .orShould()
                    .haveSimpleNameEndingWith("UseCaseImpl");

}
