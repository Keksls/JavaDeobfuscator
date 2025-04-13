/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Renamed from cuV
 */
public class cuv_2
extends ps_0 {
    private long a;
    private final Collection<ewz_1> b = new ArrayList<ewz_1>();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        while (byteBuffer.hasRemaining()) {
            ewb_1 ewb_12 = ewb_1.a(byteBuffer.get());
            ewz_1 ewz_12 = ewb_12.a();
            ewz_12.a(byteBuffer);
            this.b.add(ewz_12);
        }
        return true;
    }

    public Iterator<ewz_1> b() {
        return this.b.iterator();
    }

    public long c() {
        return this.a;
    }

    @Override
    public int a() {
        return 12633;
    }

    @Override
    public String toString() {
        return "QuestInventoryChangeMessage{m_changes=" + this.b.size() + "}";
    }
}

