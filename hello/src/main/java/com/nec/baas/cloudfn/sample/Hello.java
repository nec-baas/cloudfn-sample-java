package com.nec.baas.cloudfn.sample;

import com.nec.baas.cloudfn.sdk.Context;

/**
 * Hello world!
 */
public class Hello {
    public static void hello(String name, Context context) {
        context.succeed("Hello " + name + "!");
    }
}
