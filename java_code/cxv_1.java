/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Renamed from cxv
 */
public class cxv_1
extends ps_0 {
    private long a;
    private final Collection<ffc_0> b = new ArrayList<ffc_0>();
    private long c;
    private ffe_0 d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.c = byteBuffer.getLong();
        this.a = byteBuffer.getLong();
        this.d = ffe_0.a(byteBuffer.getShort());
        while (byteBuffer.hasRemaining()) {
            fff_0 fff_02 = fff_0.a(byteBuffer.get());
            ffc_0 ffc_02 = fff_02.a();
            ffc_02.a(byteBuffer);
            this.b.add(ffc_02);
        }
        return true;
    }

    public long b() {
        return this.c;
    }

    public long c() {
        return this.a;
    }

    public Iterator<ffc_0> d() {
        return this.b.iterator();
    }

    public ffe_0 e() {
        return this.d;
    }

    @Override
    public int a() {
        return 13656;
    }

    @Override
    public String toString() {
        return "PetChangeMessage{m_itemId=" + this.a + ", m_changes=" + this.b.size() + "}";
    }
}

