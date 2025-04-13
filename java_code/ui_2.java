/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from ui
 */
final class ui_2 {
    private final ArrayList<ug_2> b = new ArrayList(0);
    private int c = 0;
    final /* synthetic */ uf_1 a;

    ui_2(uf_1 uf_12) {
        this.a = uf_12;
    }

    public void a() {
        this.a.a.clear();
        this.a.a.ensureCapacity(this.b.size());
        this.a.a.addAll(this.b);
        this.a.b = this.c;
    }

    private boolean a(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ug_2 ug_22 = new ug_2();
            boolean bl = ug_22.a(byteBuffer, 0);
            if (!bl) {
                return false;
            }
            this.b.add(ug_22);
        }
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ug_2 ug_22 = new ug_2();
            boolean bl = ug_22.a(byteBuffer, 10045002);
            if (!bl) {
                return false;
            }
            this.b.add(ug_22);
        }
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 10045002) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 10048001) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        return false;
    }
}

