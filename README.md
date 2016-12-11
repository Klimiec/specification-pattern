# Specification pattern

## Overview
The main purpose of this project is to present how to implement specification pattern in Java. <br />

Specification pattern is kind of extension to composite pattern which enables group of objects to be treated the same way as a single instance of an object. In case of specification, condition is considered to be a basic building block. It can be combine with other conditions, creating complicated logical expression(composite). Composite of conditions is treated as a single condition object and can be combined further with other conditions.

Specification pattern is used for selection and validations. 

[Here](https://prezi.com/dwhryejqbown/specification/) is presentation outlining concept of specification pattern that refers to this project.

## Project Structure

Project consists of three modules: 
* FileSystem
* Arithmetic
* Specification

The role of the first two projects is to familiarize reader with composite pattern which is the basis of specification pattern. 

##### FileSystem

Implementation of files and directories tree structure. Clasic example of composite pattern.
It simulates invocation of command **rm -rf** on the directory which in turn can contain other directories and files. 
Both file(component) and directory(composite) implements method **delete()**.  

Invocation of ```dir1.delete()``` on composite object is equivalent of recursive deletion```rm -rf dir1```.

```
        // root
        Directory dir1 = new Directory();

        //---- dir1 content
        dir1.add(new File());
        Directory dir2 = new Directory();
        dir1.add(dir2);

        //---- dir2 content
        dir2.add(new File());
        dir2.add(new File());
        Directory dir3 = new Directory();
        dir2.add(dir3);
        dir2.add(new File());

        //---- fill in dir3
        dir3.add(new File());
        dir3.add(new Directory());
        dir3.add(new File());

        // Delete dir1 with all data inside: rm -rf
        dir1.delete();              
```

Sequence of deletion, result of ```dir1.delete()``` execution.

```
---file
---***file
---***file
---***###file
---***###dir4
---***###file
---***dir3
---***file
---dir2
dir1
```

##### Arithmetic

Arithmetic expressions is another example of composite pattern. 
Unfortunately when evaluating expression, order of operations is not supported. 
Expression should be written in appropriate from with order of operations in mind. 

```
        Number a = new Number(3);
        Number b = new Number(5);
        Number c = new Number(2);
        Number d = new Number(4);

        /*  sum = 3 + 5 + 2 + 4 = 14  */
        int sum = a.add(b).add(c).add(d).value();

        /*  var = 3 + 5 * 2 + 4=  17  */
        int var = a.add( b.multiplyBy(c)).add(d).value();

        /*  var = 5 - 3 + 2 = 4 */
        var = b.minus(a).add(c).value();
```

##### Specification

Implementation of the specification pattern for object validation.  
It depicts conceptual process of approving time-sheet. 
Time-sheet describe work done by an individual in a given month in a company. 
It consists of task items. Each task item describes piece of work(name of the task, duration, expected time, status etc).

Time-sheet needs to be approved at the end of each month. 
Before approving it needs to be validated to check if it adheres to the corporate rules. 
Project describes three ways of implementing validating mechanism: 

* Naive 

Approach without any architecture in mind. Solution that just works. 
Hard to test, maintain and extend. 

* Policy 

Introduce strategy pattern in order to separate validation logic for supported countries in the system. 
Each country has its own validation rules encapsulated within module(class). 
Modules can be tested and changed independently of other modules. 


* Specification

Narrow modules size from 'country' into condition size. 
Each condition can be perfectly tested in isolation. 
Modules are joined together in factories. 

[This](https://prezi.com/dwhryejqbown/specification/) presentation shows step by step progression from naive approach towards specification pattern.


## Resources

#### Videos 
* [Przewodnik strukturyzacji Sobótka](https://youtu.be/Xe5PPXsmqFQ?t=4361): only part about specification pattern, presentation for this talk is [here](https://prezi.com/j_qpkc1jx7mr/copy-of-przewodnik-strukturyzacji-architektury-systemu-105-klasycznych-technik-programistycznych-lezacych-u-podstaw-nowoczesnej-inzynierii-oprogramowania/)

##### Repositories
* [BottegaIT/ddd-leaven-v2](https://github.com/BottegaIT/ddd-leaven-v2)

#### Articles

###### Specification
* [Specifications - Martin Fowler](www.martinfowler.com/apsupp/spec.pdf)
* [Specification pattern - Wikipedia](https://en.wikipedia.org/wiki/Specification_pattern)

###### Composite
* [Composite pattern - Wikipedia](https://en.wikipedia.org/wiki/Composite_pattern)
* [Composite Design Pattern - Source Making](https://sourcemaking.com/design_patterns/composite)

##### Presentation
* [TODO: Specyfication Presentation](https://prezi.com/dwhryejqbown/specification/)


## Contact
In case of any questions don't hesitate to contact me:
- [klimiec@gmail.com](klimiec@gmail.com)
- [Linkedin](https://www.linkedin.com/in/piotr-klimiec-621873b5?trk=nav_responsive_tab_profile_pic)
- [Facebook](https://www.facebook.com/klimiec)
- [Twitter](https://twitter.com/piotr_twit)
