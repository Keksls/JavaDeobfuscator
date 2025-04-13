/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.awt.event.KeyEvent;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class aZF
implements ajh_1,
fwo {
    public static final String a = "key";
    public static final String b = "effect";
    public static final String d = "text";
    public static final String e = "isBind";
    private static final String[] f = new String[]{"key", "effect", "text", "isBind"};
    private final any_1 g;

    public aZF(any_1 any_12) {
        this.g = any_12;
    }

    @Override
    public String[] d() {
        return f;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.a();
        }
        if (string.equals(b)) {
            return this.g();
        }
        if (string.equals(d)) {
            return this.i();
        }
        if (string.equals(e)) {
            return "binding".equals(this.h());
        }
        return null;
    }

    public String a() {
        return aZF.a(this.g);
    }

    @NotNull
    public static String a(@Nullable any_1 any_12) {
        Object object;
        if (any_12 == null) {
            return "";
        }
        switch (any_12.b()) {
            case -1: {
                object = bae.h().a("unassignedShortcutKey", new Object[0]);
                break;
            }
            case 9: {
                object = "Tab";
                break;
            }
            default: {
                object = aZF.a(any_12.b());
            }
        }
        Object object2 = object = ((String)object).startsWith("Unknown") ? bae.h().a("unknown", new Object[0]) : object;
        if (any_12.e()) {
            object = aZF.a(16) + " + " + (String)object;
        }
        if (any_12.d()) {
            object = aZF.a(18) + " + " + (String)object;
        }
        if (any_12.c()) {
            object = aZF.a(17) + " + " + (String)object;
        }
        return object;
    }

    @NotNull
    public static String a(@NotNull String string) {
        String[] stringArray = string.replaceAll("CONTROL", "CTRL").split(" \\+ ");
        StringBuilder stringBuilder = new StringBuilder(Cz.n(stringArray[0]));
        if (stringArray.length > 1) {
            for (int k = 1; k < stringArray.length; ++k) {
                stringBuilder.append(" + ").append(Cz.n(stringArray[k]));
            }
        }
        return stringBuilder.toString();
    }

    public int b() {
        return this.g.b();
    }

    public String c() {
        return this.g.g();
    }

    public any_1 e() {
        return this.g;
    }

    public int f() {
        return this.g.l();
    }

    public String g() {
        return bae.h().a("shortcutEffect." + ("binding".equals(this.h()) ? "binding" : this.c()), new Object[0]);
    }

    public String h() {
        return this.g.j();
    }

    public String i() {
        return this.g.m();
    }

    public String toString() {
        return this.i();
    }

    public static String a(int n) {
        return aZF.b(n);
    }

    private static String b(int n) {
        int n2 = 25;
        Field[] fieldArray = KeyEvent.class.getDeclaredFields();
        for (int k = 0; k < fieldArray.length; ++k) {
            try {
                if (fieldArray[k].getModifiers() != 25 || fieldArray[k].getType() != Integer.TYPE || !fieldArray[k].getName().startsWith("VK_") || fieldArray[k].getInt(KeyEvent.class) != n) continue;
                return fieldArray[k].getName().substring(3);
            }
            catch (IllegalAccessException illegalAccessException) {
                return "ERROR";
            }
        }
        return "UNKNOWN";
    }

    @Override
    public String getFilterableStringValue() {
        return this.a() + this.g();
    }
}

