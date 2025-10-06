# CodeScene Code Coverage examples - monorepo

This demonstrates CI build pipeline configuration in "monorepo" settings.
That is a repository hosting multiple different source code components - each with a separate build.

In our case, the modules are indentical, they just have different names: 

- calculator1
- calculator2
- calculator3

In .github/workflows, you will find corresponding build pipelines definitions.
