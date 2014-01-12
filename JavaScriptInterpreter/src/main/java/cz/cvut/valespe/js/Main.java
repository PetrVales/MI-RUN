package cz.cvut.valespe.js;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        final BootstrapService bootstrapService = new BootstrapService();
        bootstrapService.runScript(args[0], Arrays.copyOfRange(args, 1, args.length));
    }

}
