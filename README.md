**CUCUMBER VERSION 4.0 EXAMPLES**

Version 4.0 introduces some excellent features:

1. With introduction to version 3 dynamic type casting was not supported.
   This feature is back in version 4.0 release.
   see example (code).Just include the TypeRegistryConfiguration.java in your glue path.
   
2. Cucumber version 4 now supports parallel execution , therefore you don't need to depend upon cucumber-parallel-plugin
    to run your testcases in parallel. see example (code)
    
3. Supports cucumber expression , which are very easy to use. see example (code)

4. When there are multiple runners each runners has to spell out its entire glue path e.g. @CucumberOptions(glue={"login", "common"}). With   the extraGlue property this is no longer required. The extra glue is used in addition to the default glue path. see example (code) 
