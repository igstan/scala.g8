An opinionated [giter8][0] template for a simple Scala project using sbt and ScalaTest.

### Usage

```
$ g8 igstan/scala
version [0.1.0]:
organization [ro.igstan]:
scala [2.10.0]:
name []: example

Template applied in ./example

$ cd example/
$ tree -I target
.
├── build.sbt
├── project
│   ├── build.properties
│   └── plugins.sbt
├── src
│   └── scala
│       └── Example.scala
└── test
    └── scala
        └── ExampleTest.scala

5 directories, 5 files
```


[0]: https://github.com/n8han/giter8
