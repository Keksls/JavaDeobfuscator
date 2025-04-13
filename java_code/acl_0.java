/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;

/*
 * Renamed from acL
 */
class acl_0 {
    final int a;
    final short b;
    final int c;

    acl_0(ScreenElement screenElement) {
        this.a = screenElement.k;
        this.b = screenElement.l;
        this.c = screenElement.m;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof acl_0)) {
            return false;
        }
        acl_0 acl_02 = (acl_0)object;
        if (this.c != acl_02.c) {
            return false;
        }
        if (this.a != acl_02.a) {
            return false;
        }
        return this.b == acl_02.b;
    }

    public int hashCode() {
        int n = this.a;
        n = 31 * n + this.b;
        n = 31 * n + this.c;
        return n;
    }

    public void a(gk_0 gk_02) {
        gk_02.a(this.a);
        gk_02.a((byte)this.b);
        gk_02.a(this.c);
    }
}

