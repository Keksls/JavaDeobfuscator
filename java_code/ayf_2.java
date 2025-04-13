/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from ayF
 */
public abstract class ayf_2 {
    public static boolean q;
    private static final char[] a;
    private static final TIntHashSet b;

    public abstract String a();

    public abstract int b();

    public abstract ayn_2 c();

    public abstract ayn_2 a(int var1, float var2);

    public abstract int a(char var1);

    public abstract int b(char var1);

    public abstract int c(char var1);

    public abstract int d();

    public abstract int e();

    public abstract int a(String var1, int var2, int var3);

    public abstract int a(String var1);

    public abstract int b(String var1);

    public abstract int c(String var1);

    public abstract boolean f();

    public ayr_1 p() {
        return ayr_1.a;
    }

    public abstract void a(float var1, float var2, float var3, float var4);

    public abstract void a(int var1, int var2);

    public abstract void a(char[] var1, float var2, float var3);

    public abstract void a(char[] var1, float var2, float var3, float var4);

    public abstract void a(char[] var1, float var2, int var3, float var4, float var5);

    public abstract void a(char[] var1, float var2, int var3, float var4, float var5, float var6);

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public int a(String string, int n) {
        return this.a(string, n, true);
    }

    public int a(String string, int n, boolean bl) {
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = string.length();
        while (n3 < n5) {
            char c2;
            int n6;
            int n7;
            while (n3 < n5) {
                ++n4;
                n7 = string.charAt(n3++);
                if (q) continue;
                n6 = 1;
                if (n3 < n5 && b.contains((int)(c2 = string.charAt(n3)))) {
                    n6 = 0;
                }
                if (n7 != 32 && n7 != 10 && n7 != 9 || n6 == 0) continue;
                break;
            }
            if (n4 == 0) {
                ++n4;
            }
            if ((n7 = this.a(string, n4, n)) < n4) {
                if (n2 != 0) {
                    return n2;
                }
                if (q || bl) {
                    if (n7 != n5) {
                        n6 = n7;
                        c2 = string.charAt(n7);
                        ayk_1 ayk_12 = ayk_1.a();
                        while ((ayk_12.a(c2) || b.contains((int)c2)) && n7 > 0) {
                            c2 = string.charAt(--n7);
                        }
                        if (n7 == 0 && n6 != 0) {
                            n7 = n6;
                        }
                    }
                    return n7;
                }
                return 0;
            }
            n2 = n4;
        }
        return n5;
    }

    static {
        a = new char[]{'(', ')', '\'', '\"', '.', '?', '!', ':', ';', ',', '#', '$', '%', '&', '*', '+', '-', '/', '<', '=', '>', '@', '[', ']', '^', '`', '{', '|', '}', '~', '\u3002', '\u303c', '\u303d', '\u303e', '\u303f', '\uff01', '\uff02', '\uff05', '\uff07', '\uff08', '\uff09', '\uff0c', '\uff0d', '\uff0e', '\uff0f', '\uff1a', '\uff1b', '\uff1f'};
        b = new TIntHashSet();
        for (char c2 : a) {
            b.add((int)c2);
        }
    }
}

