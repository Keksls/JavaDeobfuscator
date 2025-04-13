/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aeO
 */
public class aeo_0 {
    public int a;
    public String b;
    public int c;
    public boolean d;
    public int e;
    public byte f;
    public int g;
    public short h;

    public aeo_0() {
    }

    public aeo_0(int n, String string, int n2, boolean bl, int n3, byte by, int n4, short s2) {
        this.a = n;
        this.b = string;
        this.c = n2;
        this.d = bl;
        this.e = n3;
        this.f = by;
        this.g = n4;
        this.h = s2;
    }

    final void a(@NotNull arf_1 arf_12) {
        this.a = arf_12.c();
        short s2 = arf_12.b();
        byte[] byArray = arf_12.a(s2);
        this.b = Cz.a(byArray);
        this.c = arf_12.c();
        this.d = arf_12.l();
        this.e = arf_12.c();
        this.f = arf_12.a();
        this.g = arf_12.c();
        this.h = arf_12.b();
    }

    final void a(@NotNull gk_0 gk_02) {
        gk_02.a(this.a);
        byte[] byArray = Cz.a(this.b);
        gk_02.a((short)byArray.length);
        gk_02.a(byArray);
        gk_02.a(this.c);
        gk_02.a(this.d);
        gk_02.a(this.e);
        gk_02.a(this.f);
        gk_02.a(this.g);
        gk_02.a(this.h);
    }
}

