# Review of Alternative JVM Workflows for Data Science

JVM-based languages, Java in particular, are popular tools for enterprise and web app systems, such as Java Spring.  Introducing a data science pipeline with these systems offers many alternatives.  In this document, we focus on jvm-language data science workflows that integrate closely with these environments.  

An alternative approach might be to use more traditional data science tools (R or Python) in a MicroService.  While this is often a strong, isolated approach, it can lead to inflexibility in team dynamics, and difficult in data transferability when the functionality in question is considered a core component of the underlying system.



__Requirements__

This document reviews the various approaches and provides a recommendation based on the following workflow requirements:

* simple, stand-alone tool
  - preferably one language
  - docker notebook deploy
  - file export
* strong notebook support for reproducible research
  - archive previous work
  - simulate results
  - visualize analysis
* notebook-to-file code insertion
  - functional: inputs / outputs
  - no manual modifications
* strong community and ease of use
  - notebook
  - tools and libs



__Recommendation__

Scala

* Commonly-accepted approach in data science (ds) community
  - more recent / popular libraries ds
  - more popular notebook tools
  - simple, stand-alone notebook-to-file workflow (java repl more for teaching, and notebook dependent on polyglot jvm tools, including java)
* Ease of use
  - inferred type system
  - balance between dynamic (python) and static (java) language characteristics
  - expected ds tools and libs: matrix, dataframe, visualizations
* Functional programming
  - modeling verbs of immutable data, not objects
  - not concerned with state
  - pure functions: output based on input





# Framework Assessments

### Java

Really impressive polygot environments.  Transformation of the Beaker notebook (formerly Jupyter competitor) which makes use of the strengths of many languages.  Fun demo, [here](https://hub.mybinder.org/user/twosigma-beakerx-f82v308h/notebooks/StartHere.ipynb).  Also, SciJava project has goal of being a polyglot kernel for Jupyter.

_History lesson:_ Beaker notebooks offered multiple languages, with shared data structures (specifically dataframes), within the same notebook - awesome!  Doing this in Jupyter (R2Py) is difficult and doesn't work so well.  And it was supported by a profitable firm.  But, it was never accepted by the open-source community, and never had contributors (such as through extensions), and was eventually disbanded.  This could be caused by a variety of reasons: late to market, less publicity.  But, overall, I think data science doesn't value multiple language use, or interoperability.  Focusing on multiple languages detracts from advancements in math and algorithmic implementation.



__Pros__

* possible to use Jupyter notebooks, not just repl
* includes lambda for more functional programming
* seamless integration with cyber repo
* (?good) aimed a polyglot environment: Groovy (default), Python, Beanshell, Clojure, Kotlin, Java, Javascript, Ruby and Scala
* TwoSigma support, from previous Beaker notebook polyglot project

__Cons__

* most strong tools are still in Beta
* polyglot: reliant on other languages, including scala for support (analytics, plots, etc)
* notebook-to-file not straight-forward because OOP nature and differences between REPL, Notebook, and compile implementation
* low popularity / weak community - almost totally supported by TwoSigma company which has low following
* science toolkits have virtually no following
* despite java being an old, popular language - it was late to the game
* mostly aimed at educational pursuits for learning java
* fewer libs


__References__

* [JShell repl](https://www.javaworld.com/article/2971152/core-java/what-repl-means-for-java.html)
* [open repl](http://www.javarepl.com/term.html)
* [notebook kernel]()
* [science toolbox](http://opensource.twosigma.com/)
* [docker notebook deploy](http://beakerx.com/)
* [tablesaw: pandas alternative](https://github.com/jtablesaw/tablesaw)




### Scala


__Pros__

* strong acceptance from the data science community (notebooks, tools, etc.) 
* can make use of other jvm languages/libs, but not reliant on them (very independent)
* strong functional programming foundations
* used in implementation of many new platforms (spark, flink, etc) (?good) maybe not really relevant, here
* scalable work - distributed, unstructured if you need it (?good) maybe not really relevant, here
* simple Scala-library.jar for integration with Java


__Cons__

* hockey-stick learning curve: advanced language features are considered difficult
* good data science community, but not great like python or R (more data engineering oriented)
* using spark or other big data libs could be considered over-kill
* integration with Gradle may be more involved (need help)


__References__

* [lib spire: number types and numeric abstractions](https://github.com/non/spire)
* [lib algebird: abstract algebra](https://github.com/twitter/algebird)
* [lib scalaz: more functional programming extensions](https://github.com/scalaz/scalaz)
* [lib vegas: vega-lite plots and visualizations](https://www.vegas-viz.org/)
* [lib spark: dataframes like R](https://docs.databricks.com/spark/latest/dataframes-datasets/introduction-to-dataframes-scala.html)



### Additional discussions 

* [Scala without spark](https://datascience.stackexchange.com/questions/12106/scala-vs-java-if-youre-not-going-to-use-spark)
* [Scala vs Java for data engineering](https://dzone.com/articles/scala-vs-java-for-big-data-engineering)







END