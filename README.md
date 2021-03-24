# ObliVM : A Programming Framework for Secure Computation (The compiler)

--------------------------------------------------------------------------------
Addition by zlp
--------------------------------------------------------------------------------

ObliVMLang框架是编译器，后端ObliVM-GC以jar包的形式放在lib文件夹下，首先编译项目（./compile.sh)，然后根据具体实例（如汉明距离）运行编译（./run-compile.sh），lcc文件是源代码文件，输入输出是txt格式文件；计算分为runtogether和（rungen、runeva）两种，前者在一台主机上模拟多方计算，后者在两台主机上运行，通信接口规定在`countConfig.conf`文件中。
开始另外一种计算之前需要清理上次计算产生的中间文件，运行`./clean.sh`即可。
给出的样例在examples文件夹下，其中包括欧式距离的计算。

--------------------------------------------------------------------------------
Author
--------------------------------------------------------------------------------

The ObliVM compiler is developed and currently maintained by [Chang Liu].


--------------------------------------------------------------------------------
Disclaimer
--------------------------------------------------------------------------------

The code is a research-quality proof of concept, and is still under development for more features and bug-fixing.


--------------------------------------------------------------------------------
Prerequisit
--------------------------------------------------------------------------------

Oracle Java 8
JavaCC 5.0 (to compile C.jj under the parser folder only)
Python 2.7 (to run tools)

--------------------------------------------------------------------------------
Compile
--------------------------------------------------------------------------------

In Linux:

    $ ./compile.sh

In Cygwin

    $ ./compile_cygwin.sh

--------------------------------------------------------------------------------
Run the hamming distance example (examples/hamming)
--------------------------------------------------------------------------------
Compile the example:

    $ ./run-compiler.sh 54321 examples/hamming/hamming.lcc

In Cygwin

    $ ./run-compiler_cygwin.sh 54321 examples/hamming/hamming.lcc

Run the real secure computation:

    $ ./runtogether.sh examples/hamming/input_alice.txt examples/hamming/input_bob.txt 

In Cygwin

    $ ./runtogether_cygwin.sh examples/hamming/input_alice.txt examples/hamming/input_bob.txt 

--------------------------------------------------------------------------------
Tools
--------------------------------------------------------------------------------

Under tools/ folder, the following tools are available:

  * datainitilizer: initialize the bit input file from a file containing an integer or an array of integers

--------------------------------------------------------------------------------
References
--------------------------------------------------------------------------------

\[LWNYS15] [
  _ObliVM: A Programming Framework for Secure Computation_
] (http://www.cs.umd.edu/~liuchang/paper/oakland2015-oblivm.pdf)
  Chang Liu, Xiao Shuan Wang, Kartik Nayak, Yan Huang, Elaine Shi
  IEEE S&P 2015

[Chang Liu]: http://www.cs.umd.edu/~liuchang/
