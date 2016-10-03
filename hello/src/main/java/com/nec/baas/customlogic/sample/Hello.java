package com.nec.baas.customlogic.sample;

import com.nec.baas.customlogic.sdk.Context;

/**
 * Hello world!
 */
public class Hello {
    public static void hello(String name, Context context) {
        context.succeed("Hello " + name + "!");
    }
}
