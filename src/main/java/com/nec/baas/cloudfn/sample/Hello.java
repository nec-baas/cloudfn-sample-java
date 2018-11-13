package com.nec.baas.cloudfn.sample;

import com.nec.baas.cloudfn.sdk.Context;
import java.util.Map;

/**
 * Hello world!
 */
public class Hello {
    public static void sayHello(Map<String, Object> event, Context context) {
        String name = "John Doe";
        if (context.clientContext().queryParams().containsKey("name")) {
            name = context.clientContext().queryParams().get("name").get(0);
        }
	context.logger().info("You can use logger.");
        context.succeed("Hello, " + name + "!");
    }
}
