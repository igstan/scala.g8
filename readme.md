An opinionated [giter8][0] template for a simple Scala project using sbt and ScalaTest.

### Basic Template
In its basic usage, the template will create the following project structure:

```
$ g8 igstan/scala
version [0.1.0]:
organization [ro.igstan]:
scala [2.10.3]:
name []: example

Template applied in ./example

$ cd example/
$ tree -I target
.
├── project
│   ├── build.properties
│   └── plugins.sbt
│   └── build.scala
├── src
│   └── scala
│       └── Example.scala
└── test
    └── scala
        └── ExampleTest.scala

5 directories, 5 files
```

### Macros Teamplate
The giter8 template under the **macros** branch will create a two-module project
in which one of the modules is set up to be used as a Scala macros module.

```
$ g8 igstan/scala -b macros
version [0.1.0]:
organization [ro.igstan]:
scala [2.10.3]:
name []: example

Template applied in ./example

$ cd example/
$ tree -I target
.
├── core
│   ├── src
│   │   └── scala
│   │       └── Example.scala
│   └── test
│       └── scala
│           ├── ExampleCoreTest.scala
│           └── package.scala
├── macros
│   ├── src
│   │   └── scala
│   │       └── id.scala
│   └── test
│       └── scala
│           ├── ExampleMacrosTest.scala
│           └── package.scala
└── project
    ├── build.properties
    ├── build.scala
    └── plugins.sbt

11 directories, 9 files
```

[0]: https://github.com/n8han/giter8
