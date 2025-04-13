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
 * Renamed from aeU
 */
public class aeu_0
extends qt_0 {
    private static final Logger m = Logger.getLogger(aeu_0.class);
    public int e;
    public int f;
    public int g;
    public byte h;
    public boolean i;
    public byte j;
    public String k;
    public String l;

    public aeu_0() {
    }

    public aeu_0(int n, int n2, int n3, byte by, byte by2, byte by3, short s2, boolean bl, byte by4, String string, String string2) {
        super(by2, by3, s2);
        this.e = n;
        this.f = n2;
        this.g = n3;
        this.h = by;
        this.i = bl;
        this.j = by4;
        this.k = string;
        this.l = string2;
    }

    @Override
    public void a(@NotNull arf_1 arf_12) {
        super.a(arf_12);
        this.e = arf_12.c();
        this.f = arf_12.c();
        this.g = arf_12.b();
        this.h = arf_12.a();
        this.i = arf_12.l();
        this.j = arf_12.a();
        this.k = arf_12.e();
        this.l = arf_12.e();
    }

    @Override
    public void a(@NotNull gk_0 gk_02) {
        super.a(gk_02);
        gk_02.a(this.e);
        gk_02.a(this.f);
        gk_02.a((short)this.g);
        gk_02.a(this.h);
        gk_02.a(this.i);
        gk_02.a(this.j);
        gk_02.a(this.k);
        gk_02.a(this.l);
    }

    @Override
    public String toString() {
        return "SoundDef{m_id=" + this.e + ", m_gfxId=" + this.f + ", m_type=" + this.g + ", m_direction=" + this.h + ", m_x=" + this.a + ", m_y=" + this.b + ", m_z=" + this.c + ", m_occluder=" + this.i + ", m_height=" + this.j + ", m_baseAnimation=" + this.k + ", m_params=" + this.l + "}";
    }

    public aeu_0 b() {
        return new aeu_0(this.e, this.f, this.g, this.h, this.a, this.b, this.c, this.i, this.j, this.k, this.l);
    }

    @Override
    public /* synthetic */ qt_0 a() {
        return this.b();
    }
}

