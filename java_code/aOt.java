/*
 * Decompiled with CFR 0.152.
 */
public interface aOt {
    public static final String a = "AnimMarche-Mnt%d";
    public static final String b = "AnimCourse-Mnt%d";
    public static final String c = "AnimCourse-Debut-Mnt%d";
    public static final String d = "AnimCourse-Fin-Mnt%d";
    public static final String e = "AnimRelique-Saut-Mnt%d";
    public static final String f = "AnimStatique-Mnt%s";

    public String a();

    public String b();

    public String c();

    public String d();

    public String e();

    public String f();

    public UL g();

    public static String a(int n) {
        return String.format(f, n);
    }
}

