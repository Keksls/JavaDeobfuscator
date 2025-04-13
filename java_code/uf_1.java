/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from uf
 */
public class uf_1
implements gs_0 {
    public final ArrayList<ug_2> a = new ArrayList(0);
    public int b = 0;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        if (this.a.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.a.size());
        for (int k = 0; k < this.a.size(); ++k) {
            ug_2 ug_22 = this.a.get(k);
            boolean bl = ug_22.a(byteBuffer);
            if (bl) continue;
            return false;
        }
        byteBuffer.putInt(this.b);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.a.clear();
        this.a.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ug_2 ug_22 = new ug_2();
            boolean bl = ug_22.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.a.add(ug_22);
        }
        this.b = byteBuffer.getInt();
        return true;
    }

    @Override
    public void c() {
        this.a.clear();
        this.b = 0;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10048001) {
            ui_2 ui_22 = new ui_2(this);
            boolean bl = ui_22.a(byteBuffer, n);
            if (bl) {
                ui_22.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 2;
        for (int k = 0; k < this.a.size(); ++k) {
            ug_2 ug_22 = this.a.get(k);
            n += ug_22.b();
        }
        return n += 4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("items=");
        if (this.a.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.a.size()).append(" elements)...\n");
            for (int k = 0; k < this.a.size(); ++k) {
                ug_2 ug_22 = this.a.get(k);
                ug_22.a(stringBuilder, string + k + "/ ");
            }
        }
        stringBuilder.append(string).append("activeRefId=").append(this.b).append('\n');
    }
}

