/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Renamed from cuW
 */
public class cuw_2
extends ps_0 {
    private final Collection<ewk_2> a = new ArrayList<ewk_2>();
    private long b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b = byteBuffer.getLong();
        while (byteBuffer.hasRemaining()) {
            ewm_2 ewm_22 = ewm_2.a(byteBuffer.get());
            ewk_2 ewk_22 = ewm_22.a();
            ewk_22.a(byteBuffer);
            this.a.add(ewk_22);
        }
        return true;
    }

    public long b() {
        return this.b;
    }

    public Iterator<ewk_2> c() {
        return this.a.iterator();
    }

    @Override
    public int a() {
        return 13801;
    }

    @Override
    public String toString() {
        return "TemporaryInventoryChangeMessage{m_changes=" + this.a.size() + "}";
    }
}

