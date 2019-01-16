package cse12pa2student;

class LongWordChooser implements StringChooser {

	@Override
	public boolean choose(String s) {
		return s.length() > 5;
	}

}

// Add your choosers here