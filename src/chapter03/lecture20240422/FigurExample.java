package chapter03.lecture20240422;


abstract class Figur {
	private int attr;
	public Figur() {
		this.attr = 42;
	}
	
	void doOtherthing() {
		// ...
	}
	
	abstract double flaecheninhalt();
}

abstract class SpezialFigur extends Figur {
	abstract void doSomething();
}

class Rechteck extends SpezialFigur {
	void doSomething() {
		
	}

	double flaecheninhalt() {
		return 0;
	}
}


class Kreis extends Figur {
	double flaecheninhalt() {
		return 0;
	}
}

public class FigurExample {
	public static void main(String[] args) {
		Figur re = new Rechteck();
		double flaecheninhalt = re.flaecheninhalt();
		
		Figur[] figuren = new Figur[] { new Kreis(), new Rechteck() };
		// ...
		for(Figur fig : figuren) {
			fig.flaecheninhalt();
		}
	}
}
