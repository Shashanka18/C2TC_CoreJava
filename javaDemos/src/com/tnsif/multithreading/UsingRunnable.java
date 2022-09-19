package com.tnsif.multithreading;
public class UsingRunnable implements  Runnable {
	   int h;
	   int l;
	   String msg;
	   
		public UsingRunnable(int h, int l, String msg) {
		this.h = h;
		this.l = l;
		this.msg = msg;
	}

		public void UsingRunnable1(int h2, int l2, String msg2) {
			// TODO Auto-generated constructor stub
		}
		

		@Override
		public void run() {
			for(int i=h;i>l;i--)
			{
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					
				}
				System.out.println(msg+i);
			}
			
		}

	}
