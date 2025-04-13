/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import java.util.Arrays;

/*
 * Renamed from acK
 */
class ack_0 {
    final float[] a;
    final byte b;

    ack_0(ScreenElement screenElement) {
        this.a = screenElement.p;
        this.b = screenElement.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ack_0)) {
            return false;
        }
        ack_0 ack_02 = (ack_0)object;
        if (this.b != ack_02.b) {
            return false;
        }
        return Arrays.equals(this.a, ack_02.a);
    }

    public int hashCode() {
        int n = Arrays.hashCode(this.a);
        n = 31 * n + this.b;
        return n;
    }

    public void a(gk_0 gk_02) {
        gk_02.a(this.b);
        for (int k = 0; k < this.a.length; ++k) {
            gk_02.a((byte)this.a[k]);
        }
    }
}

