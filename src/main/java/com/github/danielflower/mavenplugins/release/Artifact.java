package com.github.danielflower.mavenplugins.release;

import org.apache.maven.plugins.annotations.Parameter;

/**
 * @author Sivasankar Radhakrishnan
 */
public class Artifact {
    @Parameter(property = "groupId")
    private String groupId;

    @Parameter(property = "artifactId")
    private String artifactId;

    public String getArtifactId() {
        return artifactId;
    }

    public String getGroupId() {
        return groupId;
    }

    @Override
    public String toString() {
        return "Artifact{" +
            "artifactId='" + artifactId + '\'' +
            ", groupId='" + groupId + '\'' +
            '}';
    }
}
