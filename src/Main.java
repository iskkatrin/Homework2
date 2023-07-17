public class Main {
    public static void main(String[] args) {

        var dog = 8.0 ;
        System.out.println(dog);
        var cat = 3.6 ;
        System.out.println(cat);
        var paper = 763789 ;
        System.out.println(paper);
        dog = dog + 4 ;
        System.out.println(dog);
        cat = cat + 4 ;
        System.out.println(cat);
        paper = paper + 4 ;
        System.out.println(paper);
        dog = dog - 3.5 ;
        System.out.println(dog);
        cat = cat - 1.6 ;
        System.out.println(cat);
        paper = paper - 7639 ;
        System.out.println(paper);

        var friend = 19 ;
        System.out.println(friend);
        friend = friend + 2 ;
        System.out.println(friend);
        friend = friend / 7 ;
        System.out.println(friend);
        var frog = 3.5 ;
        System.out.println(frog);
        frog = frog * 10 ;
        System.out.println(frog);
        frog = frog / 3.5 ;
        System.out.println(frog);
        frog = frog + 4 ;
        System.out.println(frog);

        var boxerOne = 78.2;
        System.out.println(boxerOne);
        var boxerTwo = 82.7;
        System.out.println(boxerTwo);
        var totalWeight = boxerOne + boxerTwo;
        System.out.println(totalWeight);
        var difference = boxerTwo - boxerOne;
        System.out.println(difference);
        var Division = boxerTwo % boxerOne;
        System.out.println(Division);

        var hours = 640;
        System.out.println(hours);
        var worker = 8;
        System.out.println(worker);
        var howMany = hours / worker;
        System.out.println("Всего работников в компании " + howMany );
        howMany = howMany + 94 ;
        System.out.println();
        var workTime = hours / howMany ;
        System.out.println ("Если в компании работает " + howMany + " человек, то всего " + workTime + "часов работы может быть поделенно между сотруниками") ;

    }
}