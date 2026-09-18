import java.util.Stack;

class TextEditor {

    private Stack<String> textStack = new Stack<>();

    public void writeLine(String line) {
        textStack.push(line);
    }

    public void undoLine() {
        if (!textStack.isEmpty()) {
            System.out.println("Removed: " + textStack.pop());
        } else {
            System.out.println("Nothing to undo!");
        }
    }

    public void displayText() {
        if (textStack.isEmpty()) {
            System.out.println("No text available.");
        } else {
            System.out.println("Current Text:");
            for (String line : textStack) {
                System.out.println(line);
            }
        }
    }
}
