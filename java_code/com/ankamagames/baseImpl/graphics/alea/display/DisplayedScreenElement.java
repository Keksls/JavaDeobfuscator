/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.util.texture.TextureCoords
 *  org.apache.log4j.Logger
 */
package com.ankamagames.baseImpl.graphics.alea.display;

import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement$ObjectFactory;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.ankamagames.baseImpl.graphics.isometric.highlight.HighLightEntity;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.jogamp.opengl.util.texture.TextureCoords;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class DisplayedScreenElement
extends abh_1
implements acy,
aek_0,
aiG,
aiq_0 {
    public static final DisplayedScreenElement$ObjectFactory a = new DisplayedScreenElement$ObjectFactory();
    public ScreenElement b;
    protected byte c;
    public EntitySprite d;
    boolean e = true;
    boolean f = false;
    public boolean g = false;
    private short i = 0;
    private final float[] j = new float[4];
    private float[] k;
    private int l = 0;
    private int m = 0;
    private short n = 0;
    private byte o = (byte)3;
    private long p;
    private static final float[] q = new float[4];
    private static final Logger r = Logger.getLogger(DisplayedScreenElement.class);

    public float a() {
        return this.j[3];
    }

    public void a(ScreenElement screenElement) {
        if (this.b != null) {
            this.j_();
        }
        this.b = screenElement;
        this.c = this.b.h.n();
        this.b.k_();
        this.p = aii_0.a(this.b.d(), this.b.e(), this.b.c());
        this.l = this.b.k();
        this.n = this.b.n();
        this.m = this.b.j();
        this.b();
    }

    public void b() {
        int n;
        int n2;
        ays_2 ays_22;
        agD agD2 = this.b.h;
        int n3 = agD2.f();
        float f2 = this.b.f;
        float f3 = this.b.g;
        if (adc_0.a.b(agD2.o())) {
            this.e = false;
            ays_22 = aca_0.a().a(19067);
            if (this.e && ays_22 != null) {
                n2 = ays_22.w().a();
                n = ays_22.w().b();
                f3 = (float)acm_0.a(this.b.d, this.b.e) - (float)n2 * 0.5f;
                f2 = (float)acm_0.a(this.b.d, this.b.e, this.b.c) + (float)n * 0.5f;
            } else {
                n2 = 1;
                n = 1;
            }
        } else {
            ays_22 = aca_0.a().a(n3);
            n2 = agD2.d();
            n = agD2.e();
        }
        if ((this.b.d + this.b.e) % 2 != 0) {
            f2 += this.b.e > -this.b.d ? -0.5f : 0.5f;
        }
        GLGeometrySprite gLGeometrySprite = (GLGeometrySprite)GLGeometrySprite.j.d();
        gLGeometrySprite.a(axn_2.b, axn_2.f);
        gLGeometrySprite.a(f2, f3, n2, n);
        this.c();
        if (this.d != null) {
            this.d.u();
        }
        this.d = (EntitySprite)EntitySprite.a.d();
        this.a(this.d);
        this.d.a(gLGeometrySprite);
        this.d.a(ays_22);
        this.d.a(this.j[0], this.j[1], this.j[2], this.j[3]);
        this.d.l = this.b.g;
        this.d.m = this.b.g + n2;
        this.d.n = this.b.f - n;
        this.d.o = this.b.f;
        this.a((short)Hw.a(Integer.MAX_VALUE));
        gLGeometrySprite.u();
    }

    protected final void c() {
        this.j[0] = 0.5f;
        this.j[1] = 0.5f;
        this.j[2] = 0.5f;
        this.j[3] = 1.0f;
    }

    protected final void a(Entity entity) {
        entity.p = this;
        if (this.b.a()) {
            entity.k |= 2;
        }
        entity.Q();
        entity.f = this.b.d;
        entity.g = this.b.e;
        entity.h = this.b.c - this.b.j;
        entity.j = this.b.j;
        int n = this.b.i;
        if (this.b.h.l()) {
            entity.f += 0.9f;
            entity.g += 0.9f;
            n += ahi_0.n - 1;
        }
        entity.e = ahi_0.a(this.b.d, this.b.e, n, ahi_0.a.a());
    }

    public void a(int n) {
        int n2 = this.b.d;
        int n3 = this.b.e;
        if (n < 0) {
            --n2;
            --n3;
            n += ahi_0.n;
        }
        this.d.e = ahi_0.a(n2, n3, this.b.i, n);
    }

    public void a(short s2) {
        this.i = (short)(this.i + s2);
        TextureCoords textureCoords = this.b.h.a(this.i);
        this.d.c().b(textureCoords.top(), textureCoords.left(), textureCoords.bottom(), textureCoords.right());
    }

    public final void b(int n) {
        agD agD2 = agE.a(n);
        if (agD2 == null) {
            r.error((Object)("Unable to replace element gfxId : " + n + " unknown"));
            return;
        }
        this.b.f -= this.b.h.c();
        this.b.g += this.b.h.b();
        this.b.h = agD2;
        this.b.f += agD2.c();
        this.b.g -= agD2.b();
        this.b();
    }

    public final void a(acn acn2) {
        acn2.a(this);
    }

    private boolean a(ahm_0 ahm_02) {
        Entity entity = this.e();
        return entity != null && ahm_02.a(entity.o, entity.l, entity.n, entity.m);
    }

    public void a(ahg_0 ahg_02, ArrayList<DisplayedScreenElement> arrayList, ahm_0 ahm_02) {
        float f2;
        float[] fArray;
        if (!this.e) {
            return;
        }
        if (!this.a(ahm_02)) {
            this.f = true;
            return;
        }
        if (this.g) {
            return;
        }
        if (this.k == null) {
            fArray = ahg_02.a(this);
        } else {
            this.k[3] = ahg_02.a(this)[3];
            this.k[3] = this.k[3] * 0.5f;
            this.k[0] = this.k[0] * this.k[3];
            this.k[1] = this.k[1] * this.k[3];
            this.k[2] = this.k[2] * this.k[3];
            fArray = this.k;
        }
        assert (fArray != null);
        System.arraycopy(fArray, 0, q, 0, 4);
        acA acA2 = acz.a().a(this.p);
        if (acA2 != null) {
            f2 = acA2.d;
            q[0] = q[0] * (acA2.a * f2);
            q[1] = q[1] * (acA2.b * f2);
            q[2] = q[2] * (acA2.c * f2);
            q[3] = q[3] * f2;
        }
        if ((acA2 = acz.a().a(this.n)) != null) {
            f2 = acA2.d;
            q[0] = q[0] * (acA2.a * f2);
            q[1] = q[1] * (acA2.b * f2);
            q[2] = q[2] * (acA2.c * f2);
            q[3] = q[3] * f2;
        }
        if (fArray[3] < 0.004f) {
            this.f = true;
            return;
        }
        this.o = acd_0.a(this.o, q);
        this.f = false;
        this.e(q);
        aii_0.a().a(ahg_02, this, this.j[3]);
        this.g = true;
        arrayList.add(this);
    }

    public boolean a(int n, int n2) {
        assert (this.g());
        ays_2 ays_22 = this.d.d();
        if (ays_22 == null) {
            return false;
        }
        int n3 = n2 - this.d.n;
        azr_2 azr_22 = ays_22.a(0);
        if (n3 >= azr_22.b() || n3 < 0) {
            return false;
        }
        int n4 = n - this.d.l;
        if (n4 >= azr_22.a() || n4 < 0) {
            return false;
        }
        if (this.b.h.g()) {
            n4 = azr_22.a() - n4 - 1;
        }
        int n5 = Hw.c((float)n4 * this.b.h.s());
        int n6 = Math.abs(Hw.c((float)n3 * this.b.h.r()) - 1);
        try {
            return azr_22.l().a(n5, n6);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            return false;
        }
    }

    public final ScreenElement d() {
        return this.b;
    }

    public Entity e() {
        return this.d;
    }

    public final long f() {
        return this.b.o;
    }

    public final boolean g() {
        return this.e && this.o == 3 && !this.f;
    }

    final boolean h() {
        return this.e && this.o == 3;
    }

    public final void a(boolean bl) {
        this.e = bl;
    }

    @Override
    public final void l(boolean bl) {
        this.o = (byte)(bl ? 0 : 2);
    }

    public int i() {
        return this.m;
    }

    @Override
    public final int aq() {
        return this.l;
    }

    @Override
    public final void a(int n, short s2) {
        throw new UnsupportedOperationException("");
    }

    @Override
    public final short ar() {
        return this.n;
    }

    @Override
    public long j() {
        return this.p;
    }

    @Override
    public boolean k() {
        if (this.b == null || this.b.h == null) {
            return false;
        }
        return this.b.h.j();
    }

    @Override
    public void a(ahg_0 ahg_02, HighLightEntity highLightEntity, float f2, afe_1 afe_12, int n, aim aim2, int n2) {
        if (highLightEntity == null) {
            return;
        }
        byte by = this.b.h.h();
        float f3 = this.k() ? 0.0f : (float)this.b.h.i();
        float f4 = by == 0 ? f3 : f3 * 0.5f;
        int n3 = this.b.c - this.b.j;
        int n4 = this.b.d;
        int n5 = this.b.e;
        float f5 = f4 + (float)n3;
        float f6 = ahg_02.c(n4, n5);
        float f7 = ahg_02.a(n4, n5, f5);
        highLightEntity.D().a(0);
        highLightEntity.D().a(0, f6, f7);
        highLightEntity.f = n4;
        highLightEntity.g = n5;
        highLightEntity.h = n3;
        highLightEntity.j = 0.0f;
        this.a(highLightEntity);
        aim2.a(highLightEntity, by, f3 * (float)n, f2, (float)afe_12.a() * 0.5f, (float)afe_12.b() * 0.5f);
    }

    @Override
    public void a(HighLightEntity highLightEntity) {
        long l;
        Entity entity = this.e();
        long l2 = l = entity != null ? entity.e : 0L;
        if ((l += (long)ahi_0.b.a()) >= highLightEntity.e) {
            highLightEntity.e = l;
        }
    }

    public void a(float[] fArray) {
        this.k = fArray;
    }

    @Override
    public void n_() {
        this.o = (byte)3;
        this.g = false;
        this.f = false;
        this.i = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.p = 0L;
    }

    @Override
    public void m() {
        this.b.u();
        this.b = null;
        this.c = 0;
        this.e = true;
        this.k = null;
        if (this.d != null) {
            this.d.u();
            this.d = null;
        }
    }

    private void e(float[] fArray) {
        if (!this.b.o()) {
            this.c(fArray);
        }
    }

    protected void c(float[] fArray) {
        this.b.e(fArray);
        if (fArray[0] < 0.0f) {
            fArray[0] = 0.0f;
        } else if (fArray[0] > 1.0f) {
            fArray[0] = 1.0f;
        }
        if (fArray[1] < 0.0f) {
            fArray[1] = 0.0f;
        } else if (fArray[1] > 1.0f) {
            fArray[1] = 1.0f;
        }
        if (fArray[2] < 0.0f) {
            fArray[2] = 0.0f;
        } else if (fArray[2] > 1.0f) {
            fArray[2] = 1.0f;
        }
        if (fArray[3] < 0.0f) {
            fArray[3] = 0.0f;
        } else if (fArray[3] > 1.0f) {
            fArray[3] = 1.0f;
        }
        if (this.j[0] == fArray[0] && this.j[1] == fArray[1] && this.j[2] == fArray[2] && this.j[3] == fArray[3]) {
            return;
        }
        this.j[0] = fArray[0];
        this.j[1] = fArray[1];
        this.j[2] = fArray[2];
        this.j[3] = fArray[3];
        this.d(fArray);
    }

    protected void d(float[] fArray) {
        this.d.a(fArray[0], fArray[1], fArray[2], fArray[3]);
        this.d.f();
    }

    @Override
    public int G() {
        return this.b.d;
    }

    @Override
    public int H() {
        return this.b.e;
    }

    @Override
    public short I() {
        return this.b.c;
    }

    @Override
    public void b(float[] fArray) {
        if (this.d != null && this.b != null) {
            DisplayedScreenElement.a(this.d, fArray);
        }
    }

    protected static void a(EntitySprite entitySprite, float[] fArray) {
        Material material = entitySprite.e();
        float[] fArray2 = material.a();
        if (fArray[0] == fArray2[0] && fArray[1] == fArray2[1] && fArray[2] == fArray2[2]) {
            return;
        }
        material.e(fArray);
        entitySprite.f();
    }

    public String toString() {
        return "DisplayScreenElement (" + (String)(this.b != null ? this.b.d + ", " + this.b.e + ", " + this.b.c : "m_element=null") + ")";
    }

    public final boolean a(byte by) {
        return (this.c & by) == this.c;
    }
}

