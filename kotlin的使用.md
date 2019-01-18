### kotlin中的扩展函数结合

#### kotlin自带的扩展函数

1. **apply函数**  ->  **同also函数基本一致用法**

   * apply 是 Any 的扩展函数，因而所有类型都能调用 
   * apply 接受一个lambda表达式作为参数，并在apply调用时立即执行，**apply返回原来的对象** 
   * apply 主要作用是将多个初始化代码链式操作，提高代码可读性
   * 使用**this**关键字代指调用者

2. **let函数**

   * 同apply相同,唯一不同是返回值,let不返回原来的对象,而是闭包里面最后一行的值
   * 使用**it**关键字代指调用者:**不可省略** (run就可以省略it,直接访问对象属性)

3. **with函数**

   * 是一个顶级函数,想调用对象的多个方法但是不想重复对象引用时使用,替代**switch..case**

4. **run 函数**

   * run是with跟let的组合
   * 返回值为最后一行的值或者指定的return的表达式。 在其中使用可省略掉**it**关键值
   * 因为run函数是let,with两个函数结合体，准确来说它弥补了let函数在函数体内必须使用it参数替代对象，
   * 在run函数中可以像with函数一样可以省略，直接访问实例的公有属性和方法，另一方面它弥补了with函数传入对象判空问题，在run函数中可以像let函数一样做判空处理 

5. **lazy函数**

   * lazy延迟运算，当第一次访问时，调用相应的初始化函数 
   * **第一次调用get() 会执行已传递给 lazy() 的 lambda 表达式并记录结果， 后续调用get() 只是返回记录的结果** 
   * 这里需要注意的是 调用的是 `get()`方法,和set没啥关系 

6. **use函数** (同readLines函数)

   * use 用在 Java 上的 try-catch-finally表达式上

   * 适用于IO操作，可以放心使用，而不用担心异常的发生，并且会自动关闭IO流 

   * 省去了捕捉异常和关闭的烦恼 

   * 经过包装以后你只需要关注读出来的数据本身而不需要care各种异常情况 

     ```
     val input = Files.newInputStream(Paths.get("input.txt"))
     val byte = input.use({ input.read() }) //读取文件,不用担心异常,内存泄漏等
     ```

7. **repeat函数** 

   * 它接受函数和整数作为参数，函数会被调用 n 次，这个函数避免写循环 

     ```
     repeat(10, { println("Hello") })
     ```

     

#### 自定义扩展函数类

1. EditView赋值函数

   * et.text = "hello world"会报editable转化异常,String需要使用Editable.Factory工厂类转化为了避免每个函数都调用一遍,使用扩展函数

     ```
     fun String.toEditable():Editable{
       return Editable.Factory.getInstance().newEditable(this)
     }
     使用方法: et.text = "hello world"?.toEditable()
     ```