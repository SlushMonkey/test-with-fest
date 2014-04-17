package com.thoughtworks.fest._3_jbehave;

import org.jbehave.core.InjectableEmbedder;
import org.jbehave.core.annotations.Configure;
import org.jbehave.core.annotations.UsingEmbedder;
import org.jbehave.core.annotations.UsingSteps;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.junit.AnnotatedEmbedderRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;


@RunWith(AnnotatedEmbedderRunner.class)
@Configure(storyReporterBuilder = SimpleReportBuilder.class)
@UsingSteps(instances = { CelsiusSteps.class })
@UsingEmbedder(embedder = Embedder.class, verboseFailures = true)
public class JBehave extends InjectableEmbedder {
    @Test
    public void run() {
        List<String> storyPaths = Arrays.asList("com/thoughtworks/fest/_3_jbehave/CelsiusConverter.story");
        injectedEmbedder().runStoriesAsPaths(storyPaths);
    }
}