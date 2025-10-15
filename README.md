# CodeScene Code Coverage examples: multiple source code components

This repository contains multiple source code components with unit tests. The purpose of the repo is to illustrate how CodeScene's code coverage gates work.
As such, this repository is part of the [CodeScene product documentation](https://codescene.io/docs/guides/code-coverage-gates/check-code-coverage-in-pull-and-merge-requests.html).

That [documentation](https://codescene.io/docs/guides/code-coverage-gates/check-code-coverage-in-pull-and-merge-requests.html) explains how to enable code coverage gates on your own repositories.

## Using multiple Source Code Components

That is a repository hosting multiple different source code components - each with a separate build.

In our case, the modules are indentical, they just have different names: 

- calculator1
- calculator2
- calculator3

In [.github/workflows](./.github/workflows), you will find corresponding build pipelines definitions.
