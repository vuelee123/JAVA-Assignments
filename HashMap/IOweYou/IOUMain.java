package HashMap.IOweYou;

public class IOUMain {
    public static void main(String [] args) {
        IOU charlieIOU = new IOU ();
        charlieIOU.setSum("Lee", 100.50);
        charlieIOU.setSum("Kian", 200.90);
        System.out.println(charlieIOU.howMuchDoIOweTo("Lee"));
        System.out.println(charlieIOU.howMuchDoIOweTo("Kian"));
    }
}
