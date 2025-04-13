/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class eZo {
    private final List<exk_2> a = new ArrayList<exk_2>();

    public eZo() {
    }

    public eZo(eZo eZo2) {
        this.a.addAll(eZo2.a);
    }

    public void a(exk_2 exk_22) {
        if (this.a.contains(exk_22)) {
            return;
        }
        this.a.add(exk_22);
    }

    public int a() {
        return this.a.size();
    }

    public List<exk_2> b() {
        return Collections.unmodifiableList(this.a);
    }

    public void a(wl_1 wl_12) {
        wl_12.a = epj.k;
        abx_2 abx_22 = new abx_2();
        abx_22.a((byte)this.a.size());
        for (exk_2 exk_22 : this.a) {
            byte[] byArray = exk_22.Q();
            if (byArray == null) continue;
            abx_22.a(byArray.length);
            abx_22.b(byArray);
        }
        wl_12.b = abx_22.c();
    }

    public String toString() {
        return "MergedSetInfo{m_items=" + this.a + "}";
    }

    public static eZo b(wl_1 wl_12) {
        eZo eZo2 = new eZo();
        int n = wl_12.a;
        byte[] byArray = wl_12.b;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n2 = byteBuffer.get();
        for (int k = 0; k < n2; ++k) {
            int n3 = byteBuffer.getInt();
            byte[] byArray2 = new byte[n3];
            byteBuffer.get(byArray2);
            exk_2 exk_22 = new exk_2();
            if (!exk_22.a(n, ByteBuffer.wrap(byArray2))) continue;
            eZo2.a.add(exk_22);
        }
        return eZo2;
    }
}

