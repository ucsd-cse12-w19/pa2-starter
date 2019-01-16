package cse12pa2student;
public interface StringList {
	  String[] toArray();
	  void transform(StringTransformer st);
	  void choose(StringChooser sc);
	  boolean isEmpty();
}
