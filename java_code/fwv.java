/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongByteHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongByteHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;

public class fwv
extends avc_1 {
    private static final azf_2 g = new azf_2(new float[0]);
    private static final String h = "selectedZone";
    private static final String i = "tex0Dim";
    public static final String e = "nation";
    public static final String f = "highlight";
    private ays_2 j;
    private TLongByteHashMap k;
    private TLongObjectHashMap<azj_2> l;

    private static ava_1 g() {
        return new ava_1(new aut_1(h, auu_1.a), new aut_1(i, auu_1.a));
    }

    public fwv() {
        super(fpm_0.b().B + "mappemonde.cgfx", e, fwv.g());
    }

    public void a(ays_2 ays_22) {
        this.j = ays_22;
        this.h();
    }

    public void a(TLongByteHashMap tLongByteHashMap) {
        this.k = tLongByteHashMap;
        this.h();
    }

    public void a(TLongObjectHashMap<azj_2> tLongObjectHashMap) {
        this.l = tLongObjectHashMap;
        this.h();
    }

    public void b(int n) {
        this.d.a(h, n);
    }

    public void c(int n) {
        this.d.a(i, n);
    }

    private void h() {
        if (this.j == null || this.k == null || this.l == null) {
            return;
        }
        azr_2 azr_22 = this.j.a(0);
        if (azr_22 == null) {
            return;
        }
        TLongObjectIterator tLongObjectIterator = this.l.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            tLongObjectIterator.key();
            byte by = this.k.get(tLongObjectIterator.key());
            azj_2 azj_22 = (azj_2)tLongObjectIterator.value();
            if (azj_22 == null || f.equals(this.b)) {
                g.a(1.0f, 1.0f, 1.0f, 1.0f);
            } else {
                g.a(1.0f, azj_22.q(), azj_22.r(), azj_22.s());
            }
            azr_22.a(by, 0, g);
        }
        this.j.z();
    }

    @Override
    public void a(EntitySprite entitySprite) {
        entitySprite.a(this.c(), this.d(), this.f());
        entitySprite.b(this.j);
    }

    public ava_1 f() {
        if (!axy_2.b.c()) {
            this.d.a("gColorScale", aup_1.I.a("gColorScale"));
        }
        return this.d;
    }

    public String toString() {
        return "MapShader{m_maskTexture=" + (this.j != null ? this.j.g() : "null") + "}";
    }
}

