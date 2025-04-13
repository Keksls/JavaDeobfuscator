/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

public class afd
implements qu_0 {
    public static byte a = (byte)-1;
    public int b;
    public int c;
    public int d;
    public short e;
    public byte f;
    public byte g;
    public int h;
    public short i;
    public short j;
    public byte k;
    public int l;
    public short m;
    public ArrayList<afe> n;

    public afd() {
    }

    public afd(int n, int n2, int n3, short s2, byte by, byte by2, int n4, short s3, short s4, byte by3, int n5, short s5) {
        this.b = n;
        this.c = n2;
        this.d = n3;
        this.e = s2;
        this.f = by;
        this.g = by2;
        this.h = n4;
        this.i = s3;
        this.j = s4;
        this.k = by3;
        this.l = n5;
        this.m = s5;
    }

    @Override
    public void a(@NotNull arf_1 arf_12) {
        this.b = arf_12.c();
        this.c = arf_12.c();
        this.d = arf_12.c();
        this.e = arf_12.b();
        this.f = arf_12.a();
        this.g = arf_12.a();
        this.h = arf_12.c();
        this.i = arf_12.b();
        this.j = arf_12.b();
        this.k = arf_12.a();
        this.l = arf_12.c();
        this.m = arf_12.b();
        int n = arf_12.a();
        if (n > 0) {
            this.n = new ArrayList(2);
        }
        for (int k = 0; k < n; ++k) {
            afe afe2 = new afe();
            afe2.a(arf_12);
            this.n.add(afe2);
        }
    }

    @Override
    public void a(@NotNull gk_0 gk_02) {
        gk_02.a(this.b);
        gk_02.a(this.c);
        gk_02.a(this.d);
        gk_02.a(this.e);
        gk_02.a(this.f);
        gk_02.a(this.g);
        gk_02.a(this.h);
        gk_02.a(this.i);
        gk_02.a(this.j);
        gk_02.a(this.k);
        gk_02.a(this.l);
        gk_02.a(this.m);
        int n = (byte)(this.n == null ? 0 : (byte)this.n.size());
        gk_02.a((byte)n);
        for (int k = 0; k < n; ++k) {
            this.n.get(k).a(gk_02);
        }
    }

    public void a(afe afe2) {
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.n.add(afe2);
    }

    public boolean a() {
        return this.m > 0;
    }

    public String toString() {
        return "LandMarkDef{m_x=" + this.c + ", m_y=" + this.d + ", m_z=" + this.e + ", m_type=" + this.f + ", m_subType=" + this.g + ", m_achievementGoalId=" + this.h + ", m_version=" + this.i + "." + this.j + ", m_linkedWorldId=" + this.m + "}";
    }
}

