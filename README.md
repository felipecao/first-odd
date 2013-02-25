first-odd
=========

This project is a demo for solving Amazon's exercise about "finding the first character in a stream which is not repeated in the rest of the stream".

Full question
=========

Coding exercise:Find the first character in a stream which is not repeated in the rest of the stream. Please note that you are being provided a stream as a source for these characters. The stream is guaranteed to eventually terminate (i.e. return false from a call to the hasNext() method), though it could be very long. You will access this stream through the provided interface methods. A call to hasNext() will return whether the stream contains any more characters to process. A call to getNext() will return the next character to be processed in the stream. It is not possible to restart the stream.Example:Input: aAbBABacOutput: bIn this example, the character ‘b’ is the first character in the stream which is not repeated in the stream.Use one of the following skeletons for your solutions.Java:public interface Stream{public char getNext(); public boolean hasNext();}public static char firstChar ( Stream input ) { }