# SlowLifeGUI

> Panel Initial Status

<div style="text-align: center;">
	<img src="scrnshots/initial_panel.png" alt="initial panel setting" />
</div>

> VisualVM Profiler indicated that top hotspot `MainPanel.convertToInt(int)` 

<div style="text-align: center;">
	<img src="scrnshots/init.png" alt="visualVM initial screenshots" />
</div>

## Spinning for `MainPanel.convertToInt(int)`

### Initial status 

```java
  private int convertToInt(int x) {
    	int c = 0;
    	String padding = "0";
    	while (c < _r) {
    		String l = new String("0");
    		padding += l;
    		c++;
    	}
	
    	String n = padding + String.valueOf(x);
    	int q = Integer.parseInt(n);
    	return q;
    }
```

Original method above takes around 40% of CPU usage when running continuously. In original `convertToInt(int)` method, there is a while loop that create a new string "0" in each iteration and use `+` sign to append this new zero to padding. 

### Refactoring 

> Issue: in Java, `+` is not efficient to concatenate Strings in accumulative way, it is better to use `StringBuilder.append()` method.

**Modification**

```Java
  private int convertToInt(int x) {
    	int c = 0;
    	StringBuilder padding = new StringBuilder("0"); // use `StringBuilder` instead of `new String()`
    	while (c < _r) {
    		padding.append("0");
    		c++;
    	}
    	
    	String n = padding.toString() + String.valueOf(x); // continue use String 
    	int q = Integer.parseInt(n);
    	return q;
    }
```

> Spinning Result 

<div style="text-align: center;">
	<img src="scrnshots/modi_1.png" alt="visualVM screenshots after refactoring" />
</div>

New Result shows that under same initial board the CPU usage of `MainPanel.convertToInt(int)` method is greatly diminished, from 40% (previous) to 3.9% (current). Which gives justification for this modification. 








