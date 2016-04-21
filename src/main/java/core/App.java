package core;

import java.util.List;
import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;


@Parameters(separators = ":")

public class App {
       public static final String LIST = "--list";
       public static final String sLIST = "-l";
       
       @Parameter(names = { LIST, sLIST }, arity = 3, description = "List")
        private static List<String> list;
       
//     @Parameter(names = { "-n", "--name" }, description = "Your name", required = true)
       
       @Parameter(names = { "-n", "--name" }, description = "Your name")
       private static String name = "John";
       
       @Parameter(names = { "-a", "--age", }, description = "Your age")
       private static int age = 18;
       
       @Parameter(names = { "-m", "--married" }, description = "Your marriage status")
       private static boolean married = false;
       
       @Parameter(names = "--help", help = true, hidden = true)
       private static boolean help = false;
       
       ////////////////////////////////////////////////////////////////////////////////////
       public static void main(String[] args) {
              new JCommander(new App(), args);
//            JCommander cli = new JCommander(new App(), args);
              if (help) {
                     new JCommander(new App(), args).usage();
//                  cli.usage();
                    System.exit(0);
           }
           System.out.println("Your name is " + name + ", your age is " + age + " and you are "
                           + (married ? "married :-(" : "not married :-)"));
           System.out.println(list.toString());
           System.out.println(list.size());
           System.out.println(list.get(0));
           System.out.println(list.get(1));
           System.out.println(list.get(2));
       }
}
