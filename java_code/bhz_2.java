/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.builder.ToStringBuilder
 */
import org.apache.commons.lang3.builder.ToStringBuilder;

/*
 * Renamed from bhZ
 */
class bhz_2 {
    private boolean a;

    bhz_2() {
    }

    public boolean a() {
        return this.a;
    }

    public void a(boolean bl) {
        this.a = bl;
    }

    public void a(arf_1 arf_12, int n) {
        if (n >= 1) {
            this.a = arf_12.l();
        }
    }

    public void a(gk_0 gk_02, int n) {
        if (n >= 1) {
            gk_02.a(this.a);
        }
    }

    public String toString() {
        return new ToStringBuilder((Object)this).append("m_opened", this.a).toString();
    }
}

