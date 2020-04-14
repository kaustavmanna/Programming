/*
* Two threads will print alternate numbers
*/

package com.thread;

import java.lang.Thread;

class Counter
{
    private int i;
    public Counter()
    {
        i = 0;
    }

    public int getCounter()
    {
        return this.i;
    }

    public void setCounter(int i)
    {
        this.i = i;
    }
}

class Thread1 extends Thread
{
    private Counter counter;
    private int n;

    public Thread1(Counter counter, int n)
    {
        this.counter = counter;
        this.n = n;
    }

    @Override
    public void run()
    {
        while(counter.getCounter() < 10)
        {
            if (counter.getCounter() % 2 == n)
            {
                synchronized (counter)
                {
                    System.out.println(Thread.currentThread().getName() + ": " + counter.getCounter());
                    counter.setCounter(counter.getCounter() + 1);
                    counter.notify();
                }
            }
            else
            {
                try
                {
                    wait();
                }
                catch (Exception e)
                {
                }
            }
        }
    }
}

public class AlternatePrint
{
    public static void main(String args[])
    {
        Counter counter = new Counter();
        Thread thread1 = new Thread1(counter, 1);
        thread1.setName("First Thread");
        Thread thread2 = new Thread1(counter, 0);
        thread2.setName("Second Thread");
        thread1.start();
        thread2.start();
    }
}
