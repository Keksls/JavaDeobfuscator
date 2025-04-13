/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eZX
 */
public class ezx_0 {
    private final fac_0 a;

    public ezx_0(fac_0 fac_02) {
        this.a = fac_02;
    }

    public void a(long l) {
        if (!this.a.w()) {
            throw new faa_0("pas d'xp sur l'item");
        }
        fad_0 fad_02 = (fad_0)this.a.x();
        fad_02.a(l);
    }

    public fac_0 b() {
        return this.a;
    }

    public String toString() {
        return "ItemXpController{m_xpHolder=" + this.a + "}";
    }
}

