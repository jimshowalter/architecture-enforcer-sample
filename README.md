Architecture Enforcer Sample Project
====================================

Sample project from which we can generate files used to test architecture-enforcer.

1. mvn clean install

1. Run pf-CDA, pointing it to this project's war.

1. Export pf-CDA to .odem file.

1. Edit .odem file to add two unresolveds to the dependencies for com.jimandlisa.utils.Utils (and add to the dependencies count):

```
        <type name="com.jimandlisa.utils.Utils" classification="class" visibility="public">
          <dependencies count="8">
...
            <depends-on name="com.jimandlisa.utils.Unresolved" classification="uses" />
            <depends-on name="com.jimandlisa.utils.AnotherUnresolved" classification="uses" />
```

4. Save the modified file on top of architecture-enforcer/src/test/resources/Sample.odem.

5. Make sure architecture-enforcer builds, then check everything in.

## See Also ##

https://github.com/jimshowalter/architecture-enforcer-sample