/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from blG
 */
public class blg_2
implements Comparable<blg_2> {
    private static final Logger a = Logger.getLogger(blg_2.class);
    private final int b;
    private final int c;
    private final int d;
    private final short e;
    private final int f;
    private final int g;
    private String h;
    private final String i;
    private final boolean j;
    private final byte k;

    public blg_2(int n, int n2, int n3, short s2, int n4, int n5, String string, boolean bl, byte by) {
        this.b = n;
        this.c = n2;
        this.d = n3;
        this.e = s2;
        this.f = n4;
        this.g = n5;
        this.i = string;
        this.j = bl;
        this.k = by;
    }

    public int a() {
        return this.g;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.d;
    }

    public short d() {
        return this.e;
    }

    public boolean e() {
        return this.j;
    }

    public byte f() {
        return this.k;
    }

    public int a(@NotNull blg_2 blg_22) {
        return this.k - blg_22.k;
    }

    public int g() {
        return this.f;
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((blg_2)object);
    }
}

