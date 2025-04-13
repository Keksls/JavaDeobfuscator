/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Field;

public abstract class eFl
extends Sn {
    public static final int f = 11;
    public static final int g = 12;
    public static final int h = 14;
    public static final int i = 15;
    public static final int j = 16;
    public static final int k = 18;
    public static final int l = 19;
    public static final int m = 20;
    public static final int n = 21;
    public static final int o = 22;
    public static final int p = 23;
    public static final int q = 24;
    public static final int r = 25;
    public static final int s = 26;
    public static final int t = 27;
    public static final int u = 28;
    public static final int v = 29;
    public static final int w = 30;
    public static final int x = 31;
    public static final int y = 32;
    public static final int z = 33;
    public static final int A = 34;
    public static final int B = 35;
    public static final int C = 36;
    public static final int D = 37;

    public static String a(int n) {
        for (Field field : eFl.class.getFields()) {
            try {
                if (field.getInt(null) != n) continue;
                return field.getName();
            }
            catch (IllegalAccessException illegalAccessException) {
                // empty catch block
            }
        }
        return "UNKNOWN_CONTAINER_TYPE (" + n + ")";
    }
}

