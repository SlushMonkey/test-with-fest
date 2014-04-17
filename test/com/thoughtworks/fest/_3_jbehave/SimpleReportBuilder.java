package com.thoughtworks.fest._3_jbehave;

import org.jbehave.core.reporters.FilePrintStreamFactory;
import org.jbehave.core.reporters.StoryReporterBuilder;

import java.util.Properties;

import static org.jbehave.core.reporters.Format.CONSOLE;
import static org.jbehave.core.reporters.Format.HTML;

public class SimpleReportBuilder extends StoryReporterBuilder {
    public SimpleReportBuilder() {
        Properties viewResources = new Properties();
        viewResources.put("decorateNonHtml", "true");
        this
                .withViewResources(viewResources).withFormats(CONSOLE, HTML)
                .withDefaultFormats().withPathResolver(new FilePrintStreamFactory.ResolveToPackagedName());
    }
}
