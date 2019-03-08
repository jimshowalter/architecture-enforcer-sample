Architecture Enforcer Sample Project
====================================

Sample project used to build war and references file to document and test architecture-enforcer.

1. Sync and build this project and https://github.com/jimshowalter/architecture-enforcer.

1. Run the following command (adjusted for your environment) in architecture-enforcer/target:

```
java -jar architecture-enforcer-1.0-SNAPSHOT.jar /path/to/architecture-enforcer/target/test-classes/SampleTarget2.yaml /path/to/architecture-enforcer/target/test-classes/architecture-enforcer-sample-1.0-SNAPSHOT.war /path/to/architecture-enforcer/target -i/path/to/architecture-enforcer/target/test-classes/SampleIgnores.txt
```

3. Check war for this project into https://github.com/jimshowalter/architecture-enforcer/src/test/resources.

4. Check generated all_references.txt from https://github.com/jimshowalter/architecture-enforcer/target into https://github.com/jimshowalter/architecture-enforcer/src/test/resources.