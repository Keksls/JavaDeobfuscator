/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Pattern;

public abstract class aZz {
    private static final String a = "(?:\\s+.*|$)";
    private static final String b = "\\s+";
    private String c = "";
    private final Pattern d;
    private final Pattern e;
    private byte f = (byte)-128;
    private boolean g;

    public aZz(String string, String string2, boolean bl) {
        Object object = "";
        if (string != null && string.length() != 0 && !string.endsWith(a)) {
            object = string + a;
        }
        this.d = Pattern.compile((String)object);
        String string3 = "(" + string + ")";
        if (string2 != null && string2.length() != 0 && !string2.startsWith(string3 + b)) {
            string3 = string3 + b + string2;
        }
        if (bl) {
            string3 = string3 + "|(" + string + ")";
        }
        this.e = Pattern.compile(string3);
    }

    public void a(String string) {
        this.c = string;
    }

    public String h() {
        return this.c;
    }

    public byte i() {
        return this.f;
    }

    public void a(byte by) {
        this.f = by;
    }

    public Pattern j() {
        return this.d;
    }

    public Pattern k() {
        return this.e;
    }

    public boolean l() {
        return this.g;
    }

    public void a(boolean bl) {
        this.g = bl;
    }

    public abstract avt_0 a();
}

