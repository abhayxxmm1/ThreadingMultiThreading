# Java Threading & Multithreading

This module demonstrates core Java Threading and Multithreading concepts using practical examples.

---

# Concepts Covered

## 1. Creating Threads using Thread Class

Threads are created by extending the `Thread` class and overriding the `run()` method.

```java
public class FirstThread extends Thread {

    @Override
    public void run() {

        System.out.println(":First thread Begin");
        System.out.println("From 1st thread");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getId());
        System.out.println("First thread ended");

    }
}
```

---

## 2. Current Thread Information

Getting details of the currently executing thread.

```java
String nameString = Thread.currentThread().getName();
int priority = Thread.currentThread().getPriority();
long id = Thread.currentThread().getId();

System.out.println(nameString);
System.out.println(priority);
System.out.println(id);
```

---

## 3. Thread Priority

Setting thread priority.

```java
Thread2 t1 = new Thread2();

t1.setPriority(Thread.MAX_PRIORITY);
t1.setName("hola");

t1.start();
```

### Priority Constants

```java
Thread.MIN_PRIORITY
Thread.NORM_PRIORITY
Thread.MAX_PRIORITY
```

---

## 4. Naming Threads

Assigning custom names to threads.

```java
t1.setName("hola");
```

---

## 5. Multiple Thread Execution

Running multiple threads simultaneously.

```java
MyThread m1 = new MyThread();
m1.start();

MyThread2 m2 = new MyThread2();
m2.start();
```

---

## 6. Thread Yield

`Thread.yield()` pauses the currently executing thread temporarily and gives chance to other threads.

```java
@Override
public void run() {

    Thread.yield();

    for (int i = 0; i < 10; i++) {
        System.out.println(Thread.currentThread().getName());

        Thread.yield();
    }
}
```

---

## 7. Thread Sleep

Pausing execution of a thread for a specified time.

```java
try {
    Thread.sleep(2000);
} catch (InterruptedException e) {

    System.out.println("Thread Interrupted");
}
```

---

## 8. Thread Interruption

Interrupting a running thread.

```java
MyThread3 m3 = new MyThread3();

m3.start();

m3.interrupt();
```

---

## 9. Shared Resource Between Threads

Multiple threads accessing the same object.

```java
Demo d1 = new Demo();

MyThread4 t1 = new MyThread4("Raju", d1);
MyThread4 t2 = new MyThread4("Rani", d1);

t1.start();
t2.start();
```

---

## 10. Synchronization

Synchronization prevents multiple threads from accessing critical sections simultaneously.

```java
public synchronized void greetings(String name)
{
    for (int i = 0; i < 10; i++) {

        System.out.println("good Morning " + name);
    }
}
```

---

# Files Included

| File Name | Concept |
|------------|----------|
| `FirstThread.java` | Basic Thread Creation |
| `Thread2.java` | Thread Execution |
| `T1diver.java` | Current Thread Details |
| `T2Driver.java` | Thread Priority & Naming |
| `MyThread.java` | Thread Yield |
| `MyThread2.java` | Parallel Thread Execution |
| `MyThread3.java` | Sleep & InterruptedException |
| `MyThread3Driver.java` | Thread Interruption |
| `Demo.java` | Shared Resource |
| `MyThread4.java` | Shared Object Thread |
| `MyThread4Driver.java` | Multithreading Demo |

---

# Topics Learned

- Thread Class
- Multithreading
- Thread Lifecycle
- Thread Scheduling
- Thread Priorities
- Thread Naming
- Yield Method
- Sleep Method
- Interrupt Method
- Shared Resources
- Synchronization
- Concurrent Execution

---

# Technologies Used

- Java
- Eclipse IDE

---

# Purpose

This project was created to practice and understand Java Threading and Multithreading concepts through hands-on examples and implementations.
