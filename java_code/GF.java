/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Module
 */
import com.google.inject.Module;

final class GF {
    private static final int a = 1183458017;
    private static final int b = 511224688;

    public static boolean a(Module module, Module module2) {
        if (module == module2) {
            return true;
        }
        if (module == null || module2 == null) {
            return false;
        }
        Class<?> clazz = module.getClass();
        if (clazz != module2.getClass()) {
            return false;
        }
        if (clazz.isAnonymousClass()) {
            return module.equals(module2);
        }
        return true;
    }

    public static int a(Module module) {
        if (module == null) {
            return 0;
        }
        Class<?> clazz = module.getClass();
        if (clazz.isAnonymousClass()) {
            return 511224688 + module.hashCode();
        }
        return 1183458017 + clazz.hashCode();
    }

    private GF() {
    }
}

