## Exercise: Point (25 Points)

The project name of this exercise is **Point**.

The objective of this project is to create your Java class with accessors, mutators and contructors.

### Problem Description

This problem is based on the discussions we've had in class with respect to the `Point`
class. This class represents a 2-dimensional point with three data members: one 
for each dimension, X, and Y. In this assignment you will implement the various 
methods for tranforming Point objects such as translate, and scale. We'll 
discuss these tranformations in class in further detail. In addition, you will also
implement a distance method to calculate the distance between two points.

### Getting Started

The first thing you will need to do is accept the invitation to this 
assignment from GitHub Classroom. You can click 
[here](https://classroom.github.com/a/1Wlg2Zgw) to accept the 
invitation, and get started.

Be sure that you accept the invitation first and use the URL to your new project when you clone it in CLion. After copying
the URL into the clipboard, in CLion click **VCS -> Checkout from Version Control -> Git**. Paste the URL into the **URL** box of the _Clone Repository_ dialog box and press **Clone**.

### Writing the code for this Project
Your `Point` class starts out like this, from `Point.java`:

```java
package edu.sbcc.cs105;

public class Point {
	private double _x = 0;
	private double _y = 0;

	private void _setX(double x) { _x = x; }
	private void _setY(double y) { _y = y; }

	public Point() {
	}

	public Point(double x, double y) {
		_x = x;
		_y = y;
	}

	public double getX() { return _x; }
	public double getY() { return _y; }

	public void translate(double dx, double dy) {
		translateX(dx);
		translateY(dy);
	}

	public void translateX(double dx) {
		// Put your code here to translate (addition) _x by dx
	}

	public void translateY(double dy) {
		// Put your code here to translate (addition) _y by dy
	}

	public void scale(double sx, double sy) {
		scaleX(sx);
		scaleY(sy);
	}

	public void scaleX(double sx) {
		// Put your code here to scale (multiply) _x by sx
	}

	public void scaleY(double sy) {
		// Put your code here to scale (multiply) _y by sy
	}


	public double distance(Point p) {
		double x = p.getX() - getX();
		double y = p.getY() - getY();

		// Change the 0.0 below to the distance formula Math.sqrt(x * x + y * y)
		double distance = 0.0;
		return distance;
	}
}
```

Your job is to replace the comments that ask for code with the proper code. For example, the
`translateX` method should look something like this:

```java
    public void translateX(double dx) {
        _x += dx;
    }
```

Once you've implemented all the methods `translateX`, `translateY`, `scaleX`, `scaleY` and 
`distance`, then you can run the tests and see how you did.

### Running the code for this project

Running this code should be straightforward. In the drop-down 
menu in the upper right-hand corner you should see a *Run
Configuration* called `EX07-Point [run]`. Make sure this 
configuration is selected and press the play button next to it.
In the **Run** view below the code you should see the output 
of running the program. It should look something like this:

Using the test input, your output should look like:

```
/tmp/tmp.iJP6dUckGb/cmake-build-debug/../bin/Point
4
p1.x: 0.0, p1.y: 4.0

Process finished with exit code 0
```

Success! Now you can move on to testing your code.

### Testing the code for this project

Testing the code for this project is similar to running your code
as outlined above. In the drop-down menu in the upper right-hand
corner select the target `EX07-Point [test]` and press the 
play button next to it. In the **Run** view below the code you should
see the output of running these tests. It should look something
like this:

```bash
12:30:50 PM: Executing task 'test'...

> Task :wrapper
BUILD SUCCESSFUL in 0s
1 actionable task: 1 executed
> Task :compileJava
> Task :processResources NO-SOURCE
> Task :classes
> Task :compileTestJava
> Task :processTestResources NO-SOURCE
> Task :testClasses
> Task :test
Your unit test score is 20 out of 20.

The assignment is worth a total of 25 where the remainder of 5 points
comes from grading related to documentation, algorithms, and other
criteria.
BUILD SUCCESSFUL in 1s
3 actionable tasks: 3 executed

Process finished with exit code 0
```

### Pushing your code to GitHub

Now you need to turn in your code by sending, or pushing, your code to GitHub. You created a 
GitHub repository when you started the assignment. Now you need to take your local code changes
and send them to GitHub so that you can turn it in and have it graded in the next step in the
work flow.

The first step is to commit your code locally. This tell git what files you want to turn in. In 
this case you only need to turn in the contents of `Point.java`. In the Project view, right-
click **EX07-Point** and then select **Git -> Commit Directory...**. In the dialog box that
pops up, be sure only `Point.java` is selected and that there is some text in the _Commit 
Message_ box. A good commit message would be something like `Committing code to get a good grade`.

Once the commit is finished, which is a purely local action, you need to send that commit to 
GitHub. This is called the push phase of the process. Again right-click on **EX07-Point**.
Then select **Git -> Repository -> Push**. In the dialog box that pops up, push the **Push** button
and that should be it. You should see a message that says the push was successful. In the next
step you'll confirm that your code is working and then submit it for a grade.

### Turning in and Grading your code

Go back to LazyGrader and login again, if needed. Press the _Build_ button next to 
**EX07-Point** for this course. This will send a command to Jenkins to download your code
from GitHub and test it. If all goes well and all the tests pass, the ball next to the _Build_
will turn blue. If some of the tests don't pass the ball will be yellow. If the ball is grey,
that means you have not run the tests before and your project is not ready for grading.

Once the Jenkins status is blue or yellow, press the _Grade_ button for **EX07-Point**.
This will read the results from Jenkins and send your grade to Canvas. Once the notification in 
LazyGrader says the grade has been posted, you should see your grade on Canvas.

That's it, once you've submitted your grade, you are done. I will add points later, after I
inspect your code. For example, most projects will be out of a total of 25 points, but after 
pressing the _Grade_ button, Canvas will show 20 points. I will add up to 5 points after I have
looked at your code and am conviced it is original.
