/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class aVg
implements Comparable<aVg> {
    private String a;
    protected String c;
    private boolean b;
    private long d;

    public aVg(String string, String string2, boolean bl, long l) {
        this.c = string;
        this.a = string2;
        this.b = bl;
        this.d = l;
    }

    public aVg(long l, String string, String string2) {
        this(string2, string, false, l);
    }

    public String g() {
        return this.a;
    }

    public void c(String string) {
        this.a = string;
    }

    public boolean h() {
        return this.b;
    }

    public void c(boolean bl) {
        this.b = bl;
    }

    public long i() {
        return this.d;
    }

    public void b(long l) {
        this.d = l;
    }

    public String j() {
        return this.c;
    }

    public void d(String string) {
        this.c = string;
    }

    public int a(@NotNull aVg aVg2) {
        return this.g().toLowerCase().compareTo(aVg2.g().toLowerCase());
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((aVg)object);
    }
}

