/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class afo
extends qt_0 {
    private static final Logger m = Logger.getLogger(afo.class);
    CellParticleSystem e;
    int f = 0;
    byte g = 0;
    float h = 0.0f;
    byte i;
    byte j;
    byte k;
    byte l;

    public afo() {
    }

    public afo(byte by, byte by2, short s2, int n, byte by3, float f2, byte by4, byte by5, byte by6, byte by7) {
        super(by, by2, s2);
        this.f = n;
        this.g = by3;
        this.h = f2;
        this.i = by4;
        this.j = by5;
        this.k = by6;
        this.l = by7;
    }

    @Override
    public void a(@NotNull arf_1 arf_12) {
        super.a(arf_12);
        this.f = arf_12.c();
        this.g = arf_12.a();
        this.h = arf_12.d();
        this.i = arf_12.a();
        this.j = arf_12.a();
        this.k = arf_12.a();
        this.l = arf_12.a();
    }

    @Override
    public void a(@NotNull gk_0 gk_02) {
        super.a(gk_02);
        gk_02.a(this.f);
        gk_02.a(this.g);
        gk_02.a(this.h);
        gk_02.a(this.i);
        gk_02.a(this.j);
        gk_02.a(this.k);
        gk_02.a(this.l);
    }

    @Override
    public String toString() {
        return "ParticleDef{m_systemId=" + this.f + ", m_level=" + this.g + "m_x=" + this.a + ", m_y=" + this.b + ", m_z=" + this.c + ", m_offsetX=" + this.i + ", m_offsetY=" + this.j + ", m_offsetZ=" + this.k + ", m_lod=" + this.l + "}";
    }

    public afo b() {
        return new afo(this.a, this.b, this.c, this.f, this.g, this.h, this.j, this.j, this.k, this.l);
    }

    @Override
    public /* synthetic */ qt_0 a() {
        return this.b();
    }
}

