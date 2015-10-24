package com.mycompany.app;

// clojure api
import clojure.lang.IFn;
import clojure.java.api.Clojure;

// for my api
import clojure.lang.RT;

public class App 
{
    public static void main( String[] args )
    {
 
        System.out.println("Java World!" );

        try {

            // running my clojure code
            RT.loadResourceScript("com/mycompany/app/core.clj");
            IFn main = RT.var("com.mycompany.app.core", "-main");
            main.invoke(args);

            // running the clojure api
            IFn plus = Clojure.var("clojure.core", "+");
            System.out.println(plus.invoke(1, 2).toString());
            
        } catch(Exception e) {
          e.printStackTrace();
        }

    }
}
