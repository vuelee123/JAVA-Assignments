package HashMap.Abbreviations;

public class AbbreviationsMain {
    public static void main(String[] args) {
        // Test your program here!
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("etc.", "and other things");
        abbreviations.addAbbreviation("amt.", "amount");
        abbreviations.addAbbreviation("byob.", "bring your own bottle");
        abbreviations.addAbbreviation("apt.", "appointment");

        String text = "etc. amt. byob. apt. lol";

        for (String part: text.split(" ")) {
            if(abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print("");
        }

        System.out.println();
    }
}
